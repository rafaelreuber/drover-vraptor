
Ext.define('Drover.store.Estados',{
	extend: 'Ext.data.Store',
	
	model: 'Drover.model.Estado',
	
	autoLoad: true,
	
	proxy:{
		type: 'ajax',
		api: {
			read: '/drover/estado/getEstados.action'
		},
		reader: {
			type: 'json',
			root: 'estados',
			sucessProperty: 'success'
		}
	}
});