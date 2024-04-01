function validateForm() {
    let cpf = register.cpf.value 
    let password = register.password.value
    let confirm = register.confirm.value

    if(cpf.length != 11) {
        alert("CPF inválido.")
        register.cpf.focus()
        return false
    }
    if(isNaN(cpf)) {
        alert("Informe apenas números para o campo CPF.")
        register.cpf.focus()
        return false
    }
    if(confirm != password) {
        alert("Senhas não conferem.")
        register.confirm.focus()
        return false
    }

    const regex = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[^\w\s]).{6,10}$/

    if(!regex.exec(password)) {
        alert("A senha deve conter no mínimo uma letra maiúscula, uma letra minúscula, um número, um caractere especial, mínimo 6 e máximo 10 caracteres.")
        register.password.focus()
        return false
    }
}
