const sequelize = require("sequelize")
const database = sequelize("test", "root", "", {
    host: "localhost",
    dialect: "mysql"
})

database.authenticate().then(function(){
    console.log("Conectado com sucesso!")
}).catch(function(error){
    console.log("Falha ao conectar: " + error)
})

const schedules = sequelize.define("schedules", {
    name: {
        type: sequelize.STRING
    },
    address: {
        type: sequelize.STRING
    },
    neighborhood: {
        type: sequelize.STRING
    },
    zipCode: {
        type: sequelize.INTEGER
    },
    city: {
        type: sequelize.STRING
    },
    state: {
        type: sequelize.STRING
    },
    note: {
        type: sequelize.STRING
    }
})
