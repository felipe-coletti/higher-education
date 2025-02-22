import { useState, useEffect } from 'react'
import { View, Text, TextInput, Button, StyleSheet } from 'react-native'
import AsyncStorage from '@react-native-async-storage/async-storage'

export default comp => {
    const [name, setName] = useState('')
    const [email, setEmail] = useState('')
    const [avatar, setAvatar] = useState('')
    const [users, setUsers] = useState([])

    useEffect(() => {
        loadUsers()
    }, [])

    const loadUsers = async () => {
        try {
            const usersData = await AsyncStorage.getItem('users')
            
            if (usersData) {
                setUsers(JSON.parse(usersData))
            }
        } catch (error) {
            console.error(error)
        }
    }

    const saveUsers = async (users) => {
        try {
            await AsyncStorage.setItem('users', JSON.stringify(users))

            setUsers(users)
        } catch (error) {
            console.error(error)
        }
    }

    const addUser = () => {
        const newUser = {
          id: users.length > 0 ? users[users.length - 1].id + 1 : 0,
          name,
          email,
          avatar
        }
        const updatedUsers = [...users, newUser]

        saveUsers(updatedUsers)

        comp.navigation.navigate('ViewUser')
    }

    return (
        <View style={styles.container}>
            <Text style={styles.header}>Adicionar usuário</Text>
            <TextInput style={styles.input} placeholder='Nome' value={name} onChangeText={setName} />
            <TextInput style={styles.input} placeholder='Email' value={email} onChangeText={setEmail} />
            <TextInput style={styles.input} placeholder='Avatar URL' value={avatar} onChangeText={setAvatar} />
            <Button
                title={'Adicionar'}
                onPress={addUser}
            />
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        padding: 20,
        justifyContent: 'center',
        backgroundColor: '#fff',
    },
    header: {
        fontSize: 24,
        marginBottom: 20,
        textAlign: 'center',
    },
    input: {
        height: 40,
        borderColor: 'gray',
        borderWidth: 1,
        paddingLeft: 8,
        marginBottom: 10,
    },
})
