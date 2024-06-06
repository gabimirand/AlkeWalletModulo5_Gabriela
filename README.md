**DOCUMENTACIÓN ALKEWALLET MÓDULO 5 - GABRIELA MIRANDA ** 

Este repositorio corresponde a un Dynamic Web Project llamado "AlkeWalletModulo5" contiene una carpeta con Java con 4 package: conexionBD, controller, dao y model. Además de una carpeta
webapp con las vistas del home y el login en archivos JSP. Se incorpora también un archivo web.xml con las rutas de los servlets.

En los package puede encontrar: 
* conexionBD: Contiene la clase ConexionBD en la que se establece el método para la conexión con la base de datos.
* controller: Contiene los servlets DepositoController, HomeController, LoginController y RetiroController, cada uno con métodos que permiten ejecutar acciones relacionadas a sus nombres.
En esta carpeta también se encuentra la claseMainWallet, que permite verificar la conexión y utilidad de los métodos a través de la consola del IDE.
* dao: Contiene los dao DaoUsuario y DaoLogin para establecer los métodos para realizar transacciones e ingresa a la billetera, respectivamente.
* model: Contiene la clase Usuario con los atributos, constructores, getters y setters a utilizar en las clases dao.

Toda este proyecto se estructura a partir de la base de datos creada en el proyecto: https://github.com/gabimirand/Modulo3-Fundamentos-de-Bases-de-Datos-Relacionales.git 

