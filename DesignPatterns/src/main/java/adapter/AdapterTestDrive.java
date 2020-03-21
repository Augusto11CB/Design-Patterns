package adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterTestDrive {

    public static void main(String[] args) {

        List<MediaPlayer> playerList = new ArrayList<>();

        playerList.add(new MP3("Nice Music - Artist1"));

        playerList.add(new FormatAdapter(new MP4("Awesome Music HD - Artist1")));
        playerList.add(new FormatAdapter(new VLC("Marvelous Music HD - Artist1")));
        playerList.add(new FormatAdapter(new MP4("Unbelievable Music HD - Artist1")));


        Player player = new Player(playerList);

        player.playPlayList();
    }
}
