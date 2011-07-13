
Ext.define('Drover.store.Cidades',{
	extend: 'Ext.data.Store',
	model: 'Drover.model.Cidade',
	autoLoad: true,
	
	proxy: {
		type: 'rest',
		url: '/drover/cidades',
		reader :{
			 type: 'json',
			 root: 'data',
			 sucessProperty: 'success'
		}
	}
});