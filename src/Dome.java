import java.util.ArrayList;
import java.util.List;


// DoME – Database of Multimedia Entertainment
// A system for storing information about various types of media.

public class Dome {
    private static Database database;
    private static Interface frontEnd;

    // Register a media type.
    public static void addMediaItem() {
        int typeMedia = frontEnd.getTypeMedia();

        String title = frontEnd.getTitleMedia();
        int playingTime = frontEnd.getPlayingTimeMedia();

        if (typeMedia == 1) { // DVD
            String director = frontEnd.getDirectorDvd();
            database.addDvd(title, playingTime, director);
            frontEnd.showRegisteredDvd();

        } else if (typeMedia == 2) { // CD
            String artist = frontEnd.getArtistCd();
            int tracks = frontEnd.getTracksCd();
            frontEnd.showRegisteredCd();
            database.addCd(title, playingTime, artist, tracks);

        } else if (typeMedia == 3) { // Video Game
            String studio = frontEnd.getStudioGame();
            String platform = frontEnd.getPlatformVideoGame();
            int numberOfPlayers = frontEnd.getNumberOfPlayersGame();
            frontEnd.showRegisteredVideoGame();
            database.addVideoGame(title, playingTime, studio, platform, numberOfPlayers);

        } else if (typeMedia == 4) { // Board Game
            String studio = frontEnd.getStudioGame();
            int numberOfPlayers = frontEnd.getNumberOfPlayersGame();
            database.addBoardGame(title, playingTime, studio, numberOfPlayers);
            frontEnd.showRegisteredBoardCame();
        }
    }

    // List all media types.
    public static void listAllMedias() {
        ArrayList<MediaItem> list = database.getAllMedias();
        for (MediaItem mediaItem : list) {
            frontEnd.showMedia(mediaItem);
        }
    }

    // Lists the media formats by adding some filters.
    public static void listFilteredMedia() {
        boolean filterType = frontEnd.getFilterType();

        int typeMedia = 0;
        if (filterType) {
            typeMedia = frontEnd.getTypeMedia();
        }

        boolean filterTitle = frontEnd.getFilterTitle();
        String titleMedia = "";
        if (filterTitle) {
            titleMedia = frontEnd.getTitleMedia();
        }

        if (filterType || filterTitle) {
            List<MediaItem> list = database.getFilterMedias(filterType, typeMedia, filterTitle, titleMedia);
            for (MediaItem mediaItem : list) {
                frontEnd.showMedia(mediaItem);
            }
        } else {
            frontEnd.showErrorFilter();
        }
    }

    // Edit the comment in some media format.
    public static void editComment() {
        String title = frontEnd.getTitleEditComment();
        String comment = frontEnd.getCommentEdit();
        boolean statusEditComment = database.findEditCommentMediaByTitle(title, comment);

        if (statusEditComment) {
            frontEnd.showChangeComment();
        } else {
            frontEnd.showErrorChangeComment();
        }
    }

    // Changes the flag of some type of media.
    public static void editFlag() {
        String title = frontEnd.getTitleEditFlag();
        boolean statusEditFlag = database.findEditFlagMediaByTitle(title);

        if (statusEditFlag) {
            frontEnd.showChangeFlag();
        } else {
            frontEnd.showErrorChangeFlag();
        }
    }

    public static void main(String[] args) {
        database = new Database();
        frontEnd = new Interface();

        try {
            while (true) {
                int action = frontEnd.getMenuOption();

                if (action == 1) addMediaItem();
                if (action == 2) listAllMedias();
                if (action == 3) listFilteredMedia();
                if (action == 4) editComment();
                if (action == 5) editFlag();
                if (action == 6) break;
            }
        } catch (Exception ex) {
            frontEnd.showError();
        }
    }
}
