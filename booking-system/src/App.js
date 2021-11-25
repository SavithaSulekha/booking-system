import './App.css';
import DeviceList from './components/DeviceList'
import Header from './components/Header/Header'
import React, { useState } from 'react';

function App() {
  const [isOpen, setIsOpen] = useState(false);
 
  const togglePopup = () => {
    setIsOpen(!isOpen);
  }
  return (
    <div className="container">
       <Header />
      <DeviceList />
    </div>
  );
}

export default App;
