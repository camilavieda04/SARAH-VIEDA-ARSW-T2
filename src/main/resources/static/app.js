var app =(function(){

var  generateTable=function(info){
    $("#casesCovidTable > tbody").empty();
    info.map(function(pais){
        $("#casesCovidTable > tbody").append(
            "<tr> <td>" +
            pais.name +
            "</td>" +
            "<td>" +
            pais.deaths+
            "</td>" +
            "<td>" +
            pais.confirmed +
            "</td>" +
            "<td>" +
            pais.recovered +
            "</td>"+
            "<td>"+
            "<form><button class='btn btn-dark' type='button' onclick='app.getCoronaPais(\"" +
        pais.pais+"\""+ ")' > Ver </button></form>"+
            "</td> " +
            "</tr>"
            );
    
    });
    $("button").click(function() {
        $('html,body').animate({
            scrollTop: $(".casesCountry").offset().top},
            'slow');
    });

};

var table=function(info){
    document.getElementById("nombrePais").innerHTML=info.name;
    $("#pais > tbody").empty();

    $("#pais > tbody").append(
        "<tr> <td> Num Deaths</td> <td>" +
        info.deaths +
        "</td></tr>" +
        "<tr> <td> Num Confirmed</td> <td>" +
        info.confirmed +
        "</td></tr>"+
    "<tr> <td> Num Recovered</td> <td>" +
    info.recovered +
    "</td></tr>"

    );
    $("#casesCountry > tbody").empty();
    info.map(function(namepais){
        $("#casesCountry > tbody").append(
            "<tr> <td>" +
            namepais.name+
            "</td>" +
            "<td>" +
            namepais.deaths+
            "</td>" +
            "<td>" +
            namepais.confirmed+
            "</td>" +
            "<td>" +
            namepais.recovered+
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
    apiClient.getCoronaPais(name).then(function(info){
        table(info);
    });
}

return{
    getAllCases:getAllCases,
    getCoronaPais:getCoronaPais
};


})();