package adapter;

public class VLC implements MediaPackage {

    private String fileName;

    public VLC(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void playFile() {
        System.out.println("Playing HQ VLC File *_#_* " + fileName + " *_#_*");
    }

}
