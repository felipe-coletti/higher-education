$(document).ready(function() {
    let fonte = 14
    $("#aumentar").click(function() {
        if(fonte < 22){
            $("body").css({"font-size": ++fonte + "px"})
        }
    })
    $("#diminuir").click(function() {
        if(fonte > 6) {
            $("body").css({"font-size": --fonte + "px"})
        }
    })
})
