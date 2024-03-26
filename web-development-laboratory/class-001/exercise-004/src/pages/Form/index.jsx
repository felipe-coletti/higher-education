import React, {useState} from 'react'
import styles from './styles.module.css'

const Form = () => {
    const [name, setName] = useState('')
    const [email, setEmail] = useState('')
    const [message, setMessage] = useState('')

    const handleSubmit = () => {

    }


    return (
        <div className={styles.container}>
            <form className={styles.form} onSubmit={handleSubmit}>
                <label className={styles.label}>
                    Nome
                    <input className={styles.input} type='text' value={name} onChange={(e) => setName(e.target.value)}/>
                </label>
                <label className={styles.label}>
                    E-mail
                    <input className={styles.input} type='email' value={email} onChange={(e) => setEmail(e.target.value)}/>
                </label>
                <label className={styles.label}>
                    Mensagem
                    <textarea className={styles.textarea} rows='4' value={message} onChange={(e) => setMessage(e.target.value)}/>
                </label>
                <button className={styles.button} type='submit'>Enviar</button>
            </form>
        </div>
    )
}

export default Form