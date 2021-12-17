
public class Circle extends Shape
{
    private double r;
    public Circle(double r){
        this.r = r;
    }
    public double area(){
        return Math.PI * Math.pow(r, 2);
    }
    public double perimeter(){
        return 2*Math.PI * r;
    }
    public static void main(String[] args){
        Circle c = new Circle(3);
        Triangle t = new Triangle(4,1,10,7);
        Rectangle r = new Rectangle(3,6);
        System.out.println(c.area());
        System.out.println(t.area());
        System.out.println(r.area());
        System.out.println(c.perimeter());
        System.out.println(t.perimeter());
        System.out.println(r.perimeter());
    }
}
