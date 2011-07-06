/**
 * 
 */

Ext.application({
	
	name: 'Drover',
	
	controllers: [
	           'Clientes'
	],
	
	requires: ['Ext.container.Viewport'],
	
	launch: function (){
		Ext.create('Ext.container.Viewport',{
			layout: 'fit',
			items:[{
			       xtype: 'clientelist'
			}]
		});
	}
});