
Ext.define('Drover.view.cliente.List',{
		extend: 'Ext.grid.Panel',
		alias: 'widget.clientelist',
			
		title: 'Clientes',	
		store: 'Clientes',
		
		initComponent: function(){
			
			Ext.apply(this,{

				columns: [
							{ header	: 'Nome' 			,dataIndex	: 'nome', sortable	: true ,width		: 300 },
							{ header	: 'CPF/CNPJ'	 	,dataIndex	: 'cpfCnpj', align: 'right'},
							{header		: 'Limite'				, dataIndex: 'limiteCredito', sortable	: true  ,align		: 'right' ,renderer 	: 'usMoney'},
							{header		: 'Nascimento'	, dataIndex: 'dataNascimento',xtype: 'datecolumn', format:'d/m/Y'},
							{header		: 'Logradouro'	,dataIndex	: 'logradouro',width		: 200},
							{header		: 'Bairro'				,dataIndex	: 'bairro' ,width		: 200}
		        ],
		        dockedItems: [{
	                xtype: 'toolbar',
	                items: [{
	                    iconCls: 'icon-add',
	                    text: 'Novo',
	                    action: 'new'
	                } ]
		        }]
			});
			
			this.callParent(arguments);
		}
});