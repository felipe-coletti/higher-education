import { NavigationContainer } from '@react-navigation/native'
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'

import Ionicons from 'react-native-vector-icons/Ionicons'

import colors from '../styles/colors'

import Episode1 from '../pages/Episode1'
import Episode2 from '../pages/Episode2'
import Episode3 from '../pages/Episode3'
import Episode4 from '../pages/Episode4'
import Episode5 from '../pages/Episode5'
import Episode6 from '../pages/Episode6'

const Tab = createBottomTabNavigator()

export default function MyTab() {
    return (
        <NavigationContainer>
            <Tab.Navigator
                screenOptions={({ route }) => ({
                    tabBarStyle:{
                        backgroundColor:'#000'
                    },
                    tabBarIcon: ({ focused, color, size }) => {
                        let iconName

                        switch (route.name) {
                            case 'Episode1':
                                iconName = focused ? 'planet': 'planet-outline'
                                break
                            case 'Episode2':
                                iconName = focused ? 'body': 'body-outline'
                                break
                            case 'Episode3':
                                iconName = focused ? 'flame': 'flame-outline'
                                break
                            case 'Episode4':
                                iconName = focused ? 'bandage': 'bandage-outline'
                                break
                            case 'Episode5':
                                iconName = focused ? 'bowling-ball': 'bowling-ball-outline'
                                break
                            case 'Episode6':
                                iconName = focused ? 'color-wand': 'color-wand-outline'
                        }
                        
                        return <Ionicons name={iconName} size={size} color={color} />
                    },
                    tabBarActiveTintColor: colors.activedTextColor,
                    tabBarInactiveTintColor: colors.textColor,
                    headerShown: false
                })}
            >
                <Tab.Screen name="Episode1" component={Episode1} options={{ title: 'Episode I' }}/>
                <Tab.Screen name="Episode2" component={Episode2} options={{ title: 'Episode II' }}/>
                <Tab.Screen name="Episode3" component={Episode3} options={{ title: 'Episode III' }}/>
                <Tab.Screen name="Episode4" component={Episode4} options={{ title: 'Episode IV' }}/>
                <Tab.Screen name="Episode5" component={Episode5} options={{ title: 'Episode V' }}/>
                <Tab.Screen name="Episode6" component={Episode6} options={{ title: 'Episode VI' }}/>
            </Tab.Navigator>
        </NavigationContainer>
    )
}