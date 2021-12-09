<template>
  <form id="reserva" @submit.prevent="salvar">
    <h1 id="treserva">Faça sua reserva</h1>
    <br />
    <br />

    <label for="placa">Placa</label>
    <br />
    <br />
    <input class="i1" name="placa" v-model="ticket.placa_automovel" />

    <br />
    <br />

    <label for="drywash">Drywash</label>
    <input name="drywash" type="checkbox" />
    <br />
    <br />
    <br />
    <button
      id="breserva"
      onclick="window.location.href = 'http://localhost:8080/pagamento'"
      type="submit"
    >
      Reservar
    </button>
    <br />
    <br />
  </form>

</template>

<script>
import ticketSalvar from "../services/ticket";
export default {
  components: {
 
  },

  data() {
    return {
      ticket: {
        placa_automovel: "",
        horario: "",
      },

      tickets: [],
    };
  },

  mounted() {
    ticketSalvar.listar().then((response) => {
      console.log(response.data);
    });
  },

  methods: {
    salvar() {
      ticketSalvar.salvar(this.ticket).then((response) => {
        this.cliente = response.data;
        alert(`Ticket emitido! `);

      });
    },
  },
};
</script>


<style scoped>
label {
  font-size: 30px;
}
#i {
  position: absolute;
  left: 1200px;
  top: 280px;
}
#reserva {
  text-align: center;
  position: absolute;
  top: 300px;
  left: 750px;
}

#breserva {
  width: 100px;
  height: 30px;
  font-family: Sans-serif;
  font-size: 20px;
  color: white;

  background-color: #22856d;
  border-radius: 5px;
}
#treserva {
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
.i1 {
  width: 200px;
  height: 43px;
  left: 766px;
  background-color: black;
  text-align: center;
  font-size: 18px;
  font-family: Sans-serif;
  background: rgba(255, 255, 255, 0.56);
  border-radius: 39px;
}
</style>