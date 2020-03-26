var apiClient = (function () {

    var getAll = (function (callback) {
        axios({
            method: 'GET',
            url: '/covid19',
        })
            .then(response => callback(response.data))
            .catch(error => console.log(error));
    });
    return{
        
        getAll:getAll,
    }
})();