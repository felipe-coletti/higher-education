import { Component } from 'react'
import { SafeAreaView, Text, ScrollView, View, StyleSheet } from 'react-native'
import params from './src/params'
import Header from './src/components/Header'
import MineField from './src/components/MineField'
import {
    createMineBoard,
    cloneBoard,
    hadExplosion,
    openField,
    showMines,
    wonGame,
    invertFlag,
    flagsUsed,
} from './src/functions'

export default class App extends Component {
    constructor(props) {
        super(props)
        this.state = this.createState()
    }

    minesAmount = () => {
        const cols = params.getColumnsAmount()
        const rows = params.getRowsAmount()

        return Math.ceil(cols * rows * params.difficult)
    }

    createState = () => {
        const cols = params.getColumnsAmount()
        const rows = params.getRowsAmount()
        return {
            board: createMineBoard(cols, rows, this.minesAmount()),
            won: false,
            lost: false,
            showLevelSelection: false,
        }
    }

    onOpenField = (row, column) => {
        if (this.state.lost) return
        
        const board = cloneBoard(this.state.board)
        openField(board, row, column)
        const lost = hadExplosion(board)
        const won = wonGame(board)

        if (lost) {
            showMines(board)
        }

        this.setState({board, lost, won})
    }

    onSelectField = (row, column) => {
        if (this.state.lost) return

        const board = cloneBoard(this.state.board)
        invertFlag(board, row, column)
        const won = wonGame(board)

        this.setState({board, won})
    }

    render() {
        return (
            <SafeAreaView style={styles.container}>
            <ScrollView>
                <Header
                    flagsLeft={this.minesAmount() - flagsUsed(this.state.board)}
                    onNewGame={() => this.setState(this.createState())}
                />
                {this.state.won || this.state.lost && (
                    <View style={styles.gameOver}>
                        {this.state.won && <Text style={styles.wonText}>Você ganhou!</Text>}
                        {this.state.lost && <Text style={styles.lostText}>Você perdeu!</Text>}
                    </View>
                )}
                <MineField
                    board={this.state.board}
                    onOpenField={this.onOpenField}
                    onSelectField={this.onSelectField}
                />
            </ScrollView>
            </SafeAreaView>
        )
    }
}

const styles = StyleSheet.create({
    container: {
        alignItems: 'center',
        backgroundColor: '#f5fcff',
        flex: 1,
        justifyContent: 'center'
    },
    gameOver: {
        alignItems: 'center',
        backgroundColor: '#EEE',
        display: 'flex',
        left: '50%',
        padding: 20,
        position: 'absolute',
        top: '50%',
        transform: 'translate(-50%, -50%)',
        width: '80%',
        zIndex: 1
    },
    wonText: {
        color: 'green',
        fontSize: 24,
        fontWeight: 'bold'
    },
    lostText: {
        color: 'red',
        fontSize: 24,
        fontWeight: 'bold'
    }
})
