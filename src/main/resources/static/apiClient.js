var apiClient = (function () {
    return{
        getAllCases:function () {
            var getPromise=$.ajax({
                dataType: "json",
                url:"/covid19/",
            });
            return getPromise;
        },getCoronaPais:function (name) {
            var getPromise=$.ajax({
                dataType: "json",
                url:"/covid19/"+name,
            });
            return getPromise;
        }
    };
})();