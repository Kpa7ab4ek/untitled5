package House.Building;

public interface Floor {
    public int getTotalFlats();

    public int getFlatsSquare();

    public int getFlatsQuantity();

    public Space[] getFlats();

    public Space getFlat(int index);

    public void setFlat(int index, Space newFlat);

    public void addFlat(int index, Space newFlat);

    public void deleteFlat(int index);

    public Space getBestSquare();
}
