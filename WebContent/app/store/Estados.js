
Ext.define('Drover.store.Estados',{
	extend: 'Ext.data.Store',
	model: 'Drover.model.Estado',
	autoLoad: true,
	
	proxy: {
		type: 'rest',
		url: '/drover/estados',
		reader: {
			type: 'json',
			root: 'data',
			sucessProperty: 'success'
		}
	}
});