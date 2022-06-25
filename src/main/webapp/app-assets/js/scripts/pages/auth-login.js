/*=========================================================================================
  File Name: auth-login.js
  Description: Auth login js file.
  ----------------------------------------------------------------------------------------
  Item Name: Vuexy  - Vuejs, HTML & Laravel Admin Dashboard Template
  Author: PIXINVENT
  Author URL: http://www.themeforest.net/user/pixinvent
==========================================================================================*/

$(function () {
  'use strict';

  var pageLoginForm = $('.auth-login-form');
  console.log(pageLoginForm);

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
});
