'use strict';
/*
 * var app = angular.module('myApp',[]);
 */

function Test($scope, $http) {
	/* var id = $scope.data.id; */
	$scope.getData = function(id) {
		$http.get('http://localhost:8080/Vehicle-Store/dataById/' + id)
				.success(function(data) {
					$scope.data = data;
				});
	}

}

function Insert($scope, $http) {

	$scope.insertData = function() {
		$http({
			method : 'post',
			url : 'http://localhost:8080/Vehicle-Store/insertData',
			data : angular.toJson($scope.data),
			headers : {
				'Content-Type' : 'application/json'
			}
		}).then(_success, _error);
	}
}