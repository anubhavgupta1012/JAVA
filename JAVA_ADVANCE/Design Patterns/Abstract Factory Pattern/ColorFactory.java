public class ColorFactory extends AbstractFactory{

        public Color getColor(String S1){
            if(S1==null)
                return null;

            else if(S1.equalsIgnoreCase("Red"))
                return new Red();



            else if(S1.equalsIgnoreCase("Green"))
                return new Green();

             
            else if(S1.equalsIgnoreCase("Blue"))
                return new Blue();

            return null;

        }

        public Shape getShape(String S2){    

                return null;
            }




}