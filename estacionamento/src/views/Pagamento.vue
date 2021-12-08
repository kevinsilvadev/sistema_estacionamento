<template>
  <div id="taxa">
    <h1 id="htaxa" class="titulo">Taxa da Reserva</h1>
    <br />
    <h2>R$ 10,00</h2>
  </div>

  <form id="forma" @submit.prevent="salvar">
    <h1 class="titulo">Pagamento</h1>
    <div id="pix">
      <img class="img" src="../assets/pix.png" />
      <br />
      <label for="pix">Pix</label>
      <input name="pix" type="checkbox" value="Pix" />
    </div>

    <div id="card">
      <img class="img" src="../assets/card.png" />
      <br />
      <label for="card">Cartão</label>
      <input name="card" type="checkbox"  v-model="pagamento.modo" />
    </div>
    <br />
    <br />
    <button id="bpagar" type="submit">Pagar</button>
  </form>
</template>

<script>
import Pagamentos from "../services/pagamento";
export default {
  data() {
    return {
      pagamento: {
       modo: ""
      },
      pagamentos: [],
    };
  },

  mounted() {
    Pagamentos.listar().then((response) => {
      console.log(response.data);
    });
  },

  methods: {
    salvar() {
      Pagamentos.salvar(this.pagamento).then((response) => {
        this.pagamento = response.data;
        alert(`Sua reserva foi paga, muito obrigado! Volte sempre`);
      });
    },
  },
};
</script>

<style scoped>
h2 {
  font-size: 70px;
}
#bpagar {
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
  left: 200px;
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
</style>