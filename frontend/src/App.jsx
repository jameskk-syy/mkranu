import { React } from 'react'
import './App.css'
import {  Routes, Route } from 'react-router-dom';
import Login from './components/Login/Login'
import AddLoan from './components/Loan/AddLoan'
import ShowLoan from './components/Loan/ShowLoan'

function App() {

  return (
    <div className='App'>
      <Routes>
      <Route path='/' element={<Login/>}/>
        <Route path='/add' element={<AddLoan/>} />
        <Route path='/get' element={<ShowLoan />} />
      </Routes>
    </div>
  )
}

export default App
