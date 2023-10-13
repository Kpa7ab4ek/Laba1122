package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        System.out.println("Массив");
        for(int i=0; i<array.length; i++){
            //array[i]=i;
            System.out.println(array[i]);
        }
        System.out.println("Обратный массив");
        for(int i=array.length-1; i>=0; i--){
            //array[i]=i;
            System.out.println(array[i]);
        }
    }
}
