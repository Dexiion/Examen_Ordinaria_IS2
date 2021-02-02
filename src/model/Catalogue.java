package model;

import java.util.*;

public class Catalogue {
    
    private List<Film> films;

    public Catalogue(List<Film> films) {
        this.films = films;
    }
    
    public List<Film> getFilms() {
        return films;
    }

    public void genreOrder() {
        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                return f1.getGenre().compareTo(f2.getGenre());
            }
        });
    }

    public void noveltiesOrder() {  
        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                Integer p1 = f1.getYear();
                Integer p2 = f2.getYear();
                return -(p1.compareTo(p2));
            }
        });
    }

    public void seenOrder() {
        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                Integer p1 = f1.getSeen();
                Integer p2 = f2.getSeen();
                return -(p1.compareTo(p2));
            }
        });
    }

    public void ratedOrder() {
        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                Integer p1 = f1.getRate();
                Integer p2 = f2.getRate();
                return -(p1.compareTo(p2));
            }
        });
    }
    
    
    
}
