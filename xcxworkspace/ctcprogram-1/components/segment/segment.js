// components/segment/segment.js
Component({
    options:{
        multipleSlots:true
    },
    /**
     * 组件的属性列表
     */
    properties: {
        items:{
            type:Array,
            value:["推荐","关注","同城"]
        },
        defaultIndex:{
            type:Number,
            value:0
        }
    },
    
    /**
     * 组件的初始数据
     */
    data: {
        currentIndex:0
    },
    lifetimes:{
        attached:function(){
            this.setData({
                currentIndex:this.properties.defaultIndex
            })
        }
    },

    /**
     * 组件的方法列表
     */
    methods: {
        onItemTapEvent:function(event){
            var index=event.target.dataset.index;
            this.setData({
                currentIndex:index
            })
        }
    }
})
