package exercises.solutions.ex005;

import exercises.solutions.ex005.music.Artist;

public class Main {
    public static void main(String[] args) {
        Artist radiohead = new Artist("Radiohead");
        radiohead.addSong("Weird Fishes", 318);
        radiohead.addSong("Fake Plastic Trees", 290);
        radiohead.printCatalogue();
    }
}
