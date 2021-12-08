<template>
  <div id="ticket">
    <h1 id="nome">Ticket</h1>
    <div id="conteudo" v-for="ticket in tickets" :key="ticket.id_ticket">
      <p>{{ ticket.placa_automovel }}</p>
      <p>{{ ticket.hora_entrada }}</p>
      <p>{{ ticket.id_ticket }}</p>
      <p>Obrigado pela<br />preferência</p>
    </div>
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

  methods: {},
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