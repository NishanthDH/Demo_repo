class arithmetic
{
int sum(int a,int b)
{
return(a+b);
} 
float sum(int a, float b)
{
return(a-b);
}
float sum(float a, int b)
{
return(a*b);
}
float sum(float a, float b)
{
return(a/b);
}
}
class arithmeticdemo
{
public static void main(String args[])
{
arithmetic a=new arithmetic();
int c=a.sum(5,15);
float d=a.sum(10,5.432f);
float e=a.sum(8.42f,5);
float f=a.sum(10.632f,2.53f);
System.out.println("The sum is="+c);
System.out.println("The difference is="+d);
System.out.println("The product is="+e);
System.out.println("The division is="+f);
}
}