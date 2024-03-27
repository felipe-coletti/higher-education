import './App.css'
import ShowUserName from './components/ShowUserName'
import UserDetails from './components/UserDetais'

function App() {
    const users = [
        {id: 1001, name: "Tom", age: 19, job: "só dorme"},
        {id: 1002, name: "Lisa", age: 17, job: "aprendiz de inspetora"},
        {id: 1003, name: "Jão", age: 25, job: "desenvolvedor"}
    ]

    return (
        <div className="container">
            <ShowUserName name="Junior"/>
            {users.map((user) => (
                <UserDetails key={user.id} name={user.name} age={user.age} job={user.job}/>
            ))}
        </div>
    )
}

export default App
