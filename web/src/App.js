import './App.css';
import GameBoard from './pages/GameBoard';
import StartGame from './pages/StartGame';
import {BrowserRouter, Routes, Route} from 'react-router-dom'

function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path='/' exact element={<StartGame />} />
          <Route path='/board' element={<GameBoard />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
