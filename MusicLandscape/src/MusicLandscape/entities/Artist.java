package MusicLandscape.entities;

public class Artist {
    private String name;

    public String getName() {
        // gets the name of this artist
        return name;
    }
    public void setName(String name) {
        // sets the name of this artist.
        // the name of an artist cannot be null or empty.
        // if an invalid argument is passed to the method the state of the object remains unchanged
        if ( name != null  && name.trim().length() > 0 )
        // possibility from the guidance video is:    if ( name != null && !name.isEmpty() ) {...}
        // !! this however does not pass the "  " test !!
            this.name=name;
    }

}