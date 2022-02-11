import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Database {
    private final ArrayList<MediaItem> collection;

    public Database() {
        collection = new ArrayList<>();
    }

    // Add DVD.
    public void addDvd(String title, int playingTime, String director) {
        collection.add(new DVD(title, playingTime, director));
    }

    // Add CD.
    public void addCd(String title, int playingTime, String artist, int tracks) {
        collection.add(new CD(title, playingTime, artist, tracks));
    }

    // Add Video Game.
    public void addVideoGame(String title, int playingTime, String studio, String platform, int numberOfPlayers) {
        collection.add(new VideoGame(title, playingTime, studio, platform, numberOfPlayers));
    }

    // Add Board Game.
    public void addBoardGame(String title, int playingTime, String studio, int numberOfPlayers) {
        collection.add(new BoardGame(title, playingTime, studio, numberOfPlayers));
    }

    // Get all medias.
    public ArrayList<MediaItem> getAllMedias() {
        return collection;
    }

    // Filter media by title or type.
    public List<MediaItem> getFilterMedias(boolean filterType, int typeMedia, boolean filterTitle, String titleMedia) {
        List<MediaItem> localData = collection;
        if (filterType) {
            if (typeMedia == 1) { // Filter DVD
                localData = localData.stream().filter(mediaItem -> (mediaItem instanceof DVD)).collect(Collectors.toList());
            } else if (typeMedia == 2) { // Filter CD
                localData = localData.stream().filter(mediaItem -> (mediaItem instanceof CD)).collect(Collectors.toList());
            } else if (typeMedia == 3) { // Filter VideoGame
                localData = localData.stream().filter(mediaItem -> (mediaItem instanceof VideoGame)).collect(Collectors.toList());
            } else if (typeMedia == 4) { // Filter BoardGame
                localData = localData.stream().filter(mediaItem -> (mediaItem instanceof BoardGame)).collect(Collectors.toList());
            }
        }

        if (filterTitle) {
            localData = localData.stream().filter(mediaItem -> (mediaItem.getTitle().toLowerCase().contains(titleMedia.toLowerCase()))).collect(Collectors.toList());
        }
        return localData;
    }

    // Search for a media item by its name and edit your comment.
    // If all goes well, the function returns TRUE, otherwise it returns FALSE.
    public boolean findEditCommentMediaByTitle(String title, String comment) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).getTitle().equals(title)) {
                collection.get(i).setComment(comment);
                return true;
            }
        }
        return false;
    }

    // Search for a media item by name and edit its flag.
    public boolean findEditFlagMediaByTitle(String title) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).getTitle().equals(title)) {
                collection.get(i).setGotIt(true);
                return true;
            }
        }
        return false;
    }
}