import api from './config'

export default {
    listar: () => {
        return api.get("tickets")
    },

    salvar: (ticket) => {
        return api.post("tickets", ticket)

    },


    findByid: (ticket) => {
        return api.get(`tickets/${ticket}`)
    }
}