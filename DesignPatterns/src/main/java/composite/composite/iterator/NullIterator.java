package composite.composite.iterator;

import java.util.Iterator;

public class NullIterator implements Iterator<MusicalComponent> {

    public MusicalComponent next() {

        System.out.println("!!!!!! NullIterator next !!!!!!");

        return null;
    }

    public boolean hasNext() {

        System.out.println("!!!!!! NullIterator hasnext !!!!!!");
        return false;
    }

}