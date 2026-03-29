import java.util.Scanner;
public class VotingEligiblityCheck
{
    public static void main (String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        char ans;
        String name = "";
        char userchoice;
        while (true)
        {
            System.out.println("Please enter your Name");
            name = sc.nextLine();
            if (name.matches("[a-zA-Z ]+"))
            {
                System.out.println("Entered value is:"+ name);

            }
            else
            {
                System.out.println("Please enter your name using only alphabet");
                continue;

            }
            System.out.println("Please enter your Age");
            if (sc.hasNextInt())
            {
                age= sc.nextInt();
                sc.nextLine();

            }
            else
            {
                System.out.println("Please enter the number only");
                sc.nextLine();
                continue;
            }
            if (age<=0 || age>=100)
            {
                System.out.println("Age should be greater than 0 and less than 100");
                System.out.println("Please enter the correct value");
                continue;
            }
            System.out.println("Please verify your provided detail");
            System.out.println("Your name is:"+ name);
            System.out.println("Your age is:"+ age);
            System.out.println("If it is correct press Y");
            System.out.println("If it is incorrect press N");
            ans = sc.next().charAt(0);
            sc.nextLine();

            if (ans=='Y' || ans=='y')
            {
                if (age>0 && age<=70)
                {
                    System.out.println("You are eligible for vote");

                }
                else
                {
                    System.out.println("You are not eligible for voting");
                }

            }
            else if (ans=='N' || ans=='n')
            {
                System.out.println("Please enter the correct answer");
            }
            System.out.println("If you want to continue press Y or for exit press any other key");
            userchoice=sc.next().charAt(0);
            if (userchoice =='Y' || userchoice=='y')
            {
                System.out.println("we are initiating it from start");
                sc.nextLine();
            }
            else
            {
                System.out.println("Thank you for your time");
                break;
            }
        }


    }


}