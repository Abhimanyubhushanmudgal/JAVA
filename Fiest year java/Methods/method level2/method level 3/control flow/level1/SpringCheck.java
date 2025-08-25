import java.util.Scanner;



 class SpringCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the month");
        int month = s.nextInt();
        if(month <1 || month >12)
        {
            System.out.println("enter a valid month");
            System.exit(0);
        }
        else 
        {
            System.out.println("enter the date");
            int date = s.nextInt();
            if(date>0 || date<31)
            {
            
            
                if(month == 3)
            {
                    if(date>20)
                {
                    System.out.println("this is a spring seaon");
                }
                    else
                    {
                    System.out.println("this is not a spring season");
                }
            }
                else if(month == 6)
            {
                    if(date<20)
                {
                    System.out.println("this is a spring seaon");
                }
                    else
                {
                    System.out.println("this is not a spring season");
                }

            } 
                else if (month<3 || month >6)
            {
                System.out.println("this is not a spring season");
            }
                else 
            {
                System.out.println("this  is a spring season");
            }  
        }
        else
        {
            System.out.println("enter a valid date");
        }
    }
    }
     
           
}
          
        
    
     
        