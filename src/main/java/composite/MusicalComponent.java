package composite;

public interface MusicalComponent {

    String getName();

    String getDescription();

    void add(MusicalComponent musicalComponent);

    void play();

    void setPlayBackSpeed(double speedy);


}
