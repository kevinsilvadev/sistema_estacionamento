<template>
  <Navbar/>
  <img id="fundo" alt="fundo" src="../assets/fundo.jpeg"/>
  <button onclick="window.location.href = 'http://localhost:8080/cadastro' " id="b1">Crie sua conta</button>
  <h1 id="h1">O Estacionamento do futuro</h1>
</template>

<style scoped>
  #fundo{
    position: absolute;
    width: 1920px;
    height: 807px;
    top: 130px;
    right: 8px;
    left: 0px;
    background: url("../assets/fundo.jpeg");
  }
  #h1{
    position: absolute;
    width: 1000px;
    height: 88px;
    right: 450px;
    top: 300px;

    font-family: Sans-serif;
    font-weight: normal;
    font-size: 80px;
    line-height: 135px;
    color: #1d745e;
  }

  #b1{
    position: absolute;
    width: 266px;
    height: 58px;
    left: 840px;
    top: 600px;

    font-family: Sans-serif;
    font-size: 30px;
    color: white;

    background: #22856D;
    border-radius: 20px;
  }

</style>

<script>
import Navbar from "@/components/Navbar.vue";

export default{
    components:{
        Navbar
    },
};
</script>
