import { useState } from 'react'
import { Text, View, TextInput, Button, StyleSheet } from 'react-native'

export default function MP1() {
    const [birthDay, setBirthDay] = useState('')
    const [birthMonth, setBirthMonth] = useState('')
    const [birthYear, setBirthYear] = useState('')
    const [result, setResult] = useState('')

    const calculateDateDifference = (firstDate, secondDate) => {
        firstDate = firstDate.split('-')

        let firstYear = parseInt(firstDate[0])
        let firstMonth = parseInt(firstDate[1])
        let firstDay = parseInt(firstDate[2])

        secondDate = secondDate.split('-')

        let secondYear = parseInt(secondDate[0])
        let secondMonth = parseInt(secondDate[1])
        let secondDay = parseInt(secondDate[2])

        let years = secondYear - 1 - firstYear
        let months = secondMonth - 1 + 12 - firstMonth
        let days = secondDay - 1 + 31 - firstDay

        if (days >= 31) {
            months++
            days -= 31
        }
        if (months >= 12) {
            years++
            months -= 12
        }

        return years.toString() + '-' + months.toString() + '-' + days.toString()
    }

    const calculateAge = (birthDate) => {
        let currentDate = new Date()

        let currentYear = currentDate.getFullYear()
        let currentMonth = currentDate.getMonth() + 1
        let currentDay = currentDate.getDate()

        currentDate = currentYear.toString() + '-' + currentMonth.toString() + '-' + currentDay.toString()

        return calculateDateDifference(birthDate, currentDate)
    }

    return (
        <View style={styles.container}>
            <Text style={styles.title}>Calcular idade</Text>
            <View style={styles.contentArea}>
                <View style={styles.inputField}>
                    <Text style={styles.label}>Dia</Text>
                    <TextInput
                        style={styles.input}
                        value={birthDay}
                        onChangeText={setBirthDay}
                        keyboardType='numeric'
                    />
                </View>
                <View style={styles.inputField}>
                    <Text style={styles.label}>Mês</Text>
                    <TextInput
                        style={styles.input}
                        value={birthMonth}
                        onChangeText={setBirthMonth}
                        keyboardType='numeric'
                    />
                </View>
                <View style={styles.inputField}>
                    <Text style={styles.label}>Ano</Text>
                    <TextInput
                        style={styles.input}
                        value={birthYear}
                        onChangeText={setBirthYear}
                        keyboardType='numeric'
                    />
                </View>
            </View>
            <Button
                title='Calcular'
                onPress={() => setResult(calculateAge(`${birthYear}-${birthMonth}-${birthDay}`))}
            />
            {result && (
                <Text>
                    Resultado: {result.split('-')[0]} {result.split('-')[0] != 1 ? 'anos' : 'ano'}{' '}
                    {result.split('-')[1]} {result.split('-')[1] != 1 ? 'meses' : 'mês'} {result.split('-')[2]}{' '}
                    {result.split('-')[2] != 1 ? 'dias' : 'dia'}
                </Text>
            )}
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#fff',
        flex: 1,
        gap: 16,
        justifyContent: 'center',
        padding: 20,
    },
    contentArea: {
        display: 'flex',
        flexDirection: 'row',
        gap: 16,
    },
    title: {
        color: '#000',
        fontSize: 18,
        fontWeight: 'bold',
        textAlign: 'center',
    },
    inputField: {
        flex: 1,
        gap: 16,
    },
    label: {
        color: '#000',
        fontSize: 16,
    },
    input: {
        border: '1px solid #ccc',
        borderRadius: 2.5,
        display: 'flex',
        padding: 8,
        width: '100%',
    },
})
