const sequelize = require("sequelize")
const database = sequelize("example", "root", "", {
    host: "localhost",
    dialect: "mysql"
})

database.authenticate().then(function(){
    console.log("Conectado com sucesso!")
}).catch(function(error){
    console.log("Falha ao conectar: " + error)
})

const Agendamentos sequelize.define("agendamentos", {
    nome: {
        type: sequelize.STRING
    },

    endereco: {
        type: sequelize.STRING
    },

    bairro: {
        type: sequelize.STRING
    },

    cep: {
        type: sequelize.INTEGER
    },

    cidade: {
        type: sequelize.STRING
    },

    estado: {
        type: sequelize.STRING
    },

    observacao: {
        type: sequelize.STRING
    }
})
