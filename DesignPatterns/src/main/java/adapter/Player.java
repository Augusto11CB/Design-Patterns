package adapter;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<MediaPlayer> playList = new ArrayList<>();


    public Player(MediaPlayer playList) {
        this.playList.add(playList);
    }

    public Player(List<MediaPlayer> playList) {
        this.playList.addAll(playList);
    }

    public void addSong(MediaPlayer playList) {
        this.playList.add(playList);
    }

    public List<MediaPlayer> getPlayList() {
        return playList;
    }

    public void playPlayList() {
        playList.forEach(media -> media.play());
    }

    public void clearPlayList() {
        playList.clear();
    }

    public boolean removeSongPlayPlist(MediaPlayer removeSong) {
        return playList.removeIf(song -> song.equals(song));
    }

    public void playSong(MediaPlayer player) {
        player.play();
    }
}
