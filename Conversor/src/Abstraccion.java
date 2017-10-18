package conversor;

import java.io.InputStream;
import java.util.Scanner;


/**
 *
 * @author Estudiantes
 */
public class Abstraccion {

    public static void main(String[] args) {
       
        Conversorconcreto miconversor= new Conversorconcreto();
        InputStream stream =System.in;
        Scanner scanner=new Scanner(stream);
        System.out.println("Ingrese Grados farenheit y Grado angular");
        String input=scanner.next(String.valueOf(miconversor.dato));
        System.out.println("El valor en Grados Kelvin es:"+input);
        System.out.println("El valor en radianes  es:"+input);
        
        TransformadorImplementado mitransformador= new TransformadorImplementado();
        System.out.println("Ingrese Grados kelvin y Grado angular");
        String Impresion=scanner.next(String.valueOf(mitransformador.valor));
        System.out.println("El valor en grados celcios es:"+mitransformador.kelvin2celcius());
        System.out.println("El valor en Radianes es:"+mitransformador.grado2radian());
    }
    
}
