/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise4;

/**
 *
 * @author Camilo
 */
/*
    El ejemplo se basa en que una empresa se designo a varios ingenieros de 
    software implementar cada uno algunas funcionalidades (procesos de calculo y demas)
    importantes para el producto que estan desarrollando, estas propiedades tienen 
    algunas similitudes pero cada ingeniero desarrollara la funcionalidad por su cuenta, 
    algunos ingenieros son novatos y otros experimentados. 
*/

public class Cut_and_Paste_Programing {
    
    //Funcionalidad 1 es implementada por un desarrollador Senior, el realiza todo desde cero
    public static String funcionalidadImportante01(int entrada){
        //PARTE I - Desarollado por el Desarrollador Senior
        //Calculos super importantes y muy muy muy complicados de hacer
        int variable01 = entrada * 2 * 4 * 9 + (12/entrada);
        //Muchos mas calculos
        //Muchos mas calculos
        //Muchos mas calculos
        //Muchos mas calculos
        //Muchos mas calculos
        
        
        //PARTE II - Desarollado por el Desarrollador Senior
        //Analisis super hiper complicado de hacer
        String salida;
        if(variable01 > 0){
            salida = "Mayor que 0";
        }
        else{
            salida = "Menor que 0";
        }
        //Muchos mas analisis
        //Muchos mas analisis
        //Muchos mas analisis
        //Muchos mas analisis
        //Muchos mas analisis
        //Muchos mas analisis
        
        
        
        //PARTE III - Desarollado por el Desarrollador Senior
        //Mostar los datos en un formato establecido, FACIL de ENTENDER
        String plantilla = "El resultado de la funcionalidad fue: ";
        String respuesta = plantilla.concat(salida);
        //Muchos mas formatos
        //Muchos mas formatos
        //Muchos mas formatos
        //Muchos mas formatos
        //Muchos mas formatos
        return respuesta;
    }
    
    
    
    //Funcionalidad 2 es implementada por un desarrollador Junior
    public static String funcionalidadImportante02(int entrada){
        
        
        //PARTE 1 - Implementados por el desarrollador Junior
        //Calculos super importantes y muy muy muy complicados de hacer
        int variable01 = entrada*2;
        int variable02 = (entrada*89)/12;
        //Muchos mas calculos
        //Muchos mas calculos
        //Muchos mas calculos
        //Muchos mas calculos
        //Muchos mas calculos
        
        
        //PARTE II - Implementados por el desarrollador Junior
        //Analisis super hiper complicado de hacer
        String salida;
        if(variable01>variable02){
            salida = "Caso 1 Aprobado";
        }
        else{
            salida = "Caso 2 Aprobado";
        }
        //Muchos mas analisis
        //Muchos mas analisis
        //Muchos mas analisis
        //Muchos mas analisis
        //Muchos mas analisis
        //Muchos mas analisis
        
        
        
        //PARTE III - Copy and Paste
        //El desarrollador Junior nota que en una funcion anterior se 
        //resolvio el mismo problema con el mismo codigo, el decide reutilizar este codigo
        //Mostar los datos en un formato establecido, FACIL de ENTENDER
        String plantilla = "El resultado de la funcionalidad fue: ";
        String respuesta = plantilla.concat(salida);
        //Muchos mas formatos
        //Muchos mas formatos
        //Muchos mas formatos
        //Muchos mas formatos
        //Muchos mas formatos
        return respuesta;
    }
    
    
    
    //Funcionalidad 3 es implementada por un desarrollador Semi Senior
    public static String funcionalidadImportante03(int entrada){
        
        
        //PARTE I - Desarollado por el Desarrollador Semi Senior
        //Calculos super importantes y muy muy muy complicados de hacer
        int variable01 = entrada*2;
        int variable02 = (entrada*90992)/3312 + 77123;
        int variable03 = entrada*entrada + entrada +821389;
        //Muchos mas calculos
        //Muchos mas calculos
        //Muchos mas calculos
        //Muchos mas calculos
        //Muchos mas calculos
        
        
        
        //PARTE II - Desarollado por el Desarrollador Semi Senior
        //Analisis super hiper complicado de hacer
        String salida;
        if(variable01>0 && variable02>0 && variable03>0){
            salida = "Compra Aprovada";
        }
        else{
            salida = "Compra Rechazada";
        }
        //Muchos mas analisis
        //Muchos mas analisis
        //Muchos mas analisis
        //Muchos mas analisis
        
        
        
        
        
        
        
        //PARTE III - Copy and Paste
        
        //El desarrollador semi senior nota que todos los demas desarrolladores 
        //estan usando el mismo fragmento de codigo para solucionar este problema
        //el decide usar el mismo. 
        
        
        //Mostar los datos en un formato establecido, FACIL de ENTENDER
        String plantilla = "El resultado de la funcionalidad fue: ";
        String respuesta = plantilla.concat(salida);
        //Muchos mas formatos
        //Muchos mas formatos
        //Muchos mas formatos
        //Muchos mas formatos
        //Muchos mas formatos
        return respuesta;
    }
    
    
    public static void main(String[] args) {
        //Uso de las funcionalidades
        System.out.println("Funcionalidad 1: " + funcionalidadImportante01(90));
        System.out.println("Funcionalidad 2: " + funcionalidadImportante02(90));
        System.out.println("Funcionalidad 3: " + funcionalidadImportante03(90));    
    }
}
