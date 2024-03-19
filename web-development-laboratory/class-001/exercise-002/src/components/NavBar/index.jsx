import React from 'react'
import styles from './styles.module.css'

const NavBar = () => {
    return(
        <nav className={styles.container}>
            <a className={styles.link} href="/">Home</a>
            <a className={styles.link} href="/page2">Página 2</a>
            <a className={styles.link} href="/page3">Página 3</a>
        </nav>
    )
}

export default NavBar