class Flower
{
String name;
String colour;
int noOfPetals;

void blooming()
{
System.out.println(colour+" "+name+"is blooming...!");
}
public static void main(String args[])
{
Flower rose = new Flower();
rose.name = "rose";
rose.colour = "red";
rose.noOfPetals = 9;
rose.blooming();
}
}