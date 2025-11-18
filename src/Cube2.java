public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public Cube2(int side, String color) {
        this(side);
        this.color = color;
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public String getColor() {
        return this.color;
    }

    public void setSide(int side){
        basicCube.setSide(side);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Cube{side=" + basicCube.getSide() + ", color=\"" + this.color + "\"}";
    }

    //the following methods have been started for you, but need to be completed
    public int calculateVolume() { 
        return basicCube.calculateVolume();
    }

    public int calculateSurfaceArea() { 
        return basicCube.calculateSurfaceArea();
    }

    public Cube2 add(Cube2 otherCube) {
        // calculation: √(a² + b²)
        int newSide = (int) Math.sqrt((otherCube.getSide() * otherCube.getSide()) + (this.getSide() * this.getSide()));
        
        // Check if the calculation is valid (perfect square)
        int expectedSquare = (otherCube.getSide() * otherCube.getSide()) + (this.getSide() * this.getSide());
        if (newSide * newSide != expectedSquare) {
            throw new IllegalArgumentException("The resulting side length is not an integer");
        }
        
        return new Cube2(newSide, this.color);
    }

    public Cube2 minus(Cube2 otherCube) { 
        int newSide = (int) Math.sqrt((otherCube.getSide() * otherCube.getSide()) - (this.getSide() * this.getSide()));

        return new Cube2(newSide, this.color);
    }

    public boolean equals(Cube2 otherCube) { 
        if (otherCube.getSide() == this.getSide() && otherCube.getColor() == color){
            return true;
        }; 
        return false;
    }
}
