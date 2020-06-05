import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MissionToMarsSystem {

    public MissionToMarsSystem() {

    }

    public static void main(String args[]) {
        MissionToMarsSystem system = new MissionToMarsSystem();
        User user1 = new User();
        system.login(user1);

        while (true) {
            system.selectOperation(system, user1);
        }

    }

    // system login function, include user password validation
    public void login(User user) {
        Display screen = new Display();
        boolean success = false;

        while (!success) {
            screen.displayLoginUsername();
            Scanner scanner = new Scanner(System.in);
            String username = scanner.next();
            screen.displayLoginPassword();
            String password = scanner.next();

            // load user information from user.txt
            // store each user's information into an ArrayList info
            ArrayList<String> info = new ArrayList<>();
            try {
                File f = new File("user.txt");
                BufferedReader buff = new BufferedReader(new FileReader(f));
                String str;
                while ((str = buff.readLine()) != null) {
                    info.add(str);
                }
                info.remove(0); // remove the first row
                buff.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.exit(1);
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }

            // validate the user's username and password
            String[] singleInfo = {};
            for (int i = 0; i < info.size(); i++) {
                singleInfo = info.get(i).split(" ");

                // login success
                if (username.equals(singleInfo[3]) && password.equals(singleInfo[4])) {
                    // call login function in User class to store the corresponding information into user1
                    user.login(Integer.parseInt(singleInfo[0]), singleInfo[1], singleInfo[2], singleInfo[3], singleInfo[4], singleInfo[5]);
                    success = true;
                    screen.displayLoginSuccessful(user.getName());
                    break;
                }
            }

            // login failed
            if (!success) {
                screen.displayLoginFailed();
                String input = scanner.next();
                // input validation
                while (!input.equals("B")) {
                    screen.goBack();
                    input = scanner.next();
                }
            } else {
                screen.displayContinue();
                String input = scanner.next();
                // input validation
                while (!input.equals("N")) {
                    screen.displayContinue();
                    input = scanner.next();
                }
            }

        }

    }

    public int selectOperation(MissionToMarsSystem system, User user) {
        Display screen = new Display();
        Scanner scanner = new Scanner(System.in);
        int operation = 0;
        if (user.getType().equals("Administrator")) {
            screen.displayOperationAdmin();
            String input = scanner.next();
            // input validation
            while (!(input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4"))) {
                screen.displayValidInput();
                input = scanner.next();
            }
            if (input.equals("1")) {
                // system.selectSpaceShuttle(user);
            } else if (input.equals("2")) {
                // system.createCriteria(user);
            } else if (input.equals("3")) {
                user.selectCandidates(user);
            } else {
                user.logOut();
            }
        } else if (user.getType().equals("Coordinator")) {
            screen.displayOperationCoordinator();
            String input = scanner.next();
            // input validation
            while (!(input.equals("1") || input.equals("2"))) {
                screen.displayValidInput();
                input = scanner.next();
            }
            if (input.equals("1")) {
                system.createMission(user);
            } else {
                user.logOut();
            }
        } else {
            screen.displayOperationCandidate();
            String input = scanner.next();
            // input validation
            while (!input.equals("1")) {
                screen.displayValidInput();
                input = scanner.next();
            }
            user.logOut();
        }

        return operation;
    }

    public void createMission(User user) {
        Display screen = new Display();
        Scanner scanner = new Scanner(System.in);
        Mission mission1 = new Mission();

        String name;
        String description;
        String countryOfOrigin;
        String countriesAllowed;
        String status;
        String launchDate;
        String location;
        String duration;
        String jobInfo;
        String employment;
        String cargoRequirements;
        String coordinatorInfo;

        screen.missionInfo();
        name = scanner.nextLine();
        mission1.setName(name);

        screen.missionDescription();
        description = scanner.nextLine();
        mission1.setDescription(description);

        screen.missionCountryAllowed();
        countriesAllowed = scanner.nextLine();
        mission1.setCountriesAllowed(countriesAllowed);

        screen.missionCountryOrigin();
        countryOfOrigin = scanner.nextLine();
        mission1.setCountryOfOrigin(countryOfOrigin);

        screen.missionStatus();
        status = scanner.nextLine();
        while (!(status.equals("1") || status.equals("2") ||status.equals("3") ||status.equals("4") ||status.equals("5") ||status.equals("6"))) {
            screen.displayValidInput();
            status = scanner.next();
        }
        if (status.equals("1")) {
            mission1.setStatus("Planning phase");
        } else if (status.equals("2")) {
            mission1.setStatus("Departed Earth");
        } else if (status.equals("3")) {
            mission1.setStatus("Landed on Mars");
        } else if (status.equals("4")) {
            mission1.setStatus("Mission in progress");
        } else if (status.equals("5")) {
            mission1.setStatus("Returned to Earth");
        } else {
            mission1.setStatus("Mission completed");
        }


        screen.displayLaunchDate();
        launchDate = scanner.nextLine();
        mission1.setLaunchDate(launchDate);

        screen.displayLocation();
        location = scanner.nextLine();
        mission1.setLocation(location);

        screen.displayDuration();
        duration = scanner.nextLine();
        mission1.setDuration(duration);

        screen.displayJob();
        jobInfo = scanner.nextLine();
        mission1.setJobInfo(jobInfo);

        screen.displayEmployment();
        employment = scanner.nextLine();
        mission1.setEmploymentRequirements(employment);

        screen.displayCargoRequirements();
        cargoRequirements = scanner.nextLine();
        mission1.setCargoRequirements(cargoRequirements);

        screen.displayCoordinator();
        coordinatorInfo = scanner.nextLine();
        mission1.setCoordinatorInfo(coordinatorInfo);

        try {
            user.createMission(mission1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        screen.displayConfirmMission();
        screen.displayContinue();
        String input = scanner.next();
        // input validation
        while (!input.equals("N")) {
            screen.displayValidInput();
            input = scanner.next();
        }
    }

}