import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { ChatClient } from './components/chatcliente/Chatclient'

function App() {  

  return (
    <div className="App"> 
          
      <ChatClient />
    </div>
  )
}

export default App
