import { View, ScrollView, StyleSheet } from 'react-native'
import Ionicons from 'react-native-vector-icons/Ionicons'
import Card from '../components/Card'
import Button from '../components/Button'
import Divider from '../components/Divider'
import Section from '../components/Section'

export default function Home() {
    const images = [
        '',
        '',
        '',
        ''
    ]

    return (
        <ScrollView>
            <View style={styles.container}>
                <Card>
                    <View>
                        <ScrollView horizontal={true} showsHorizontalScrollIndicator={false}>
                            <View style={styles.verticalContentArea}>
                                <Button>Explorar</Button>
                                <Divider orientation='vertical'/>
                                <Button>Romance</Button>
                                <Button>Crime, suspense e mistério</Button>
                            </View>
                        </ScrollView>
                    </View>
                </Card>
                <Section
                    icon={<Ionicons name={'book'} size={20} color={'#000'} />}
                    title='Da sua biblioteca'
                    data={images}
                />
                <Section
                    title='Para você em Computação, internet e mídia digital'
                    data={images}
                />
                <Section
                    title='Para você em Educação'
                    data={images}
                />
            </View>
        </ScrollView>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        gap: 12
    },
    verticalContentArea: {
        alignItems: 'center',
        display: 'flex',
        flexDirection: 'row',
        gap: 8
    }
})