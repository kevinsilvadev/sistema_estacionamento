<template id="app">
<div id="conta">
    <h1>{{ name }}</h1>
    <h2 id="t1">{{ t1 }}</h2>
    <input id="i1" />
    <h2 id="t2">{{ t2 }}</h2>
    <input id="i2" />
</div>
</template>

<script>

export default {
    name: "Texto",
    props:{
        name:String,
        t1:String,
        t2:String
    },
};
</script>

<style scoped>
    input{
        position: absolute;
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
    #i1{
        top: 400px;
    }
    #i2{
        top: 500px;
    }
    h2{
        position: absolute;
        color:black;
        left: 880px;
        font-family: Sans-serif;
    }

    #t1{
        top: 340px;
    }
    #t2{
        top: 440px;
    }

    h1{
        position: absolute;
        width: 350px;
        height: 70px;
        left: 750px;
        top: 230px;


        font-family: Sans-serif;
        font-size: 45px;
        line-height: 61px;
        text-align: center;
        color: white;

        background: #22856D;
        border-radius: 50px 50px 50px 50px;   
    }
</style>



