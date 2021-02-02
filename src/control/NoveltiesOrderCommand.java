package control;

import model.Catalogue;
import view.CatalogueDisplay;

public class NoveltiesOrderCommand implements Command{

    private Catalogue catalogue;
    private CatalogueDisplay catalogueDisplay;

    public NoveltiesOrderCommand(Catalogue catalogue, CatalogueDisplay catalogueDisplay) {
        this.catalogue = catalogue;
        this.catalogueDisplay = catalogueDisplay;
    }
    
    @Override
    public void execute() {
        catalogue.genreNovelties();
        catalogueDisplay.display(catalogue);
    }
    
}
