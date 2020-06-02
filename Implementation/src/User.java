import java.util.ArrayList;

public class User {
    private int userId;
    private String type;
    private String name;
    private String contact;
    private String username;
    private String password;

    User() {

    }

    User(int id, String type, String name, String contact) {
        this.userId = id;
        this.type = type;
        this.name = name;
        this.contact = contact;
    }

    public static void main(String args[]) {

        // Test creating staff using constructor
        String contact = "Phone: 1234567, Email: 1234567@qq.com";
        User staff1 = new User(1, "Administrator", "Lucas", contact);
        System.out.println("Staff ID: " + staff1.getUserId());
        System.out.println("Staff Role: " + staff1.getType());
        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Contact: " + staff1.getContact() + "\n");

        // Call display method in boundary class
        String username = "Yiwei";
        String password = "1234567";

        // Test login method
        boolean result = staff1.login1(username, password);
        if (result == true) {
            System.out.println("Login Successfully");
        } else {
            System.out.println("Login Failed");
        }

    }

    public boolean login1(String username, String password) {
        boolean found = false;
        boolean match = false;

        // Create a sample database
        ArrayList<String> usernames = new ArrayList<>();
        usernames.add("Lucas");
        usernames.add("Lee");
        usernames.add("Jasper");
        usernames.add("Kimberley");
        ArrayList<String> passwords = new ArrayList<>();
        passwords.add("123456");
        passwords.add("1234567");
        passwords.add("12345678");
        passwords.add("123456789");

        for (int i = 0; i < usernames.size(); i++) {
            if (usernames.get(i).equals(username)) {
                found = true;
                if (passwords.get(i).equals(password)) {
                    match = true;
                    break;
                }
            }
        }

        return  found && match;
    }

    public void login(String username, String password) {

    }

    public void logOut(String username) {

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

}
