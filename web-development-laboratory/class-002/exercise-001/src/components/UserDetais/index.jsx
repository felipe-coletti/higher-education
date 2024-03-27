import React from 'react'
import styles from './styles.module.css'

const UserDetails = ({name, age, job}) => {
    return (
        <div className={styles.container}>
            <h2>Usuários</h2>
            <ul className={styles.list}>
                <li>Nome: {name}</li>
                <li>Idade: {age}</li>
                <li>Profissão: {job}</li>
                <li>{age >= 18 ? <p>Maior de idade</p> : <p>Menor de idade</p>}</li>
            </ul>
        </div>
    )
}

export default UserDetails