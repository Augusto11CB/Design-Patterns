package composite;

public interface MusicalComponent {

    String getName();

    void add(MusicalComponent musicalComponent);

    void play();

    void setPlayBackSpeed(double speedy);


}
