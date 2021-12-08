import { createRouter, createWebHistory } from "vue-router";
import Home from "../views/Home.vue";

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/about",
    name: "About",
    component: () =>
      import("../views/About.vue"),
  },
  {
    path: "/patrocinios",
    name: "Patrocinios",
    component: () =>
      import("../views/Patrocinios.vue"),
  },
  {
    path: "/contato",
    name: "Contato",
    component: () =>
      import("../views/Contato.vue"),
  },
  {
    path: "/login",
    name: "Login",
    component: () =>
      import("../views/Login.vue"),
  },
  {
    path: "/cadastro",
    name: "Cadastro",
    component: () =>
      import("../views/Cadastro.vue"),
  },
  {
    path: "/dashc",
    name: "DashC",
    component: () =>
      import("../views/DashC.vue"),
  },
  {
    path: "/reserva",
    name: "Reserva",
    component: () =>
      import("../views/Reserva.vue"),
  },
  {
    path: "/dashp",
    name: "DashP",
    component: () =>
      import("../views/DashP.vue"),
  },
  {
    path: "/pagamento",
    name: "Pagamento",
    component: () =>
      import("../views/Pagamento.vue"),
  },

  {
    path: "/pagar",
    name: "Pagar",
    component: () =>
      import("../views/Pagar.vue"),
  },




];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
