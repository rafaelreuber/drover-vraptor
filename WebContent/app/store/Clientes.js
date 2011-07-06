
Ext.define('Drover.store.Clientes',{
		extend: 'Ext.data.Store',
		
		model: 'Drover.model.Cliente',
		
		autoLoad: true,
		
		proxy: {
			type: 'ajax',
			api: {
				read 	: '/drover/clientes/lista',
				create  : '/drover/clientes/criar',
				update  : '/drover/cliente/create.action',
				destroy : '/drover/cliente/delete.action'
			},
			url: '/drover/clientes',
			 reader: {
				 type: 'json',
				 root: 'data',
				 sucessProperty: 'success'
			 },
			 writer: {
				    type: 'xml',
				    documentRoot: 'br.com.drover.entity.ClienteWrapper',
				    record: 'cliente',
		            writeAllFields: true,
		     }
		}

});