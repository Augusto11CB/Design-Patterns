package composite;

public class DJTestDrive {

    public static void main(String[] args) {

        // 10 Songs
        // 3 Playlists   - 2 Normal Playlist and 1 CompostedPlayList

        Song song1 = new Song("Amazing Eletro Song: 1");
        Song song2 = new Song("Amazing Eletro Song: 2");
        Song song3 = new Song("Amazing Eletro Song: 3");
        Song song4 = new Song("Amazing Eletro Song: 4");
        Song song5 = new Song("Amazing Eletro Song: 5");
        Song song6 = new Song("Amazing Eletro Song: 6");
        Song song7 = new Song("Amazing Eletro Song: 7");
        Song song8 = new Song("Amazing Eletro Song: 8");
        Song song9 = new Song("Amazing Eletro Song: 9");
        Song song10 = new Song("Amazing Eletro Song: 10");

        PlayList playList1 = new PlayList("EDM PlayList NighCore Mix");
        PlayList playList3 = new PlayList("EDM PlayList NighCore Anime");

        PlayList playList2 = new PlayList("DeepHouse PlayList Several Artists");

        PlayList allPlayLists = new PlayList("PlayList Best Of EDM");

        allPlayLists.add(playList1);
        allPlayLists.add(playList2);

        playList1.add(playList3);


        playList2.add(song1);
        playList2.add(song2);
        playList2.add(song3);

        playList1.add(song4);
        playList1.add(song5);
        playList1.add(song6);

        playList3.add(song7);
        playList3.add(song8);
        playList3.add(song9);
        playList3.add(song10);

        DJ dj = new DJ(allPlayLists);

        dj.playShow();


    }
}
