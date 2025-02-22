import { View, StyleSheet } from 'react-native'

export default function Card({ children }) {
  return (
    <View style={styles.container}>
      {children}
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    backgroundColor: '#fff',
    padding: 12,
    width: '100%'
  }
})