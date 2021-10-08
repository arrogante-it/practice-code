package FabricPattern;

import FabricPattern.Tools.*;

public class InformationToolsFabric {

    public static InformationData getInformation(TypesInformation typesInformation){
        if(typesInformation == null){
            throw new IllegalArgumentException("Не известный тип инструмента по получению информации.");
        }else if(typesInformation == TypesInformation.BOOK){
            return new Book();
        }else if(typesInformation == TypesInformation.PHONE){
            return new Phone();
        }else if(typesInformation == TypesInformation.COMPUTER){
            return new Computer();
        }else if(typesInformation == TypesInformation.LAPTOP){
            return new Laptop();
        }else {
            return new Magasine();
        }
    }
}
