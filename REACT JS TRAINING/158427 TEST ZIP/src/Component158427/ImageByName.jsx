import React, { useState, useEffect } from 'react'
import { Link } from 'react-router-dom'
import { useForm } from 'react-hook-form'
import { getByName } from '../Service158427/ServiceAPI'

export default function ImageByName() {

  const [name, setName] = useState("")
  const [user, setUser] = useState({})
  const [error, setError] = useState("")

  useEffect(() => { }, [])

  const { register, handleSubmit } = useForm();
  const onSubmit = (data, e) => {
    getByName(data.login).then(res => {
      setUser(res.data);
      setError("")
    }).catch((error) => {
      setError("USER NOT FOUND");
      setUser({})
    })
  }
  const onError = (errors, e) => console.log(errors, e);
  return (
    <div>
      <br />
      <Link to='/' >Home</Link> &nbsp; | &nbsp;
      <Link to='/image' >All Image</Link> &nbsp; | &nbsp;
      <Link to='/imagebyname' >Image By Name</Link> <br /><br /><br />

      <h1>To See specific image from the API</h1>
      <form onSubmit={handleSubmit(onSubmit, onError)}>
        <input {...register("login")} /><br /><br />
        <button type="submit">Submit</button>
      </form><br />
      <div><h3><b>{error}</b></h3></div>
      {/* <h1>{user.login}</h1>
      <img src={user.url} alt="" /> */}

        <table>
          <th>ID</th>
          <th>Name</th>
          <th>Images</th>
          <tbody>
            <tr>
              <td>{user.id}</td>
              <td>{user.login}</td>
              <td><img src={user.avatar_url} alt="" /></td>
            </tr>
          </tbody>
        </table>

    </div>
  )
}
