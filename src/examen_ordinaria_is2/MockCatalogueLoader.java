package examen_ordinaria_is2;

import java.util.ArrayList;
import java.util.List;
import model.Catalogue;
import model.Film;
import view.CatalogueLoader;

public class MockCatalogueLoader implements CatalogueLoader{

    @Override
    public Catalogue load() {
        List<Film> films = new ArrayList<>();
        List<String> actors = new ArrayList<>();
        actors.add("Actor1");
        actors.add("Actor2");
        actors.add("Actor3");
        actors.add("Actor4");
        films.add(new Film("Caratula1", "Titulo1", 2010, actors, "Genero1", 16, 120, 1000, 5));
        films.add(new Film("Caratula2", "Titulo2", 2000, actors, "Genero2", 18, 60, 500, 3));
        films.add(new Film("Caratula3", "Titulo3", 2020, actors, "Genero3", 7, 150, 12000, 4));
        Catalogue catalogue = new Catalogue(films);
        return catalogue;
    }
    
}
