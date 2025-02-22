import { Text, View, ScrollView, StyleSheet } from 'react-native'

import colors from '../styles/colors'

export default function Episode({ title, subtitle, children }) {
    return (
        <View style={styles.container}>
            <ScrollView>
                <View style={styles.contentArea}>
                    <Text style={styles.title}>{title}</Text>
                    <Text style={styles.subtitle}>{subtitle}</Text>
                    <Text style={styles.text}>{children}</Text>
                </View>
            </ScrollView>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: colors.backgroundColor,
        flex: 1
    },
    contentArea: {
        flex: 1,
        gap: 12,
        height: '100%',
        padding: 12,
        transform: 'rotateX(-55deg)'
    },
    title: {
        color: colors.activedTextColor,
        fontSize: 16,
        fontWeight: 'bold',
        textAlign: 'center'
    },
    subtitle: {
        color: colors.activedTextColor,
        fontSize: 28,
        fontWeight: 'bold',
        textAlign: 'center',
        textTransform: 'uppercase'
    },
    text: {
        color: colors.activedTextColor,
        fontSize: 16,
        fontWeight: 'bold'
    }
})