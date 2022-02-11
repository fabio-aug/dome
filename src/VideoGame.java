public class VideoGame extends MediaItem {
    private final String studio;
    private final String platform;
    private final int numberOfPlayers;

    public VideoGame(String title, int playingTime, String studio, String platform, int numberOfPlayers) {
        super(title, playingTime);
        this.studio = studio;
        this.platform = platform;
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public String toString() {
        return "\n-----\nMedia: Video Game" +
                super.toString() +
                "\nStudio: " + studio +
                "\nPlatform: " + platform +
                "\nNumber Of Players: " + numberOfPlayers;
    }
}
