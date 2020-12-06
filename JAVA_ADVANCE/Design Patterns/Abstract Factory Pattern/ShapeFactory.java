public class ShapeFactory extends AbstractFactory{

  public Shape getShape(String S2)
    { 

        if(S2==null)
             return null;

      else if(S2.equalsIgnoreCase("Circle"))
            return new Circle();


      else if(S2.equalsIgnoreCase("Square"))
            return new Square();

      else if(S2.equalsIgnoreCase("Rectangle"))
            return new Rectangle();

        return null;

    }

    public Color getColor(String S1)
    {
    return null;

    }

}