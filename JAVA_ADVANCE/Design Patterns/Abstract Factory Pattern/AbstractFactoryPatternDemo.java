
public class AbstractFactoryPatternDemo{


        public static void main(String S[])
        {
                FactoryProducer.getFactory("shape").getShape("circle").draw();
                  FactoryProducer.getFactory("shape").getShape("square").draw();
                    FactoryProducer.getFactory("shape").getShape("rectangle").draw();



                    FactoryProducer.getFactory("color").getColor("Red").fill();
                    FactoryProducer.getFactory("color").getColor("Blue").fill();
                    FactoryProducer.getFactory("color").getColor("Green").fill();
                    
                    FactoryProducer.getFactory("color").getShape("circle").draw();
                  FactoryProducer.getFactory("color").getShape("square").draw();
                    FactoryProducer.getFactory("color").getShape("rectangle").draw();
                    

        }


}