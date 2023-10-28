
package House;

import House.Building.impl.*;

public class Main {
    public static void main(String[] args) {

        Flat flat1 = new Flat(1, 500);
        Flat flat2 = new Flat(2, 350);
        Flat flat3 = new Flat(3, 400);
        Flat flat4 = new Flat(4, 113);
        Flat flat5 = new Flat(5, 600);
        Flat flat6 = new Flat(6, 50);
        Flat flat7 = new Flat(7, 100);
        Flat flat8 = new Flat(8, 1000);
        Flat flat9 = new Flat(9, 200);
        Flat flat10 = new Flat(111, 111);
        Flat[] flats = {flat1, flat2, flat3, flat4, flat5};
        Flat[] flats2 = {flat6, flat7, flat8, flat9};
        Flat[] flats3 = {flat10};
        DwellingFloor dwellingFloor1 = new DwellingFloor(flats);
        DwellingFloor dwellingFloor2 = new DwellingFloor(flats2);
        DwellingFloor dwellingFloor3 = new DwellingFloor(flats3);

        DwellingFloor[] floors = {dwellingFloor1, dwellingFloor2};
        Dwelling dwelling1 = new Dwelling(floors);


        Office office1 = new Office();
        Office office2 = new Office(3, 100);
        Office office3 = new Office(500);
        Office[] offices1 = {office1, office2, office3};

        OfficeFloor officeFloor = new OfficeFloor(offices1);
        OfficeFloor[] officeFloors = {officeFloor};

        OfficeDwelling officeDwelling = new OfficeDwelling(officeFloors);

        Office office4 = new Office(40,400);

        for (int i =0;i<officeFloor.getTotalFlats();i++) {
            System.out.println(officeFloor.getFlats()[i]);
        }

        for (int i =0;i<1;i++) {
            System.out.println(officeDwelling.getFloors()[i]);
        }

        System.out.println(officeFloor.getTotalFlats());
    }
}
