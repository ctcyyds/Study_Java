// pages/video/video.js
Page({
    data: {
        movieList:[{
            create_time:663177600000,
            src:'https://mvwebfs.ali.kugou.com/202206020930/6d452b863518ca474d356e0dc51655cc/G200/M00/01/13/aIcBAF4r1q2ACRrTBGJczaZZjgc909.mp4'
        },
        {
            create_time:1651734231000,
            src:'https://mvwebfs.ali.kugou.com/202206020932/86e6e690cffb1c613d0ab090ba3b15a4/KGTX/CLTX002/c15b84532d81997bcddf071751178e5c.mp4'   
        },
        {
            create_time:1645459200000,
            src:'https://mvwebfs.ali.kugou.com/202206020933/38067eab324211fee749c9b600653e8e/KGTX/CLTX002/780170691aadc9635a65c982e4b1aacf.mp4'
        },
        {
            create_time:1645459200000,
            src:'https://mvwebfs.ali.kugou.com/202206020935/4ff082bd553c354b35ab65d8a4fa978f/KGTX/CLTX002/600627b8e614757a318cd90e6d4e399c.mp4'
        },
        {
            create_time:1645459200000,
            src:'https://mvwebfs.ali.kugou.com/202206020936/bca4bacf20db8cfd641058aa9251facf/G238/M06/0E/00/jocBAF-wWeiAVlsKBMuD60I_H9w792.mp4'
        }
        ],
        danmuList:[
            {text:"第1s出现的弹幕",color:"#ff0000",time:1},
            {text:"第2s出现的弹幕",color:"#ff0000",time:2}
        ]
    },
    videoContext:null,
    inputValue:'',
    onReady: function () {
        this.videoContext=wx.createVideoContext('myVideo')
    },
    bindInputBlur:function(e){
        this.inputValue=e.detail.value
    },
    bindSendDanmu:function(){
        this.videoContext.sendDanmu({
            text:this.inputValue,
            color:'#f90'
        })
    },
    bindButtonTap:function(){
        wx.chooseVideo({
          sourceType:['album','camera'],//视频选择的来源，相册和相机
          maxDuration:60,//拍摄视频最长拍摄时间
          camera:'back',//默认拉起的是前置（front）或者后置（back）摄像头
          success: res=>{//成功时执行的回调函数
              this.setData({
                  src:res.tempFilePath//选定视频的临时文件路径
              })
          }
        })
    }
})