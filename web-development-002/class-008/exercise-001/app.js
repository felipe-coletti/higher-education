const express = require("express")
const app = express()
const handlebars = require("express-handlebars").engine
const bodyParser = require("body-parser")
const post = require("./models/post")

app.engine("handlebars", handlebars({defaultLayout: "main"}))
app.set("view engine", "handlebars")

app.use(bodyParser.urlencoded({extended: false}))
app.set(bodyParser.json())

app.get("/", function(req, res) {
    res.render("first-page")
})

app.post("/sign-up", function(req, res) {
    post.create({
        name: req.body.name,
        telephone: req.body.telephone,
        origin: req.body.origin,
        date: req.body.date,
        note: req.body.note
    }).then(function() {
        res.redirect("/")
    }).catch(function(error) {
        res.send("Falha ao cadastrar: " + error)
    })
})

app.post("/update", function(req, res) {
    post.update({
        name: req.body.name,
        telephone: req.body.telephone,
        origin: req.body.origin,
        date: req.body.date,
        note: req.body.note
    }, {
        where: {
            id: req.body.id
        }
    }
    ).then(function() {
        res.redirect("/consult")
    })
})

app.get("/consult", function(req, res) {
    post.findAll().then(function(post) {
        res.render("consult", {post})
    }).catch(function(error) {
        console.log("Erro ao carregar os dados: " + error)
    })
})

app.get("/edit/:id", function(req, res) {
    post.findAll({
        where: {
            id: req.params.id
        }
    }).then(function(post){
        res.render("edit", {post})
    }).catch(function(error) {
        console.log("Erro ao carregar os dados: " + error)
    })
})

app.get("/delete/:id", function(req, res){
    post.destroy({
        where: {
            id: req.params.id
        }
    }).then(function(post){
        res.redirect("/")
    }).catch(function(erro){
        console.log("Erro ao deletar os dados: " + erro)
    })
})

app.listen(8081, function() {
    console.log("Servidor Ativo!")
})
