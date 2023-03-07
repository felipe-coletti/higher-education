var http = require("http")

http.createServer(function(req, res) {
    res.end("Mensagem direcionada")
}).listen(8081)

console.log("Servidor ativo!")
