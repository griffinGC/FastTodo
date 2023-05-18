import React from 'react';
import logo from './logo.svg';
import './App.css';
import { createBrowserRouter, createRoutesFromElements, Route, RouterProvider } from 'react-router-dom';
import Main from './component/Main';
import Header from './component/Header';
import Todo from './page/Todo';

const router = createBrowserRouter(
  createRoutesFromElements(
    <Route path="/" element={<Main />}>
      <Route path='/todo' element={<Todo />}></Route>
    </Route>
  )
)

function App() {
  return (
    <div className="App">
      <Header/>
      <RouterProvider router={router} />  
    </div>
  );
}

export default App;
