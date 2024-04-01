import React from 'react'
import styles from './styles.module.css'
import fatecLogo from '../../assets/images/fatec-zl.png'

const Header = () => {
    return(
        <header className={styles.container}>
            <img src={fatecLogo} alt='Logo Fatec'/>
        </header>
    )
}

export default Header