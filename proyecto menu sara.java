import java.util.Scanner;

public class Principal {

    Scanner scanner=new Scanner(System.in);

    public static void main (String [] arga){

        int opcion =0;
       
        do {
        
        System.out.println("Bienvenido a la libreria de narinia");
        System.out.println("estos son los libros con los que contamos");
        System.out.println("1= A.el sobrino del mago");
        System.out.println("2= B. el leon la bruja y el ropero");
        System.out.println("3= C. el caballo y el muchacho");
        System.out.println("4= D. el principe caspian");
        System.out.println("5= E. la travecia del viajero del alba");
        System.out.println("6= F. la silla de plata");
        System.out.println("7= G. la ultima batalla");
        System.out.println("8= H. no deseo ningun libro");

        System.out.println("porfavor selecciona tu libro favorito");
        int opcion=scanner.nextInt();

        switch(opcion){
            case 1:
            System.out.println("A");
            System.out.println("el libro escogido es: el sobrino del mago ");
            break;

            case 2:
            System.out.println("B");
            System.out.println("el libro escogido es: el leon, la bruja y el ropero");
            break;

            case 3:
            System.out.println("C");
            System.out.println("el libro escogido es: el caballo y el muchacho");
            break;

            case 4:
            System.out.println("D");
            System.out.println("el libro escogido es: el principe caspian");
            break;

            case 5;
            system.out.printl("E");
            System.out.println("el libro escogido es: la travecia del viajero del alba");
            break;

            case 6;
            system.out.println("F");
            System.out.println("el libro escogido es: la silla de plata");
            break;

            case 7;
            system.out.println("G");
            System.out.println("el libro escogido es: la ultima batalla");
            break;

            case 8;
            system.println("H");
            System.out.println("no se ah elegido nada adios");
            break;
            
            case 9;
            system.println("");
            system.println("Gracias por escoger un libro, lindo dia :D");
            break;

            default;
            sysrem.println("j-Z");
            System.out.println("Error datos no correspondientes");
            break;

        }


    } while (opcion != 9);
   
    input.close;
}

}