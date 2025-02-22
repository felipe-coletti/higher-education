import { useState } from 'react'
import { Text, View, TextInput, Button, StyleSheet } from 'react-native'

export default function MP2() {
    const [celsius , setCelsius] = useState('')
    const [fahrenheit , setFahrenheit] = useState('')
    const [kilometer , setKilometer] = useState('')
    const [miles , setMiles] = useState('')

    const celsiusToFahrenheit = (value) => {
        return (value * 1.8) + 32
    }

    const kilometersToMiles = (value) => {
        return value * 0.6213711922
    }

    return (
        <View style={styles.container}>
            <View style={styles.contentArea}>
                <Text style={styles.title}>Converção de °C para °F</Text>
                <TextInput style={styles.input} value={celsius} onChangeText={setCelsius}/>
                <Button title='Converter' onPress={() => setFahrenheit(celsius ? celsiusToFahrenheit(celsius) : '')}></Button>
                {fahrenheit && <Text>Resultado: {fahrenheit} °F</Text>}
            </View>
            <View style={styles.contentArea}>
                <Text style={styles.title}>Conveção de Km/h para Mph</Text>
                <TextInput style={styles.input} value={kilometer} onChangeText={setKilometer}/>
                <Button title='Converter' onPress={() => setMiles(kilometer ? kilometersToMiles(kilometer) : '')}></Button>
                {miles && <Text>Resultado: {miles} Mph</Text>}
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#fff',
        flex: 1,
        gap: 20,
        justifyContent: 'center',
        padding: 20
    },
    contentArea: {
        display: 'flex',
        flexDirection: 'column',
        gap: 16
    },
    title: {
        fontSize: 18,
        fontWeight: 'bold',
        textAlign: 'center'
    },
    input: {
        border: '1px solid #ccc',
        borderRadius: 2.5,
        display: 'flex',
        padding: 8,
        width: '100%'
    }
})
