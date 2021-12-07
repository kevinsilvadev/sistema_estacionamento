import api from './config'

export default {
    listar: () => {
        return api.get("clientes")
    },

    salvar: (clientes) => {
        return api.post("clientes", clientes)

    }
}