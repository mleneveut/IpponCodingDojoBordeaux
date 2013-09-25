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

angular.module('codingDojo', [])
.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/producers', {
		templateUrl: 'partials/list.html',
		controller: ProducerListCtrl
	})
	.when('/producers/:producerId', {
		templateUrl: 'partials/detail.html',
		controller: ProducerDetailCtrl
	})
	.otherwise({redirectTo: '/producers'});
}]);


function ProducerListCtrl($scope) {
	$scope.producers = datas;
}

function ProducerDetailCtrl($scope, $routeParams) {
	$scope.producer = datas[0];
}