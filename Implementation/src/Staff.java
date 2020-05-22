import java.util.ArrayList;

public class Staff {
    private int staffId;
    private String role;
    private String name;
    private String contact;

    Staff() {

    }

    Staff(int id, String role, String name, String contact) {
        this.staffId = id;
        this.role = role;
        this.name = name;
        this.contact = contact;
    }

    public static void main(String args[]) {

        // Test creating staff using constructor
        String contact = "Phone: 1234567, Email: 1234567@qq.com";
        Staff staff1 = new Staff(1, "Administrator", "Lucas", contact);
        System.out.println("Staff ID: " + staff1.getStaffId());
        System.out.println("Staff Role: " + staff1.getRole());
        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Contact: " + staff1.getContact() + "\n");

        // Call display method in boundary class
        String username = "Yiwei";
        String password = "1234567";

        // Test login method
        boolean result = staff1.login(username, password);
        if (result == true) {
            System.out.println("Login Successfully");
        } else {
            System.out.println("Login Failed");
        }

    }

    public boolean login(String username, String password) {
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

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
