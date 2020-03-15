package composite;

import java.util.ArrayList;
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
        char[][] screen = new char[24][78];
        for (int i = 0; i < 24; ++i)
            for (int j = 0; j < 78; ++j)
                screen[i][j] = ' ';
        double x = 1;
        double y = 0;
        for (int i = 0; i < 1000000; ++i) {
            screen[(int) (y * 10 + 10)][(int) (x * 20 + 38)] = '*';
            x = x - 1E-5 * y;
            y = y + 1E-5 * x;
        }
        for (int i = 0; i < 24; ++i) {
            for (int j = 0; j < 78; ++j)
                java.lang.System.out.print(screen[i][j]);
            java.lang.System.out.println();
        }
    }

    @Override
    public void setPlayBackSpeed(double speedy) {

        this.playBackSpeed = speedy;
    }
}
