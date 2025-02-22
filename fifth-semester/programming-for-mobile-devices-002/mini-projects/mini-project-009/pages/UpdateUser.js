import { useState, useEffect } from 'react'
import { View, Text, TextInput, Button, StyleSheet } from 'react-native'
import AsyncStorage from '@react-native-async-storage/async-storage'

export default comp => {
    const { editId } = comp.route.params

    const [users, setUsers] = useState([])
    const [name, setName] = useState('')
    const [email, setEmail] = useState('')
    const [avatar, setAvatar] = useState('')

    useEffect(() => {
        loadUsers()
    }, [])

    const loadUsers = async () => {
        try {
            const usersData = await AsyncStorage.getItem('users')
            
            if (usersData) {
                const parsedUsers = JSON.parse(usersData)

                setUsers(parsedUsers)

                const user = parsedUsers.find(user => user.id === editId)

                if (user) {
                    setName(user.name)
                    setEmail(user.email)
                    setAvatar(user.avatar)
                }
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

    const updateUser = () => {
        const updatedUsers = users.map(user =>
            user.id === editId ? { ...user, name, email, avatar } : user
        )

        saveUsers(updatedUsers)

        comp.navigation.navigate('ViewUser')
    }

    return (
        <View style={styles.container}>
            <Text style={styles.header}>Editar usuário</Text>
            <TextInput style={styles.input} placeholder='Nome' value={name} onChangeText={setName} />
            <TextInput style={styles.input} placeholder='Email' value={email} onChangeText={setEmail} />
            <TextInput style={styles.input} placeholder='Avatar URL' value={avatar} onChangeText={setAvatar} />
            <Button
                title={'Salvar'}
                onPress={updateUser}
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
