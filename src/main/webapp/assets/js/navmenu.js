$(function() {
	'use strict';

	var navMenu = $('#main-menu-navigation');
	var lnkCerrarSesion = $('#lnkCerrarSesion');

	if (navMenu) {
		//console.log('petición Ajax!');
		$.ajax({
			url: 'Utiles',
			type: 'GET',
			data: { accion: 'OBTENER_MENU_NAV' },
			success: function(response) {
				if (!!!response) return;
				//Imprimiendo los menús general
				let modGeneral = response.filter((item) => item.ModuloId === 1);
				let opcionesGenerales = '';
				modGeneral.forEach((item) => {
					opcionesGenerales += `
					<li class="nav-item">
		                 <a class="d-flex align-items-center" href="${item.RutaDestino}">
		                     <i data-feather="${item.IconDataFeather}"></i>
		                     <span class="menu-title text-truncate" data-i18n="${item.NombreOpcion}">${item.NombreOpcion}</span>
		                 </a>
		             </li>
					`;
				});

				//Imprimiendo los menús adicionales
				response = response.filter((item) => item.ModuloId !== 1);
				let modOtros = response.map(function(item) {
					return { ModuloId: item.ModuloId, NombreModulo: item.NombreModulo, IconDataFeather: item.IconDataFeather };
				});
				let distinctModulos = [...new Map(modOtros.map((item) => [item["ModuloId"], item])).values()];
				distinctModulos.forEach(function(item) {
					opcionesGenerales += `
					<li class="navigation-header">
		                <span data-i18n="${item.NombreModulo}">${item.NombreModulo}</span>
		                <i data-feather="more-horizontal"></i>
		            </li>
					`;

					let opcxMod1 = response.filter((item2) => item2.ModuloId === item.ModuloId);
					let opcxMod2 = response.filter((item2) => item2.ModuloId === item.ModuloId && item2.OrdenOpcion === 0);

					if (opcxMod2.length === 0) {
						console.log(opcxMod1);
						opcxMod1.forEach((itemop) => {
							opcionesGenerales += `
									<li class="nav-item">
							            <a class="d-flex align-iwetems-center" href="${itemop.RutaDestino}">
							            	<i data-feather='${itemop.IconDataFeather}'></i>
							            	<span class="menu-title text-truncate" data-i18n="support">${itemop.NombreOpcion}</span>
							            </a>
							        </li> 
									`;
						});
					} else {
						//console.log(opcxMod1);
						opcxMod2.forEach((itemop) => {
							opcionesGenerales += `
							 <li class="nav-item has-sub">
				                <a class="d-flex align-items-center" href="${itemop.RutaDestino}">
				                	<i data-feather='${itemop.IconDataFeather}'></i>
				                	<span class="menu-title text-truncate" data-i18n="${itemop.NombreOpcion}">${itemop.NombreOpcion}</span>
				                </a>
				                <ul class="menu-content">
							`;
							let subopciones = response.filter((item2) => item2.ModuloId === item.ModuloId && item2.GrupoOpc === itemop.OpcionId && item2.OrdenOpcion !== 0);
							console.log(subopciones);
							subopciones.forEach((subitem) => {
								opcionesGenerales += `
									<li>
				                        <a class="d-flex align-items-center" href="${subitem.RutaDestino}">
				                            <i data-feather="${subitem.IconDataFeather}"></i>
				                            <span class="menu-item text-truncate" data-i18n="${subitem.NombreOpcion}">${subitem.NombreOpcion}</span>
				                        </a>
				                    </li>
								`;
							});
							opcionesGenerales += `
								</ul>
           					 </li> 
							`;
						});
					}
				});
				navMenu.html(opcionesGenerales);
			},
			error: function(jqXHR, status, error) {
				console.log(error);
			}
		});
	}

	lnkCerrarSesion.on('click', function() {
		$.ajax({
			url: 'Auth',
			type: 'POST',
			data: { accion: 'CERRAR_SESION' },
			success: function(response) {
				if (!!response)
					location.reload();
			},
			error: function(jqXHR, status, error) {
				console.log(error);
			}
		})
	});
});
