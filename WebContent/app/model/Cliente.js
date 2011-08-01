
Ext.define('Drover.model.Cliente',{
		extend: 'Ext.data.Model',
		
		fields: [
				    {name: 'id', type: 'int', useNull: true},
				    {name: 'nome', type: 'string'},
					{name: 'cpfCnpj', type: 'int'},
					{name: 'rg', type: 'int', useNull: true},
					{name: 'numero', type: 'int'},
					{name: 'orgaoExpedidor', type: 'string'},
					{name: 'dataExpedicao', type: 'string', dateFomart:'d/m/Y'},
					{name: 'logradouro', type: 'string'},
					{name: 'bairro', type: 'string'},
					{name: 'dataNascimento', type: 'string', dateFomart:'d/m/Y'},
					{name: 'limiteCredito', type: 'float'},
					{name: 'cidade_id', type: 'int'}
					
		 ],
	
		belongsTo: {model:'Drover.model.Cidade', associatedName:'Cidade'}
});


