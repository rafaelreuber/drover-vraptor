
Ext.define('Drover.store.Cidades',{
	extend: 'Ext.data.Store',
	
	model: 'Drover.model.Cidade',
	
	autoLoad: true,
	
	proxy: {
		type: 'ajax',
		api: {
			read: '/drover/cidade/getCidades.action'
		} ,
		reader :{
			 type: 'json',
			 root: 'cidades',
			 sucessProperty: 'success'
		}
	}
});