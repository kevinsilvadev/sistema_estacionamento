<template>
  <Navbar />

  <form @submit.prevent="findByid">
    <div id="taxa">
      <h1 id="htaxa" class="titulo">Dados do ticket</h1>
      <br />
      <div id="idt">
        <label for="idticket">Id do ticket</label>
        <br />
        <input class="text" type="text" name="idticket" v-model="ticket.id" />
        <br />
        <br />
        <button id="b" type="submit">Buscar</button>
      </div>
    </div>
  </form>

  <form id="forma" @submit="salvarPagamento">
    <h1 class="titulo">Pagamento</h1>
    <div id="pix">
      <img class="img" src="../assets/pix.png" />
      <br />
      <label for="pix">Pix</label>
      <input name="pix" type="checkbox" />
    </div>

    <div id="card">
      <img class="img" src="../assets/card.png" />
      <br />
      <label for="card">Cartão</label>
      <input
        name="card"
        type="checkbox"
        value="cartao"
        v-model="pagamento.status"
      />
    </div>
    <br />
    <br />
    <button id="b" type="submit">Pagar</button>
  </form>

  <div id="ticket">
    <h1 id="nome">Ticket</h1>
    <div id="conteudo" v-if="ticket">
      <p>{{ ticket.placa_automovel }}</p>
      <p>{{ ticket.hora_entrada }}</p>
      <p>{{ ticket.id_ticket }}</p>
      <p>$20</p>
    </div>
  </div>
</template>

<script>
import Navbar from "@/components/Navbar.vue";
import ticket from "../services/ticket";
import pagamentos from "../services/pagamento";

export default {
  components: {
    Navbar,
  },

  data() {
    return {
      ticket: {
        id: "",
      },
      tickets: [],

      pagamento: {
        status: "",
      },
      pagamentos: [],
    };
  },

  mounted() {
    ticket.listar().then((response) => {
      this.ticket = response.data;
      console.log(response.data);
    });
  },

  methods: {
    findByid() {
      ticket.findByid(this.ticket.id).then((response) => {
        this.ticket = response.data;
        console.log(response.data);
        alert("Ticket encontrado com sucesso");
      });
    },

    salvarPagamento() {
      pagamentos.salvar(this.pagamento).then((response) => {
        this.pagamento = response.data;
        alert("Pago!");
      });
    },
  },
};
</script>


<style scoped>
.text {
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
h2 {
  font-size: 70px;
}
#b {
  width: 150px;
  height: 50px;
  font-family: Sans-serif;
  font-size: 30px;
  color: white;

  background-color: #22856d;
  border-radius: 5px;
}
#taxa {
  text-align: center;
  position: absolute;
  font-size: 20px;
  left: 140px;
  top: 200px;
}
label {
  font-size: 30px;
}

#htaxa {
  font-size: 45px;
}

.titulo {
  width: 400px;
  height: 70px;
  font-family: Sans-serif;
  font-size: 50px;

  text-align: center;
  color: white;
  background: #22856d;
  border-radius: 50px 50px 50px 50px;
}

#forma {
  position: absolute;
  top: 200px;
  left: 1300px;
  text-align: center;
}
.img {
  width: 200px;
}

#ticket {
  position: absolute;
  left: 750px;
  top: 200px;
}

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