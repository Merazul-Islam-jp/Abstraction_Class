package OOP_Inheritance;

public class Rectangle extends Shap {
    double lenght;
    double width;

    Rectangle(String color,double lenght,double width) {
        super(color);
        System.out.println("Rectangle constractor called");
        this.lenght=lenght;
        this.width=width;

    }

    @Override
    double area() {
       
        return lenght*width;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "this is color is "+super.getColor()+" and this Rectangle  is  "+this.area();
    }
    
}
