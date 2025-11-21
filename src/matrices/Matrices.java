/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

/**
 *
 * @author dam1
 */
public class Matrices {

    

    public static void main(String[] args) {
        final int TAMC = 6;
        final int TAMF = 3;
        
        int [][] _matriz = new int [TAMF][TAMC];
        
        _matriz[0][0] = 40;
        _matriz[0][1] = -2;
        _matriz[0][4] = 0;
        _matriz[1][0] = 89;
        _matriz[1][5] = 4;
        _matriz[2][1] = -2;
        _matriz[2][2] =10;
        _matriz[2][4] = 33;
        
        System.out.println("Índice| 0 | 1 | 2 | 3 | 4 | 5|");
        
        for (int fil = 0; fil< _matriz.length;fil++)
        {
            System.out.print("FILA "+ fil+" |");   
            for (int col = 0; col<_matriz[fil].length;col++)
            {
                
                System.out.print(+_matriz[fil][col]);
                System.out.print(" |");
            }
             System.out.println("");   
                
        }
        
    }
    
}
