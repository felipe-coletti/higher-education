const express = require("express")
const app = express()

app.get("/", function(req, res){
    // res.send("<h1>Estou na primeira página.</h1>")
    res.sendFile(__dirname + "/html/index.html")
})

app.get("/contato", function(req, res){
    res.send("Estou na página de contato.")
})

app.get("/produto", function(req, res){
    res.send("Estou na página de produto.")
})

app.get("/produto/:item", function(req, res){
    // res.send(req.params)
    res.send("Item: " + req.params.item)
})

app.get("/produto/:item/:quantidade", function(req, res){
    res.send("Item: " + req.params.item + "<br>Quantidade: " + req.params.quantidade)
})

app.listen(8081, function(){
    console.log("Servidor Ativo!")
})
