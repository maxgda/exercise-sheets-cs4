package MusicLandscape.entities;

public class Track {
    private String title = null;        // the title of this track. a null title represents an unknown title
                                        // I THINK THAT strings are Null-filled by default, but it's set NULL by default
    private int duration = 0;           // the duration of this track in seconds the duration is a non-negative number
                                        // duration 0 (zero) represents unknown duration = initial value
    private Artist writer = new Artist();   // the artist who wrote this track the writer cannot be null
    private Artist performer = new Artist();// the artist who performs this track the performer cannot be null
    private int year = 0;               // the year in which the Track was or will be produced valid years are between 1900- 2999
    // initial value = 0


    public int getYear() {
        // gets the production year of this track
        return year;
    }
    public void setYear(int year) {
        // sets the production year of this track valid years are between 1900 and 2999
        // other values are ignored, the object remains unchanged
        if( year>=1900 && year<=2999)
            this.year = year;
    }
    public int getDuration() {
        // gets the duration of this track
        return duration;
    }

    public void setDuration(int inputDuration) {
        // sets the duration a negative value is ignored, the object remains unchanged
        if( inputDuration>=0 )
            this.duration = inputDuration;
    }
    public String getTitle() {
        // gets the title of this track.
        //  if the title is not known (null) "unknown title" is returned (without quotes)
        if ( title == null )
            return "unknown title";
        return title;
    }

    public void setTitle(String title) {
        // sets the title of this track.
        this.title = title;
    }

    public Artist getWriter() {
        // returns the writer of this track
        return writer;
    }

    public void setWriter(Artist writer) {
        // sets the writer of this track null arguments are ignored
        if( writer != null )
            this.writer = writer;
    }
    public Artist getPerformer() {
        // returns the performer of this track
        return performer;
    }

    public void setPerformer(Artist performer) {
        // sets the performer of this track null arguments are ignored
        if( performer != null )
            this.performer = performer;
    }

    public boolean writerIsKnown() {
        // this getter is used to check if the writer of this Track is known.
        // A writer is considered as known if the name is not equal to null.
        if( this.writer == null )
           return false;
        return writer.getName() != null;
    }

    public String getString() {
        // returns a formatted String containing all information of this track.
        // the String representation is (without quotes):
        //          "title by writer performed by performer (min:sec)"
        // where:
        // title    stands for the title (exactly 10 chars wide) if not set, return unknown
        // writer   stands for the writer name (exactly 10 chars wide, right justified)
        // performer stands for the performer name (exactly 10 chars wide, right justified)
        // min      is the duration's amount of full minutes (at least two digits, leading zeros)
        // sec      is the duration's remaining amount of seconds (at least two digits, leading zeros)

        // The text above is given from the java doc.
        // !!! HOWEVER, the test routines also demand "unknown" outputs for empty writer and performer !!!
        // Therefore, i create some helping variables, check the content and prepare the output data:

        String checkedTitle, checkedWriter, checkedPerformer;

        checkedTitle = title == null ? "unknown" : title;
        // i wrote the following version, but IntelliJ forced me to change it into one of three given options.
        // i chose number three: See above.
        // This was mine:
        //         if ( title == null )
        //            checkedTitle = "unknown";
        //        else
        //            checkedTitle = title;
        //
        // The IntelliJ-recommended version (which i dont understand without reading further) is:
        // checkedTitle = Objects.requireNonNullElse(title, "unknown");

        if ( writer == null || writer.getName() == null )
            checkedWriter = "unknown";
        else
            checkedWriter = writer.getName();

        if ( performer == null || performer.getName() == null )
            checkedPerformer = "unknown";
        else
            checkedPerformer = performer.getName();
        
        return String.format("%10.10s by %10.10s performed by %10.10s (%02d:%02d)", checkedTitle, checkedWriter, checkedPerformer, duration/60, duration%60);
    }
}