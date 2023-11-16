# Proyecto Final Java Spring (23650)

## Requeriments:

### Descripción del Proyecto:
- El proyecto consiste en el desarrollo de un simulador de acciones que replicará un sistema de Homebanking denominado "Spring Banking". Los alumnos formarán equipos de 6 desarrolladores para crear los servicios necesarios que permitan el funcionamiento del sistema.
- Se trabajarán sobre tres entidades principales:
1. Usuarios 
2. Cuentas (ya sea cuenta corriente o caja de ahorro) 
3. Transferencias.

### Requisitos Técnicos:
- Utilizar Java 11 o 17 con Maven.
- Conexión a la Base de Datos mediante JDBC.
- Implementar Spring JPA y Hibernate para el manejo de la persistencia.
- Configurar en el application.properties la conexión y las configuraciones (incluyendo ddl.auto=update). 

### Arquitectura del Proyecto:
- Se trabajará sobre un Sistema Monolítico con las siguientes capas:
1. Controllers.
2. Services.
3. Mappers.
4. DTO (Data Transfer Objects).
5. Entities.
6. Repositories.

### Entidades y Relaciones:
1. Usuario:
- **Atributos de Usuarios**: *id, nombreUsuario, email, contraseña, dni, fecha_nacimiento, domicilio (dirección), lista de cuentas (List< Cuenta>).*
2. Cuenta:
- **Atributos de las Cuentas**: *id, nombre, cbu, alias, monto, dueño (usuario dueño de la cuenta).*
3. Transferencias:
- **Atributos de las transferencias**: *id, monto, cuentaOrigen, cuentaDestino, fecha.*

### Tareas a Realizar:
**Desarrollar un CRUD para cada entidad (Usuarios, Cuentas, y Transferencias).**
**Establecer las relaciones entre entidades, garantizando la integridad de los datos.**

### División en Equipos: 
Se formarán equipos de **6 integrantes**.

### Distribución de Tareas:
- Cada equipo se dividirá en 3 partes y cada una se encargará de una entidad (Usuarios, Cuentas, Transferencias). Utilizar Github y su metodología Github Flow o su derivado GitFlow.
- En cada equipo, designar roles para cubrir el desarrollo de las capas definidas en la arquitectura del proyecto.
- Coordinar reuniones regulares para revisar avances y resolver posibles obstáculos.

### Entregables:
Repositorio Git con el código del proyecto (**Se entregará 1 repositorio por equipo**, pero las ramas de cada integrante del grupo deben permanecer activas para el momento de la corrección).

### Consideraciones Finales:
- Se evaluará la calidad del código, el manejo de las capas definidas, la correcta implementación de las relaciones entre entidades, y la funcionalidad del CRUD para cada entidad.


## Collaborators:

1. Abreu Kaira
2. Baca Paunero Julio
3. Cabrera Exequiel
4. Herera Abril Carolina
5. Maidana Ivan
6. Morales Daniela

## Recommends:

1. Git settings globals:
```
 $ git config --global user.email <"email">
 $ git config --global user.name "NAME"
```

2. Project link settings with Git:
```
 $ git init
 $ git branch -M master main
 $ git remote add origin https://github.com/Ivan9912/proyecto-final-java-spring.git
 $ git fetch origin
 $ git rebase origin/main
 $ git pull origin main
 $ git push -u origin main **(ESTO HARÁ MERGE, SOLO HACERLO CUANDO HAYAN CAMBIOS RELEVANTES PARA REALIZAR EL MERGE. Y utilizar "-u" es solo la primera vez).** 
 ```

3. Basics commands linux (Git Bash):
```
 $ git add . && git commit -m "commit" _(Cuando hay que añadir por primera vez un archivo)._
 $ git commit -am "commit" _(Cuando se guardan nuevos cambios de un archivo existente)._
 $ touch <"file_name.format"> _(Para crear un nuevo archivo.*)._
 $ mkdir <"file_name"> _(Para crear una carpeta)._
 $ cd <"path"> _(Para acceder a un directorio)_
 $ cd .. _(Para salir hacia "atrás" del directorio actual)._
 $ cp <"diretorio o archivo que copiar> <"directorio hacia donde copiarlo"> _(Copiar)._
 $ del <"file_for_detele"> _(Eliminar)._
```

## Dependencies:
- Angular v16.2.7
- Tailwind v3.3.3
- Spring Boot v3.1.5
- Java v17

## Consideraciones para utilizar Angular:
- En PowerShell (Administrador):
```
   Set-ExecutionPolicy -Scope CurrentUser -ExecutionPolicy RemoteSigned
```
Seleccionar -> [ S ]

Dentro de la carpeta "front/Wallet-7":
```
    npm i
```