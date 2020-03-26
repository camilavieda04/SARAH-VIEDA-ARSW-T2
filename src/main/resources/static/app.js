var app =(function(){


var generateTable=function(info){
    $("#tablaPaises > tbody").empty();
    info.map(function(pais){
        $("#tablaPaises > tbody").append(
            "<tr> <td>" +
            pais.name +
            "</td>" +
            "<td>" +
            pais.confirmed+
            "</td>" +
            "<td>" +
            pais.death +
            "</td>" +
            "<td>" +
            pais.recovered +
            "</td></tr>"
        );
    });
}

var getAll=function(){
    apiClient.getAll(generateTable);
};

return{
    getAll:getAll
}


})();