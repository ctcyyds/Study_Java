// index.js
// 获取应用实例
const app = getApp()

Page({
  data: {
  isPlayingMusic:false
  },
  bgm:null,
  music_url:"http://music.163.com/song/media/outer/url?id=1900257921.mp3",
  music_coverImgUrl:"https://imgessl.kugou.com/stdmusic/20210703/20210703101238789661.jpg",
  onReady:function(){
    this.bgm=wx.getBackgroundAudioManager()
    this.bgm.title='大海白噪音'
    this.bgm.epname='大海白噪音'
    this.bgm.singer='纯音乐'
    this.bgm.coverImgUrl=this.music_coverImgUrl
    this.bgm.onCanplay(()=>{
      this.bgm.pause()
    })
    this.bgm.src=this.music_url
  },
  //播放器的单击事件
  play:function(e){ 
    //执行暂停或播放操作，true为暂停
    if(this.data.isPlayingMusic){
      this.bgm.pause()
    }else{
      this.bgm.play()
    }
    this.setData({
      //将data中的isPlayingMusic赋值给它
      isPlayingMusic: !this.data.isPlayingMusic
    })
  },
  //实现拨打电话功能
  callGroom:function(){
    wx.makePhoneCall({
      phoneNumber: '16637745842',
    })
  },
  callBride:function(){
    wx.makePhoneCall({
      phoneNumber: '19545659736',
    })
  },
})
