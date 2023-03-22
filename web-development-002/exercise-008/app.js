const express = require("express")
const app = express()

app.get("/", function(req, res){
    res.sendFile(__dirname + "/html/index.html")
})

app.get("/contact", function(req, res){
    res.send("Estou na página de contato.")
})

app.get("/product", function(req, res){
    res.send("Estou na página de produto.")
})

app.get("/product/:item", function(req, res){
    // res.send(req.params)
    res.send("Item: " + req.params.item)
})

app.get("/product/:item/:quantity", function(req, res){
    res.send("Item: " + req.params.item + "<br>Quantidade: " + req.params.quantity)
})

app.listen(8081, function(){
    console.log("Servidor Ativo!")
})
