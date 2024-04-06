Limpiar
Para que tome los cambios realizados en el .gitignore realiza lo siquiente:

Realiza commit de cambios pendientes y remueve archivos modificados del indice:
Comandos

git rm --cached -r .
guarda cambios:

git add .
y realiza un commit:

git commit -m ".gitignore funcionando!"

*Esto hay que hacerlo cuando se clona y este todo funcionnado , reseten con esos 3 comandos
*Esto va a borrar la carpeta nbProyect (pusch) , depues de eso ya no se ba a subir mas nbproyect, 
Depues la subimos a mano. Me avisan y yo la subo

____________________________________________
Para tener en cuenta de errores

Archivo -> project.properties 
modificar 
  javac.source=21 (vercion de apache netben)
  
  javac.target=21 (vercion de apache netben)

  ARchivo -> private.properties
  C:\\Users\\Name de usuario\\AppData\\Roaming\\NetBeans\\21\\build.properties
  va el usaurio de su compu ejemplo
  C:\\Users\\Martin\\AppData\\Roaming\\NetBeans\\21\\build.properties


En el directorio private/
archivo private.xml. Tenemos la ruta de todo nuestras clases

<file>file:/F:/Documents/NetBeansProjects/SuperDeTodo2.0/Lab1TP6/src/controller/CtrlConsultaNombre.java</file>
            <file>file:/F:/Documents/NetBeansProjects/SuperDeTodo2.0/Lab1TP6/src/controller/CtrlGestionProducto.java</file>
            <file>file:/F:/Documents/NetBeansProjects/SuperDeTodo2.0/Lab1TP6/src/view/ViewMenuPrincipal.java</file>
            <file>file:/F:/Documents/NetBeansProjects/SuperDeTodo2.0/Lab1TP6/src/view/ViewGestionProducto.java</file>
            <file>file:/F:/Documents/NetBeansProjects/SuperDeTodo2.0/Lab1TP6/src/model/Productos.java</file>
            <file>file:/F:/Documents/NetBeansProjects/SuperDeTodo2.0/Lab1TP6/src/controller/CtrlConsultaRubro.java</file>
            <file>file:/F:/Documents/NetBeansProjects/SuperDeTodo2.0/Lab1TP6/src/controller/CtrlViewMenuPrincipal.java</file>
