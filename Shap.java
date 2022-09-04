package OOP_Inheritance;

 abstract class  Shap {

    String color;
    public String getColor() {
        return color;
    }

    abstract double area();

    public abstract String toString();

    Shap(String color){
        System.out.println("shap constractor called");
        this.color=color;

    }




    
}
