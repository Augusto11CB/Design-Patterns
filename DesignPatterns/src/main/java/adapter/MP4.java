package adapter;

public class MP4 implements MediaPackage {

    private String fileName;

    public MP4(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void playFile() {
        System.out.println("Playing MP4 File #-_-_- " + fileName + " -_-_-#");
    }

}
