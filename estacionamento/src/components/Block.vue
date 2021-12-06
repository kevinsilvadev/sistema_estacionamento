<template>
    <div id="block" >
        <h1>{{ titulo }}</h1>
        <h2>{{ dados }}</h2>
    </div>
</template>

<script>

export default {
    name: "Block",
    props:{
        titulo:String,
        dados:String
    },
};
</script>

<style scoped>
    h1{
        font-size:40px;
        margin-bottom: 20px;
    }
    h2{
        font-size:50px;
    }

    #block{
        background-color: #22856D;
        color: white;
        width: 280px;
        height: 250px;
        text-align: center;
        border-radius: 34px;
    }
</style>
