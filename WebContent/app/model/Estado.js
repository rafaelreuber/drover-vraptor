
Ext.define('Drover.model.Estado',{
		extend: 'Ext.data.Model',
		
		fields: [
		         {name : 'id', type: 'int'},
		         {name: 'sigla', type: 'string'}
		],

	hasMany: 'Cidade'
});