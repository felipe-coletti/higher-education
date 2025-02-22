import { Text, SafeAreaView, View, StyleSheet } from 'react-native'
import Card from '../../components/Card'

export default function Drinks() {
    return (
        <SafeAreaView>
            <View style={styles.container}>
                <Text style={styles.title}>Drinks</Text>
                <Card title='Suco de laranja' description= 'Laranja, água e açúcar.' price='R$ 10,00'/>
            </View>
        </SafeAreaView>
    )
}

const styles = StyleSheet.create({
    container: {
        display: 'flex',
        gap: 12,
        padding: 12
    },
    title: {
        fontSize: 24,
        fontWeight: 'bold'
    }
})
