// method overloading

class p12
{
void getArea(float r)
{
System.out.println("Area of a Circle="+(3.14f*r*r));
}
void getArea(int l , int b)
{
System.out.println("Area of a Rectangle="+(l*b));
}
void getArea(double a)
{
System.out.println("Area of Sqr. ="+(a*a));
}

public static void main(String arg[])
{
p12 p=new p12();

p.getArea(4,5);
p.getArea(2.5);
p.getArea(2.5f);
}
}
