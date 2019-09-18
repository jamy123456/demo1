new Vue({
    el:"#v-app",
    data:{
        age:0,
        x:0,
        y:0
    },
    methods:{
        add:function(inc){
            this.age+=inc;
        },
        sub:function(dec){
            this.age-=dec;
        },
        updateXY:function(event){
            this.x = event.offsetX;
            this.y = event.offsetY;
        }
    }
});