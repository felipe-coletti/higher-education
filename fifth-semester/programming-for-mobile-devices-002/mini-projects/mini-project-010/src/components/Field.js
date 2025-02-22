import { Text, View, StyleSheet, TouchableWithoutFeedback } from 'react-native'
import params from '../params'
import Mine from './Mine'
import Flag from './Flag'

export default props => {
    const { mined, opened, nearMines, exploded, marked } = props
    const fieldStyle = [styles.field]

    if (opened) fieldStyle.push(styles.opened)
    if (exploded) fieldStyle.push(styles.exploded)
    if (marked) fieldStyle.push(styles.marked)
    if (!opened && !exploded) fieldStyle.push(styles.regular)

    let color

    if (nearMines > 0) {
        if (nearMines === 1) color = '#2a28d7'
        if (nearMines === 2) color = '#2b520f'
        if (nearMines > 2 && nearMines < 6) color = '#f9060a'
        if (nearMines >= 6) color = '#f221a9'
    }

    return (
        <TouchableWithoutFeedback onPress={props.onOpen} onLongPress={props.onSelect}>
            <View style={fieldStyle}>
                {!mined && opened && nearMines > 0 && (
                    <Text style={[ styles.label, {color: color} ]}>{nearMines}</Text>
                )}
                {mined && opened && (
                  <Mine/>
                )}
                {marked && !opened && (
                  <Flag/>
                )}
            </View>
        </TouchableWithoutFeedback>
    )
}

const styles = StyleSheet.create({
    field: {
        borderWidth: params.borderSize,
        height: params.blockSize,
        width: params.blockSize
    },
    regular: {
        backgroundColor: '#999',
        borderBottomColor: '#333',
        borderLeftColor: '#ccc',
        borderRightColor: '#333',
        borderTopColor: '#ccc',
    },
    opened: {
        alignItems: 'center',
        backgroundColor: '#999',
        borderColor: '#777',
        justifyContent: 'center'
    },
    label: {
        fontSize: params.fontSize,
        fontWeight: 'bold'
    },
    exploded: {
        backgroundColor: 'red',
        borderColor: 'red'
    },
    marked: {}
})
