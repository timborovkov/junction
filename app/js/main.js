var remote = require('remote')
var Menu = remote.require('menu')
var menu = Menu.buildFromTemplate({
  [
  label: 'qproject',
  submenu: [{
    label: 'Settings',
    click: function(){
      alert('Settings')
    }
  }]
  ]
})
Menu.setApplicationMenu(menu)
