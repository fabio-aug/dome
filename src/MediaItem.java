public class MediaItem {
    private final String title;
    private Boolean gotIt;
    private String comment;
    private final int playingTime;

    public MediaItem(String title, int playingTime) {
        this.title = title;
        this.gotIt = false;
        this.comment = "<no comment>";
        this.playingTime = playingTime;
    }

    public String getTitle() {
        return title;
    }

    public void setGotIt(Boolean gotIt) {
        this.gotIt = gotIt;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return  "\nTitle: " + title +
                "\nGotIt: " + gotIt +
                "\nComment: " + comment +
                "\nPlaying Time: " + playingTime;
    }
}
