import { View, Text, ScrollView, StyleSheet } from 'react-native'
import Card from './Card'
import Divider from './Divider'
import Book from './Book'
import Link from './Link'

export default function Section({ icon, title, data }) {
  return (
    <Card>
      <View style={styles.horizontalContentArea}>
        <View style={styles.verticalContentArea}>
          {icon && icon}
          <Text style={styles.title}>{title}</Text>
        </View>
        <Divider orientation='horizontal'/>
        <View>
          <ScrollView horizontal={true} showsHorizontalScrollIndicator={false}>
            <View style={styles.verticalContentArea}>
              {data && data.map((item, i) => <Book src={item} key={i}/>)}
            </View>
          </ScrollView>
        </View>
        <Divider orientation='horizontal'/>
        <Link>Ver tudo</Link>
      </View>
    </Card>
  )
}

const styles = StyleSheet.create({
  verticalContentArea: {
    alignItems: 'center',
    display: 'flex',
    flexDirection: 'row',
    gap: 8
  },
  horizontalContentArea: {
    display: 'flex',
    gap: 8,
    justifyContent: 'center'
  },
  title: {
    fontSize: 16,
    fontWeight: 'bold'
  }
})