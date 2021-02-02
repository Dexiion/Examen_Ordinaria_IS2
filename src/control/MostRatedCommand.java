package control;

import model.Catalogue;
import view.CatalogueDisplay;

public class MostRatedCommand implements Command{

    private Catalogue catalogue;
    private CatalogueDisplay catalogueDisplay;

    public MostRatedCommand(Catalogue catalogue, CatalogueDisplay catalogueDisplay) {
        this.catalogue = catalogue;
        this.catalogueDisplay = catalogueDisplay;
    }

    @Override
    public void execute() {
        catalogue.ratedOrder();
        catalogueDisplay.display(catalogue);
    }
    
}
