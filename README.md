# Proyecto Final Java Spring (23650)


## Collaborators:

1. Abreu Kaira
2. Baca Paunero Julio
3. Cabrera Exequiel
4. Castagnola Agustin
5. Herera Abril Carolina
6. Maidana Ivan
7. Morales Daniela

## Requeriments:
hr

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
 _$ git push -u origin main_ **(ESTO HARÁ MERGE, SOLO HACERLO CUANDO HAYAN CAMBIOS RELEVANTES PARA REALIZAR EL MERGE. Y utilizar "-u" es solo la primera vez).** 
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