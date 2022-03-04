package exercises.solutions.ex005.music;

import java.util.LinkedList;
import java.util.List;

public class Artist {

    public static int SECONDS_IN_MINUTES = 60;
    private final String name;
    private final List<Song> catalogue; // We just want the List interface - doesn't matter about the implementation
    // Why is catalogue final if we're adding elements?
    // That's because we aren't every assigning a different list to the catalogue.
    // The STATE of the list changes, but it's never a NEW or DIFFERENT list.

    public Artist(String name) {
        this.name = name;
        catalogue = new LinkedList<>(); // Could be ArrayList too if you want!
    }

    public void addSong(String name, int duration) {
        catalogue.add(new Song(name, duration));
    }

    public void printCatalogue() {
        for (Song song : catalogue) {
            int minutes = song.getDuration() / SECONDS_IN_MINUTES;
            int seconds = song.getDuration() % SECONDS_IN_MINUTES;
            System.out.println("Song Title: " + song.getTitle() + ", Duration: " + minutes + " min " + seconds + " sec");
        }
    }
}
