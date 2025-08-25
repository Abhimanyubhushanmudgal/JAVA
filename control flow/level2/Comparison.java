import java.util.Scanner;
public class Comparison {

   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the age and height of amar");

    int amarage = s.nextInt();
    float amarheight = s.nextFloat();

    System.out.println("enter the age and height of akbar");

    int akbarage = s.nextInt();
    float akbarheight = s.nextFloat();

    System.out.println("enter the age and height of anthony");

    int anthonyage = s.nextInt();
    float anthonyheight = s.nextFloat();

    if(amarage>akbarage && amarage>anthonyage)
    {
        System.out.println("amar is the older than both of them");

    }
    else if(akbarage>anthonyage && akbarage>amarage)
    {
        System.out.println("akbar is the older than both of them");

   } 
   else
   {
    System.out.println("anthony is the older than both of them");


   }

   if(amarheight>akbarheight && amarheight>anthonyheight)
    {
        System.out.println("amar is the taller than both of them");

    }
    else if(akbarheight>anthonyheight && akbarheight>amarheight)
    {
        System.out.println("akbar is the taller than both of them");

   } 
   else
   {
    System.out.println("anthony is the taller than both of them");
   }
   s.close();


}
}