package House.Building;

public class Flat {
    private int quantity;
    private int square;
    private final static int QUANTITY = 2;
    private final static int SQUARE = 50;

    public Flat() {
        this.quantity = QUANTITY;
        this.square = SQUARE;
    }

    public Flat(int square)  {
        this(QUANTITY,square);
    }

    public Flat(int quantity, int square) {
        this.quantity = quantity;
        this.square = square;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "|количесвто комнат: " + quantity + ", площадь квартиры: " + square + "кв.м|";
    }
}
