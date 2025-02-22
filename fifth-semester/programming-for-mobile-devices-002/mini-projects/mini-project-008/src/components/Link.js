import { Text, StyleSheet } from 'react-native'

export default function Link({ children }) {
  return (
    <Text style={styles.link}>
      {children}
    </Text>
  )
}

const styles = StyleSheet.create({
  link: {
    color: 'blue'
  }
})