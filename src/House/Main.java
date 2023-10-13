
package House;

import House.Building.Dwelling;
import House.Building.DwellingFloor;
import House.Building.Flat;

public class Main {
    public static void main(String[] args) {

        Flat flat1 = new Flat(1, 300);
        Flat flat2 = new Flat(2, 123);
        Flat flat3 = new Flat(3, 123);
        Flat flat4 = new Flat(4, 123);
        Flat flat5 = new Flat(5, 123);
        Flat flat6 = new Flat(6, 50);
        Flat flat7 = new Flat(7, 100);
        Flat flat8 = new Flat(8, 150);
        Flat flat9 = new Flat(9, 200);
        Flat[] flats = {flat1, flat2, flat3, flat4, flat5};
        Flat[] flats2 = {flat6, flat7, flat8, flat9};

        DwellingFloor dwellingFloor1 = new DwellingFloor(flats);
        DwellingFloor dwellingFloor2 = new DwellingFloor(flats2);

        DwellingFloor[] floors = {dwellingFloor1, dwellingFloor2};
        Dwelling dwelling1 = new Dwelling(floors);


/*


       System.out.println(flat7.getRooms());
        System.out.println(dwellingFloor2.getTotalFlats());
        dwellingFloor2.addFlat(1, new Flat());
        System.out.println(dwellingFloor2.getTotalFlats());
        System.out.println(dwelling1.getFlat(7).getRooms());
       System.out.println(dwelling1.getFlatsQuantity());

        System.out.println(dwelling1.getFlatsQuantity());
        System.out.println("ЖОПААААА");
        dwelling1.sortirovshik();
        System.out.println(dwelling1.getFlatsQuantity());

*/
        System.out.println(flat1.getSquare()+"\t" + flat1.getRooms()); //квартира№1 50/1
        System.out.println(dwellingFloor1.getTotalFlats()); //кол-во квартир на 1 этаже
        System.out.println(dwellingFloor2.getTotalFlats()); //кол-во квартир на 2 этаже
        System.out.println(dwellingFloor1.getFlat(4).getRooms()+"\t"+dwellingFloor1.getFlat(4).getSquare());
        System.out.println(dwellingFloor2.getFlat(3).getRooms()+"\t"+dwellingFloor1.getFlat(3).getSquare());
        flat1.setRooms(5);
        flat1.setSquare(100000);
        System.out.println(flat1.getRooms() + "\t" + flat1.getSquare());//квартира 1 100000/5
        System.out.println(dwelling1.getFlat(0).getRooms() + "\t" + dwelling1.getFlat(0).getSquare());
        System.out.println(dwellingFloor1.getTotalFlats());
        System.out.println(dwellingFloor1.getFlat(4).getRooms());
        dwellingFloor1.deleteFlat(0);
        System.out.println(dwellingFloor1.getTotalFlats());
       /* System.out.println(dwellingFloor1.getFlat(0).getRooms() + "\t" + dwelling1.getFlat(0).getSquare());
        System.out.println(dwellingFloor1.getFlat(4).getRooms());*/
        System.out.println("4len");
        dwellingFloor1.getFlats();
        System.out.println("JOPA");
        System.out.println(dwellingFloor1.getBestSpace());

    }
}
