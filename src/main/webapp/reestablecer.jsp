<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="templates/global/meta.jsp"%>
<meta name="keywords" content="reestablecer, contraseña, setra">
<title>SETRA Web | Reestablecer Contraseña</title>
<%@ include file="templates/global/styles.jsp"%>
</head>
<body
	class="vertical-layout vertical-menu-modern blank-page navbar-floating footer-static"
	data-open="click" data-menu="vertical-menu-modern"
	data-col="blank-page">
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
						<a class="brand-logo" href="/"> <%@ include
								file="templates/global/svg-image.jsp"%>
							<h2 class="brand-text text-primary ms-1">SETRA</h2>
						</a>
						<!-- /Brand logo-->
						<!-- Left Text-->
						<div class="d-none d-lg-flex col-lg-8 align-items-center p-5">
							<div
								class="w-100 d-lg-flex align-items-center justify-content-center px-5">
								<img class="img-fluid"
									src="app-assets/images/pages/forgot-password-v2.svg"
									alt="Forgot password V2" />
							</div>
						</div>
						<!-- /Left Text-->
						<!-- Forgot password-->
						<div
							class="d-flex col-lg-4 align-items-center auth-bg px-2 p-lg-5">
							<div class="col-12 col-sm-8 col-md-6 col-lg-12 px-xl-2 mx-auto">
								<h2 class="card-title fw-bold mb-1">¿Olvido su contraseña?
									🔒</h2>
								<p class="card-text mb-2">Por favor, ingrese su correo
									electrónico.</p>
								<form class="auth-forgot-password-form mt-2" action="Auth"
									method="POST">
									<input type="hidden" name="accion" id="accion" value="REESTABLECER_PASSWORD"/>
									<div class="mb-1">
										<label class="form-label" for="forgot-email">Correo
											Electrónico</label> <input class="form-control" id="forgot-email"
											type="text" name="forgot-email"
											placeholder="demo@setours.com"
											aria-describedby="forgot-email" autofocus="" tabindex="1" />
									</div>
									<button class="btn btn-primary w-100" tabindex="2">Reestablecer
										contraseña</button>
								</form>
								<%
								if (request.getAttribute("message") != null) {
								%>
								<div class="alert alert-<%=request.getAttribute("typeMessage") %> alert-dismissible fade show mt-2"
									role="alert">
									<div class="alert-body"><%=request.getAttribute("message")%></div>
									<button type="button" class="btn-close" data-bs-dismiss="alert"
										aria-label="Close"></button>
								</div>
								<%
								}
								%>
								<p class="text-center mt-2">
									<a href="/"><i data-feather="chevron-left"></i> Inicia
										sesión</a>
								</p>
							</div>
						</div>
						<!-- /Forgot password-->
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- END: Content-->

	<%@ include file="templates/auth/js.jsp"%>
	<script src="app-assets/js/scripts/pages/auth-forgot-password.js"></script>
	<script>
		$(window).on('load', function() {
			if (feather) {
				feather.replace({
					width : 14,
					height : 14
				});
			}
		})
	</script>
</body>
</html>