const express = require("express")
const app = express()
const handlebars = require("express-handlebars").engine
const bodyParser = require("body-parser")
const { initializeApp, applicationDefault, cert } = require("firebase-admin/app")
const { getFirestore, Timestamp, FieldValue } = require("firebase-admin/firestore")

const serviceAccount = require("./path/to/serviceAccountKey.json")

initializeApp({
    credential: cert(serviceAccount)
})
  
const db = getFirestore()

app.engine("handlebars", handlebars({defaultLayout: "main"}))
app.set("view engine", "handlebars")

app.use(bodyParser.urlencoded({extended: false}))
app.set(bodyParser.json())

app.get("/", function(req, res) {
    res.render("first-page")
})

app.post("/sign-up", function(req, res) {
    var res = db.collection("schedules").add({
        name: req.body.name,
        telephone: req.body.telephone,
        origin: req.body.origin,
        date: req.body.date,
        note: req.body.note
    }).then(function(){
        console.log("Documento adicionado.");
        res.redirect('/')
    })
})

app.post("/update", function(req, res) {
    var res = db.collection("schedules").update({
        name: req.body.name,
        telephone: req.body.telephone,
        origin: req.body.origin,
        date: req.body.date,
        note: req.body.note
    }).doc(doc.id).then(function(){
        console.log("Documento atualizado.");
        res.redirect('/consult')
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
