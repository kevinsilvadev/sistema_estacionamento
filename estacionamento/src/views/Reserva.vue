<template>
    <form id="reserva">
      <h1 id="treserva">Faça sua reserva</h1>

      <label for="hora">Horário</label>
      <br/>
      <input name="hora" class="i1" type="time"/>

      <br/>
      <br/>
      
      <label for="placa">Placa</label>
      <br/>
      <input class="i1" name="placa"/>

      <br/>
      <br/>

      <label for="drywash">Drywash</label>
      <input name="drywash" type="checkbox"/>

      <br/>
      <br/>

      <button id="breserva">Reservar</button>
    </form>
    <Ticket placa="ABC-1234" data="5/12/2021 - 11:00" cod="1" id="i"/>
</template>

<script>
import Ticket from '@/components/Ticket.vue'

export default{
  components:{
    Ticket,
  },
};
</script>


<style scoped>
label{
  font-size:30px;
}
#i{
  position:absolute;
  left: 1200px;
  top:280px;
}
#reserva{
  text-align:center;
  position: absolute;
  top: 300px;
  left: 350px;
}

#breserva{
  width: 100px;
  height: 30px;
  font-family: Sans-serif;
  font-size: 20px;
  color: white;

  background-color: #22856D;
  border-radius: 5px;
  
}
#treserva{

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
.i1{
  width: 200px;
  height: 43px;
  left: 766px;
  background-color: black;
  text-align: center;
  font-size: 18px;
  font-family: Sans-serif;
  background: rgba(255, 255, 255, 0.56);
  border-radius: 39px;
}
</style>