package MusicLandscape.entities;

public class Artist {
    private String name;

    public Artist() {
        name = "unknown";
    }

    public Artist(String name) {
        this.name = name;
    }
    public Artist(Artist a) {
        setName(a.getName());
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (argumentIsValid(name)) {
            this.name = name;
        } else {
            // its good to have some kind of feedback ( logging )
            System.out.printf("Invalid name argument: %s%n", name);
        }
    }

    // not present in the class diagramm but a nice way to make the code more readable.
    private boolean argumentIsValid(String name) {
        return ( name != null  && name.trim().length() > 0 );
    }

}