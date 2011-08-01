
Ext.define('Drover.model.Cidade',{
	extend: 'Ext.data.Model',
	
	fields :[
	         {name: 'id', type: 'int'},
	         {name: 'nome', type: 'string'},
	         {name: 'estado_id', type: 'string'},
	],

	belongsTo:{model: 'Drover.model.Estado', associatedName:'Estado'}
	
});