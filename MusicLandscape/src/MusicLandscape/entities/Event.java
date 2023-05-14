package MusicLandscape.entities;

import MusicLandscape.entities.provided.Date;
import MusicLandscape.entities.provided.Venue;

public class Event {
    private Artist artist;
    private int attendees;
    private Date date;
    private String description;
    private Venue venue;
    public Event() {
        setArtist(new Artist());
        setDescription("");
        setDate(null);
        setVenue(null);
        setAttendees(0);
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        if(artist != null) {
            this.artist = artist;
        } else {
            System.out.println("invalid Artist");
        }
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Date getDate() {
        return this.date == null ? null : new Date(this.date);
    }

    public void setDate(Date date) {
        this.date = (date != null) ? new Date(date) : null;
    }

    public int getAttendees() {
        return attendees;
    }

    public void setAttendees(int attendees) {
        if(attendees >= 0 && venue != null && attendees <= venue.getCapacity()) {
            this.attendees = attendees;
        } else {
            System.out.println("invalid amount of Attendees");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description != null) {
            this.description = description;
        } else {
            System.out.println("invalid description");
        }
    }
}
