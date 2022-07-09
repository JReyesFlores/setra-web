$(function() {
	'use strict';

	var pageLoginForm = $('.auth-login-form');
	var btnLogin = $('#btnLogin');
	var loginEmail = $('#login-email');
	var loginPassword = $('#login-password');
	//console.log(pageLoginForm);

	// jQuery Validation
	// --------------------------------------------------------------------
	if (pageLoginForm.length) {
		pageLoginForm.validate({
			/*
			* ? To enable validation onkeyup
			onkeyup: function (element) {
			  $(element).valid();
			},*/
			/*
			* ? To enable validation on focusout
			onfocusout: function (element) {
			  $(element).valid();
			}, */
			rules: {
				'login-email': {
					required: true,
					email: true,
				},
				'login-password': {
					required: true,
				},
			},
			messages: {
				'login-email': {
					required: "El correo electrónico es requerido.",
					email: "Formato no válido para el correo electrónico."
				},
				'login-password': {
					required: "La contraseña es requerida.",
				}
			},
		});
	}

	const ValidacionDatos = function(usuario, password) {
		return usuario.hasClass('error') || password.hasClass('error');
	}

	btnLogin.on('click', function() {
		pageLoginForm.valid();
		if (!ValidacionDatos(loginEmail, loginPassword)) {
			//console.log(pageLoginForm.serialize());
			const datos = `usuario=${loginEmail.val()}&password=${loginPassword.val()}`;
			$.ajax({
				url: 'Auth',
				type: 'POST',
				data: datos,
				success: function(response) {
					//console.log(`Contraseña encriptada!: ${response}`);
					console.info(response);
				},
				error: function(err) {
					console.error(err);
				}
			});
		}
	});
});
