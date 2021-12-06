<template>
    <Navbar/>
    <img id="drywash" src="../assets/drywash.jpeg"/>
    <h1>Parceiros DryWash</h1>
    <p>
        Além de cuidar do estacionamento, gestão de vagas, sistemas de pagamentos e banco de dados, 
        nossa equipe também se propôs em fazer uma parceria com a DryWash.
        <br><br>
        Agora, enquanto você está fazendo tudo que pode imaginar, você pode requisitar que seu carro seja lavado, 
        lhe salvando o sufoco de ter que levá-lo outra hora e deixando um carro limpinho a sua espera.
    </p>
</template>

<style scoped>
    #drywash{
        position:absolute;
        left: 20px;
        top: 200px;
        width:1000px;
        height:700px;
    }
    h1{
        position:absolute;
        left: 1070px;
        top: 175px;
        font-size: 40px;

        color: #22856D;
    }
    p{
        position: absolute;
        left: 1070px;
        top: 240px;
        font-size: 35px;;
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