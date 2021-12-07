<script>
import Block from "@/components/Block.vue";
import Cliente from "../services/clientes"
export default{
  components:{
    Block,
  },

  
  data() {
    return {
      cliente: []
    }
  },

  mounted() {
    Cliente.listar().then(response => {
      this.cliente = response.data
    })
  },

}


</script>

<style  scoped>
#titulo {
  position: absolute;
  top: 20px;
  left: 480px;
  width: 350px;
  height: 70px;

  font-family: Sans-serif;
  font-size: 35px;
  line-height: 61px;
  text-align: center;
  color: white;
  background: #22856d;
  border-radius: 50px 50px 50px 50px;
}
.Block {
  position: absolute;
  background-color: #22856d;
  color: white;
  width: 300px;
  height: 250px;
  text-align: center;
  border-radius: 34px;
}
#vt {
  top: 200px;
  left: 150px;
}
#vo {
  top: 200px;
  left: 500px;
}
#vl {
  top: 200px;
  left: 850px;
}
#op {
  top: 500px;
  left: 150px;
}
#fe {
  top: 500px;
  left: 500px;
}
#mv {
  top: 500px;
  left: 850px;
}

#dashboard {
  position: absolute;
  left: 500px;
}

#reserva {
  position: absolute;
  width: 266px;
  height: 58px;
  left: 115px;
  top: 600px;

  font-family: Sans-serif;
  font-size: 30px;
  color: white;

  background: #22856d;
  border-radius: 20px;
}
#conta {
  position: absolute;
  left: 150px;
  top: 330px;
  background-color: #22856d;
  color: white;
  width: 200px;
  text-align: center;
  border-radius: 34px;
}
#img {
  width: 150px;
  height: 150px;
}
#b1 {
  left: 1630px;
  top: 30px;
}

.dados {
  font-size: 30px;
}
</style>


<template>
  <div id="conta">
    <h1>Olá, </h1>
    <img src="../assets/person.png" id="img" />
  </div>
  <button
    onclick="window.location.href = 'http://localhost:8080/reserva' "
    id="reserva"
  >
    Faça sua reserva
  </button>
  <div id="dashboard">
    <h1 id="titulo">Dashboard</h1>
    <Block id="vt" class="Block" titulo="Vagas totais" dados="100" />
    <Block id="vo" class="Block" titulo="Vagas ocupadas" dados="10" />
    <Block id="vl" class="Block" titulo="Vagas Liberadas" dados="90" />
    <Block id="op" class="Block" titulo="Ocupação" dados="10%" />
    <Block id="fe" class="Block" titulo="Fila de espera" dados="0" />
    <Block id="mv" class="Block" titulo="Movimentação" dados="Baixa" />
  </div>
</template>