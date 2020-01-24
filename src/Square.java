public class Square {
    private double side;

    public Square(double side){
        this.side = side;
    }
    public double calculateArea(){
        return Math.PI * side * side;
    }

    public String toString(){
        return "Square with side: " + side;
    }
}
