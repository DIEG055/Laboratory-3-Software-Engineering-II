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
public class Spaghetti_Code {
    
    public static boolean sePuedeIngresar(int edad, double[] calificaciones, String carrera, String universidad, double promedio){
        
        //Verificando que es mayor de edadd
        if(edad>=18){
            
            //Revisando si es de la alguna carrera de la facultad de economia
            if(carrera.compareTo("Economia")==0 ||  carrera.compareTo("Contaduria")==0 || carrera.compareTo("Administracion") == 0 ){
                
                //Revisando que pertenece a la universidad de los Andes o Nacional
                if(universidad.compareTo("Universidad de los Andes") == 0 || universidad.compareTo("Universidad Nacional de Colombia") == 0){
                    
                    
                    //revisando Promedio
                    if(promedio>4.3){
                        
                        //Por ultimo se revisan notas
                        for(int i=0; i<calificaciones.length; i++){
                            if(calificaciones[i]<3.5){
                                return false;
                            }
                        }
                        
                        return true;
                        
                    }
                    
                    //Si el promedio es muy bajo
                    else{
                        return false;
                    }
                    
                }
                
                //Si no pertenece a la universidad nacional, ni a los andes
                else{
                    return false;
                }
            }
            //Si no pertence a una carrera de la facultad de economia
            else{
                return false;
            }
        }
        //Si es mejor de edad
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        double[] calificaciones = new double[5];
        calificaciones[0] = 5;
        calificaciones[1] = 4.5;
        calificaciones[2] = 3.8;
        calificaciones[3] = 4.7;
        calificaciones[4] = 3.6;
        boolean respuesta = sePuedeIngresar(19, calificaciones, "Economia", "Universidad Nacional de Colombia", 4.6);
        System.out.println("Se puede ingresar: " + respuesta );
    }
}
