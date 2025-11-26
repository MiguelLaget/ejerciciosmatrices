/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dam1
 */
import java.util.Random;

public class ejercicio_4 {

    public static void main(String[] args) {
        int [][] _array = new int [6][10];
        arrayAleatorio(_array);
        encontrarMayor(_array);
        encontrarMenor(_array);
        
          for (int fil = 0; fil< _array.length;fil++)
        {
            System.out.print("FILA "+ fil+" |");   
            for (int col = 0; col<_array[fil].length;col++)
            {
                
                System.out.print(+_array[fil][col]);
                System.out.print(" |");
            }
             System.out.println("");   
                
        }
    }
    public static void arrayAleatorio(int [][]_array)
    {
        Random rand = new Random();
        int _comprobar [] = new int[1001]; 
        int numeroAleatorio;

        for (int fila = 0; fila < _array.length; fila++)
        {
            for (int colum = 0; colum < _array[0].length; colum++)
            {
                do {
                    numeroAleatorio = rand.nextInt(1000);
                } while (_comprobar[numeroAleatorio] == 1);

                _comprobar[numeroAleatorio] = 1;
                _array[fila][colum] = numeroAleatorio;
            }
        }
    }
    public static void encontrarMayor(int [][]_array)
    {
        int mayor = 0, mayorFila=0, mayorColum=0;
        for (int fila=0; fila<_array.length; fila++)
        {
            for (int colum = 0; colum<_array[0].length; colum++)
            {
                if (mayor < _array[fila][colum])
                {
                    mayor = _array[fila][colum];
                    mayorFila= fila;
                    mayorColum = colum;
                    
                }
            }
        }
        System.out.println("El mayor es "+mayor+" y se encuentra en la fila: "+mayorFila+" y en la colunna: "+mayorColum);
    }
     public static void encontrarMenor(int [][]_array)
    {
        int menor = 1000, menorFila=0, menorColum=0;
        for (int fila=0; fila<_array.length; fila++)
        {
            for (int colum = 0; colum<_array[0].length; colum++)
            {
                if (menor > _array[fila][colum])
                {
                    menor = _array[fila][colum];
                    menorFila= fila;
                    menorColum = colum;
                    
                }
            }
        }
        System.out.println("El menor es "+menor+" y se encuentra en la fila: "+menorFila+" y en la colunna: "+menorColum);
    }
    
}


