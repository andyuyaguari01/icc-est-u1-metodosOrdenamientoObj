package models;
public class Person {
    private String nombre ;
    private int edad;
    private int[] notas;
    public Person(String nombre, int edad, int[]notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas= notas;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Person [nombre=" + nombre + ", edad=" + edad + " ,promedio=" + Promedio + "]";
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    public int getPromedio(){
        
        //calcular el promedio
        //sumo todas la notas / cantidad de notas 
        int sum = 0;
        for( )

        return 0 ;
    }
    public int valueNombre(){
        int value = 0 ;
        for ( int i = 0; i < nombre.length(); i++){
            char letra = nombre.charAt(i);

        }
    }

    

    

    

}
