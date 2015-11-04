// say a message
function speak(text, callback) {
    var u = new SpeechSynthesisUtterance();
    u.text = text;
    u.lang = 'en-US'
 
    u.onend = function () {
        if (callback) {
            callback();
        }
    };
 
    u.onerror = function (e) {
        if (callback) {
            callback(e);
        }
    };
 
    speechSynthesis.speak(u);
}

function wake(){
    if (annyang) {
      // Let's define our first command. First the text we expect, and then the function it should call
      var commands = {
        'wake up': alert('wake UP')
        'wake': alert('wake UP')
      }

      // Add our commands to annyang
      annyang.addCommands(commands);

      // Start listening. You can call this here, or attach this call to an event, button, etc.
      annyang.start();
}