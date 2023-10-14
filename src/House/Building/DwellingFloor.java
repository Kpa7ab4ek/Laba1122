package House.Building;


public class DwellingFloor {
    private Flat[] flats;

    /**
     * Конструктор 2 принимает массив квартир этажа.
     */
    public DwellingFloor(Flat[] flats) {
        this.flats = flats;
    }
    /**
     * Конструктор 1 принимает количество квартир на этаже и создаёт этаж с
     * квартирами используя конструктор квартир по умолчанию.
     */
    public DwellingFloor(int numbersOfFlats) {
        this.flats = new Flat[numbersOfFlats];
        for (int i = 0; i < flats.length; i++) {
            this.flats[i] = new Flat();
        }
    }
    /**
     * Создайте метод получения количества квартир на этаже.
     */
    public int getTotalFlats() {
        return flats.length;
    }
    /**
     * Создайте метод получения объекта получения общей площади квартир на этаже
     */
    public int getFlatsSquare() {
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getSquare();
        }
        return sum;
    }
    /**
     * Создайте метод получения общего количества комнат этажа.
     */
    public int getFlatsQuantity() {
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getRooms();
        }
        return sum;
    }
    /**
     * Создайте метод получения массива квартир этажа.
     */
    public Flat[] getFlats() {
        return flats;
    }
    /**
     * Создайте метод получения объекта квартиры по ее номеру на этаже
     */
    public Flat getFlat(int index) {
        return flats[index];
    }
    /**
     * Создайте метод изменения квартиры по ее номеру на этаже и ссылке на новую квартиру.
     */
    public void setFlat(int numberFlat, Flat newFlat) {
        flats[numberFlat] = newFlat;
    }
    /**
     * Создайте метод удаления квартиры по её номеру на этаже
     */

    public void deleteFlat(int index) {
        Flat[] newFlats = new Flat[flats.length - 1];
        for (int i = 0; i < index; i++) {
            newFlats[i] = flats[i];
        }
        for (int i = index; i < flats.length-1; i++) {
            newFlats[i] = flats[i+1];
        }
        flats = newFlats;
    }
    /**
     * Создайте метод добавления новой квартиры на этаже по будущему номеру квартиры
     */

    public void addFlat(int index, Flat newFlat) {
        Flat[] flat = new Flat[flats.length + 1];
        for (int i = 0; i < index; i++) {
            flat[i] = flats[i];
        }
        flat[index]=newFlat;
        for (int i = index; i < flats.length; i++) {
            flat[i+1]=flats[i];
        }
        flats = flat;
    }
    /**
     * Создайте метод получения самой большой по площади квартиры этажа
     */
    public Flat getBestSquare() {
        int bestSpace = 0;
        Flat flatBestSpace = null;
        for (int i = 0; i < flats.length; i++) {
            if (flats[i].getSquare() > bestSpace) {
                bestSpace = flats[i].getSquare();
                flatBestSpace = flats[i];
            }
        }
        return flatBestSpace;
    }
}