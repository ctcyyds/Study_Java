// pages/joke/joke.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
        hasmore:true
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
        var that=this;
        that.getJokes(1);
    },

    /**
     * 页面相关事件处理函数--监听用户下拉动作
     */
    onPullDownRefresh: function () {
        that.getJokes(1);
    },

    /**
     * 页面上拉触底事件的处理函数
     */
    onReachBottom: function () {
        var that=this;
        var page =that.data.page;
        that.getJokes(page+1);
    },

    /**
     * 用户点击右上角分享
     */
    onShareAppMessage: function () {

    },
    getJokes:function(page){
        var that =this;
        var timestamp=null;
        if(page==1){
            timestamp=parseInt((new Date()).getTime()/1000);
        }else{
            timestamp=that.data.timestamp;
        }
        wx.request({
          url: 'http://v.juhe.cn/joke/content/list.php',
          data:{
              key:"9b4905429d35f9b4d92fd45507a82642",
              time:timestamp,
              page:page,
              pagesize:10,
              
          },
          success:function(res){
            var jokes=res.data.result.data;
            console.log(jokes);
            if(!jokes){
                that.setData({
                    hasmore:false
                });
                return;
            }
            var oldJokes=that.data.jokes;
            var newJokes=[];
            if(!oldJokes || page ==1){
                newJokes=jokes;
            }else{
                newJokes=oldJokes.concat(jokes);
            }
            that.setData({
                jokes:newJokes,
                timestamp:timestamp,
                page:page
            });
        }
        })
    }
})