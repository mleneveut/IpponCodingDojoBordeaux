CodingDojo.ProducteursNewController = Ember.ArrayController.extend({
	actions: {
		createProducteur: function() {
			var producteur = this.store.createRecord('producteur', {
				name: this.get("name"),
				type: this.get("type")
			});

			producteur.save();
			alert(this.store.find('producteur'));
		}
	}
});