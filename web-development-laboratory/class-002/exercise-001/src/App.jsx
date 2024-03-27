import './App.css'
import ShowUserName from './components/ShowUserName'
import UserDetails from './components/UserDetais'

function App() {
    const users = [
        {id: 1, name: "Primeiro nome", age: 1, job: "primeiro trabalho"},
        {id: 2, name: "Segundo nome", age: 18, job: "segundo trabalho"}
    ]

    return (
        <div className="container">
            <div className="content-area">
                <ShowUserName name="Primeiro nome"/>
                {users.map((user) => (
                    <UserDetails key={user.id} name={user.name} age={user.age} job={user.job}/>
                ))}
            </div>
        </div>
    )
}

export default App
