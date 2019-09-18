new Vue({
    el:"#v-app",
    data:{
        age:0
    },
    methods:{
        add:function(inc){
            this.age+=inc;
        },
        sub:function(dec){
            this.age-=dec;
        }
    }
});