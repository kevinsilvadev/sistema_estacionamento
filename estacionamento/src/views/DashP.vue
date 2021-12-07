
<template>
   <div id="conta" >
      <h1>Olá, {{ text }}</h1>
      <img src="../assets/person.png" id="img">
    </div>
    <div id="dashboard">
      <h1 id="titulo">Dashboard </h1>
      <Block id="vt" class="Block" titulo="Vagas totais" dados="100"/>
      <Block id="vo" class="Block" titulo="Vagas ocupadas" dados="10"/>
      <Block id="vl" class="Block" titulo="Vagas Liberadas" dados="90"/>
      <Block id="op" class="Block" titulo="Ocupação" dados="10%"/>
      <Block id="fe" class="Block" titulo="Fila de espera" dados="0"/>
      <Block id="mv" class="Block" titulo="Movimentação" dados="Baixa" />
      <Block id="pg" class="Block" titulo="Tickets do dia" dados="256" />
      <Block id="si" class="Block" titulo="Sistema" dados="Online" />
      <Block id="lc" class="Block" titulo="Lucro" dados="Baixa" />
    </div>

</template>

<script>
import Block from "@/components/Block.vue";

export default{
  components:{
    Block
  },
};

</script>

<style  scoped>
#titulo{
  position: absolute;
  top:-10px;
  left:480px;
  width: 350px;
  height: 70px;

  font-family: Sans-serif;
  font-size: 35px;
  line-height: 61px;
  text-align: center;
  color: white;
  background: #22856D;
  border-radius: 50px 50px 50px 50px;
  
}

.Block{
  position:absolute;
  background-color: #22856D;
  color: white;
  width: 300px;
  height: 250px;
  text-align: center;
  border-radius: 34px;
}
#vt{
  top: 100px;
  left:150px;
}
#vo{
  top: 100px;
  left: 500px;
}
#vl{
  top: 100px;
  left: 850px;
}
#op{
  top: 400px;
  left: 150px;
}
#fe{
  top: 400px;
  left:500px;
}
#mv{
  top: 400px;
  left:850px;
}
#pg{
  top: 700px;
  left:150px;
}
#si{
  top: 700px;
  left:500px;
}
#lc{
  top: 700px;
  left:850px;
}

#dashboard{
  position:absolute;
  left:500px;
}

#conta{
  position: absolute;
  left: 150px;
  top: 400px;
  background-color: #22856D;
  color: white;
  width: 200px;
  text-align: center;
  border-radius: 34px;
}
#img{
  width:150px;
  height:150px;
}
#b1{
  left: 1630px;
  top: 30px;
}

.dados{
  font-size: 30px;
}

</style>
