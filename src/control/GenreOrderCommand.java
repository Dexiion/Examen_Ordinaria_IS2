package control;

import model.Catalogue;
import view.CatalogueDisplay;

public class GenreOrderCommand implements Command{
    
    private Catalogue catalogue;
    private CatalogueDisplay catalogueDisplay;

    public GenreOrderCommand(Catalogue catalogue, CatalogueDisplay catalogueDisplay) {
        this.catalogue = catalogue;
        this.catalogueDisplay = catalogueDisplay;
    }

    
    @Override
    public void execute() {
        catalogue.genreOrder();
        catalogueDisplay.display(catalogue);
    }
}
