# Laboratory-3-Software-Engineering-II

# **Integrantes**
* Julian David Acosta Bello
* Camilo Andres Gil Ballen
* Juan Diego Medina Naranjo

## **Exercise 3**
El ejemplo que se usó para la implementación del patrón Builder Pattern, consiste en una fabrica de carros la cual es capaz de ensamblar y construir carros de diferentes marcas, el problema de esto es que cada marca de autos tiene diferentes especificaciones de sus partes. 

En este caso el patrón Builder Pattern toma gran relevancia ya que, permite a la Fábrica de autos construir autor de cualquier marca sin importar las especificaciones de cada marca. 

## **Exercise 4**
**Cut and Paste Programming:** 
Para ejemplificar este antipattern, se consideró la existencia de una empresa que está desarrollando un determinado producto, y se necesitan desarrollan 3 funcionalidades para dicho producto, para cada funcionalidad se le asigna un desarrollador. 

Por lo general las funcionalidades que desarrollada esta empresa tienen 3 partes:

* Parte I: Se realizan todos y cada uno de los cálculos correspondientes a las entradas.
* Parte II: Se analizan los resultados obtenidos en la parte 1 y se determina una respuesta. 
* Parte III: Se le da un formato predefinido por la empresa a la respuesta obtenida en la parte II.

El primero en terminar es un Desarrollador Senior el cual realizo la funcionalidad 01 absolutamente desde 0. 
Luego un Desarrollador Junior que es el encargado de implementar la funcionalidad 02, termina la parte I y la parte II de su funcionalidad, y nota que el Desarrollador Senior resolvió el mismo problema que el tiene en la parte III con un bloque de código, el decide clonar este código en su parte III.

Por último, un Desarrollador Semi Senior termina la parte I y II de la funcionalidad 03, y nota que sus dos compañeros usaron el mismo código en la parte III, por lo cual el clona ese bloque código para su parte III. 
En este punto se puede evidenciar el problema del antipattern Cut and Paste Programming, existe una misma pieza de código en 3 funcionalidades distintas, en caso de que esta pieza de código presente alguna falla o bug, el trabajo de arreglarla será extremadamente tedioso. 

**Spaguetti Code:**

Una de las principales practicas que genera el código espagueti es la concatenación de if, para ejemplificar esto, se implemento una funcionalidad que permite determinar si un estudiante dado puede ingresar a un evento o no, dependiendo de algunos parámetros, este código es una clásica validación, pero la concatenación un if tras otro, (incluso un for, para este caso) hace que se genere código espagueti, haciéndolo ilegible. 
