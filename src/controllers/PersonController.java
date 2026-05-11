package controllers;

import models.Person;

public class PersonController {
//Metodo que ordena un arreglo de persona

    public void sortPersonByAge(Person[]personas){
        for ( int i = 1; i< personas.length; i++){
            Person aux = personas[i];
            int j= i -1;
            while ( j>=0 && personas[j].getEdad()> aux.getEdad()){
                personas[j+1] = personas[j];
                j--; 
            }
            personas[ j+1]= aux;
        }

    }
    //Metod ordena las personas segun el Promedio
    //de sus notas con seleccion
    public void sortPersonByAvrNotas ( Person[] personas){
        for(int i = 0; i< personas.length; i++){
            int index = i;
            for( int j=i+1; j< personas.length; j++){

                //comparacion para actualizar el indice
                if(personas[j].getPromedio()< personas[index].getPromedio())
                    index = i;
                // pregunto si el index != de i
                //entoces cambio posiciones
                if ( i !=index){
                    Person aux = personas[i];
                    personas[i]= personas[index];
                    personas[index]= aux;
                }
            
            }
        }
    }
    //ORDENAR EL ARREGLO DE PERSONAS POR VALOR DE SU NOMBRE
    // EL VALOR DEL NOMBRE SERA LA CANTIDAD DE LETRAS
    //DONDE LAS VOCALES VALEN 5
    // Y LAS CONSONANTES VALEN EL VALOR DE LA EDAD
    //EJ: Juan 20             EJ.Ana
    // 20 + 5 + 5 + 20 =50     5 + 80 + 5 =90
    public void sortPersonByNombreValue(Person[]personas){

    }
  


}
