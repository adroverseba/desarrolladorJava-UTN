# Ejercicio n4

## Consignas

1. Tomando los Ejercicios de la clase anterior:
   a. haga un main, donde por parámetro ponga 3 números y una letra que
   represente ascendente o descendente y los muestre ordenados por tal criterio
   b. haga lo mismo, pero solicitando los parámetros de a uno por consola
   c. lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b)
   si no detecta ninguno. Vea si con una función puede evitar repetir código.
2. Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
   contener números. El programa debe escribir por consola la suma de esos números
   a. Al programa anterior agreguele un parámetro para que la operación pueda ser
   suma o multiplicación.
3. Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
   codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
   otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
   resultados deben estar en el archivo de salida

## Respuesta

Ejercicio 2:<br>
Si se ejecuta desde la consola se debera pasar los argumentos correspondientes a la ruta del archivo donde se encuentra el mismo a leer, y como segundo parametro el nombre de la operacion a realizar pudiendo elegir ente "_sumar_" o "_multiplicar_". Acontinuacion se deja un ejemplo de como deberia ser el **comando ejecutado por consola** suponiendo que el **archivo de lectura** se encuentra **dentro** de la carpeta `clase4\` al **mismo nivel** que `/src`, `/build`, etc .

```bash
java Principal.java ../../nombreDelArchivo.txt multiplicar
```

(nota: en este caso se esta haciendo uso de una ruta relativa pero tambien se podria pasar una ruta absoluta)
