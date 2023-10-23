package House.Building;

import com.sun.deploy.security.SelectableSecurityManager;

public class Dwelling {

    public Dwelling(int numbersOfFloors, int[] numbersOfFlats) {
        this.floors = new DwellingFloor[numbersOfFloors];

        for (int i = 0; i < numbersOfFloors; i++) {
            this.floors[i] = new DwellingFloor(numbersOfFlats[i]);
        }
    }

    private DwellingFloor[] floors;

    public Dwelling(DwellingFloor[] floors) {
        this.floors = floors;
    }

    public int getFloorsQuantity() {

        return floors.length;
    }

    public int getTotalFlats() {
        int sum = 0;
        for (int i = 0; i < floors.length; i++) {
            sum += floors[i].getTotalFlats();
        }
        return sum;
    }

    public int getFlatsSquare() {
        int sum = 0;
        for (int i = 0; i < floors.length; i++) {
            sum += floors[i].getFlatsSquare();
        }
        return sum;
    }

    public int getFlatsQuantity() {
        int sum = 0;
        for (int i = 0; i < floors.length; i++) {
            sum += floors[i].getFlatsQuantity();
        }
        return sum;
    }

    public DwellingFloor[] getFloors() {
        return floors;
    }

    public DwellingFloor getFloor(int index) {
        return floors[index];
    }

    public void setFloor(int index, DwellingFloor newDwellingFloor) {
        floors[index] = newDwellingFloor;
    }

    public Flat getFlat(int index) {
        int counter = 0;
        for (int i = 0; i < floors.length; i++) {
            DwellingFloor floor = floors[i]; //
            for (int k = 0; k < floor.getTotalFlats(); k++) {
                if (counter == index) {
                    return floor.getFlat(k);
                }
                counter++;
            }
        }
        return null;
    }

    public void setFlat(int index, Flat newFlat) {
        int sum = 0;
        for (int i = 0; i < floors.length; i++) {
            DwellingFloor floor = floors[i];
            int flatsAmount = floor.getTotalFlats();
            sum += floor.getTotalFlats();
            if (sum > index) {
                floor.setFlat((flatsAmount - (sum - index)), newFlat);
                break;
            }
        }
    }

    public void addFlat(int index, Flat newFlat) {
        for (int i = 0; i < floors.length; i++) {
            if (index > floors[i].getTotalFlats()) {
                index -= floors[i].getTotalFlats();
            } else {
                floors[i].addFlat(index, newFlat);
                break;
            }
        }
    }

    public void deleteFlat(int index) {

        for (int i = 0; i < floors.length; i++) {
            if (index > floors[i].getTotalFlats()) {
                index -= floors[i].getTotalFlats();
            } else {
                floors[i].deleteFlat(index);
            }
        }
    }

    public Flat getBestFlatBySquare() {
        Flat bestFlat = floors[0].getBestSquare();
        for (int i = 0; i < floors.length; i++) {
            Flat bigFlat = floors[i].getBestSquare();
            if (bigFlat.getSquare() > bestFlat.getSquare()) {
                bestFlat = bigFlat;
            }
        }
        return bestFlat;
    }

    public Flat[] getSortFlatsBySquare(int order) {
        Flat[] mass = new Flat[getTotalFlats()];
        Flat[] massNotSorted = getAllFlats();
        {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                if (order == 1) {
                    for (int in = 1; in < mass.length; in++) {
                        if (massNotSorted[in].getSquare() > massNotSorted[in - 1].getSquare()) {
                            Flat temp = massNotSorted[in];
                            massNotSorted[in] = massNotSorted[in - 1];
                            massNotSorted[in - 1] = temp;
                            isSorted = false;
                        }
                    }
                }
                if (order==-1){
                    for (int in = mass.length-1; in >= 1; in--) {
                        if (massNotSorted[in].getSquare() < massNotSorted[in - 1].getSquare()) {
                            Flat temp = massNotSorted[in];
                            massNotSorted[in] = massNotSorted[in - 1];
                            massNotSorted[in - 1] = temp;
                            isSorted = false;
                        }
                    }
                }
            }
            return massNotSorted;
        }
    }

    private Flat[] getAllFlats() {
        Flat[] mass = new Flat[getTotalFlats()];
        int counter = 0;
        for (int i = 0; i < floors.length; i++) {
            for (int k = 0; k < floors[i].getFlats().length; k++) {
                mass[counter++] = floors[i].getFlats()[k];
            }
        }
        return mass;
    }
}