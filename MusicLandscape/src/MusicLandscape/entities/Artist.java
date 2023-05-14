package MusicLandscape.entities;

public class Artist {
    private String name;

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