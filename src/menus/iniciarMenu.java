package menus;

import java.awt.*;
import java.util.Scanner;

public class iniciarMenu
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Rank Gastronomic");

        MenuComida menuOptions = MenuComida.z;

        while (menuOptions != MenuComida.g)
            try
            {
                menuComida();


                menuOptions = MenuComida.valueOf(input.nextLine());


                switch (menuOptions)
                {
                    case a:
                        //menuRestaurante();
                        break;

                    case b:
                        //menuRestaurante();
                        break;

                    case c:
                        //menuRestaurante();
                        break;

                    case d:
                        //menuRestaurante();
                        break;

                    case e:
                       // menuRestaurante();

                        break;

                    case g:
                        System.out.println("Exit");
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

    public static void menuComida()
    {
        System.out.println("\nEnter:");
        System.out.println("\ta. Pizza");
        System.out.println("\tb. Sushi");
        System.out.println("\tc. Hot Dog");
        System.out.println("\td. Desserts");
        System.out.println("\te. Salad");
        System.out.println("\tq. Exit");
        System.out.print("\nSelection -> ");

    }

    public static void menuRestaurante()
    {
        System.out.println("\nEnter:");
        System.out.println("\ta. 1");
        System.out.println("\tb. 2");
        System.out.println("\tc. 3");
        System.out.println("\td. 4");
        System.out.println("\te. 5");
        System.out.println("\tq. Exit");
        System.out.print("\nSelection -> ");

    }
}
