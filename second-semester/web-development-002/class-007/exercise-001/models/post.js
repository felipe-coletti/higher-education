const database = require("./database")

const schedules = database.sequelize.define("schedules", {
    name: {
        type: database.Sequelize.STRING
    },
    telephone: {
        type: database.Sequelize.INTEGER
    },
    origin: {
        type: database.Sequelize.STRING
    },
    date: {
        type: database.Sequelize.DATE
    },
    note: {
        type: database.Sequelize.TEXT
    }
})

module.exports = schedules
