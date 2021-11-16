package actividadpracticaobligatoria;

/**
 *
 * @author Charly
 */

import java.util.Scanner ;
public class Actividadpracticaobligatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  Scanner Sc= new Scanner (System.in);


System.out.println("Ingrese nombre: ");
String nombre =Sc.nextLine();

System.out.println("Ingrese apellido: ");

String apellido = Sc.nextLine();

System.out.println("Ingrese edad: ");

String edad = Sc.nextLine();

System.out.println("Ingrese hobbie: ");

String hobbie = Sc.nextLine();

System.out.println("Ingrese Editor de codigo preferido: ");

String editordecodigo= Sc.nextLine();


System.out.println("Ingrese Sistema operativo usado: ");

String sistemaoperativo = Sc.nextLine();



System.out.println("Nombre: "+nombre + "\nApellido: " +apellido+ "\nEdad: " +edad+ "\nHobbie" +hobbie + "\nEditor de codigo "+editordecodigo + "\nSistema Operativo"+sistemaoperativo );   
        
        
        
   
    }
    
}
