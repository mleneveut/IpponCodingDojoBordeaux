var datas = [
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

function CodingDojoViewModel() {
	var self = this;

	self.producers = ko.observable(datas);
	self.chosenList = ko.observable();
	self.chosenProducer = ko.observable();

	self.goToList = function() {
		self.chosenList(self.producers);
		self.chosenProducer(null);
	};

	self.goToDetail = function(producer) {
		self.chosenProducer(producer); 
		self.chosenList(null);
	};

	self.goToList();
}

ko.applyBindings(new CodingDojoViewModel());