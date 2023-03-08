const sequelize = require("sequelize")
const database = sequelize("example", "root", "" {
    host: "localhost",
    dialect: "mysql"
})

sequelize.authenticate().then(function() {
    console.log("Conectado com sucesso!")
}).catch(function(error) {
    console.log("Falha ao conectar: " + error)
})
