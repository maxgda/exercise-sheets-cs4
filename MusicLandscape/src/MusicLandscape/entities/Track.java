package MusicLandscape.entities;

public class Track {
    private String title     = null;
    private int    duration  = 0;
    private Artist writer    = new Artist();
    private Artist performer = new Artist();
    private int    year      = 0;

    public Track() {
        setTitle(null);
        setDuration(0);
        setWriter(new Artist());
        setPerformer(new Artist());
        setYear(1900);
    }

    public Track(Track t) {
        this.duration = t.getDuration();
        this.year = t.getYear();
        this.title = t.getTitle();
        this.writer = new Artist(t.getWriter());
        this.performer = new Artist(t.getPerformer());
    }

    public Track(String title) {
        setTitle(title);
        setDuration(0);
        setWriter(new Artist());
        setPerformer(new Artist());
        setYear(1900);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 2999) {
            this.year = year;
        } else {
            System.out.printf("year is out of range (year >= 1900 && year <= 2999), year: %s%n", year);
        }
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int inputDuration) {
        if (inputDuration >= 0) {
            this.duration = inputDuration;
        } else {
            System.out.printf("duration cant be negative, duration: %d%n", inputDuration);
        }
    }

    public String getTitle() {
        if (title == null) {
            return "unknown title";
        }
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getWriter() {
        return writer;
    }

    public void setWriter(Artist writer) {
        if (writer != null) {
            this.writer = writer;
        } else {
            System.out.println("setting a null writer is invalid");
        }
    }

    public Artist getPerformer() {
        return performer;
    }

    public void setPerformer(Artist performer) {
        if (performer != null) {
            this.performer = performer;
        } else {
            System.out.println("setting a null performer is invalid");
        }
    }

    public boolean writerIsKnown() {
        if (this.writer == null) {
            return false;
        }
        return writer.getName() != null;
    }

    public String getString() {
        return String.format("%10.10s by %10.10s performed by %10.10s (%02d:%02d)",
                formatTitle(),
                formatArtistName(writer),
                formatArtistName(performer),
                formatDurationToMin(),
                formatDurationToSec());
    }

    // not present in the class diagramm but a nice way to make the code more readable.
    // you can make as many private methods as you like to make the code more readable.
    private int formatDurationToMin() {
        return this.duration / 60;
    }
    private int formatDurationToSec() {
        return this.duration % 60;
    }
    private String formatTitle() {
        return title == null ? "unknown" : title;
    }
    private String formatArtistName(Artist artist) {
        return (artist == null || artist.getName() == null) ? "unknown" : artist.getName();
    }
}