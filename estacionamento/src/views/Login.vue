<template id="app">
  <Navbar/>
  <form id="login">
    <h1>Conectar-se</h1>
    <label for="email">Email</label>
    <br/>
    <input type="text" name="email"/>
    <br/>
    <br/>
    <label for="senha">Senha</label>
    <br/>
    <input type="password" name="senha"/>
  </form>
  <button id="b" onclick="window.location.href = 'http://localhost:8080/dashc' ">Entrar</button>
</template>

<script>
import Navbar from "@/components/Navbar.vue";

export default {
  components: {
    Navbar
  },
};
</script>

<style scoped>
label{
  font-size:30px;
}
input{
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

h1{

  width: 350px;
  height: 70px;

  font-family: Sans-serif;
  font-size: 35px;
  line-height: 61px;
  color: white;
  background: #22856D;
  border-radius: 50px 50px 50px 50px;
}
#login{
  position:absolute;
  top:250px;
  left: 750px;
  text-align: center;
}
#b{
    position:absolute;
    left:820px;
    top: 600px;

    font-family: Sans-serif;
    font-size: 30px;
    color: white;
    width: 200px;
    height: 58px;
    background: #22856D;
    border-radius: 20px;
}
</style>