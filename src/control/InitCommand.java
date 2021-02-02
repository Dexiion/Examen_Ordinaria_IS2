package control;

import java.util.HashMap;
import java.util.Map;
import model.Catalogue;
import view.CatalogueDisplay;

public class InitCommand implements Command{

    private final Map<String, Command> commands = new HashMap<>();
    private final CatalogueDisplay catalogueDisplay;
    private final Catalogue catalogue;

    public InitCommand(CatalogueDisplay catalogueDisplay, Catalogue catalogue) {
        this.catalogueDisplay = catalogueDisplay;
        this.catalogue = catalogue;
    }


    
    @Override
    public void execute() {
        commands.put("G", new GenreOrderCommand(catalogue, catalogueDisplay));
        commands.put("MR", new MostRatedCommand(catalogue, catalogueDisplay));
        commands.put("MS", new MostSeenCommand(catalogue, catalogueDisplay));
        commands.put("N", new NoveltiesOrderCommand(catalogue, catalogueDisplay));
    }
    
    public Map<String, Command> getCommands() {
        return commands;
    }
    
}
