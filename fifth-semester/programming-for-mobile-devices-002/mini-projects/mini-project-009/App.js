import { NavigationContainer } from '@react-navigation/native'
import { createStackNavigator } from '@react-navigation/stack'
import CreateUser from './pages/CreateUser'
import UpdateUser from './pages/UpdateUser'
import ViewUser from './pages/ViewUser'
import { Button, Icon } from 'react-native-elements'

const Stack = createStackNavigator()

const screenOptions = {
    headerStyle: {
        backgroundColor: '#009955'
    },
    headerTintColor: '#fff',
    headerTitleStyle: {
        fontWeight: 'bold'
    }
}

export default comp => {
    return (
        <NavigationContainer>
            <Stack.Navigator
                initialRouteName='ViewUser'
                screenOptions={screenOptions}
            >
                <Stack.Screen
                    name='ViewUser'
                    component={ViewUser}
                    options={({navigation}) => {
                        return {
                            title: 'Lista de usuários',
                            headerRight: () => (
                                <Button
                                    onPress={() => navigation.navigate('CreateUser')}
                                    type='clear'
                                    icon={<Icon name='add' size={25} color='white' />}
                                />
                            )
                        }
                    }}
                />
                <Stack.Screen
                    name='CreateUser'
                    component={CreateUser}
                    options={{
                        title: 'Formulário de Usuários'
                    }}
                />
                <Stack.Screen
                    name='UpdateUser'
                    component={UpdateUser}
                    options={{
                        title: 'Formulário de Usuários'
                    }}
                />
            </Stack.Navigator>
        </NavigationContainer>
    )
}
