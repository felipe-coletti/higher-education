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
    telephone: {
        type: sequelize.INTEGER
    },
    origin: {
        type: sequelize.STRING
    },
    date: {
        type: sequelize.DATE
    },
    note: {
        type: sequelize.TEXT
    }
})
