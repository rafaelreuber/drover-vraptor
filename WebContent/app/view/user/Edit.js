/**
 * 
 */

Ext.define('Drover.view.user.Edit',{
	extend: 'Ext.window.Window',
	alias: 'widget.useredit',
	
	title: 'Edit User',
	layout: 'fit',
	autoShow: true,
	
	requires:[
	          'Ext.form.Panel'
	],
	
	initComponent: function (){
		        this.items = [ {
		        	xtype : 'form',
						items : [ {
							xtype : 'textfield',
							name : 'name',
							fieldLabel : 'Name',
							allowBlank: false
						}, {
							xtype : 'textfield',
							name : 'email',
							fieldLabel : 'Email'
						} ]
		        } ];

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