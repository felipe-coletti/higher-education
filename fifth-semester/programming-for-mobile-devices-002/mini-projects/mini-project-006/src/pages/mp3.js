import { useState, useEffect } from 'react'
import { Text, View, StyleSheet } from 'react-native'

export default function MP3() {
    const eventDate = new Date('2024-12-31T12:00:00')
    const [result, setResult] = useState()

    const formatDate = (date) => {
        let year = date.getFullYear().toString().padStart(2, 0)
        let month = (date.getMonth() + 1).toString().padStart(2, 0)
        let day = date.getDate().toString().padStart(2, 0)

        return `${day}/${month}/${year}`
    }

    const formatTime = (date) => {
        let hour = date.getHours().toString().padStart(2, 0)
        let minute = date.getMinutes().toString().padStart(2, 0)

        return `${hour}:${minute}`
    }

    const getResult = () => {
        let currentDate = new Date()
        let dateDifference = eventDate - currentDate

        let daysLeft = Math.floor(dateDifference / (1000 * 60 * 60 * 24))
        let hoursLeft = Math.floor((dateDifference / (1000 * 60 * 60)) % 24)
        let minutesLeft = Math.floor((dateDifference / 1000 / 60) % 60)
        let secondsLeft = Math.floor((dateDifference / 1000) % 60)

        return `${daysLeft != 1 ? 'Faltam' : 'Falta'} ${daysLeft} ${daysLeft != 1 ? 'dias' : 'dia'}, ${hoursLeft} ${hoursLeft != 1 ? 'horas' : 'hora'}, ${minutesLeft} ${minutesLeft != 1 ? 'minutos' : 'minuto'} e ${secondsLeft} ${secondsLeft != 1 ? 'segundos' : 'segundo'}`
    }

    useEffect(() => {
        const interval = setInterval(() => {
          setResult(getResult)
        }, 1)

      return () => clearInterval(interval)
    }, [])

    return (
        <View style={styles.container}>
            <Text style={styles.title}>{formatDate(eventDate)} {formatTime(eventDate)}</Text>
            {result && <Text style={styles.timeLeft}>{result}</Text>}
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#fff',
        flex: 1,
        gap: 16,
        justifyContent: 'center',
        padding: 20
    },
    title: {
        fontSize: 18,
        fontWeight: 'bold',
        textAlign: 'center'
    },
    timeLeft: {
        fontSize: 24,
        fontWeight: 'bold',
        textAlign: 'center'
    }
})
