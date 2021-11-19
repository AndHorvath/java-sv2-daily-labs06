package day05;

public class ProductWithPiece {

    // --- attributes ---------------------------------------------------------

    private Type type;
    private int count;

    // --- constructors -------------------------------------------------------

    public ProductWithPiece(Type type) {
        this.type = type;
        this.count = 1;
    }

    // --- getters and setters ------------------------------------------------

    public Type getType() { return type; }
    public int getCount() { return count; }

    // --- public methods -----------------------------------------------------

    public void incrementCount() {
        count++;
    }
}