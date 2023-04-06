import './App.css';
import { Route , Routes } from 'react-router-dom';
import Home from './Component158427/Home';
import AllImages from './Component158427/AllImages';
import ImageByName from './Component158427/ImageByName';

function App() {
  return (
    <div className="App">     
     <Routes>
      <Route path="/" element={<Home />}/>
      <Route path="/image" element={<AllImages/>}/>
      <Route path="/imagebyname" element={<ImageByName/>}/>
     </Routes>
    </div>
  );
}
export default App;