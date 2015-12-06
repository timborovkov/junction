var app = require('app');
var BrowserWindow = require('browser-window');

app.on('ready', function(){
  console.log("app is loaded");

  var win = new BrowserWindow({
     x: 200,
     y: 200,
     width: 600,
     height: 350,
     show: false,
     resizable: false
   });

  win.loadUrl('https://www.google.com/intl/en/chrome/demos/speech.html');
  win.show();
})
