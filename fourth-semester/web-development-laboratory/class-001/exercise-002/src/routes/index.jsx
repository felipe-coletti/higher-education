import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import Home from '../pages/Home'
import SecondPage from '../pages/SecondPage'
import ThirdPage from '../pages/ThirdPage'

const PagesRoutes = () => {
    return(
        <Router>
            <Routes>
                <Route path="/" element={<Home/>}/>
                <Route path="/page2" element={<SecondPage/>}/>
                <Route path="/page3" element={<ThirdPage/>}/>
            </Routes>
        </Router>
    )
}

export default PagesRoutes