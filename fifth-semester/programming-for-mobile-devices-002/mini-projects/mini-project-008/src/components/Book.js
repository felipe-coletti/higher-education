import { View, Image, StyleSheet } from 'react-native'

export default function Book({ src }) {
  return (
    <View style={styles.container}>
      <Image style={styles.image} source={src} />
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    aspectRatio: 1/1.6,
    backgroundColor: '#d9d9d9',
    display: 'flex',
    width: 96
  },
  image: {
    flex: 1
  }
})