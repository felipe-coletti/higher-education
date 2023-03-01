const express = require("express")
const app = express()

app.get("/", function(req, res){
    res.send("<h1>Estou na primeira página.</h1>")
})

app.get("/contato", function(req, res){
    res.send("Estou na página de contato.")
})

app.get("/produto", function(req, res){
    res.send("Estou na página de produto.")
})

app.listen(8081, function(){
    console.log("Servidor Ativo!")
})
