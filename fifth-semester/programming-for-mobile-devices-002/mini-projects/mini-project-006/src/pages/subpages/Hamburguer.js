import { Text, SafeAreaView, View, StyleSheet } from 'react-native'
import Card from '../../components/Card'

export default function Hamburguer() {
    return (
        <SafeAreaView>
            <View style={styles.container}>
                <Text style={styles.title}>Hamburguers</Text>
                <Card title='X-Burguer' description= 'pão, hamburguer, queijo, alface...' price='R$ 15,00'/>
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
