<!-- BEGIN: Main Menu-->
<div class="main-menu menu-fixed menu-light menu-accordion menu-shadow" data-scroll-to-active="true">
    <div class="navbar-header">
        <ul class="nav navbar-nav flex-row">
            <li class="nav-item me-auto">
                <a class="navbar-brand" href="Dashboard">
                    <span class="brand-logo">
                        <%@ include file="/templates/global/svg-image.jsp" %>
                    </span>
                    <h2 class="brand-text">SETRA</h2>
                </a>
            </li>
            <li class="nav-item nav-toggle">
	            <a class="nav-link modern-nav-toggle pe-0" data-bs-toggle="collapse">
	            	<i class="d-block d-xl-none text-primary toggle-icon font-medium-4" data-feather="x"></i>
	            	<i class="d-none d-xl-block collapse-toggle-icon font-medium-4  text-primary" data-feather="disc" data-ticon="disc"></i>
	            </a>
            </li>
        </ul>
    </div>
    <div class="shadow-bottom"></div>
    <div class="main-menu-content">
        <ul class="navigation navigation-main" id="main-menu-navigation" data-menu="menu-navigation">
        	<li class=" nav-item">
                 <a class="d-flex align-items-center" href="Dashboard">
                     <i data-feather="home"></i>
                     <span class="menu-title text-truncate" data-i18n="Dashboards">Dashboards</span>
                 </a>
             </li>
            
            <!-- BEGIN: Perfil -->
            <li class=" navigation-header">
                <span data-i18n="Profile">Perfil</span>
                <i data-feather="more-horizontal"></i>
            </li>
            
            <li class=" nav-item">
                <a class="d-flex align-items-center" href="#">
                	<i data-feather='unlock'></i>
                	<span class="menu-title text-truncate" data-i18n="Email">Cambiar Contraseña</span>
                </a>
            </li> 
            <li class=" nav-item">
                <a class="d-flex align-items-center" href="#">
                	<i data-feather='life-buoy'></i>
                	<span class="menu-title text-truncate" data-i18n="support">Tickets de Soporte</span>
                </a>
            </li>
            <!-- END: Perfil -->
            
            <!-- BEGIN: Ventas -->
            <li class=" navigation-header">
                <span data-i18n="Sales">Ventas</span>
                <i data-feather="more-horizontal"></i>
            </li>
            <li class=" nav-item">
                <a class="d-flex align-items-center" href="#">
                	<i data-feather='archive'></i>
                	<span class="menu-title text-truncate" data-i18n="Quote">Cotización</span>
                </a>
                <ul class="menu-content">
                    <li>
                        <a class="d-flex align-items-center" href="#">
                            <i data-feather="circle"></i>
                            <span class="menu-item text-truncate" data-i18n="List">Consultar</span>
                        </a>
                    </li> 
                </ul>
            </li>
            <!-- END: Ventas -->
            
            <!-- BEGIN: Sistemas -->
            <li class=" navigation-header">
                <span data-i18n="System">Sistemas</span>
                <i data-feather="more-horizontal"></i>
            </li>
            <li class=" nav-item">
                <a class="d-flex align-items-center" href="#">
                	<i data-feather='users'></i>
                	<span class="menu-title text-truncate" data-i18n="Users">Usuarios</span>
                </a>
                <ul class="menu-content">
                    <li>
                        <a class="d-flex align-items-center" href="#">
                            <i data-feather="circle"></i>
                            <span class="menu-item text-truncate" data-i18n="List">Consultar</span>
                        </a>
                    </li> 
                </ul>
                <ul class="menu-content">
                    <li>
                        <a class="d-flex align-items-center" href="#">
                            <i data-feather="circle"></i>
                            <span class="menu-item text-truncate" data-i18n="List">Consultar 2</span>
                        </a>
                    </li> 
                </ul>
            </li>
            <li class=" nav-item">
                <a class="d-flex align-items-center" href="#">
                	<i data-feather='layout'></i>
                	<span class="menu-title text-truncate" data-i18n="Tickets">Tickets</span>
                </a>
                <ul class="menu-content">
                    <li>
                        <a class="d-flex align-items-center" href="#">
                            <i data-feather="circle"></i>
                            <span class="menu-item text-truncate" data-i18n="List">Consultar</span>
                        </a>
                    </li> 
                </ul>
            </li>
            <!-- END: Sistemas -->
        </ul>
    </div>
</div>
<!-- END: Main Menu-->