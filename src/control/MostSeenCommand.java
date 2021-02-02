package control;

import model.Catalogue;
import view.CatalogueDisplay;

public class MostSeenCommand implements Command{

    private Catalogue catalogue;
    private CatalogueDisplay catalogueDisplay;

    public MostSeenCommand(Catalogue catalogue, CatalogueDisplay catalogueDisplay) {
        this.catalogue = catalogue;
        this.catalogueDisplay = catalogueDisplay;
    }
    
    @Override
    public void execute() {
        catalogue.seenOrder();
        catalogueDisplay.display(catalogue);
    }
    
}
