public class Cube {
    // properties
    private int side;

    // constructors
    public Cube(int side){
        setSide(side);
    }
    public Cube(){
        this.side = 1;
    }

    // getter
    public int getSide(){
        return side;
    }

    // setter
    public void setSide(int side){
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
        this.side = side;
    }

    // functions 
    public int calculateVolume(){
        return side*side*side;
    }

    public int calculateSurfaceArea(){
        return 6 * side*side;
    }

    // toString
    public String toString(){
        return "Cube{Side=" + side + "}";
    }
}
