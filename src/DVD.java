public class DVD extends MediaItem {
    private final String director;

    public DVD(String title, int playingTime, String director) {
        super(title, playingTime);
        this.director = director;
    }

    @Override
    public String toString() {
        return "\n-----\nMedia: DVD" +
                super.toString() +
                "\nDirector: " + director;
    }
}
