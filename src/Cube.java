public class Cube {
    // properties
    private int side;

    // constructor
    public Cube(){
        this.side = 1;
    }
    public Cube(int side){
        if (side < 1){
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        else {
            this.side = side;
        }
    }
    
    // behaviors
    public int getSide(){
        return this.side;
    }
    public void setSide(int side){
        if (side < 1){
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        else {
            this.side = side;
        }
    }
    public int calculateSurfaceArea(){
        return this.side * this.side * 6;
    }
    public int calculateVolume(){
        return this.side * this.side * this.side;
    }
    public String toString(){
        return "Cube{side=" + this.side + "}";
    }
}