package FabricPattern.Tools;

import FabricPattern.InformationData;

public class Book implements InformationData {
    @Override
    public void getInformAboutSomeTool() {
        System.out.println("Book");
    }
}
