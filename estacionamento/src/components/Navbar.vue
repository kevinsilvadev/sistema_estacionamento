<template>
    <div id="nav">
        <router-link class="menu" to="/">Home</router-link> 
        <router-link class="menu" to="/about">Sobre nós</router-link>
        <router-link class="menu" to="/patrocinios">Patrocinadores</router-link>
        <router-link class="menu" to="/login">Login</router-link>
        <router-link class="menu" to="/contato">Contato</router-link>
        <router-link class="menu" to="/pagar">Pagar</router-link>
    </div>
</template>

<style scoped>
#nav {
  padding: 30px;
  position: absolute;
  width: 800px;
  height: 20px;
  left: 1000px;
  top: 42px;
  font-size: 25px;
  font-family : Sans-serif;
  text-align: center;

  background: #22856D;
  border-radius: 20px;
}

#nav a {
  font-weight: bold;
}

#nav a.router-link-exact-active {
  color: #42b983;
}

.menu{
  padding : 15px;
  color : white;
  text-decoration: none;

}
</style>