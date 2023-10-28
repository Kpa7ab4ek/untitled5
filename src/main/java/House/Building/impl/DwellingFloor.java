package House.Building.impl;


import House.Building.Floor;
import House.Building.Space;
import lombok.Data;

@Data
public class DwellingFloor implements Floor {

    private Space[] flats;

    public DwellingFloor(int numbersOfFlats) {
        this.flats = new Space[numbersOfFlats];
        for (int i = 0; i < flats.length; i++) {
            this.flats[i] = new Flat();
        }
    }

    public DwellingFloor(Space[] flats) {
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

    public Space[] getFlats() {
        return flats;
    }

    public Space getFlat(int index) {
        return flats[index];
    }

    public void setFlat(int index, Space newFlat) {
        this.flats[index] = newFlat;
    }

    public void addFlat(int index, Space newFlat) {
        Space[] flat = new Space[flats.length + 1];
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
        Space[] newFlats = new Space[flats.length - 1];
        for (int i = 0; i < index; i++) {
            newFlats[i] = flats[i];
        }
        for (int i = index; i < flats.length - 1; i++) {
            newFlats[i] = flats[i + 1];
        }
        flats = newFlats;
    }

    public Space getBestSquare() {
        int bestSpace = 0;
        Space flatBestSpace = null;
        for (int i = 0; i < flats.length; i++) {
            if (flats[i].getSquare() > bestSpace) {
                bestSpace = flats[i].getSquare();
                flatBestSpace = flats[i];
            }
        }
        return flatBestSpace;
    }

}
