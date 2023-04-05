const database = require("./database")

const schedules = database.sequelize.define("schedules", {
    name: {
        type: database.sequelize.STRING
    },
    telephone: {
        type: database.sequelize.INTEGER
    },
    origin: {
        type: database.sequelize.STRING
    },
    date: {
        type: database.sequelize.DATE
    },
    note: {
        type: database.sequelize.TEXT
    }
})

module.exports = schedules
