import MusicLandscape.entities.Artist;
import MusicLandscape.entities.Track;
public class Main {
    public static void main(String[] args) {
        Track track = new Track();
        Artist writer = new Artist();
        Artist performer = new Artist();

        writer.setName("test-writer");
        performer.setName("test-performer");

        track.setDuration(3);
        track.setPerformer(performer);
        track.setPerformer(null);
        track.setWriter(writer);
        track.setWriter(null);
        track.setTitle("test-title");
        track.setTitle("");
        track.setTitle(null);
        track.setYear(1999);
        track.setYear(0);
        track.setYear(5000);

        print(track.getString());
    }

    static void print(String text){
        System.out.println(text);
    }
}