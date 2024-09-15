package com.tutorial;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int angka1 = userInput.nextInt();
        userInput.nextLine();
        System.out.print("Masukkan angka : ");
        int angka2 = userInput.nextInt();
        
        try{
            System.out.println(angka1/angka2);
            int [] arr = {1,2,3,4};
            System.out.println(arr[6]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Ada kesalahan ges : " + e.getMessage());
        } catch(Exception e){
            System.out.println("Ada kesalahan ges : " + e.getMessage());
        }finally{

            System.out.println("Akhir dari program");
        }

        userInput.close();
    }
}