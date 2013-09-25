CodingDojo.Producteur = DS.Model.extend({
  name: DS.attr('string'),
  type: DS.attr('string')
});

CodingDojo.Producteur.FIXTURES = [
	{
		id: 1,
		name: "Producteur de patates",
		type: "agro"
	},
	{
		id: 2,
		name: "Producteur d'alcool",
		type: "boisson"
	},
	{
		id: 3,
		name: "Producteur de fruits",
		type: "agro"
	}
];