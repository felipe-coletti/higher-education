const sequelize = require("sequelize")
const database = new sequelize("test", "root", "", {
    host: "localhost",
    dialect: "mysql"
})

database.authenticate().then(function() {
    console.log("Conectado com sucesso!")
}).catch(function(error) {
    console.log("Falha ao conectar: " + error)
})

module.exports = {
    Sequelize: Sequelize,
    sequelize: sequelize
}
