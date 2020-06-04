import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private int userId;
    private String type;
    private String name;
    private String username;
    private String password;
    private String contact;

    User() {

    }

    public static void main(String args[]) {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return  username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(int id,  String name, String type, String username, String password, String contact) {
        this.userId = id;
        this.name = name;
        this.type = type;
        this.username = username;
        this.password = password;
        this.contact = contact;
    }

    public void logOut() {
        Display screen = new Display();
        screen.displayLogOut();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        // input validation
        while (!(input.equals("N") || input.equals("Y"))) {
            screen.displayLogOutConfirmation();
            input = scanner.next();
        }

        if (input.equals("Y")) {
            screen.displayLogOutSuccessful();
            System.exit(0);
        }
    }

}
