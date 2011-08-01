
Ext.define('Drover.view.cliente.Edit',{
		extend:  'Ext.window.Window',
		alias: 'widget.clienteedit',
		
		title: 'Edição de Clientes',
		layout: 'fit',
		width: 700,
		autoShow: true,
		
		requires: ['Ext.form.Panel',
		           		  'Ext.form.field.ComboBox'
		  ],
		
		initComponent: function () {		
			this.items = [{
					    xtype: 'form',
				        frame:true,
				        bodyStyle:'padding:5px 5px 0',
				        fieldDefaults: {
				            labelAlign: 'top',
				            msgTarget: 'side',
				        	margins: '0 6 0 0'
				        },
				        
				        items :  [{
				        	    // Nome e CPF
				        		xtype: 'container',
				        		layout: 'hbox',
				        		items:[ {
				        				name: 'nome',
				        				fieldLabel: 'Nome',
				        				xtype: 'textfield',
				        				allowBlank: false,
				        				flex: 6,
				        		},{
			        				name:'dataNascimento',
			        				fieldLabel: 'Data de Nascimento',
			        				xtype: 'datefield',
			        				flex: 2,
			        				format: 'd/m/Y',
					        	}]
				        },{
				        	xtype: 'container',
				        	layout: 'hbox',
				        	items:[{
		        				name: 'cpfCnpj',
		        				fieldLabel: 'CPF',
		        				xtype: 'textfield',
		        				allowBlank: false,
		        				flex: 2,
				          },{
		        				name:'rg',
		        				fieldLabel: 'RG',
		        				maxLength: 13,
		        				xtype: 'textfield',
		        				flex: 3
				          },{
				        	  name:'orgaoexpedidor',
				        	  xtype: 'textfield',
				        	  fieldLabel: 'Orgão Expedidor',
				        	  flex: 3
				          },{
		        				name:'dataExpedicao',
		        				fieldLabel: 'Data de Expedição',
		        				xtype: 'datefield',
		        				flex: 3,
		        				labelWidth: 110,
		        				format: 'd/m/Y',
				        	}]
				        },{
				        	xtype:'tabpanel', // TabPanel
				        	plain:true,
				        	activeTab: 0,
				            height:200,
				            defaults:{bodyStyle:'padding:10px'},
				            items:[{ //Aba Endereço
				            	title:'Endereço',
				            	items:[{// Logradouro e Número
						        	xtype: 'container',
						        	layout: 'hbox',
						        	items: [{
						        			    name: 'logradouro',
						        				fieldLabel: 'Logradouro',
						        				xtype: 'textfield',
						        				allowBlank: false,
						        				flex: 6
						        	},{
					        			   name: 'numeroCasa',
					        			   fieldLabel: 'Nº',
					        			   xtype: 'textfield',
					        			   allowBlank: false,
					        			   flex: 1
						        	}]
						          },{ //Cep e complemento
							        	xtype: 'container',
							        	layout:'hbox',
							        	items:[{
						        			   name: 'cep',
						        			   fieldLabel: 'CEP',
						        			   xtype: 'textfield',
						        			   flex: 1
							        	},{
							        		   name: 'complemento',
						        			   fieldLabel: 'Complemento',
						        			   xtype: 'textfield',
						        			   flex: 4
							        	}]
							        		
							        },{ // Bairro Cidade e UF
						        	xtype: 'container',
						        	layout: 'hbox',
						        	items: [{
				        		        name: 'bairro',
				        		        fieldLabel: 'Bairro',
				        		        xtype: 'textfield',
				        		        flex: 4
						        	},{
						        		name: 'estado',
						        		fieldLabel: 'UF',
						        		width: 20,
						        		xtype: 'combobox',
						        		store: 'Estados',
						        		allowBlank: false,
						        		displayField: 'sigla',
						          		action: 'selectEstadoAction',
						        		valueField: 'id',
						        		id: 'estado-combobox',
						        	    flex: 1
						        	},{
						        		name: 'cidade_id',
						        		fieldLabel: 'Cidade',
						        		xtype: 'combobox',
						        		store: 'Cidades',
						        		allowBlank: false,
						        		displayField: 'nome',
						        		valueField: 'id',
						        		disabled: true,
						        		id: 'cidade-combobox',
						        		flex: 4
						        	}]
						        }]
				            },{
				            	title:'Telefones',
				            	items: [{
				                    fieldLabel: 'Residencial',
				                    name: 'home',
				                	xtype: 'textfield',
				                    value: '(888) 555-1212'
				                },{
				                    fieldLabel: 'Comercial',
				                	xtype: 'textfield',
				                    name: 'business'
				                },{
				                    fieldLabel: 'Celular',
				                	xtype: 'textfield',
				                    name: 'mobile'
				                }]
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