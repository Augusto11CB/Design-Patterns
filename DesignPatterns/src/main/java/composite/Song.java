package composite;

public class Song implements MusicalComponent {

    private String name;
    private double playBackSpeed;

    public Song(String name) {
        this.name = name;
        this.playBackSpeed = 1;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(MusicalComponent musicalComponent) {
        throw new UnsupportedOperationException("Operation Unsupported by this class");
    }

    @Override
    public void play() {
        System.out.println("Playing the Music: " + this.name);
    }

    @Override
    public void setPlayBackSpeed(double speedy) {
        this.playBackSpeed = speedy;
    }
}
