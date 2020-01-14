import Vue from 'vue'
import 'api/resource'
import App from 'pages/App.vue'
import { connect } from "./util/ws";
import vuetify from './plugins/vuetify'
import 'vuetify/dist/vuetify.min.css'

if (frontendData.profile){
    connect()
}

new Vue({
    el: '#app',
    vuetify,
    render: a => a(App)
})
