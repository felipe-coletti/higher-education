import { Text, SafeAreaView, View, StyleSheet } from 'react-native'
import Card from '../../components/Card'

export default function Pizza() {
    return (
        <SafeAreaView>
            <View style={styles.container}>
                <Text style={styles.title}>Pizzas</Text>
                <Card title='Mussarela' description= 'Massa, queijo, molho de tomate...' price='R$ 40,00'/>
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
