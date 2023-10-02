package Org;

public class Application {
    public void run() {
        UserInterface userInterface = new UserInterface();
        Person person = new Person();

        userInterface.showUi(person);
    }
}