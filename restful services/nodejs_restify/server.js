var restify = require('restify');
var Db = require('mongodb').Db,
	MongoClient = require('mongodb').MongoClient,
	MongoServer = require('mongodb').Server,
	ObjectID = require('mongodb').ObjectID;

var server = restify.createServer({
name: 'coding-dojo-restify'
});

var mongoclient = new MongoClient(new MongoServer("localhost", 27017, {native_parser: true}));


server.use(restify.bodyParser());

var producteur1 = {id:1, name:"Florian"};
var producteur2 = {id:2, name:"Kevan"};
var producteurs = [producteur1, producteur2];

server.get('/producteurs', function(req, res, next){
	mongoclient.open(function(err, mongoclient) {
		var db = mongoclient.db("coding-dojo");
		var collection = db.collection("producteur");
		collection.find().toArray(function(error, result){
			res.send(result);
			mongoclient.close();
		});
	});
	return next();
});

server.get('/producteur/:id', function(req, res, next){
	mongoclient.open(function(err, mongoclient) {
		var db = mongoclient.db("coding-dojo");
		var collection = db.collection("producteur");
		collection.findOne({_id: new ObjectID(req.params.id)}, function(error, result){
			res.send(result);
			mongoclient.close();
		});
	});
	return next();
});

server.get('/producteur/par-nom/:name', function(req, res, next){
	producteurs.forEach(function(producteur){
		if(req.params.name == producteur.name){
			res.send(producteur);
		}
	});
	return next();
});

server.post('/producteur/search', function(req, res, next) {
	console.log(req.params);
	var newProducteur = {
		id: req.param.id,
		name: req.param.name
	};

	if (req.params.perimeter != undefined && req.params.perimeter != null){
		// Add query params

	}

	// Save OR search producteur

	res.send(newProducteur);
	return next();
});

server.get('/producteurs/par-categorie-de-produit/:category', function(req, res, next){
	var producteursToReturn = new Array();

	producteurs.forEach(function(producteur){
		if(req.params.category == producteur.category){
			producteursToReturn.push(producteur);
		}
	});

	res.send(producteursToReturn);
	return next();
});

server.get('/producteurs/par-ville/:ville', function(req, res, next){
	var producteursToReturn = new Array();

	producteurs.forEach(function(producteur){
		if(req.params.ville == producteur.ville){
			producteursToReturn.push(producteur);
		}
	});

	res.send(producteursToReturn);
	return next();
});

server.listen(8080, function(){
	console.log('%s listening at %s', server.name, server.url);
});