import api from './config'

export default {
    listar: () => {
        return api.get("pagamentos")
    },

    salvar: (pagamento) => {
        return api.post("pagamentos", pagamento)

    }
}