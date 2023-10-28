package House.Building;

import lombok.Data;

@Data
public abstract class AbstractSpace{
    private int quantity;
    private int square;
    private final static int QUANTITY = 2;
    private final static int SQUARE = 50;

    public AbstractSpace() {
        this.quantity = QUANTITY;
        this.square = SQUARE;
    }

    public AbstractSpace(int square)  {
        this(QUANTITY,square);
    }

    public AbstractSpace(int quantity, int square) {
        this.quantity = quantity;
        this.square = square;
    }

/*
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
    }*/
}