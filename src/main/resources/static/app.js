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
    $("#casesCountry > tbody").empty();
    info.map(function(namepais){
        $("#casesCountry>tbody").append(
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