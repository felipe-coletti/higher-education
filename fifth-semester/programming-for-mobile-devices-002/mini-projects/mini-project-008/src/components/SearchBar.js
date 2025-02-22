import { TextInput, StyleSheet } from 'react-native'

export default function SearchBar() {
  return (
    <TextInput style={styles.searchBar} placeholder='Pesquisar'/>
  )
}

const styles = StyleSheet.create({
  searchBar: {
    backgroundColor: '#d9d9d9',
    borderRadius: 4,
    padding: 8
  }
})