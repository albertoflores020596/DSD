document.getElementById('files').addEventListener('change', handleFileSelect, false);

function handleFileSelect(evt) {

  var f=evt.target.files[0];
  var reader= new FileReader();


  reader.onload= (function(theFile){
    return  function(e) {

      var binDatos=e.target.result;
      var binNombre= f.name;

      var base64Datos=window.btoa(binDatos);
      var base64Nombre=window.btoa(binNombre);

      document.getElementById('base64').value=base64Datos;
      document.getElementById('base64Name').textContent = base64Nombre;
      alert ('El PDF  se ha codificado correctamente !!');

    };
  })(f);
  reader.readAsBinaryString(f);  
    
  }
  

