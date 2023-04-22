public class add
{
   static int c;
   int a;
   static
   {
      a=6;
      c=5;
      System.out.println(c);
      System.out.println(a);
   }
   public static void main(String[] args)
    {   
        add a=new add();
        int d=5;
        int b=10;
        System.out.println(b+d);
    }
}