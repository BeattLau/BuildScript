package Org;
public class UserInterface {
    public void showUi(Person person) {

        System.out.println("What do you want to do?");
        System.out.println("  1. Show person's name");
        System.out.println("  2. Change the person's name");
        System.out.println("  0. Exit program ");

        String command = System.console().readLine();

        while (!command.equals("9")) {

            if (command.equals("1")) {
                System.out.println("Hello " + person.name);
            }
            if (command.equals("2")) {
                System.out.print("What's your name? ");
                person.name = System.console().readLine();
            }
            System.out.println("What do you want to do?");
            System.out.println("  1. Show person's name");
            System.out.println("  2. Change the person's name");
            System.out.println("  0. Exit program ");
            command = System.console().readLine();

        }
    }
}
