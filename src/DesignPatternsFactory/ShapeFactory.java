package DesignPatternsFactory;

public class ShapeFactory {
    //creaione della classe factory con METODO che ritorni la forma corretta(shape) in base all'enum in input
    public static Shape createShape(TipiShapeEnum shapeType) {
        switch (shapeType) {
            case CERCHIO:
                return new Cerchio();
            case RETTANGOLO:
                return new Rettangolo();
            default:
                throw new IllegalArgumentException("Tipo di forma non supportato: " + shapeType);
        }
    }
}
