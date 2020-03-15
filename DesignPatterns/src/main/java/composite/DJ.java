package composite;

public class DJ {
    MusicalComponent allMusicalComponents;

    public DJ(MusicalComponent allMenus) {
        this.allMusicalComponents = allMenus;
    }

    public void playShow() {
        allMusicalComponents.play();
    }
}
