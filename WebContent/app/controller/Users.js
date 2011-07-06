
Ext.define('Drover.controller.Users',{
		extend: 'Ext.app.Controller',
		
		views: ['user.List','user.Edit'],
		stores: ['Users'],
		models: ['User'],
		 
		init: function(){
			console.log('User\'s  Controller are initialized!');
			 this.control({
		            'userlist': {
		                itemdblclick: this.editUser
		            },
		            'useredit button[action=save]' :{
		            	click: this.updateUser
		            }
		        });
		},

	  onPanelRendered: function() {
		   console.log('Executou a função onPanelRendered');
	  },
		
	  editUser: function(grid, record) {
		    console.log('Editing user ' + record.get('name'));
		    
		  	var view = Ext.widget('useredit');

		  	view.down('form').loadRecord(record);
	   },
	   
	   updateUser: function(button){
		   console.log('cliked the Save button');
		   
		   var win = button.up('window');
		   		form = win.down('form'),
		   		record = form.getRecord(),
		   		values = form.getValues();
		   		
		   record.set(values);
		   win.close();
	   },
	   
	   teste: function(){
		   alert('Ai se eu te pego');
	   }

});