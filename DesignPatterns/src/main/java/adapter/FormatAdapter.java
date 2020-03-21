package adapter;

public class FormatAdapter implements MediaPlayer {

    private MediaPackage media;

    public FormatAdapter(MediaPackage media) {
        this.media = media;
    }

    @Override
    public void play() {
        System.out.print("Using Adapter --> ");
        media.playFile();
    }
}
