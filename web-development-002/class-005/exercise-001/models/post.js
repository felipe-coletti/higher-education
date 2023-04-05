const database = require("./database")

const schedules = database.sequelize.define("schedules", {
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

module.exports = schedules
