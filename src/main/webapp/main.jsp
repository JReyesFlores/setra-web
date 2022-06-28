<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, java.util.ArrayList, setra.model.entities.*" %>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="templates/global/meta.jsp" %>
	<title>SETRA Web | Principal</title>
	<%@ include file="templates/global/styles.jsp" %>
</head>
	<%
		List<TipoProveedorEntity> ListaTipoProveedor = request.getAttribute("listaTipoProveedor") == null ? new ArrayList<TipoProveedorEntity>() : (List<TipoProveedorEntity>) request.getAttribute("listaTipoProveedor");
		String resultadoTest = request.getAttribute("TestConnection").toString();
	%>
	
	<body class="vertical-layout vertical-menu-modern navbar-floating footer-static" data-open="click" 
		  data-menu="vertical-menu-modern" data-col="">
	<%@ include file="templates/admin/header.jsp" %>
	<%@ include file="templates/admin/nav.jsp" %>
		
	<!-- BEGIN: Content-->
    <div class="app-content content">
        <div class="content-overlay"></div>
        <div class="header-navbar-shadow"></div>
        <div class="content-wrapper container-xxl p-0">
            <div class="content-header row">
                <div class="content-header-left col-md-9 col-12 mb-2">
                    <div class="row breadcrumbs-top">
                        <div class="col-12">
                            <h2 class="content-header-title float-start mb-0">Dashboard</h2>
                            <div class="breadcrumb-wrapper">
                                <ol class="breadcrumb">
                                    <li class="breadcrumb-item">
                                    	<a href="#">Home</a>
                                    </li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div> 
            </div>
            <div class="content-body"> 
                <section id="input-mask-wrapper">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4 class="card-title">Dashboard</h4>
                                </div>
                                <div class="card-body">
                                	<%=resultadoTest %>
                                	<br>
                                    Lista de Tipos de Proveedor
                                    <ul>
                                    	<% for(TipoProveedorEntity item : ListaTipoProveedor) {
                                    		out.print("<li>"+ item.GetNombre() + "</li>");
                                    	} %>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </section> 
            </div>
        </div>
    </div>
    <!-- END: Content-->
		
    <%@ include file="templates/admin/footer.jsp" %>
	<%@ include file="templates/global/jsSectionA.jsp" %>
	<!-- BEGIN: Page Vendor JS-->
	<script src="app-assets/vendors/js/forms/cleave/cleave.min.js"></script>
   	<script src="app-assets/vendors/js/forms/cleave/addons/cleave-phone.us.js"></script>
    <!-- END: Page Vendor JS-->
	<%@ include file="templates/global/jsSectionB.jsp" %>
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