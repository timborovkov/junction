//alert('popup.js')
if (('speechSynthesis' in window) && ('webkitSpeechRecognition' in window)) {
 //alert('yes')
}
var button = document.getElementById("sayButton");
var text = document.getElementById("toSay");
alert(text.value)
button.addEventListener("onclick", function() { 
    alert("alert");
});