package composite.composite.iterator;

import java.util.Iterator;

public interface MusicalComponent {

    String getName();

    void add(MusicalComponent musicalComponent);

    void play();

    void setPlayBackSpeed(double speedy);

    Iterator<MusicalComponent> createIterator();


}
