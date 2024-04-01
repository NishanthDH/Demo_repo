class addition4
{
 int sum(int a, int b)
   {
    return(a+b);
    }
}
class additiondemo
{
 public static void main(String args[])
 {
  addition4 ad=new addition4();
  int c=ad.sum(12,13);
  System.out.println("Sum of two numbers="+c);
  }
}
