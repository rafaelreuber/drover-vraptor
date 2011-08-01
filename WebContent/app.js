/**
 * 
 */

Ext.application({
	
	name: 'Drover',
	
	controllers: [
	           'Clientes'
	],
	
	launch: function (){
		
		Ext.QuickTips.init();
		
		Ext.create('Ext.container.Viewport',{
			layout: 'fit',
			items:[{
			       xtype: 'clientelist'
			}]
		});
	}
});