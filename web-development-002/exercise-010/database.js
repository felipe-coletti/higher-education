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

Agendamentos.create({
    nome: "Jeferson Roberto de Lis",
    endereco: "Av Águia de Haia",
    bairro: "Jd São Nicolau",
    cep: 09239222,
    cidade: "São Paulo",
    estado: "SP",
    observacao. "Teste para aula"
)}
