import {View, Text, StyleSheet, TouchableOpacity} from 'react-native'
import Flag from './Flag'

export default props => {
    const { flagsLeft, onNewGame } = props

    return (
        <View style={styles.container}>
            <View style={styles.flagContainer}>
                <Flag bigger/>
                <Text style={styles.flagsLeft}>{flagsLeft}</Text>
            </View>
            <TouchableOpacity style={styles.button} onPress={onNewGame}>
                <Text style={styles.buttonLabel}>Novo Jogo</Text>
            </TouchableOpacity>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        display: 'flex',
        flexDirection: 'row',
        backgroundColor: '#EEE',
        alignItems: 'center',
        justifyContent: 'space-around',
        padding: 20,
        width: '100%'
    },
    flagContainer: {
        display: 'flex',
        flexDirection: 'row',
    },
    flagsLeft: {
        fontSize: 30,
        fontWeight: 'bold',
        marginLeft: 40
    },
    button: {
        backgroundColor: '#999',
        padding: 5,
    },
    buttonLabel: {
        fontSize: 20,
        color: '#DDD',
        fontWeight: 'bold',
    },
})