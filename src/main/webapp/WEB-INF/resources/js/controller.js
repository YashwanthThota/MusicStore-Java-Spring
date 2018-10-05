var cartApp = angular.module("cartApp", []);

cartApp.controller("cartCtrl", function($scope, $http){

    $scope.refreshCart = function() {
        $http.get('/eMusicStore/rest/cart/'+$scope.cartId).success(function (data) {
            console.log("check")
            $scope.cart = data;
        }).error(function(response) {
            console.log(response);
        });
    };

    $scope.clearCart = function () {
        $http.delete('/eMusicStore/rest/cart/'+$scope.cartId).success($scope.refreshCart());
    };

    $scope.initCartId = function (cartId) {
        $scope.cartId = cartId;
        console.log("check mic87890-");
        $scope.refreshCart(cartId);
    };

    $scope.addToCart = function (productId) {
        $http.put('/eMusicStore/rest/cart/add/'+productId).success(function () {
            alert("Product successfully added to the cart")
        });
    };

    $scope.removeFromCart = function (productId) {
        $http.put('/eMusicStore/rest/cart/remove/'+productId).success(function () {
            $scope.refreshCart();
        });
    };

    $scope.calGrandTotal = function() {
        var grandTotal = 0;

        for (var i=0; i<$scope.cart.cartItems.length; i++){
            grandTotal+=$scope.cart.cartItems[i].totalPrice;
        }

        return grandTotal;
    }
});