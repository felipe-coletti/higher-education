import { Dimensions } from 'react-native'

const params = {
    blockSize: 30,
    borderSize: 5,
    fontSize: 15,
    paintelRatio: 0.15,
    difficult: 0.1,
    getColumnsAmount() {
        const width = Dimensions.get('window').width
        return Math.floor(width / this.blockSize)
    },
    getRowsAmount() {
        const totalHeight = Dimensions.get('window').height
        const borderHeight = totalHeight * (1 - this.paintelRatio)
        return Math.floor(borderHeight / this.blockSize)
    }
}

export default params