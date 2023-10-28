package House.Building;

public interface Building {
    public int getFloorsQuantity();

    public int getTotalFlats();

    public int getFlatsSquare();

    public int getFlatsQuantity();

    public Floor[] getFloors();

    public Floor getFloor(int index);

    public void setFloor(int index, Floor newFloor);

    public Space getFlat(int index);

    public void setFlat(int index, Space newSpace);

    public void addFlat(int index, Space newSpace);

    public void deleteFlat(int index);

    public Space getBestSpaceBySquare();

    public Space[] getSortSpacesBySquare(int order);
}
