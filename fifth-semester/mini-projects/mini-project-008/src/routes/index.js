import { NavigationContainer } from '@react-navigation/native'
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'

import Ionicons from 'react-native-vector-icons/Ionicons'

import Home from '../pages/Home'
import Library from '../pages/Library'
import Explore from '../pages/Explore'
import More from '../pages/More'

const Tab = createBottomTabNavigator()

export default function MyTab() {
    return (
        <NavigationContainer>
            <Tab.Navigator
                screenOptions={({ route }) => ({
                    tabBarIcon: ({ focused, color, size }) => {
                        let iconName

                        switch (route.name) {
                            case 'Home':
                                iconName = focused ? 'home': 'home-outline'
                                break
                            case 'Library':
                                iconName = focused ? 'book': 'book-outline'
                                break
                            case 'Explore':
                                iconName = focused ? 'reader': 'reader-outline'
                                break
                            case 'More':
                                iconName = focused ? 'options': 'options-outline'
                        }
                        
                        return <Ionicons name={iconName} size={size} color={color} />
                    }
                })}
            >
                <Tab.Screen name="Home" component={Home} options={{ title: 'Página inicial' }}/>
                <Tab.Screen name="Library" component={Library} options={{ title: 'Biblioteca' }}/>
                <Tab.Screen name="Explore" component={Explore} options={{ title: 'Explorar' }}/>
                <Tab.Screen name="More" component={More} options={{ title: 'Mais' }}/>
            </Tab.Navigator>
        </NavigationContainer>
    )
}