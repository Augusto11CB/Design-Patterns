package composite.composite.iterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MusicalComponent> {

    Stack<Iterator<MusicalComponent>> stack = new Stack<Iterator<MusicalComponent>>();

    CompositeIterator(Iterator<MusicalComponent> iterator) {

        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {

        System.out.println("--- CompositeIterator HasNext Method ---");

        if (stack.empty()) {

            return false;

        } else {

            Iterator<MusicalComponent> iterator = stack.peek();

            if (!iterator.hasNext()) {
                System.out.println("Poping something thing");
                stack.pop();
                return hasNext();

            } else {

                return true;
            }
        }
    }

    @Override
    public MusicalComponent next() {

        System.out.println("$$$$$ CompositeIterator Next Method $$$$$");

        if (this.hasNext()) {

            Iterator<MusicalComponent> iterator = stack.peek();
            MusicalComponent musicalComponent = iterator.next();

            System.out.println("##### CompositeIterator Push In The Stack Musical Componet:" + musicalComponent.getName() + "#####");

            stack.push(musicalComponent.createIterator());

            return musicalComponent;

        } else {
            return null;
        }
    }
}
