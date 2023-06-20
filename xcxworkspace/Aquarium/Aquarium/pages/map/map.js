// pages/map/map.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
        latitude: 22.6046, longitude: 114.32874,
  markers: [{
    iconPath: '/photo/haima.png', id: 0,
    latitude: 22.6046, longitude: 114.32874, width: 50, height: 50
  }] 
    },
    buttonTap: function() {
        wx.getLocation({
          type: 'gcj02',
          success: function (res) {
            wx.openLocation({
              latitude: res.latitude,
              longitude: res.longitude }) } 
      }) },
      markertap: function() {
        wx.openLocation({
          latitude: this.data.latitude, longitude: this.data.longitude,
      }) }
       
})