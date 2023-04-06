import axios from 'axios'

const getAllUsers = () =>{
    return axios.get(`https://api.github.com/users`);
}

export const getByName = (name) =>{
    return axios.get(`https://api.github.com/users/${name}`)
}

export default getAllUsers