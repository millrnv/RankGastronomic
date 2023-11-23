package menus;

import java.util.Scanner;

public class main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Welcome to Frank's Banking Application.");

        MenuComida menuOptions = MenuComida.z;

        while (menuOptions != MenuComida.g)
            try
            {
                menu();


                menuOptions = MenuComida.valueOf(input.nextLine());


                switch (menuOptions)
                {
                    case a:
                        //createBank();
                        break;

                    case b:
                        //addBranch();
                        break;

                    case c:
                        // addCustomer();
                        break;

                    case d:
                        // makeTransaction();
                        break;

                    case e:
                        break;

                    case f:
                        break;
                    case g:
                        System.out.println("Goodbye");
                        break;

                    default:
                        System.out.println("Selection out of range. Try again");
                }
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Selection out of range. Try again:");
            }


    }

    public static void menu()
    {
        System.out.println("\nEnter:");
        System.out.println("\ta. Sushi");
        System.out.println("\tb. Pizza");
        System.out.println("\tc. Hot Dog");
        System.out.println("\td. Dessert");
        System.out.println("\te. Salad");
        System.out.println("\tq. Quit Application.");
        System.out.print("\nSelection -> ");

    }
}


