package composite.composite.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class PlayList implements MusicalComponent {

    private String name;

    private double playBackSpeed;

    private List<MusicalComponent> playList;

    private Iterator<MusicalComponent> iterator = null;

    public PlayList(String name, List<MusicalComponent> playList) {

        this.name = name;
        this.playList = playList;
        this.playBackSpeed = 1;
    }

    public PlayList(String name) {

        this.name = name;
        this.playList = new ArrayList<>();
        this.playBackSpeed = 1;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public void add(MusicalComponent musicalComponent) {

        playList.add(musicalComponent);
    }

    @Override
    public void play() {

        System.out.println("----------------------------------");
        System.out.println("Playing the PlayList:" + this.name);

        Iterator<MusicalComponent> iterator = playList.iterator();

        System.out.println("End Playing the PlayList:" + this.name);

        while (iterator.hasNext()) {
            iterator.next().play();
        }

        System.out.println("End Playing the PlayList:" + this.name);

    }

    @Override
    public void setPlayBackSpeed(double speedy) {

        this.playBackSpeed = speedy;
    }

    @Override
    public Iterator<MusicalComponent> createIterator() {

        if (Objects.isNull(iterator)) {
            iterator = new CompositeIterator(playList.iterator());
        }

        return this.iterator;
    }
}
