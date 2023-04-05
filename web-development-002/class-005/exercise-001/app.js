const express = require("express")
const app = express()
const handlebars = require("express-handlebars").engine
const bodyParser = require("body-parser")

app.engine("handlebars", handlebars({defaultLayout: "main"}))
app.set("view engine", "handlebars")

app.use(bodyParser.urlencoded({extended}))

app.get("/", function(req, res){
    res.render("first-page")
})

app.post("/sign-up", function(req, res){
    res.send("Formulário enviado com sucesso!")
})

app.listen(8081, function(){
    console.log("Servidor Ativo!")
})
