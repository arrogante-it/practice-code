package FabricPattern;

public class Solution {
    public static void main(String[] args) {
        InformationData informationData = InformationToolsFabric.getInformation(TypesInformation.LAPTOP);
        informationData.getInformAboutSomeTool();
    }
}
