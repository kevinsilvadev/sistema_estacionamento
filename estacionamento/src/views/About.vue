<template>
      <Navbar/>
    <img id="sobre" src="../assets/sobre.png"/>
    <h1 id="t1">Por que usar Pear Parking ?</h1>
    <p id="p1"> 
        Os sistemas de estacionamento atualmente são inconsistentes, e muito desorganizados. 
        A criação do Pear Parking tem como base a melhora nessa questão de organização, como 
        por exemplo dashboards para o controle de vagas, ou até mesmo o sistema de reserva de lugares com horário marcado.
    </p>
    <h1 id="t2">Quem Somos ?</h1>
    <p id="p2">
        Somos estudantes da Pontifícia Universidade Católica de Campinas, 
        encarregados de fazer um projeto de manutenção, gestão e controle de um estacionamentos.
    </p>
    <h1 id="t3">Quais são os objetivos do projeto ?</h1>
    <p id="p3">
        Melhora no sistema de organização de estacionamentos, com o uso de um sistema web 
        para o registro de vagas disponíveis para o usuário. Com esse novo sistema, o usuário 
        pode ver o fluxo de carros desde a entrada até a saída do estacionamento, e possui o modo de reserva 
        de vagas com horário marcado, além disso o usuário tem a opção de usar o recurso do DryWash, onde o carro 
        ocupado pela vaga vai ser lavado, e devolvido nessa mesma vaga selecionada.
    </p>
</template>

<style scoped>
    #sobre{
        position: absolute;
        top: 189px;
        height: 780px;
        left: 80px;
    }
    h1{
        position:absolute;
        top:180px;
        left: 950px;
        font-size: 36px;

        color: #22856D;
    }
    p{
        position:absolute;
        left: 950px;
        font-size: 30px;;
    }
    #p1{
        top: 235px;
    }
    #p2{
        top: 455px; 
    }
    #p3{
        top:685px;
    }
    #t2{
        top: 400px;
    }
    #t3{
        top: 620px;
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
