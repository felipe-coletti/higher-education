import React from 'react'

const UserDetails = ({name, age, job}) => {
    return (
        <div>
            <h2>Usuários</h2>
            <ul>
                <li>Nome: {name}</li>
                <li>Idade: {age}</li>
                <li>Profissão: {job}</li>
            </ul>
            {age >= 18 ? <p>Maior de idade</p> : <p>Menor de idade</p>}
        </div>
    )
}

export default UserDetails