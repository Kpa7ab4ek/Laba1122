package House.Building;

public class Dwelling {

    /**
     * Конструктор 2 принимает массив этажей дома.
     */
    private DwellingFloor[] floors;

    /**
     * Конструктор 1 принимает количество этажей и массив количества квартир по этажам. (для создания этажей и квартир будет срабатывать конструктор по умолчанию)
     */
    public Dwelling(int numbersOfFloors, int[] numbersOfFlats) {
        this.floors = new DwellingFloor[numbersOfFloors];

        for (int i = 0; i < numbersOfFloors; i++) {
            this.floors[i] = new DwellingFloor(numbersOfFlats[i]);
        }
    }

    /**
     * Конструктор может принимать массив этажей дома.
     */
    public Dwelling(DwellingFloor[] floors) {
        this.floors = floors;
    }

    /**
     * Создайте метод получения общего количества этажей дома.
     */
    public int getDwellingFloorQuantity() {

        return floors.length;
    }

    /**
     * Создайте метод получения общего количества квартир дома.
     */
    public int getFlatsQuantity(){
        int sum = 0;
        for (int i = 0; i < floors.length; i++) {
            sum += floors[i].getTotalFlats();
        }
        return sum;
    }

    /**
     * Создайте метод получения общей площади квартир дома.
     */
    public int getFlatsSquare() {
        int sum = 0;
        for (int i = 0; i < floors.length; i++) {
            sum += floors[i].getFlatsSquare();
        }
        return sum;
    }

    /**
     * Создайте метод получения общего количества комнат дома.
     */
    public int getRoomsQuantity() {
        int sum = 0;
        for (int i = 0; i < floors.length; i++) {
            sum += floors[i].getFlatsQuantity();
        }
        return sum;
    }

    /**
     * Создайте метод получения массива этажей жилого дома.
     */
    public DwellingFloor[] getDwellingFloors() {
        return floors;
    }

    /**
     * Создайте метод получения объекта этажа, по его номеру в доме.
     */
    public DwellingFloor getDwellingFloor(int index) {
        return floors[index];
    }

    /**
     * Создайте метод изменения этажа по его номеру в доме и ссылке на обновленный этаж.
     */
    public void setDwellingFloor(int index, DwellingFloor newDwellingFloor) {
        floors[index] = newDwellingFloor;
    }

    /**
     * Создайте метод получения объекта квартиры по ее номеру на этаже.
     */
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

    /**
     * Создайте метод добавления квартиры в дом по будущему номеру квартиры в доме
     */

    public void addFlat(int index, Flat newFlat) {
        for (int i = 0; i < floors.length; i++) {
            if (index > floors[i].getTotalFlats()) {
                index -= floors[i].getTotalFlats();
            } else {
                floors[i].addFlat(index, newFlat);
                return;
            }
        }
    }

    /**
     * Создайте метод удаления квартиры по ее номеру в доме.
     */
    public void deleteFlat(int index) {

        for (int i = 0; i < floors.length; i++) {
            if (index > floors[i].getTotalFlats()) {
                index -= floors[i].getTotalFlats();

            } else {
                floors[i].deleteFlat(index);
                return;
            }
        }
    }

    /**
     * Создайте метод getBestSpace() получения самой большой по площади квартиры дома.
     */
    public Flat getBestSpace() {
        Flat bestFlat = floors[0].getBestSquare();
        for (int i = 0; i < floors.length; i++) {
            Flat bigFlat = floors[i].getBestSquare();
            if (bigFlat.getSquare() > bestFlat.getSquare()) {
                bestFlat = bigFlat;
            }
        }
        return bestFlat;
    }

    /**
     * Создайте метод получения отсортированного по убыванию площадей массива квартир.
     */
    public Flat[] sortirovshik() {
        Flat[] mass = new Flat[getFlatsQuantity()];
        Flat[] massNotSorted = getAllFlats();
        {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int in = 1; in < mass.length; in++) {
                    if (massNotSorted[in].getSquare() > massNotSorted[in - 1].getSquare()) {
                        Flat temp = massNotSorted[in];
                        massNotSorted[in] = massNotSorted[in - 1];
                        massNotSorted[in - 1] = temp;
                        isSorted = false;
                    }
                }
            }
            return massNotSorted;
        }
    }

    private Flat[] getAllFlats() {
        Flat[] mass = new Flat[getFlatsQuantity()];
        int counter = 0;
        for (int i = 0; i < floors.length; i++) {
            for (int k = 0; k < floors[i].getFlats().length; k++) {
                mass[counter++] = floors[i].getFlats()[k];
            }
        }
        return mass;
    }
}