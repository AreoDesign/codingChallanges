package patterns.factoryMethod;

public class PolygonFactory {

    public Polygon getPolygon(int noOfSides) {
        if (noOfSides == 3) {
            return new Triangle();
        } else if (noOfSides == 4) {
            return new Rectangle();
        } else if (noOfSides == 5) {
            return new Pentagon();
        } else if (noOfSides == 8) {
            return new Octagon();
        } else {
            throw new RuntimeException("There is no logic implemented for this polygon!");
        }
    }
}
