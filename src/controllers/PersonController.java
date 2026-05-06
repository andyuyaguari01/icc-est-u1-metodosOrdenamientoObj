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

}
