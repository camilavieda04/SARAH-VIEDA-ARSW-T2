var app =(function(){

var  generateTable=function(info){
    $("#casesCovidTable > tbody").empty();
    info.map(function(pais){
        alert("si entre")
        $("#casesCovidTable > tbody").append(
            "<tr> <td>" +
            "<form><button class='btn btn-primary' type='button' onclick='api.getPais(\"" +
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
    apiClient.getAllCases(generateTable)
    };


var getCoronaPais=function(name){
    apiClient.getCoronaPais(name).then(function(info){
        generateTable(info);
    })
}

return{
    getAllCases:getAllCases,
    getCoronaPais:getCoronaPais
};


})();