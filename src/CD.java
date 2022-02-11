public class CD extends MediaItem {
    private final String artist;
    private final int tracks;

    public CD(String title, int playingTime, String artist, int tracks) {
        super(title, playingTime);
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "\n-----\nMedia: CD" +
                super.toString() +
                "\nArtist: " + artist +
                "\nTracks: " + tracks;
    }
}
