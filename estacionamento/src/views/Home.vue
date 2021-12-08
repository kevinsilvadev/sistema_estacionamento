<template>
  <Navbar />
  <img id="fundo" alt="fundo" src="../assets/fundo.jpeg" />
  <button
    onclick="window.location.href = 'http://localhost:8080/cadastro' "
    id="b1"
  >
    Crie sua conta
  </button>
  <h1 id="h1">O Estacionamento do futuro</h1>
</template>

<style scoped>
#fundo {
  position: absolute;
  width: 1920px;
  height: 807px;
  top: 130px;
  right: 8px;
  left: 0px;
  background: url("../assets/fundo.jpeg");
}
#h1 {
  position: absolute;
  width: 950px;
  height: 120px;
  right: 450px;
  top: 300px;
  text-align: center;

  font-family: Sans-serif;
  font-weight: normal;
  font-size: 70px;
  line-height: 135px;
  color: white;
  background: #22856d;
  border-radius: 50px 50px 50px 50px;
}

#b1 {
  position: absolute;
  width: 266px;
  height: 58px;
  left: 840px;
  top: 600px;

  font-family: Sans-serif;
  font-size: 30px;
  color: white;

  background: #22856d;
  border-radius: 20px;
}
</style>

<script>
import Navbar from "@/components/Navbar.vue";

export default {
  components: {
    Navbar,
  },
};
</script>
