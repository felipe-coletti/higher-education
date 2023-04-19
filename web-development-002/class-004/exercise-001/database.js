const Sequelize = require("sequelize")
const sequelize = new Sequelize("test", "root", "", {
    host: "localhost",
    dialect: "mysql"
})

sequelize.authenticate().then(function() {
    console.log("Conectado com sucesso!")
}).catch(function(error) {
    console.log("Falha ao conectar: " + error)
})

const schedules = sequelize.define("schedules", {
    name: {
        type: Sequelize.STRING
    },
    address: {
        type: Sequelize.STRING
    },
    neighborhood: {
        type: Sequelize.STRING
    },
    zipCode: {
        type: Sequelize.INTEGER
    },
    city: {
        type: Sequelize.STRING
    },
    state: {
        type: Sequelize.STRING
    },
    note: {
        type: Sequelize.STRING
    }
})
