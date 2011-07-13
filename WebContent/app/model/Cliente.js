
Ext.define('Drover.model.Cliente',{
		extend: 'Ext.data.Model',
		
		fields: [
				    {name: 'id', type: 'int'},
				    {name: 'nome', type: 'string'},
					{name: 'cpfCnpj', type: 'int'},
					{name: 'rg', type: 'int'},
					{name: 'numero', type: 'int'},
					{name: 'orgaoExpedidor', type: 'string'},
					{name: 'dataExpedicao', type: 'string', dateFomart:'d/m/Y'},
					{name: 'cidade', type: 'string'},
					{name:'logradouro', type: 'string'},
					{name:'bairro', type: 'string'},
					{name: 'dataNascimento', type: 'string', dateFomart:'d/m/Y'},
					{name: 'limiteCredito', type: 'float'}
		 ]
	
});


