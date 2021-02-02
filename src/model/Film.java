package model;

import java.util.List;

public class Film {
    
    private final String cover;
    private final String title;
    private final int year;
    private final List<String> actors;
    private final String genre;
    private final int clasification;
    private final int duration;
    private int seen;
    private int rate;

    public Film(String cover, String title, int year, List<String> actors, String genre, int clasification, int duration, int seen, int rate) {
        this.cover = cover;
        this.title = title;
        this.year = year;
        this.actors = actors;
        this.genre = genre;
        this.clasification = clasification;
        this.duration = duration;
        this.seen = seen;
        this.rate = rate;
    }

    public String getCover() {
        return cover;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getActors() {
        return actors;
    }

    public String getGenre() {
        return genre;
    }

    public int getClasification() {
        return clasification;
    }

    public int getDuration() {
        return duration;
    }

    public int getSeen() {
        return seen;
    }

    public int getRate() {
        return rate;
    }
    
    public void seen() {
        seen++;
    }
    
    public void setRate(int rate) {
        this.rate = rate;
    }
    
    public String actors() {
        String mensaje = "";
        for (String actor : actors) {
            mensaje += actor + ",";
        }
        return mensaje;
    }
    
    public String toString() {
        return cover + " - " + title + " - " + year + " - " + actors() + " - " 
            + genre + " - " + "+" + clasification + " - " + duration + " min." 
            + " - " + seen + " people" + " - " + rate + " starts";
    }
}
