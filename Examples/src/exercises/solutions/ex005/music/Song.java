package exercises.solutions.ex005.music;

public class Song {

    private final String title;
    private final int duration;

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
}
