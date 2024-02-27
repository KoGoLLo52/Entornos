package ent;

import java.util.ArrayList;

import Objects.*;

public class Main {
    private static ArrayList<Runner> runners = new ArrayList<>();
    public static void main(String[] args) {
        int[] field = CreateField();
        ShowField(field);
    }

    public static void InitiateRunners(){
        for(int i = 0 ; i < 6; i++){
            if(i < 3){
                runners.add(new Midicloriano());
            } else{
                runners.add(new Gorgonita());
            }
        }
    }

    //#region Field
    public static int[] CreateField(){
        int length = 20; 
        int[] field = new int[length]; //Las trampas seran 1 y los bonus 2, nada es un 0

        for(int i = 0; i < field.length;i++){
            field[i] = 0;
            if(isPrime(i)){
                if(isTrap(i)){
                    field[i] = 1;
                } else{
                    field[i] = 2;
                }
            }
        }
        return field;
    }

    public static boolean isTrap(int n){
        int units = n%10;
        int tens = n/10;

        if(units+tens<=5){
            return false;
        }
        
        return true;
    }

    public static boolean isPrime(int n){
        for(int i = 2; i < n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void ShowField(int[] field){
        if(field==null){
            System.err.println("FIELD NOT INITIALISED");
            return;
        }

        for(int i = 0; i < field.length;i++){
            System.out.println(field[i]);
        }
    }

    //#endregion 
}