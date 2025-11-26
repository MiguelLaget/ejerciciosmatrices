
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dam1
 */
public class ejercicio2 {
    static Scanner teclado = new Scanner(System.in);
    public static void menuNumeros()
    {
        System.out.println("-----ELIJA COMO QUIERE RELLENAR LOS ARRAYS-----");
        System.out.println("-----OPCION 1: AUTOMATICO");
        System.out.println("-----OPCION 2: MANUAL");
        System.out.print("Elija una opcion: ");
    }
    public static void rellenarArray(int [][] _array)
    {
        int numero = 1;
        for (int fil = 0; fil<_array.length;fil++)
        {
            for (int col = 0; col<_array[fil].length;col++)
            {
                _array[fil][col] = numero;
                numero++;
               
            }
        }
    }
    public static void pedirNumeros(int [][] _array)
    {
        for (int fil = 0; fil<_array.length;fil++)
        {
            for (int col = 0; col<_array[fil].length;col++)
            {
                System.out.println("Introduzca el valor del array ("+fil+", "+col+")");
                _array[fil][col] = teclado.nextInt();
               
            }
        }
       
    }
    public static void tabla(int [][] _matriz, int suma)
    {
        System.out.print("Índice| ");
        
//        for (int i = 0; i<(_matriz[].length); i++) 
//        {
//        System.out.print(i+"|");
//        }
      
        for (int fil = 0; fil< _matriz.length;fil++)
        {
            if ( fil == 0)
            {
                for (int i = 0; i<(_matriz[fil].length); i++) 
                {
                    System.out.print(i+" | \t");
                }
                System.out.println("");
            }
            System.out.print("FILA "+ fil+" |\t");   
            for (int col = 0; col<_matriz[fil].length;col++)
            {
                
                System.out.print(+_matriz[fil][col]);
                System.out.print(" |");
            }
             System.out.println("");   
                
        }
        System.out.println("El valor de la suma de todos los numeros es : "+suma);
    }
     public static void main(String[] args) {
         final int TAMFIL = 4;
         final int TAMCOL = 6;
         int suma = 0;
         int opcion;
         
         int [][] _matriz = new int [TAMFIL][TAMCOL];
         
         do
         {
         menuNumeros();
         opcion = teclado.nextInt();
         switch (opcion)
         {
             case 1: 
                 rellenarArray(_matriz);
                 break;
             
             case 2:  
                 pedirNumeros(_matriz);
                 break;
             default: 
                 System.out.println("NUMERO INCORRECTO");
                 break;
         }
         tabla(_matriz, suma);
         }while (opcion == 1 || opcion == 2)  ;  
         
         
         
         
     }
}
