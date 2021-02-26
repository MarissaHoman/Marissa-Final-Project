import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [{
        path: '/',
        name: 'Home',
        component: Home
    },
    {
        path: '/destinations',
        name: 'Destinations',
        component: () =>
            import ('../views/Destinations.vue')
    }, {
    },
    {
        path: '/hotel',
        name: 'Hotels',
        component: () =>
            import ('../views/Hotels.vue')
    },
    {
        path: '/price',
        name: 'Price',
        component: () =>
            import ('../views/Price.vue')

    },
    {
   

},


]

const router = new VueRouter({
    routes
})

export default router