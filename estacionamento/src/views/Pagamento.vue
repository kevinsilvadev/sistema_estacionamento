<template>
    <div id="tempo">
        <h1 id="htempo" class="titulo">Tempo da estadia</h1>
        <img id="clock" class="img" src="../assets/clock.png"/>
        <h2>{{tempo}}</h2>
    </div>

    <div id="valor">
        <h1 class="titulo">Valor da estadia</h1>
        <h2>{{valor}}</h2>
    </div>

    <div id="forma">
        <h1 class="titulo">Pagamento</h1>
        <img class="img" src="../assets/card.png"/>
        <img class="img" src="../assets/pix.png"/>
    </div>

</template>

<style scoped>
#tempo{

    position: absolute;
    font-size:20px;
    left:100px;
    top:200px;
}
#htempo{
    font-size:40px;
}
#clock{
    position: absolute;
    left:80px;
}

#valor{
    position: absolute;
    top:200px;
    left: 700px;
    text-align: center;
    width: 500px;
    height: 150px;
}

.titulo{
    width: 400px;
    height: 70px;
    font-family: Sans-serif;
    font-size: 50px;
    
    text-align: center;
    color: white;
    background: #22856D;
    border-radius: 50px 50px 50px 50px;
}

#forma{
    position: absolute;
    top:200px;
    left: 1300px;
}
.img{
    width:200px;
    
}
</style>