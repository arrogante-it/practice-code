package FabricPattern.Tools;

import FabricPattern.InformationData;

public class Computer implements InformationData {
    @Override
    public void getInformAboutSomeTool() {
        System.out.println("Computer");
    }
}
