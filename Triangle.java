
public class Triangle extends Shape
{
    private double a;
    private double h;
    private double b;
    private double c;
    public Triangle(double a, double h, double b, double c){
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }
    public double area(){
        double p = 0.5 * perimeter();
        return Math.pow(p*(p-a)*(p-b)*(p-c),0.5);
    }
    public double perimeter(){
        return a + b + c;   
    }
}
