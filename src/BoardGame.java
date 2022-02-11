public class BoardGame extends MediaItem {
    private final String studio;
    private final int numberOfPlayers;

    public BoardGame(String title, int playingTime, String studio, int numberOfPlayers) {
        super(title, playingTime);
        this.studio = studio;
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public String toString() {
        return "\n-----\nMedia: Board Game" +
                super.toString() +
                "\nStudio: " + studio +
                "\nNumber Of Players: " + numberOfPlayers;
    }
}
