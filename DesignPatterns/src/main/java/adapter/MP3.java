package adapter;

public class MP3 implements MediaPlayer {

    private String fileName;

    public MP3(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 File #* " + fileName + " *#");
    }

}
