import House.Building.impl.DwellingFloor;
import House.Building.impl.Flat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DwellingFloorTest {

    @Test
    void deleteFlatTest(){
        int index = 3;
        int razn = index -1;
        DwellingFloor floor = new DwellingFloor(index);
        floor.deleteFlat(1);
        Assertions.assertEquals(razn,floor.getTotalFlats());
    }
    @Test
    void addFlatTest(){
        int index = 3;
        int sum = index +1;
        DwellingFloor floor = new DwellingFloor(index);
        floor.addFlat(index, new Flat(3,80));
        Assertions.assertEquals(sum, floor.getTotalFlats());
    }
    @Test
    void getFlatssquareTest(){
        Flat flat1= new Flat(9,200);
        Flat flat2 = new Flat(10,199);
        Flat[] flats = {flat1, flat2};
        int sum=0;
       for(int i=0;i<flats.length;i++){
           sum+=flats[i].getSquare();
       }
        Assertions.assertEquals(399, sum);
    }
    @Test
    void getTotalFlatsTest(){ //DwellingFloorTest()//
        Flat flat1= new Flat(9,200);
        Flat flat2 = new Flat(10,199);
        Flat[] flats = {flat1, flat2};
        int sum=flats.length;
        Assertions.assertEquals(2, sum);
    }
    @Test
    void getFlatsQuantityTest(){
        Flat flat1= new Flat(9,200);
        Flat flat2 = new Flat(10,199);
        Flat[] flats = {flat1, flat2};
        int sum=0;
        for(int i=0;i<flats.length;i++){
            sum+=flats[i].getQuantity();
        }
        Assertions.assertEquals(19, sum);
    }

    @Test
    void getFlatsTets(){
        Flat flat1= new Flat(9,200);
        Flat flat2 = new Flat(11,250);
        Flat flat3= new Flat(10,199);
        Flat[] flats = {flat1,flat2,flat3};
        DwellingFloor floor = new DwellingFloor(flats);
        Assertions.assertEquals(flats,floor.getFlats());

    }

    @Test
    void getFlatTets(){
        DwellingFloor floor = new DwellingFloor(3);
        System.out.println(floor.getFlat(1));
    }

    @Test
    void setFlatTets(){
        DwellingFloor floor = new DwellingFloor(3);
        Flat newFlat = new Flat(3,50);
        floor.setFlat(1, newFlat);
        Assertions.assertEquals(newFlat, floor.getFlat(1));
    }

    @Test
    void getBestSquareTets(){
        Flat flat1= new Flat(9,200);
        Flat flat2 = new Flat(11,250);
        Flat flat3= new Flat(10,199);
        Flat[] flats = {flat1,flat2,flat3};
        DwellingFloor floors=new DwellingFloor(flats);
        Assertions.assertEquals(flat2,floors.getBestSquare());
    }

}
