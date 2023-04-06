import React from 'react'
import { Link } from 'react-router-dom'

function Home() {
  return (
    <div>
         <br/>
                <Link to='/' >Home</Link> &nbsp; | &nbsp;
                <Link to='/image' >All Image</Link> &nbsp; | &nbsp;
                <Link to='/imagebyname' >Image By Name</Link> <br/><br/><br/>

                <h1>Fetch Image data from the API</h1>
    </div>
  )
}
export default Home;