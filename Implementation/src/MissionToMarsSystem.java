// Author: @Team 32

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MissionToMarsSystem {

    public MissionToMarsSystem() { }

    public static void main(String args[]) throws IOException {
        MissionToMarsSystem system = new MissionToMarsSystem();
        User user1 = new User();
        system.login(user1);
        while (true) {
            int userChoice = system.selectOperation(system, user1); // Variable userChoice
        }
        // selectSpaceShuttle
    }
    // system login function, include user password validation
    public void login(User user) {
        UserInterface screen = new UserInterface();
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
                System.out.print('\u000C');
                screen.displayLoginFailed();
                String input = scanner.next().toUpperCase();
                // input validation
                while (!input.equals("B")) {
                    screen.goBack();
                    input = scanner.next();
                }
            } else {
                screen.displayContinue();
                String input = scanner.next().toUpperCase();
                // input validation
                while (!input.equals("N")) {
                    screen.displayContinue();
                    input = scanner.next();
                }
            }
        }
    }

    public int selectOperation(MissionToMarsSystem system, User user) throws IOException {
        UserInterface screen = new UserInterface();
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
                user.selectSpaceShuttle();
            } else if (input.equals("2")) {
                system.createCriteria(user);
            } else if (input.equals("3")) {
                user.selectCandidates();
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

    public void createCriteria(User user) throws IOException {
        UserInterface screen = new UserInterface();
        Scanner scanner = new Scanner(System.in);
        Criteria criteria1 = new Criteria();
        Criteria criteria2 = new Criteria();
        Criteria criteria3 = new Criteria();
        criteria1.setType("Range of Age");
        criteria2.setType("Health Record");
        criteria3.setType("Criminal Record");
        String criteriaInfo1;
        String criteriaInfo2;
        String criteriaInfo3;
        screen.displayCreateCriteria();
        criteriaInfo1 = scanner.nextLine();
        while (criteriaInfo1.equals("")) {
            screen.displayNotEmpty();
            criteriaInfo1 = scanner.nextLine();
        }
        criteria1.setInformation(criteriaInfo1);

        screen.displayHealthRecord();
        criteriaInfo2 = scanner.nextLine();
        while (criteriaInfo2.equals("")) {
            screen.displayNotEmpty();
            criteriaInfo2 = scanner.nextLine();
        }
        criteria2.setInformation(criteriaInfo2);

        screen.displayCriminalRecord();
        criteriaInfo3 = scanner.nextLine();
        while (criteriaInfo3.equals("")) {
            screen.displayNotEmpty();
            criteriaInfo3 = scanner.nextLine();
        }
        criteria3.setInformation(criteriaInfo3);

        try {
            user.createCriteria(criteria1);
            user.createCriteria(criteria2);
            user.createCriteria(criteria3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        screen.displayConfirmCriteria();
        screen.displayContinue();
        String input = scanner.nextLine().toUpperCase();
        // input validation
        while (!input.equals("N")) {
            screen.displayValidInput();
            input = scanner.next();
        }
        screen.displaySelectPriority();
        String input1 = scanner.next();
        while (!(input1.equals("1") || input1.equals("2") || input1.equals("3"))) {
            screen.displayValidInput();
            input1 = scanner.next();
        }
        if (input1.equals("1")) {
            screen.displaySelectedAge();
        } else if (input1.equals("2")) {
            screen.displaySelectedHealth();
        } else {
            screen.displaySelectedCriminal();
        }
        screen.displayContinue();
        input = scanner.next().toUpperCase();
        // input validation
        while (!input.equals("N")) {
            screen.displayValidInput();
            input = scanner.next();
        }
    }
    public void createMission(User user) {
        UserInterface screen = new UserInterface();
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
        screen.displayCreateMission();
        screen.missionInfo();
        name = scanner.nextLine();
        while (name.equals("")) {
            screen.displayNotEmpty();
            name = scanner.nextLine();
        }
        mission1.setName(name);
        screen.missionDescription();
        description = scanner.nextLine();
        while (description.equals("")) {
            screen.displayNotEmpty();
            description = scanner.nextLine();
        }
        // calculate how many words are in the description
        int cnt = 0;
        screen.displayDescriptionShort();
        description = scanner.nextLine();
        cnt = 0;
        for (int i = 0; i < description.length(); i++) {
            char c = description.charAt(i);
            if (c == ' ') {
                cnt++;
            }
        }
        while (cnt < 9) {
            screen.displayDescriptionShort();
            description = scanner.nextLine();
            cnt = 0;
            for (int i = 0; i < description.length(); i++) {
                char c = description.charAt(i);
                if (c == ' ') {
                    cnt++;
                }
            }
        }
        // set description
        mission1.setDescription(description);
        screen.missionCountryAllowed();
        countriesAllowed = scanner.nextLine();
        while (countriesAllowed.equals("")) {
            screen.displayNotEmpty();
            countriesAllowed = scanner.nextLine();
        }
        mission1.setCountriesAllowed(countriesAllowed);
        // set country
        screen.missionCountryOrigin();
        countryOfOrigin = scanner.nextLine();
        while (countryOfOrigin.equals("")) {
            screen.displayNotEmpty();
            countryOfOrigin = scanner.nextLine();
        }
        mission1.setCountryOfOrigin(countryOfOrigin);
        // set status
        screen.missionStatus();
        status = scanner.nextLine();
        while (status.equals("")) {
            screen.displayNotEmpty();
            status = scanner.nextLine();
        }
        while (!(status.equals("1") || status.equals("2") || status.equals("3") || status.equals("4") || status.equals("5") || status.equals("6"))) {
            screen.displayValidInput();
            status = scanner.nextLine();
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
        // set launch date
        screen.displayLaunchDate();
        launchDate = scanner.nextLine();
        while (launchDate.equals("")) {
            screen.displayNotEmpty();
            launchDate = scanner.nextLine();
        }
        mission1.setLaunchDate(launchDate);
        // set location
        screen.displayLocation();
        location = scanner.nextLine();
        while (location.equals("")) {
            screen.displayNotEmpty();
            location = scanner.nextLine();
        }
        mission1.setLocation(location);
        // set duration
        screen.displayDuration();
        duration = scanner.nextLine();
        while (duration.equals("")) {
            screen.displayNotEmpty();
            duration = scanner.nextLine();
        }
        while (!isNumeric(duration)) {
            screen.displayDurationYears();
            duration = scanner.nextLine();
        }
        mission1.setDuration(duration);
        // set job
        screen.displayJob();
        jobInfo = scanner.nextLine();
        while (jobInfo.equals("")) {
            screen.displayNotEmpty();
            jobInfo = scanner.nextLine();
        }
        mission1.setJobInfo(jobInfo);
        // set employment
        screen.displayEmployment();
        employment = scanner.nextLine();
        while (employment.equals("")) {
            screen.displayNotEmpty();
            employment = scanner.nextLine();
        }
        mission1.setEmploymentRequirements(employment);
        // set cargo requirement
        screen.displayCargoRequirements();
        cargoRequirements = scanner.nextLine();
        while (cargoRequirements.equals("")) {
            screen.displayNotEmpty();
            cargoRequirements = scanner.nextLine();
        }
        mission1.setCargoRequirements(cargoRequirements);
        screen.displayCoordinator();
        coordinatorInfo = scanner.nextLine();
        while (coordinatorInfo.equals("")) {
            screen.displayNotEmpty();
            coordinatorInfo = scanner.nextLine();
        }
        mission1.setCoordinatorInfo(coordinatorInfo);
        try {
            user.createMission(mission1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        screen.displayConfirmMission();
        screen.displayContinue();
        String input = scanner.next().toUpperCase();
        // input validation
        while (!input.equals("N")) {
            screen.displayValidInput();
            input = scanner.next();
        }
    }
    // The method is retrieved from internet
    // Check whether a String is a number
    private boolean isNumeric(String str) {
        for (int i = str.length(); --i >= 0; ) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}