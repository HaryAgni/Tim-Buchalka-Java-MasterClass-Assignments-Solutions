import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(String title, double duration) {
        if (findSong(title) != null) {
            System.out.println("Song already exist");
        } else {
            songs.add(new Song(title, duration));
        }
    }

    private Song findSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            Song checkSong = songs.get(i);
            if (checkSong.getTitle().equals(title)) {
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= songs.size() - 1) {
            playlist.add(songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        if (findSong(title) != null) {
            for (int i = 0; i < playlist.size(); i++) {
                if (playlist.get(i).getTitle().equals(title)) {
                    System.out.println(title + " Song is already in the playlist");
                    return false;
                }

            }
            Song song = findSong(title);
            playlist.add(song);
            System.out.println(title + " Song added to the playlist");
            return true;
        }
        System.out.println("Song " + title + " is not in the Album");
        return false;
    }


}

