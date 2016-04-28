$(document).ready(function(){
	
});

function search(){
	window.location='/HalalWeb/search';
}

function readCookie(name) {
	 var nameEQ = encodeURIComponent(name) + "=";
	    var ca = document.cookie.split(';');
	    for (var i = 0; i < ca.length; i++) {
	        var c = ca[i];
	        while (c.charAt(0) === ' ') c = c.substring(1, c.length);
	        if (c.indexOf(nameEQ) === 0) return decodeURIComponent(c.substring(nameEQ.length, c.length));
	    }
	    return null;
}

function createCookie(name , value, expiry, urlPath){
	document.cookie = encodeURIComponent(name) + "=" + encodeURIComponent(value) + expiry + "; path="+urlPath;
}

function deleteCookie(name){
	$.cookie(name, null);
	$.removeCookie(name);
}
