public class FactoryDemo{

    public static void  main(String S[])

        {
           ShapeFactory.getShape("square").draw();
           ShapeFactory.getShape("rectangle").draw();
           ShapeFactory.getShape("circle").draw();


        }

}