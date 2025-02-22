import { TouchableOpacity, Text, StyleSheet } from 'react-native'

export default function Button({ children }) {
  return (
    <TouchableOpacity style={styles.button}>
      <Text style={styles.buttonText}>
        {children}
      </Text>
    </TouchableOpacity>
  )
}

const styles = StyleSheet.create({
  button: {
    alignItems: 'center',
    backgroundColor: 'transparent',
    borderColor: '#000',
    borderRadius: 4,
    borderWidth: 1,
    display: 'flex',
    padding: 8
  },
  buttonText: {
    fontWeight: 'bold'
  }
})