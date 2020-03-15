package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayList implements MusicalComponent {

    private String name;

    private double playBackSpeed;

    private List<MusicalComponent> playList;

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
        System.out.println("Playing the PlayList:" + this.name);

        Iterator<MusicalComponent> iterator = playList.iterator();

        while (iterator.hasNext()){
            iterator.next().play();
        }
    }

    @Override
    public void setPlayBackSpeed(double speedy) {

        this.playBackSpeed = speedy;
    }
}
