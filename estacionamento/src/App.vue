<template>
  <Logo/>
  <router-view/>
</template>

<script>
import Logo from "@/components/Logo.vue";

export default {
  components: {
    Logo
  },
  name: "background",
  created: function () {
    document.body.style.backgroundColor = "LightCyan";
  },
};

</script>
