package fr.ippon;

import fr.ippon.persistence.UserRepository;

import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import restx.SignatureKey;
import restx.factory.Module;
import restx.factory.Provides;
import restx.jongo.JongoFactory;
import restx.security.BasicPrincipalAuthenticator;
import restx.security.RestxPrincipal;
import restx.security.RestxSession;
import org.joda.time.Duration;
import javax.inject.Named;

@Module
public class AppModule {
    @Provides
    public SignatureKey signatureKey() {
         return new SignatureKey("41f1e627-98f3-47a2-9230-2c318c394d8b -8144688313757117920 coding-dojo Coding Dojo".getBytes(Charsets.UTF_8));
    }

    @Provides
    @Named("restx.admin.password")
    public String restxAdminPassword() {
        return "admin";
    }

    @Provides
    @Named("app.name")
    public String appName(){
        return "Coding Dojo";
    }

    @Provides
    public BasicPrincipalAuthenticator basicPrincipalAuthenticator(final UserRepository userRepository) {
        return new BasicPrincipalAuthenticator() {
            @Override
            public Optional<? extends RestxPrincipal> findByName(String name) {
                return userRepository.findUserByName(name);
            }

            @Override
            public Optional<? extends RestxPrincipal> authenticate(String name, String passwordHash, ImmutableMap<String, ?> principalData) {
                boolean rememberMe = Boolean.valueOf((String) principalData.get("rememberMe"));
                Optional<? extends RestxPrincipal> user = userRepository.findUserByNameAndPasswordHash(name, passwordHash);
                if (user.isPresent()) {
                    RestxSession.current().expires(rememberMe ? Duration.standardDays(30) : Duration.ZERO);
                }

                return user;
            }
        };
    }

	@Provides @Named(JongoFactory.JONGO_DB_NAME)
	public String dbName(){
		return "coding-dojo";
	}
}
