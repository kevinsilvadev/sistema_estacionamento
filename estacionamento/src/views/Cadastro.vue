<template>
  <Navbar />
  <form id="cadastro" @submit.prevent="salvar" v-on="checkForm">
    <h1>Cadastrar-se</h1>

    <label for="nome">Nome</label>
    <br />
    <input type="text" name="nome" v-model="cliente.nome" />

    <br />
    <br />

    <label for="cpf">CPF</label>
    <br />
    <input type="text" name="cpf" v-model="cliente.cpf" />

    <br />
    <br />

    <label for="email">Email</label>
    <br />
    <input type="text" name="email" v-model="cliente.email" />

    <br />
    <br />

    <label for="senha">Senha</label>
    <br />
    <input type="password" name="senha" v-model="cliente.senha" />
    <br>
    <br>
    <br>
    <button id="b" type="submit">Cadastrar</button>
  </form>
  <ul>
    <li v-for="error in erros" :key="error.id">{{error}}</li>
  </ul>
</template>

<script>
import Navbar from "@/components/Navbar.vue";

import Clientes from "../services/clientes";

export default {
  components: {
    Navbar,
  },

  data() {
    return {
      cliente: {
        nome: "",
        cpf: "",
        email: "",
        senha: "",
        errors: []
      },
      clientes: [],
    };
  },

  mounted() {
    Clientes.listar().then((response) => {
      console.log(response.data);
    });
  },

  methods: {
    salvar() {
      Clientes.salvar(this.cliente).then((response) => {
        alert(`Cadastrado com sucesso, bem-vindo ${this.cliente.nome}`);
        this.cliente = response.data;
      });
    },

    checkForm: function () {
        if(!this.cliente.nome) {
          this.cliente.errors('O nome deve ser preenchido')
        }

        if(!this.cliente.cpf) {
          this.errors.push('Email deve ser preenchido')
        }

        
        if(!this.cliente.email == null) {
          this.errors.push('Email deve ser preenchido')
        }

        
        if(!this.cliente.senha == null) {
          this.errors.push('Email deve ser preenchido')
        }
    }
  },
};
</script>

<style scoped>
h1 {
  width: 350px;
  height: 70px;

  font-family: Sans-serif;
  font-size: 35px;
  line-height: 61px;
  color: white;
  background: #22856d;
  border-radius: 50px 50px 50px 50px;
}
label {
  font-size: 30px;
}
#cadastro {
  position: absolute;
  left: 750px;
  top: 200px;
  text-align: center;
}
input {
  width: 300px;
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
  position: absolute;
  color: black;
  left: 880px;
  font-family: Sans-serif;
}
#b {
  font-family: Sans-serif;
  font-size: 30px;
  color: white;
  width: 200px;
  height: 58px;
  background: #22856d;
  border-radius: 20px;
}
</style>