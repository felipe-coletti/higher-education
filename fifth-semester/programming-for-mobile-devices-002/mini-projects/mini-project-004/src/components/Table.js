import { useState } from 'react'
import { StyleSheet, View, TouchableOpacity, Text } from 'react-native'

export default Table = ({ values, setValues }) => {
    const [test, setTest] = useState(false)

    const switchValue = (i) => {
        if (values.filter(value => value === true).length < 6 || values[i] === true) {
            let newValues = values

            newValues[i] = !values[i]

            setValues(newValues)
            setTest(!test)
        }
    }

    return (
        <View style={styles.container}>
            {values.map((value, i) => (
                <TouchableOpacity
                    style={value ? styles.activedButton : styles.button}
                    onPress={() => switchValue(i)}
                    key={i}
                >
                    <Text style={value ? styles.activedText : styles.text}>
                        {(i + 1).toString().padStart(2, 0)}
                    </Text>
                </TouchableOpacity>
            ))}
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flexDirection: 'row',
        flexWrap: 'wrap',
        justifyContent: 'center',
    },
    button: {
        alignItems: 'center',
        backgroundColor: 'transparent',
        border: '1px solid green',
        borderRadius: '50%',
        justifyContent: 'center',
        margin: 12,
        padding: 12
    },
    activedButton: {
        alignItems: 'center',
        backgroundColor: 'green',
        border: '1px solid green',
        borderRadius: '50%',
        justifyContent: 'center',
        margin: 12,
        padding: 12
    },
    text: {
        color: 'green',
        fontWeight: 'bold',
    },
    activedText: {
        color: '#fff',
        fontWeight: 'bold'
    }
})
