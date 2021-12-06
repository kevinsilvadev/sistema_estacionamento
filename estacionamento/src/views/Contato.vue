<template>
    <Navbar/>
    <Ctt id="c1" class="ctt" name="mail" t="Mande um E-mail" p1="Assuntos profissionais: pearparkingltda@gmail.com" p2="Dúvidas: dúvidas.pearparking@gmail.com"/>
    <Ctt id="c2" class="ctt" name="zap" t="Mande uma mensagem" p1="Assuntos profissionais: (XX) XXXXX-XXXX" p2="Dúvidas: (XX) XXXXX-XXXX"/>
    <Ctt id="c3" class="ctt" name="tele" t="Ligue agora" p1="Assuntos profissionais: (XX) XXXXX-XXXX" p2="Dúvidas: (XX) XXXXX-XXXX"/>  
</template>

<script>
import Ctt from "@/components/Ctt.vue";
import Navbar from "@/components/Navbar.vue";

export default{
    components:{
        Ctt,
        Navbar
    },
};
</script>

<style scoped>
.ctt{
    position:absolute;
    top:350px;
    text-align: center;
    width:300px;

}
#c1{
    left:200px;
}
#c2{
    left:760px;
}
#c3{
    left:1320px;
}
</style>