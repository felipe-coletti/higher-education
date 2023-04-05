const express = require("express")
const app = express()
const handlebars = require("express-handlebars").engine
const bodyParser = require("body-parser")
const post = require("")

app.engine("handlebars", handlebars({defaultLayout: "main"}))
app.set("view engine", "handlebars")

app.use(bodyParser.urlencoded({extended: false}))
app.set(bodyParser.json())

app.get("/", function(req, res){
    res.render("first-page")
})

app.post("/sign-up", function(req, res){
    res.send("Nome: " + req.body.name)
})

app.listen(8081, function(){
    console.log("Servidor Ativo!")
})
