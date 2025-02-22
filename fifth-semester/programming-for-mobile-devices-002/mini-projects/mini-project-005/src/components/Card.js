import { View, Text, StyleSheet } from 'react-native'
import colors from '../styles/colors'

export default function Card({ title, description, price }) {
    return (
        <View style={styles.container}>
            <View style={styles.contentArea}>
                <Text style={styles.title}>{title}</Text>
                <Text style={styles.text}>{description}</Text>
            </View>
            <Text style={styles.text}>{price}</Text>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        alignItems: 'center',
        backgroundColor: colors.secondaryBackgroundColor,
        borderColor: colors.borderColor,
        borderRadius: 12,
        borderStyle: 'solid',
        borderWidth: 1,
        display: 'flex',
        flexDirection: 'row',
        gap: 8,
        justifyContent: 'space-between',
        padding: 12
    },
    contentArea: {
        display: 'flex',
        gap: 4
    },
    title: {
        color: colors.primaryTextColor,
        fontSize: 16,
        fontWeight: 'bold'
    },
    text: {
        color: colors.secondaryTextColor,
        fontSize: 14
    }
})
