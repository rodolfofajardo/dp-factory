public class ShapeFactory {
    public Shape getShape(String shapeType) {
        shapeType = shapeType.toUpperCase();
        return switch (shapeType) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
