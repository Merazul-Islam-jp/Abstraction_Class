package OOP_Inheritance;

public class Cercle extends Shap {

    double redius;

    Cercle(String color,double redius) {
        
        super(color);
        System.out.println("Cercle constractor called");
        this.redius=redius;
        
    }

    @Override
    double area() {
        
        return Math.PI*Math.pow(redius, 2);
    }

    @Override
    public String toString() {
        
        return "this is color is "+super.getColor()+" and this area is  "+this.area();
    }

    
}
