import { View, StyleSheet } from 'react-native'

export default () => {
    return (
        <View style={styles.container}>
            <View style={styles.landmineColor}/>
            <View style={styles.line}/>
            <View style={[styles.line, { transform: [{ rotate: '45deg' }] }]}/>
            <View style={[styles.line, { transform: [{ rotate: '90deg' }] }]}/>
            <View style={[styles.line, { transform: [{ rotate: '135deg' }] }]}/>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        alignContent: 'center',
        justifyContent: 'center'
    },
    landmineColor: {
        alignItems: 'center',
        backgroundColor: 'black',
        borderRadius: 10,
        height: 14,
        justifyContent: 'center',
        width: 14
    },
    line: {
        backgroundColor: 'black',
        borderRadius: 3,
        height: 3,
        position: 'absolute',
        width: 20
    }
})