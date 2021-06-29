const app = Vue.createApp({});

app.component('app', {
    data() {
        return {
            count : 0
        }
    },
    template: `<button = "count++")>
    You clicked me {{count}} times.
    </button>`

})

app.mount('#components-demo')

