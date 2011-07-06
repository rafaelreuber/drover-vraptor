Ext.define('Drover.controller.Clientes',{
		extend: 'Ext.app.Controller',
		
		views: ['cliente.List', 'cliente.Edit'],
		stores: ['Clientes','Estados','Cidades'],
		models: ['Cliente','Estado','Cidade'],
		
		init: function(){
			console.log('Inicializou o controller de clientes');
			
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
  //  	  var novoCliente = Ext.create('Drover.model.Cliente');
    	  
    	  var view = Ext.widget('clienteedit');
  //  	  view.down('form').loadRecord(novoCliente);
      },
      
     updateCliente: function(button){
    	  
    	  var clienteStore =this. getStore('Clientes');
    	  
    	  var win = button.up('window'),
    	         form = win.down('form'),
    	         cliente = form.getRecord(),
    	         values = form.getValues();
    	   
    	   if(!cliente){
    		   cliente =  Ext.create('Drover.model.Cliente');
    	   }
    	  
    	   cliente.set(values);
    	   
    	    if(cliente.get('id') ==  '0'){
        	    clienteStore.insert(0,cliente);	
    	    }
    	    
    	    clienteStore.sync(); //Synchronizes the Store with its Proxy
    	    win.close();
      },
      
      selectEstado: function(combo, record){
    	  	console.log('Tentou salvar um cliente');
      },
      
      selectEstado: function(combo, record) {
     //TODO Implementar filtro de cidades através da seleção do Estado 	  
	    	  var estadoId = combo.getValue();
	    	  
	    	  var comboCity = Ext.getCmp('cidade-combobox');
	    	  
	    	  var city = comboCity.store.getAt(3);
	    	  var estado_id = city.getEstado().get('id');
	    	  
	    	  comboCity.setDisabled(true);
	    	  comboCity.setValue(' ');
	    	  comboCity.store.removeAll();
	    	  
	    	 comboCity.store.filter({
	    		  params:  {estado : estadoId}
	    	  });
	    	   
	    	 comboCity.setDisabled(false);
	    	//  console.log('Tentou selecionar Estado ' + combo.getValue() );
      }
});