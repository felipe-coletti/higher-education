import { useState, useEffect } from 'react'
import { Text, TouchableOpacity, View, ScrollView, StyleSheet } from 'react-native'
import Table from '../components/Table'

export default function MP4() {
    const [values, setValues] = useState(new Array(60).fill(false))
    const selectedValues = values.reduce((out, bool, index) => bool ? out.concat(index) : out, [])
    const [result, setResult] = useState([])
    const [resultMessage, setResultMessage] = useState([])

    const getResult = () => {
        var randomNumbers = []

        while(randomNumbers.length < 6) {
            var randomNumber = Math.floor(Math.random() * 60)
            if (!randomNumbers.includes(randomNumber)) {
                randomNumbers.push(randomNumber)
            }
        }

        setResult(randomNumbers)
    }

    useEffect(() => {
        if (result.length > 0) {
            let successes = 0

            for (let i = 0; i < selectedValues.length; i++) {
                if (result.includes(selectedValues[i])) {
                    successes++
                }
            }

            switch (successes) {
                case 6:
                    setResultMessage('Sena')
                    break
                case 5:
                    setResultMessage('Quina')
                    break
                case 4:
                    setResultMessage('Quadra')
                    break
                default:
                    setResultMessage('Não foi dessa vez')
            }
        }
    }, [result, selectedValues])

    return (
        <ScrollView>
            <View style={styles.container}>
                <Text style={styles.title}>Marque 6 números</Text>
                <Table values={values} setValues={setValues}/>
                <TouchableOpacity style={styles.button} onPress={() => getResult()}>
                    <Text style={styles.textButton}>Ver resultado</Text>
                </TouchableOpacity>
                {result && (
                    <View style={styles.resultArea}>
                        <View style={styles.result}>
                            {result.map(number => (
                                <Text style={styles.number}>{(number + 1).toString().padStart(2, '0')}</Text>
                            ))}
                        </View>
                        <Text style={styles.resultMessage}>{resultMessage}</Text>
                    </View>
                )}
            </View>
        </ScrollView>
    );
}

const styles = StyleSheet.create({
    container: {
        alignItems: 'center',
        backgroundColor: '#fff',
        flex: 1,
        justifyContent: 'center',
        padding: 24
    },
    title: {
        color: 'green',
        fontSize: 24,
        fontWeight: 'bold',
        margin: 24,
        textAlign: 'center'
    },
    button: {
        alignItems: 'center',
        backgroundColor: 'green',
        borderRadius: 8,
        justifyContent: 'center',
        padding: 12,
        width: '100%'
    },
    textButton: {
        color: '#fff',
        fontWeight: 'bold'
    },
    resultArea: {
        display: 'flex'
    },
    result: {
        display: 'flex',
        flexDirection: "row",
        gap: 8,
        margin: 12
    },
    number: {
        color: 'green',
        fontSize: 20,
        fontWeight: 'bold'
    },
    resultMessage: {
        color: 'green',
        fontSize: 18,
        fontWeight: 'bold'
    }
});
