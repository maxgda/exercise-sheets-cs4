import MusicLandscape.entities.Artist;
import MusicLandscape.entities.Event;
import MusicLandscape.entities.Track;
import MusicLandscape.entities.provided.Date;
import MusicLandscape.entities.provided.Venue;

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

        Event event = new Event();
        Date date = new Date();
        date.addDay(10);
        date.addYear(2024);
        date.addMonth(05);
        Venue venue = new Venue();
        Artist copyPerformer = new Artist(performer);
        Track copyTrack = new Track(track);
        venue.setName("venu-name");
        event.setVenue(venue);
        venue.setCapacity(200);
        event.setDescription("event-description");
        event.setAttendees(150);
        event.setAttendees(250);
        event.setDate(date);
        event.setArtist(copyPerformer);

        System.out.printf("%s %s %s %s",event.getDescription(), event.getDate(), event.getArtist().getName(), event.getVenue().getName() );
    }

    static void print(String text){
        System.out.println(text);
    }
}