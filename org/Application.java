package Org;

public class Application {
    /**
     *  Create a user interface
     *  Create some data
     *
     *  Use user interface to show the data
     */
    public void run() {
        UserInterface userinterface = new UserInterface();
        Person person = new Person();

        userinterface.showUi( person );
    }
}
