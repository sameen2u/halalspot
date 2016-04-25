/**
 * 
 */
	$(document).ready(function(){
		/*$('.login-box').hide();*/
		 $('a.login-window').click(function() {
				// Getting the variable's value from a link 
				var loginBox = $(this).attr('href');
				

				//Fade in the Popup and add close button
				$(loginBox).fadeIn(300);
				//Set the center alignment padding + border
				var popMargTop = ($(loginBox).height() + 24) / 2; 
				var popMargLeft = ($(loginBox).width() + 24) / 2; 
				
				$(loginBox).css({ 
					'margin-top' : -popMargTop,
					'margin-left' : -popMargLeft
				});
				
				// Add the mask to body
				$('body').append('<div id="mask"></div>');
				$('#mask').fadeIn(300);		
				return false;
			});
			$("#signup-box-link").click(function(){
				$(".email-signup").show();
				$(".email-login").hide();
			  $(".email-login").fadeOut(100);
			  $(".email-signup").delay(100).fadeIn(100);
			  $("#login-box-link").removeClass("active");
			  $("#signup-box-link").addClass("active");
			});
			$("#login-box-link").click(function(){
			  $(".email-login").delay(100).fadeIn(100);;
			  $(".email-signup").fadeOut(100);
			  $("#login-box-link").addClass("active");
			  $("#signup-box-link").removeClass("active");
			});
	});
	