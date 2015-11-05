// say a message
function speak(text, callback) {
    var u = new SpeechSynthesisUtterance();
    var voices = window.speechSynthesis.getVoices();
    u.text = text;
    u.lang = 'en-US'
    u.voice = voices[10];

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

function rec(){
    var recognition = new webkitSpeechRecognition();
    recognition.continuous = true; 
    recognition.interimResults = true;
    recognition.lang = 'en-US' 

    // Set up 
    recognition.onstart = function(event){ 
        console.log("onstart", event);
    }   
     
    // Process parsed result
    recognition.onresult = function(event){ 
        console.log("onresult", event);
    }
     
    // Handle error
    recognition.onerror = function(event){
        console.log("onerror", event);
    }
     
    // Housekeeping after success or failed parsing
    recognition.onend = function(){ 
        console.log("onend");
    }
    recognition.start()
    
}
