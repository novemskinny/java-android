package com.tutorial;
import java.util.Scanner;
public class Matriks {

  public static void main(String[] args) {
  
  

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan ordo : ");
        int o = input.nextInt();
        int[][] m = new int[o][o];
        int[][] t = new int[o][o];
 
        // input matrix
        for (int i = 0; i < o; i++)
            for (int j = 0; j < o; j++) {
                System.out.print("Baris " + (i + 1) + " Kolom " + (j + 1) + " : ");
                m[i][j] = input.nextInt();
            }
        // print matrix asli
        System.out.println("Matriks: ");
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < o; j++)
                System.out.print(m [i] [j] + "\t");
            System.out.println();
        
        }
 
  }

}
