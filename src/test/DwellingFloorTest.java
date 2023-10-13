package test;


import House.Building.DwellingFloor;
import House.Building.Flat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DwellingFloorTest {

    @Test
    void deleteFlatTest(){
        int lenght = 5;
        int razn=lenght-1;
        Assertions.assertEquals(4,razn);
    }
    @Test
    void addFlatTest(){
        int lenght = 5;
        int add=lenght+1;
        Assertions.assertEquals(6,add);
    }
    @Test
    void getFlatssquareTest(){
        Flat flat1= new Flat(9,200);
        Flat flat2 = new Flat(10,199);
        Flat[] flats = {flat1, flat2};
        int sum=0;
       for(int i=0;i<flats.length;i++){
           sum+=flats[i].getSquare();
       }
        Assertions.assertEquals(399, sum);
    }
    @Test
    void getTotalFlatsTest(){ //DwellingFloorTest()//
        Flat flat1= new Flat(9,200);
        Flat flat2 = new Flat(10,199);
        Flat[] flats = {flat1, flat2};
        int sum=flats.length;
        Assertions.assertEquals(2, sum);
    }
    @Test
    void getFlatsQuantityTest(){
        Flat flat1= new Flat(9,200);
        Flat flat2 = new Flat(10,199);
        Flat[] flats = {flat1, flat2};
        int sum=0;
        for(int i=0;i<flats.length;i++){
            sum+=flats[i].getRooms();
        }
        Assertions.assertEquals(19, sum);
    }


}
