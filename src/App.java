import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        PersonController orden = new PersonController();
        Person[] personas={
            
            new Person("Juan",25, new int[]{10 , 15, 20}),
            new Person("Ana",19, new int[]{15, 15, 20}),
            new Person("Carlos",30, new int[]{10,10,10}),
            new Person("Maria",25, new int[]{20,15,20}),
            new Person("Diego",25, new int[]{20, 10, 20}),
        };
        System.out.println("===Personas sin Ordenar===");
        orden.mostrarArreglo(personas);

        System.out.println("=== Personas Ordenadas por edad"); 
        orden.sortPersonByEdad(personas);
        orden.mostrarArreglo(personas);

        System.out.println("=== Personas Ordenadas Por Notas ===");
        orden.sortPersonByNombre(personas);
        orden.mostrarArreglo(personas);



        for (Person person : persona){
            System.out.println(person);
        }
           PersonController pController = new PersonController();
           pController.sortPersonByAge
        

    }
}
