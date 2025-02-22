import {View, StyleSheet} from 'react-native'
import Field from './Field'

export default props => {
    const { board, onOpenField, onSelectField} = props

    const rows = board.map((row, r) => {
        const columns = row.map((field, c) => {
            return (
                <Field
                    {...field}
                    key={c}
                    onOpen={() => onOpenField(r, c)}
                    onSelect={e => onSelectField(r, c)}
                />
            )
        })
        return <View key={r}>{columns}</View>
    })
    
    return <View style={styles.container}>{rows}</View>
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#EEE',
        flexDirection: 'row'
    }
})