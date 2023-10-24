
package House;

import House.Building.Dwelling;
import House.Building.DwellingFloor;
import House.Building.Flat;

public class Main {
    public static void main(String[] args) {

        Flat flat1 = new Flat(1, 500);
        Flat flat2 = new Flat(2, 350);
        Flat flat3 = new Flat(3, 400);
        Flat flat4 = new Flat(4, 113);
        Flat flat5 = new Flat(5, 600);
        Flat flat6 = new Flat(6, 50);
        Flat flat7 = new Flat(7, 100);
        Flat flat8 = new Flat(8, 1000);
        Flat flat9 = new Flat(9, 200);
        Flat flat10 = new Flat(111, 111);
        Flat[] flats = {flat1, flat2, flat3, flat4, flat5};
        Flat[] flats2 = {flat6, flat7, flat8, flat9};
        Flat[] flats3 = {flat10};

        DwellingFloor dwellingFloor1 = new DwellingFloor(flats);
        DwellingFloor dwellingFloor2 = new DwellingFloor(flats2);
        DwellingFloor dwellingFloor3 = new DwellingFloor(flats3);

        DwellingFloor[] floors = {dwellingFloor1, dwellingFloor2};
        Dwelling dwelling1 = new Dwelling(floors);


       /* for (int i = 0; i < 9; i++) {
            System.out.println(dwelling1.getSortFlatsBySquare(-1)[i]);
        }
        System.out.println("JOPA");
        for (int i = 0; i < 9; i++) {
            System.out.println(dwelling1.getSortFlatsBySquare(1)[i]);
        }*/

      /*  dwelling1.setFloor(0, dwellingFloor3);
        for (int i =0; i<2;i++){
            System.out.println(dwelling1.getFloors()[i]);
        }*/
        //dwelling1.setFlat(8,flat10);
      /*  dwelling1.addFlat(9, flat10);
        System.out.println("");
        for (int i = 0; i < 2; i++) {
            System.out.println(dwelling1.getFloors()[i]);
        }
        System.out.println("");
        System.out.println(dwelling1.getFlat(0));*/



    }
}
