// pages/eventPage/eventPage.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
        articles:[
            {id:1,title:'西游记'},
            {id:2,title:'红楼梦'},
            {id:3,title:'水浒传'}
        ]
    },
     onViewClick:function(event){
            console.log("点就点"),
            console.log(event);
    },
    onarTicleClick:function(event){
        console.log(event);
        console.log(event.currentTarget.dataset.id);
        console.log(event.currentTarget.dataset.title);
        var dataset=event.currentTarget.dataset;
        wx.navigateTo({
          url: '/pages/article/article?id='+dataset.id+'&title='+dataset.title
        })
    },
        onMaxClick:function(){
            console.log("最大单击");
        },
        onOutClick:function(event){
            console.log("外部单击");
            console.log(event);
        },
        onInClick:function(event){
            console.log("内部单击");
            console.log(event);
        },
        showDate:function(){
            console.log("日期");
        },
    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {

    },

    /**
     * 生命周期函数--监听页面初次渲染完成
     */
    onReady: function () {

    },

    /**
     * 生命周期函数--监听页面显示
     */
    onShow: function () {

    },

    /**
     * 生命周期函数--监听页面隐藏
     */
    onHide: function () {

    },

    /**
     * 生命周期函数--监听页面卸载
     */
    onUnload: function () {

    },

    /**
     * 页面相关事件处理函数--监听用户下拉动作
     */
    onPullDownRefresh: function () {

    },

    /**
     * 页面上拉触底事件的处理函数
     */
    onReachBottom: function () {

    },

    /**
     * 用户点击右上角分享
     */
    onShareAppMessage: function () {

    }
})