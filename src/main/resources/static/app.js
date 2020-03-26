var app =(function(){

var  generateTable=function(info){
    $("#casesCovidTable > tbody").empty();
    info.map(function(pais){
        $("#casesCovidTable > tbody").append(
            "<tr> <td>" +
            "<form><button class='btn btn-primary' type='button' onclick='app.getCoronaPais(\"" +
            pais.name +
            "</td>" +
            "<td>" +
            pais.confirmed+
            "</td>" +
            "<td>" +
            pais.deaths +
            "</td>" +
            "<td>" +
            pais.recovered +
            "</td></tr>"
        );
    
    });
};

var getAllCases=function(){
    apiClient.getAllCases().then(function(info){
        generateTable(info);
    });
};


var getCoronaPais=function(name){
    apiClient.getCoronaPais(generateTable).then(function(info){
        generateTable(info);
    })
}

return{
    getAllCases:getAllCases,
    getCoronaPais:getCoronaPais
};


})();