CodingDojo.Router.map(function() {
  this.resource('producteurs', { path: '/' }, function() {
  	this.route('new');
  });
});

CodingDojo.ProducteursRoute = Ember.Route.extend({
  model: function () {
    return this.store.find('producteur');
  }
});

CodingDojo.ProducteursNewRoute = Ember.Route.extend({
  setupController: function(controller, producteurs) {
    controller.set('model', playlist.get('songs'));
  }
});