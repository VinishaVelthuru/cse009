import java.lang.*;
class Box
{
double width;
double height;
double depth;
}
class Box_demo
{
public static void main(String args[])
{
Box b1=new Box();
Box b2=new Box();
b1.width=b1.height=b1.depth=10;
b2.width=b2.height=b2.depth=20;
System.out.println("The volume of the first box is" + b1.width*b1.height*b1.depth);
System.out.println("The volume of the second box is" + b2.width*b2.height*b2.depth);
}
}