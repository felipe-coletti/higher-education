import { View, StyleSheet } from 'react-native'

export default function Divider({ orientation }) {
  let style

  switch (orientation) {
    case 'horizontal':
      style = styles.horizontalDivider
      break
    case 'vertical':
      style = styles.verticalDivider
  }

  return (
    <View style={style}>
    </View>
  )
}

const styles = StyleSheet.create({
  horizontalDivider: {
    backgroundColor: '#ccc',
    height: 1,
    width: '100%'
  },
  verticalDivider: {
    backgroundColor: '#ccc',
    height: '100%',
    width: 1
  }
})