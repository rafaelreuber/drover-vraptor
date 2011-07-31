Ext.define('Drover.controller.Clientes',{
		extend: 'Ext.app.Controller',
		
		views: ['cliente.List', 'cliente.Edit'],
		stores: ['Clientes','Estados','Cidades'],
		models: ['Cliente','Estado','Cidade'],
		
		init: function(){
			this.control({
				'clientelist':{
					itemdblclick: this.editCliente
				},
				'clienteedit button[action=save]': {
					 click: this.updateCliente
				},
				'clienteedit combobox[action=selectEstadoAction]':{
					select: this.selectEstado
				},
				'clientelist button[action=new]':{
				     click: this.criarCliente
				}
			});
		},

      editCliente: function (grid,record) {
    	   var view = Ext.widget('clienteedit');
    	   view.down('form').loadRecord(record);
      },
      
      criarCliente: function() {    	  
    	  var view = Ext.widget('clienteedit');
      },
      
     updateCliente: function(button){
    	  
    	  var clienteStore =this. getStore('Clientes');
    	  
    	  var win = button.up('window'),
    	         form = win.down('form'),
    	         cliente = form.getRecord(),
    	         values = form.getValues();
    	  
    	  if(form.getForm().isValid()){
    		  
	    	   if(!cliente){
	    		   cliente =  Ext.create('Drover.model.Cliente');
	    	   }
	    	   
	    	   cliente.set(values);
	    	   
	    	   if(!cliente.get('id')){
	        	    clienteStore.add(cliente);	
	    	   }
	    	    
	    	   clienteStore.sync(); //Synchronizes the Store with its Proxy
	    	   win.close();
    	  } 	   
      },
      
      selectEstado: function(combo, record){
    	  	console.log('Tentou salvar um cliente');
   
      },
      
      selectEstado: function(combo, record) {
	    	  var estadoId = combo.getValue();
	    	  var comboCity = Ext.getCmp('cidade-combobox');
	    	  
	    	  comboCity.setDisabled(true);
	    	 
	    	  if(comboCity.store.isFiltered()) {
	    		  comboCity.store.clearFilter();
	    		  comboCity.clearValue();
	    	  }
	    	  
	    	 comboCity.store.filter('estado_id', estadoId);
	    	   
	    	 comboCity.setDisabled(false);
      }
});

function filtrarCidades(record, id){
	console.log('Ande tonha!');
}