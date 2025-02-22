import { NavigationContainer } from '@react-navigation/native'
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'

import Ionicons from 'react-native-vector-icons/Ionicons'

import colors from '../styles/colors'

import MP1 from '../pages/mp1'
import MP2 from '../pages/mp2'
import MP3 from '../pages/mp3'
import MP4 from '../pages/mp4'
import MP5 from '../pages/mp5'

const Tab = createBottomTabNavigator()

export default function MyTab() {
    return (
        <NavigationContainer>
            <Tab.Navigator
                screenOptions={({ route }) => ({
                    tabBarIcon: ({ focused, color, size }) => {
                        let iconName

                        switch (route.name) {
                            case 'MP1':
                                iconName = focused? 'calendar': 'calendar-outline'
                                break
                            case 'MP2':
                                iconName = focused? 'thermometer': 'thermometer-outline'
                                break
                            case 'MP3':
                                iconName = focused? 'alarm': 'alarm-outline'
                                break
                            case 'MP4':
                                iconName = focused? 'rocket': 'rocket-outline'
                                break
                            case 'MP5':
                                iconName = focused? 'fast-food': 'fast-food-outline'
                        }
                        
                        return <Ionicons name={iconName} size={size} color={color} />
                    },
                    tabBarActiveTintColor: colors.highlightColor,
                    tabBarInactiveTintColor: colors.secondaryTextColor,
                    headerShown: false
                })}
            >
                <Tab.Screen name="MP1" component={MP1} options={{ title: 'MP1' }}/>
                <Tab.Screen name="MP2" component={MP2} options={{ title: 'MP2' }}/>
                <Tab.Screen name="MP3" component={MP3} options={{ title: 'MP3' }}/>
                <Tab.Screen name="MP4" component={MP4} options={{ title: 'MP4' }}/>
                <Tab.Screen name="MP5" component={MP5} options={{ title: 'MP5' }}/>
            </Tab.Navigator>
        </NavigationContainer>
    )
}