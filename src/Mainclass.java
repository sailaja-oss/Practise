public class Mainclass {
    public static void main(String[] args)
    {
        Shape shape;
        Rectangle rect = new Rectangle();
        shape = rect;
        shape.setValues(78, 5);
        System.out.println("Area of rectangle : " + rect.getArea());
        Circle c = new Circle();
        shape = c;
        shape.setValues(34,3);


        System.out.println("Area of circle : " + c.getArea());
    }
}

