<template>
    <div id="ticket">
        <h1 id="nome">Ticket</h1>
        <div id="conteudo">
            <p>{{placa}}</p>
            <p>{{data}}</p>
            <p>{{cod}}</p>
            <p>Obrigado pela<br>preferência</p>
        </div>
    </div>
</template>

<script>
export default {
    name: "Ticket",
    props:{
        placa:String,
        data:String,
        cod:String
    },
};
</script>


<style scoped>

#nome{

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
#conteudo{
    position:absolute;
    left:40px;
    background-color: white;
    border-radius: 20px;
    
    text-align: center;
    font-size: 30px;
    width:250px;
    
}
</style>