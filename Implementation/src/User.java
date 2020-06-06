import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    public static void selectCandidates() {
        Display display = new Display();
        String[] info;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Candidates.txt"));

            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while (line!=null){
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
               String everything = sb.toString();
                info = everything.split("\\R");

                display.displaySelectCandidates();
                display.displayCandidates(info[0],info[1],info[2],info[3],info[4]);
                display.displaySendInvitation();
                display.displayContinue();

                Scanner scanner = new Scanner(System.in);
                String temp;

                temp = scanner.nextLine();
                while (!temp.equals("N")) {
                    display.displayContinue();
                    temp = scanner.nextLine();
                }

                display.displaySent();
                temp = scanner.nextLine();
                while (!temp.equals("N")) {
                    display.displayContinue();
                    temp = scanner.nextLine();
                }

                display.displayCandidateRefuse(info[1]);
                display.displayContinue();
                temp = scanner.nextLine();
                while (!temp.equals("N")) {
                    display.displayContinue();
                    temp = scanner.nextLine();
                }

                display.displaySent();
                temp = scanner.nextLine();
                while (!temp.equals("N")) {
                    display.displayContinue();
                    temp = scanner.nextLine();
                }


                display.displayCandidateAccept();

                display.displayContinue();
                temp = scanner.nextLine();
                while (!temp.equals("N")) {
                    display.displayContinue();
                    temp = scanner.nextLine();
                }
                display.displayCandidates(info[0],info[2],info[3],info[4],info[5]);

                //write to file
                List<String> lines = Arrays.asList("The selected candidates are:",info[0],info[5],info[2],info[3],info[4]);
                Path file = Paths.get("selectedCandidates.txt");
                Files.write(file, lines, StandardCharsets.UTF_8);

                display.displayContinue();
                temp = scanner.nextLine();
                while (!temp.equals("N")) {
                    display.displayContinue();
                    temp = scanner.nextLine();
                }

                display.displayInform();
                temp = scanner.nextLine();
                while (!temp.equals("N")) {
                    display.displayContinue();
                    temp = scanner.nextLine();
                }

                display.displayInformSuccessful();
                temp = scanner.nextLine();
                while (!temp.equals("N")) {
                    display.displayContinue();
                    temp = scanner.nextLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // selectSpaceShuttle Method
    public void selectSpaceShuttle(){
        ArrayList<String> spaceInfo = new ArrayList<>();
        Display displaySpaceShuttle = new Display();
        String[] spaceShuttle = {};
        try{
            File spaceShuttleFile = new File("SpaceShuttle.txt");
            BufferedReader buff = new BufferedReader(new FileReader(spaceShuttleFile));
            String str;
            while ((str = buff.readLine()) != null) {
                String temp = str.trim();
                spaceInfo.add(temp);
            }
            spaceInfo.remove(0); // remove the first row
            buff.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("***Space Shuttle Information***");
            for (int i =0;i<spaceInfo.size();i++){
                spaceShuttle = spaceInfo.get(i).split(",",0);
                System.out.println("**********");
                displaySpaceShuttle.selectedShuttle(spaceShuttle[0].trim(),spaceShuttle[1].trim(),spaceShuttle[2].trim(),spaceShuttle[3].trim(),spaceShuttle[4].trim()
                                                    ,spaceShuttle[5].trim(),spaceShuttle[6].trim(),spaceShuttle[7].trim());
            }
        }
        boolean selection = false;
        while (!selection){
            displaySpaceShuttle.enterShuttleID();
            Scanner input = new Scanner(System.in);
            String id = input.nextLine();
            int count =0;
            for (int i =0; i<spaceInfo.size();i++){
                try{
                    spaceShuttle = spaceInfo.get(i).split(",");
                    String spaceShuttleId = spaceShuttle[0];
                    if (id.equals(spaceShuttleId)){
                        count +=1;
                        selection = true;
                        // displaySpaceShuttle.selectedShuttle(spaceShuttle[0].trim(),spaceShuttle[1].trim(),spaceShuttle[2].trim(),spaceShuttle[3].trim(),spaceShuttle[4].trim()
                                //,spaceShuttle[5].trim(),spaceShuttle[6].trim(),spaceShuttle[7].trim());
                        displaySpaceShuttle.displaySuccessfullySelectedShuttle(id);
                        displaySpaceShuttle.displayContinue();
                        String input1 = input.next();
                        // input validation
                        while (!input1.equals("N")) {
                            displaySpaceShuttle.displayValidInput();
                            input1 = input.next();
                        }
                    }
                }catch (NumberFormatException e){
                    e.printStackTrace();
                }
            }
            if (count ==0){
                displaySpaceShuttle.displayShuttleNotExist(id);
            }
        }
    }

    public void createCriteria(Criteria criteria) throws IOException {
        File f = new File("Criteria.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        FileWriter buff = new FileWriter(f.getName(), true);
        buff.write("*******************************************\n");
        buff.write("Criteria Type: " + criteria.getType() + "\n");
        buff.write("Criteria Information:"+ criteria.getInformation() + "\n");
        buff.close();
    }
}


