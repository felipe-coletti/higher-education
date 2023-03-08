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

const Agendamentos sequelize.define("agendamentos", {
    name: {
        type: sequelize.STRING
    },

    address: {
        type: sequelize.STRING
    },

    neighborhood: {
        type: sequelize.STRING
    },

    cep: {
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

Agendamentos.create({
    name: "Jeferson Roberto de Lis",
    address: "Av Águia de Haia",
    neighborhood: "Jd São Nicolau",
    cep: 09239222,
    city: "São Paulo",
    state: "SP",
    note: "Teste para aula"
)}
