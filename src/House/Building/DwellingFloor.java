package House.Building;


public class DwellingFloor {

    private Flat[] flats;

    public DwellingFloor(int numbersOfFlats) {
        this.flats = new Flat[numbersOfFlats];
        for (int i = 0; i < flats.length; i++) {
            this.flats[i] = new Flat();
        }
    }

    public DwellingFloor(Flat[] flats) {
        this.flats = flats;
    }

    public int getTotalFlats() {
        return flats.length;
    }

    public int getFlatsSquare() {
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getSquare();
        }
        return sum;
    }

    public int getFlatsQuantity() {
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getQuantity();
        }
        return sum;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public Flat getFlat(int index) {
        return flats[index];
    }

    public void setFlat(int index, Flat newFlat) {
        this.flats[index] = newFlat;
    }

    public void addFlat(int index, Flat newFlat) {
        Flat[] flat = new Flat[flats.length + 1];
        for (int i = 0; i < index; i++) {
            flat[i] = flats[i];
        }
        flat[index] = newFlat;
        for (int i = index; i < flats.length; i++) {
            flat[i + 1] = flats[i];
        }
        flats = flat;
    }

    public void deleteFlat(int index) {
        Flat[] newFlats = new Flat[flats.length - 1];
        for (int i = 0; i < index; i++) {
            newFlats[i] = flats[i];
        }
        for (int i = index; i < flats.length - 1; i++) {
            newFlats[i] = flats[i + 1];
        }
        flats = newFlats;
    }

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

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("кол-во квартир на этаже: ").append(getTotalFlats()).append(", ");
        for (int i = 0; i < flats.length; i++) {
            if (i > 0) s.append(", ");
            s.append(flats[i].toString());
        }
        s.append(")");
        return s.toString();
    }
}