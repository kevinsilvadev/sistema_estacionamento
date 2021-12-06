<template>
    <div id="contato">
        <img :src="customImg" id="img"/>
        <h1>{{t}}</h1>
        <p>{{p1}}</p>
        <p>{{p2}}</p>
    </div>
</template>

<script>
export default {
    name: "Ctt",
    props:{
        name:String,
        t:String,
        p1:String,
        p2:String
    },
    computed:{
        customImg(){
            const img = require("@/assets/" + this.name + ".png");
            return (img);
        },
    },

};
</script>

<style scoped>
img{
    width:200px; 
}
h1{
    color:#22856D;
}
p{
    font-size:20px;
}

#contato{
    margin-left:10px;
    text-align: center;
}
</style>