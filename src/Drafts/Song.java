package Drafts;

import java.util.ArrayList;
import java.util.List;

public class Song {

    private final String artist;
    private final String title;
    private final String genre;

    public Song(String artist, String title, String genre) {
        this.artist = artist;
        this.title = title;
        this.genre = genre;
    }

    public static void main(String[] args) {
        List<Song> goldenHitsCollection = new ArrayList<>();

        goldenHitsCollection.add(new Song("Киркоров", "Какая то хуйня", "поса")); // добавление нового хита
    }
}
