import { useState, useEffect } from 'react'
import { View, FlatList, StyleSheet, TouchableOpacity, Text } from 'react-native'
import { Avatar, Icon } from '@rneui/themed'
import AsyncStorage from '@react-native-async-storage/async-storage'

export default comp => {
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

    const deleteUser = (id) => {
        const updatedUsers = users.filter(user => user.id !== id)
        saveUsers(updatedUsers)
    }

    return (
        <View>
            <FlatList
                data={users}
                keyExtractor={(_, index) => index.toString()}
                renderItem={({ item }) => (
                    <View style={styles.usuario}>
                        <View style={styles.userInfo}>
                          <Avatar size={50} rounded source={{ uri: item.avatarUrl }} />
                          <View style={styles.usuarioEstilo}>
                              <Text style={styles.title}>{item.name}</Text>
                              <Text style={styles.email}>{item.email}</Text>
                          </View>
                        </View>
                        <View style={styles.userInfo}>
                          <TouchableOpacity onPress={() => comp.navigation.navigate('UpdateUser', { editId: item.id })}>
                              <Icon name='edit' size={25} color='black' />
                          </TouchableOpacity>
                          <TouchableOpacity onPress={() => deleteUser(item.id)}>
                              <Icon name='delete' size={25} color='red' />
                          </TouchableOpacity>
                        </View>
                    </View>
                )}
            />
        </View>
    )
}

const styles = StyleSheet.create({
    usuario: {
        backgroundColor: '#fff',
        borderColor: '#0000001f',
        borderStyle: 'solid',
        borderBottomWidth: 1,
        display: 'flex',
        padding: 16,
        justifyContent: 'space-between',
        flexDirection: 'row',
        gap: 12,
        alignItems: 'center',
        width: '100%'
    },
    userInfo: {
        alignItems: 'center',
        display: 'flex',
        flexDirection: 'row',
        gap: 16,
    },
    title: {
        fontSize: 16,
    },
    email: {
        fontSize: 14
    },
    usuarioEstilo: {
        display: 'flex',
        gap: 8,
    },
})