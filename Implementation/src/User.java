import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.spi.CalendarDataProvider;

public class User {
    private int userId;
    private String type;
    private String name;
    private String username;
    private String password;
    private String contact;

    User() {

    }

    public static void main(String[] args) {


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
        buff.write("Coordinator Information: " + mission.getCoordinatorInfo() + "\n\n");
        buff.close();
    }

    public void selectCandidates(User user) {
        String[] info = new String[8];
        String[] single1 = new String[1];
        try {
            BufferedReader br = new BufferedReader(new FileReader("candidates.txt"));

            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while (line!=null){
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
               String everything = sb.toString();
                //System.out.println(everything);
                info = everything.split("\\R");
                /*single1 = info[0].split(" ");
                Candidate candidate1 = new Candidate();
                candidate1.setIdentificationNumber(single1[0]);
                candidate1.setName(single1[1]);
                String[] single2 = new String[1];
                single2 = info[1].split(" ");
                Candidate candidate2 = new Candidate();
                candidate2.setIdentificationNumber(single2[0]);
                candidate2.setName(single2[1]);
                String[] single3 = new String[1];
                single3 = info[2].split(" ");
                Candidate candidate3 = new Candidate();
                candidate3.setIdentificationNumber(single3[0]);
                candidate3.setName(single3[1]);
                String[] single4 = new String[1];
                single4 = info[3].split(" ");
                Candidate candidate4 = new Candidate();
                candidate4.setIdentificationNumber(single4[0]);
                candidate4.setName(single4[1]);
                String[] single5 = new String[1];
                single5 = info[4].split(" ");
                Candidate candidate5 = new Candidate();
                candidate5.setIdentificationNumber(single5[0]);
                candidate5.setName(single5[1]);
                String[] single6 = new String[1];
                single6 = info[5].split(" ");
                Candidate candidate6 = new Candidate();
                candidate6.setIdentificationNumber(single6[0]);
                candidate6.setName(single6[1]);
                String[] single7 = new String[1];
                single7 = info[6].split(" ");
                Candidate candidate7 = new Candidate();
                candidate7.setIdentificationNumber(single7[0]);
                candidate7.setName(single7[1]);
                String[] single8 = new String[1];
                single8 = info[7].split(" ");
                Candidate candidate8 = new Candidate();
                candidate8.setIdentificationNumber(single8[0]);
                candidate8.setName(single8[1]);*/
                System.out.println("The selected candidates are: \n" + info[0] + "\n" + info[1] + "\n" + info[2] + "\n" + info[3] + "\n" + info[4]);
                System.out.println(info[1]+" has refused the invitation" + "\n" + "the next candidate will be informed");;
                System.out.println("all the candidates has accepted the invitation");
                System.out.println("The selected candidates are: \n" + info[0] + "\n" + info[2] + "\n" + info[3] + "\n" + info[4] + "\n" + info[5]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}


