<template>
  <div id="ticket">
    <h1 id="nome">Ticket</h1>
    <ul id="example-1" v-for="ticket in tickets" :key="ticket.id_ticket">
      <li>Codigo: {{ ticket.id_ticket }}</li>
      <li>Placa: {{ ticket.placa_automovel }}</li>
      <li>Horário: {{ ticket.hora_entrada }}</li>
    </ul>
  </div>
</template>

<script>
import Tickets from "../services/ticket";
export default {
  name: "Ticket",
  props: {
    placa: String,
    data: String,
    cod: String,
  },

  mounted() {
    Tickets.listar().then((response) => {
      this.tickets = response.data;
      console.log(response.data);
    });
  },
  data() {
    return {
      tickets: [],
    };
  },

  methods: {
    modalContent(index) {
      const title = this.tickets[index].id_ticket;
      console.log(title);
    },
  },
};
</script>


<style scoped>
#nome {
  width: 350px;
  height: 70px;

  font-family: Sans-serif;
  font-size: 35px;
  line-height: 61px;
  text-align: center;
  color: white;
  background: #22856d;
  border-radius: 50px 50px 50px 50px;
}
#conteudo {
  position: absolute;
  left: 40px;
  background-color: white;
  border-radius: 20px;

  text-align: center;
  font-size: 30px;
  width: 250px;
}
</style>