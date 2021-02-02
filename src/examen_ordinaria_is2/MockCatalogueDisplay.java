package examen_ordinaria_is2;

import model.Catalogue;
import model.Film;
import view.CatalogueDisplay;

public class MockCatalogueDisplay implements CatalogueDisplay{

    @Override
    public void display(Catalogue catalogue) {
        for (Film film : catalogue.getFilms()) {
            System.out.println(film.toString());
        }
    }
    
}
