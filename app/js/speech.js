function recognize(onResultAction){
  if (!('webkitSpeechRecognition' in window)) {
  //Speech API not supported here…
  alert('app is not supported on your platform')
  } else { //Let’s do some cool stuff :)
    var recognition = new webkitSpeechRecognition(); //That is the object that will manage our whole recognition process.
    recognition.continuous = true;   //Suitable for dictation.
    recognition.interimResults = true;  //If we want to start receiving results even if they are not final.
    //Define some more additional parameters for the recognition:
    recognition.lang = "en-US";
    recognition.maxAlternatives = 1; //Since from our experience, the highest result is really the best...

    recognition.onresult = function(event) { //the event holds the results
    //Yay – we have results! Let’s check if they are defined and if final or not:
        if (typeof(event.results) === 'undefined') { //Something is wrong…
            recognition.stop();
            return;
        }

        for (var i = event.resultIndex; i < event.results.length; ++i) {
            if (event.results[i].isFinal) { //Final results
                console.log("final results: " + event.results[i][0].transcript);
                onResultAction(event.results[i][0].transcript);
            }
        }
    };
      recognition.start();
  }
}
