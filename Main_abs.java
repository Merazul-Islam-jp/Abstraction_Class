package OOP_Inheritance;

public class Main_abs {
    public static void main(String[] args) {
        Shap obj=new Cercle("Red",5);
        System.out.println(obj.toString());
        System.out.println("\n\n");
       
        Shap obj1=new Rectangle("Black", 4, 2);
      
        System.out.println(obj1.toString());

    }
    
}
