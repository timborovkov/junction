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
speak("Thanks for update!", null)