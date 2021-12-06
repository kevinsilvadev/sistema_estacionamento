<template>
    <Navbar/>
    <form id="cadastro">
        <h1>Cadastrar-se</h1>

        <label for="nome">Nome</label>
        <br/>
        <input type="text" name="nome"/>

        <br/>
        <br/>

        <label for="cpf">CPF</label>
        <br/>
        <input type="text" name="cpf"/>

        <br/>
        <br/>

        <label for="email">Email</label>
        <br/>
        <input type="text" name="email"/>

        <br/>
        <br/>

        <label for="senha">Senha</label>
        <br/>
        <input type="text" name="senha"/>

    </form>
    <button id="b" onclick="window.location.href = 'http://localhost:8080/dashc' ">Cadastrar</button>
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
label{
    font-size:30px;
}
#cadastro{
    position:absolute;
    left:750px;
    top:200px;
    text-align:center;
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
h2{
    position: absolute;
    color:black;
    left: 880px;
    font-family: Sans-serif;
}
#b{
    position:absolute;
    left:820px;
    top: 750px;

    font-family: Sans-serif;
    font-size: 30px;
    color: white;
    width: 200px;
    height: 58px;
    background: #22856D;
    border-radius: 20px;
}
</style>