import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    public void createMission(Mission mission) throws IOException {
        File f = new File("Mission.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        FileWriter buff = new FileWriter(f.getName(), true);
        buff.write("*******************************************\n");
        buff.write("Mission Name: " + mission.getName() + "\n");
        buff.write("Mission Description: " + mission.getDescription() + "\n");
        buff.write("Country of Origin: " + mission.getCountryOfOrigin() + "\n");
        buff.write("Countries Allowed : " + mission.getCountriesAllowed() + "\n");
        buff.write("Mission Status : " + mission.getStatus() + "\n");
        buff.write("Launch Date : " + mission.getLaunchDate() + "\n");
        buff.write("Mission Location: " + mission.getLocation() + "\n");
        buff.write("Mission Duration: " + mission.getDuration() + "\n");
        buff.write("Job Information : " + mission.getJobInfo() + "\n");
        buff.write("Employment Requirements: " + mission.getEmploymentRequirements() + "\n");
        buff.write("Cargo Requirements: " + mission.getCargoRequirements() + "\n");
        buff.write("Coordinator Information" + mission.getCoordinatorInfo() + "\n\n");
        buff.close();
    }

}
