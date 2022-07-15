<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="templates/global/meta.jsp" %>
		<meta name="keywords" content="login, setra">
		<title>SETRA Web | Iniciar Sesión</title>
		<%@ include file="templates/global/styles.jsp" %>
	</head>
	<body class="vertical-layout vertical-menu-modern blank-page navbar-floating footer-static" data-open="click" 
			data-menu="vertical-menu-modern" data-col="blank-page">
		<!-- BEGIN: Content-->
	    <div class="app-content content ">
	        <div class="content-overlay"></div>
	        <div class="header-navbar-shadow"></div>
	        <div class="content-wrapper">
	            <div class="content-header row"></div>
	            <div class="content-body">
	                <div class="auth-wrapper auth-cover">
	                    <div class="auth-inner row m-0">
	                        <!-- Brand logo-->
	                        <a class="brand-logo" href="/setra-web">
	                            <%@ include file="templates/global/svg-image.jsp" %>
	                            <h2 class="brand-text text-primary ms-1">SETRA</h2>
	                        </a>
	                        <!-- /Brand logo-->
	                        <!-- Left Text-->
	                        <div class="d-none d-lg-flex col-lg-8 align-items-center p-5">
	                            <div class="w-100 d-lg-flex align-items-center justify-content-center px-5">
	                                <img class="img-fluid" src="app-assets/images/pages/login-v2.svg" alt="Login" />
	                            </div>
	                        </div>
	                        <!-- /Left Text-->
	                        <!-- Login-->
	                        <div class="d-flex col-lg-4 align-items-center auth-bg px-2 p-lg-5">
	                            <div class="col-12 col-sm-8 col-md-6 col-lg-12 px-xl-2 mx-auto">
	                                <h2 class="card-title fw-bold mb-1">Bienvenido a SETRA! 👋</h2>
	                                <p class="card-text mb-2">Por favor, ingrese su correo y contraseña.</p>
	
	                                <form class="auth-login-form mt-2" action="Auth" method="POST">
	                                    <div class="mb-1">
	                                        <label class="form-label" for="login-email">Correo Electrónico</label>
	                                        <input class="form-control" id="login-email" type="text" name="login-email"
	                                            placeholder="jreyes@setours.com" aria-describedby="login-email" autofocus="" tabindex="1" />
	                                    </div>
	                                    <div class="mb-1">
	                                        <div class="d-flex justify-content-between">
	                                            <label class="form-label" for="login-password">Contraseña</label>
	                                            <a href="reestablecer.jsp">
	                                                <small>¿Olvidó su contraseña?</small>
	                                            </a>
	                                        </div>
	                                        <div class="input-group input-group-merge form-password-toggle">
	                                            <input class="form-control form-control-merge" id="login-password"
	                                                type="password" name="login-password" placeholder="············"
	                                                aria-describedby="login-password" tabindex="2" />
	                                            <span class="input-group-text cursor-pointer">
	                                                <i data-feather="eye"></i>
	                                            </span>
	                                        </div>
	                                    </div>
	                                    <button class="btn btn-primary w-100" tabindex="4" type="submit" id="btnLogin" name="btnLogin">
	                                    	Iniciar Sesión
	                                    </button>
	                                    <%= request.getAttribute("message") == null ? "" : request.getAttribute("message").toString() %>
	                                </form>
	                            </div>
	                        </div>
	                        <!-- /Login-->
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	    <!-- END: Content-->
	    <%@ include file="templates/auth/js.jsp" %>
	    <script src="app-assets/js/scripts/pages/auth-login.js"></script>
	    <script>
	        $(window).on('load', function () {
	            if (feather) {
	                feather.replace({
	                    width: 14,
	                    height: 14
	                });
	            }
	        })
	    </script>
	</body>
</html>