
Ext.define('Drover.store.Clientes',{
		extend: 'Ext.data.Store',
		
		model: 'Drover.model.Cliente',
		
		autoLoad: true,
		
		proxy: {
			type: 'ajax',
			api: {
				read 	: '/drover/clientes/lista',
				create  : '/drover/clientes/criar',
				update  : '/drover/clientes/criar',
				destroy : '/drover/cliente/delete'
			},
			url: '/drover/clientes',
			 reader: {
				 type: 'json',
				 root: 'data',
				 sucessProperty: 'success'
			 },
			 writer: {
				    type: 'json',
				    root: 'cliente'
		     },
		     listeners: {
		            exception: function(proxy, response, operation){
		            	
		            	var records = operation.records;
		            	
		            	var msg = JSON.parse(response.responseText);	
		            	
		                Ext.MessageBox.show({
		                    title: 'REMOTE EXCEPTION',
		                    msg:  msg.data,
		                    icon: Ext.MessageBox.ERROR,
		                    buttons: Ext.Msg.OK
		                });
		            }
		     }
		}

});