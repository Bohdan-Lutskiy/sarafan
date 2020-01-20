import Vue from 'vue'
import '@babel/polyfill'
import 'api/resource'
import router from 'router/router'
import App from 'pages/App.vue'
import store from 'store/store'
import {connect} from "./util/ws"
import vuetify from './plugins/vuetify'
import 'vuetify/dist/vuetify.min.css'
import * as Sentry from '@sentry/browser'
import * as Integrations from '@sentry/integrations'

Sentry.init({
    dsn: 'https://6d43cb2b647f41718af7c250cd9a4b63@sentry.io/1888041',
    integrations: [new Integrations.Vue({Vue, attachProps: true})],
})

Sentry.configureScope(scope =>
    scope.setUser({
        id: profile && profile.id,
        username: profile && profile.name
    })
)

if (profile) {
    connect()
}

new Vue({
    el: '#app',
    vuetify,
    store,
    router,
    render: a => a(App)
})
