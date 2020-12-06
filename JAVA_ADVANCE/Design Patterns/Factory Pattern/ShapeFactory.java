public class ShapeFactory{

public static Shape getShape(String s)
    {
        if(s==null)
            return null;

           else if(s.equalsIgnoreCase("Circle"))
                return new Circle();



           else if(s.equalsIgnoreCase("Square"))
                return new Square();



           else if(s.equalsIgnoreCase("Rectangle"))
                return new Rectangle();

                return null;
                
    }

}