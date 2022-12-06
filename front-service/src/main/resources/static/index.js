angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:61630/api/v1';

    // console.log(123);

    $scope.loadProducts = function () {
        $http.get(contextPath + '/front')
            .then(function (response) {
                 console.log(response.data)
                $scope.ProductList = response.data;
            });
    };


    $scope.loadProducts();
});