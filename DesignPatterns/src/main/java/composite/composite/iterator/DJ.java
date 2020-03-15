package composite.composite.iterator;

import java.util.Iterator;

public class DJ {
    MusicalComponent allMusicalComponents;

    public DJ(MusicalComponent allMenus) {
        this.allMusicalComponents = allMenus;
    }

    public void playShow() {

        Iterator<MusicalComponent> iterator = allMusicalComponents.createIterator();

        while (iterator.hasNext()) {

            MusicalComponent menuComponent = iterator.next();
            menuComponent.play();

            System.out.println("%%%%% END WHILE %%%%%");
        }
    }
}
