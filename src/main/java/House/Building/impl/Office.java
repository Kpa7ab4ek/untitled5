package House.Building.impl;

import House.Building.AbstractSpace;
import House.Building.Space;


public class Office extends AbstractSpace implements Space {
    public Office() {
        super();
    }

    public Office(int square)  {
        super(square);
    }

    public Office(int quantity, int square) {
        super(quantity, square);
    }
}
