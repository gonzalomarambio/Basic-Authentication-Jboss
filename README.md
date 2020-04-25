### Autenticacion básica servicio rest

#### Objetivo
Configuración de autentificacion basica para servicio rest, mediante "resteasy" en servidor Jboss


#### Ambiente
Sistema Operativo: Linux Ubuntu 18.04.4 LTS<br> 
IDE: Intellij 2020.1<br>
Servidor de aplicaciones: Jboss EAP 7.1<br>
Lenguaje: Java 1.8<br>

#### Configuracion especial
Incluir usuarios y password en application-user.propertie de servidor Jboss

Procedimiento:

Linux<br>
$JBOSS_HOME/bin/sh add-user.sh -a [**usuario**] [**password**]

Windows<br>
$JBOSS_HOME/bin/add-user.bat -a [**usuario**] [**password**]

#### ¿Como ejecutar?
Postman:<br>
Incluir en el header: Authorization: Basic [usuario]:[password]<br>
** Aplicación encripta usuario y password con Base64

Browser<br>
Incluir en el header: Authorization: Basic [usuario]:[password]<br>
** Aplicación encripta usuario y password con Base64

