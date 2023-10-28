package House.Building.impl;

import House.Building.AbstractSpace;
import House.Building.Space;

public class Flat extends AbstractSpace implements Space {

    public Flat() {
    super();
    }

    public Flat(int square)  {
        super(square);
    }

    public Flat(int quantity, int square) {
        super(quantity, square);
    }
}
