# Laboratory-3-Software-Engineering-II

# **Integrantes**
* Julian David Acosta Bello
* Camilo Andres Gil Ballen
* Juan Diego Medina Naranjo

## **Exercise 1**

Inicialmente se crea la Interfaz **VehicleStrategy**, la cual encapsula el comportamiento de ir al aeropuerto dado por el método goToAirport(). Esta interfaz es implementada por las clases **Bicycle,Bus y Cab**, allí se sobrescribe el método goToAirport() según sea el caso.

Luego, se tiene la clase **TransportContext**. Dentro de esta clase se encuentra una instancia de VehicleStrategy, la cual es inicializada con el método setVehicle(VehicleStrategy v). Esto permite que posteriormente en la clase Client al tener una instancia de TransportContext se puede usar este método enviando como parámetro alguno de los vehículos disponibles(Bicycle,Bus,Cab). La clase TransportContext no tiene en cuenta estrategias específicas(vehículos) lo cual permite ser usada sin importar los vehículos disponibles en el caso de que se agreguen o eliminen vehículos.

Finalmente se tiene la clase **Client** que es usa el método orderVehicle() para definir el vehículo a usar de acuerdo a las condiciones de tiempo y presupuesto que son definidas. Luego, como se mencionó anteriormente se tiene una instancia de TransportClient, que a través del método setVehicle() define el vehículo. Posteriormente se tiene el método goToDestination() que llama a la función goToAirport() de la interfaz VehicleStrategy, este método ya fue sobrescrito por cada tipo de vehiculo y responderá de acorde al vehículo que se haya elegido.

## **Exercise 2**

Para resolver este ejercicio, lo que se hizo fue descargar el código del repositorio indicado en las instrucciones del laboratorio. Posteriormente, siguiendo la estructura del dicho código, se creo una nueva franquicia de pizzas **MedellinPizzaStore** (En el package **PizzaStore.Stores**), y las pizzas pertenecientes a dicha franquicia (En el packeage **PizzaStore.PizzaStyle.Medellin**): **MedellinStyleBandejaPaisaPizza**, **MedellinStyleChorizoPizza**, **MedellinStyleGroundBeefPizza**, **MedellinStylePorkRindPizza**. Cada una con caracteristicas especiales que las diferencian de las demás.

Por último, se modificó la clase **main** para que se mostraran no solo las pizzas de Nueva York o Chicago, sino también las pizzas de Medellín.


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

## **Exercise 5**

Se modificó el código del ejemplo mostrado en clase para la explicación del patrón decorador (Decorator pattern). Añadiéndole nuevas adiciones: **Figure**, **Timed**; y un nuevo tipo de cafe: **Coffee**. Con estas adiciones, y las ya existentes, hicimos una función en el main que nos permite, según el tipo de cafe y las adiciones que tiene este, imprimir el nivel de sofisticación apropiado para el café indicado.
