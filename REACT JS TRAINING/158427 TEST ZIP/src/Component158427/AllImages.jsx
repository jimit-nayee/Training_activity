import React from 'react'
import { Link } from 'react-router-dom'
import { useState, useEffect } from 'react';
import getAllUsers from '../Service158427/ServiceAPI';

export default function AllImages() {
  const [users, setUsers] = useState({});
  useEffect(() => {
    getAllUsers().then((res) => setUsers(res.data))
  }, [])
  console.log(users)
  return (
    <div>
      <br />
      <Link to='/' >Home</Link> &nbsp; | &nbsp;
      <Link to='/image' >All Image</Link> &nbsp; | &nbsp;
      <Link to='/imagebyname' >Image By Name</Link> <br /><br /><br />

      <h1>All Images from the API</h1>
      <div>
        <table>
          <th>ID</th>
          <th>Name</th>
          <th>Images</th>
          {
            Array.from(users).map((user) => {
              return (
                <>
                  <tbody>
                    <tr>
                      <td>{user.id}</td>
                      <td>{user.login}</td>
                      <td><img src={user.avatar_url} alt="" /></td>
                    </tr>
                  </tbody>
                </>)
            })
          }
        </table>
      </div>
    </div>
  )
}
