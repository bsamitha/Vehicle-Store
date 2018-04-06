<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html ng-app>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js">
	
</script>
<script src="<c:url value="/resources/js/app.js" />"></script>

</head>
<body>
	<h1>Vehicle Data</h1>
	<div ng-controller="Test">
		<span class="border border-dark">
			<div>
				<span>vehicle id</span> <input type="text" id="id" ng-model="id" />
				<button type="button" class="btn btn-outline-secondary"
					ng-click="getData(id)">Search</button>
				<!-- <button type="button" class="btn btn-outline-secondary"
					ng-click="getAllData()">All Vehicles</button> -->
			</div>
		</span>

		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">#</th>
					<th scope="col">type</th>
					<th scope="col">brand</th>
					<th scope="col">model</th>
					<th scope="col">colour</th>
					<th scope="col">year</th>
					<th scope="col">Owner</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">{{data.vehicleID}}</th>
					<td>{{data.type}}</td>
					<td>{{data.brand}}</td>
					<td>{{data.model}}</td>
					<td>{{data.colour}}</td>
					<td>{{data.year}}</td>
					<td>{{data.ownerid}}</td>
				</tr>

			</tbody>
		</table>
	</div>
	<div ng-controller="Insert">
		<form ng-submit="insertData()">
			<div class="container-fluid" align="left">
				Register A Vehicle<br>
				<hr>
				Reg id:<input type="text" class="form-control" style="width:50%" ng-model="data.vehicleID" />
				type:<input type="text" class="form-control" style="width:50%" ng-model="data.type" />
				brand:<input type="text" class="form-control" style="width:50%" ng-model="data.brand" />
				model:<input type="text" class="form-control" style="width:50%" ng-model="data.model" />
				colour:<input type="text" class="form-control" style="width:50%" ng-model="data.colour" />
				year:<input type="text" class="form-control" style="width:50%" ng-model="data.year" /> 
				owner:<input type="text" class="form-control" style="width:50%" ng-model="data.ownerid" /><br>

				<button type="submit" class="btn btn-outline-secondary">submit</button>

			</div>
		</form>
	</div>
</body>
</html>
