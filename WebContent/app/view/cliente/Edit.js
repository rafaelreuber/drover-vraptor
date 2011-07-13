
Ext.define('Drover.view.cliente.Edit',{
		extend:  'Ext.window.Window',
		alias: 'widget.clienteedit',
		
		title: 'Edição de Clientes',
		layout: 'fit',
		width: 730,
		autoShow: true,
		
		requires: ['Ext.form.Panel',
		           		  'Ext.form.field.ComboBox'
		  ],
		
		initComponent: function (){
			
			this.items = [{
					    xtype: 'form',
				        frame:true,
				        bodyStyle:'padding:5px 5px 0',
				        fieldDefaults: {
				        	labelWidth: 63
				        },
				        
				        items :  [{
				        	    // Nome e CPF
				        		xtype: 'container',
				        		layout: 'hbox',
				        		items:[ {
				        				name: 'nome',
				        				fieldLabel: 'Nome',
				        				xtype: 'textfield',
				        				flex: 2,
				        				width: 380
				        		},{
				        				name: 'cpfCnpj',
				        				fieldLabel: 'CPF',
				        				xtype: 'textfield',
				        				flex: 1,
				        				width: 150,
				        				margins: '0 0 0 6',
				        				labelWidth: 27
				        		}]
				        },{// Logradouro e Número
				        	xtype: 'container',
				        	layout: 'hbox',
				        	items: [{
				        			    name: 'logradouro',
				        				fieldLabel: 'Logradouro',
				        				xtype: 'textfield',
				        				flex: 2
				        	},{
				        			   name: 'numeroCasa',
				        			   fieldLabel: 'Nº',
				        			   margins: '0 0 0 6',
				        			   xtype: 'numberfield',
				        			   labelWidth: 27,
				        			   width: 50,
				        			   flex: 1
				        	}]
				        },{
				        	xtype: 'container',
				        	layout: 'hbox',
				        	items:[{
				        				name:'rg',
				        				fieldLabel: 'RG',
				        				fieldWidth: 12,
				        				maxLength: 13,
				        				xtype: 'textfield',
				        				flex: 1
				        	},{
		        				name:'dataExpedicao',
		        				fieldLabel: 'Data de Expedição',
		        				xtype: 'datefield',
		        				flex: 3,
		        				labelWidth: 110,
		        				format: 'd/m/Y',
		        				margins: '0 0 0 6',
				        	},{
		        				name:'dataNascimento',
		        				fieldLabel: 'Data de Nascimento',
		        				xtype: 'datefield',
		        				flex: 3,
		        				labelWidth: 110,
		        				format: 'd/m/Y',
		        				margins: '0 0 0 6',
				        	}]
				        },{ // Bairro Cidade e UF
				        	xtype: 'container',
				        	layout: 'hbox',
				        	items: [{
				        		        name: 'bairro',
				        		        fieldLabel: 'Bairro',
				        		        xtype: 'textfield',
				        		        flex: 3
				        	},{
				        		name: 'cidade',
				        		fieldLabel: 'Cidade',
				        		xtype: 'combobox',
				        		store: 'Cidades',
				        		displayField: 'nome',
				        		valueField: 'id',
				        		margins: '0 0 0 6',
				        		labelWidth: 40,
				        		id: 'cidade-combobox',
				        		flex: 2
				        	},{
				        		name: 'estado',
				        		fieldLabel: 'UF',
				        		width: 20,
				        		xtype: 'combobox',
				        		store: 'Estados',
				        		displayField: 'sigla',
				          		action: 'selectEstadoAction',
				        		valueField: 'id',
				        		labelWidth: 27,
				        		margins: '0 0 0 6',
				        		id: 'estado-combobox',
				        	    flex: 1
				        	}]
				        }]
				     
			}];
			
			this.buttons = [{
	        	text: 'Save',
	        	action: 'save'
	        },{
	        	text: 'Cancel',
	        	scope: this,
	           handler: this.close
	       }];
			
			this.callParent(arguments);
		}

});