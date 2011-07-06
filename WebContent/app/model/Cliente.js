
Ext.define('Drover.model.Cliente',{
		extend: 'Ext.data.Model',
		
		fields: [
				    {name: 'id', type: 'int'},
				    {name: 'nome', type: 'string'},
					{name: 'cpfCnpj', type: 'int'},
					{name: 'rg', type: 'int'},
					{name: 'numero', type: 'int'},
					{name: 'orgaoExpedidor', type: 'string'},
					{name: 'dataExpedicao', type: 'string', convert: dataExpedicao},
					{name: 'cidade', type: 'string'},
					{name:'logradouro', type: 'string'},
					{name:'bairro', type: 'string'},
					{name: 'dataNascimento', type: 'string'},
					{name: 'limiteCredito', type: 'float'}
		 ]
	
});

function dataExpedicao(v, record){
		return null;
}
