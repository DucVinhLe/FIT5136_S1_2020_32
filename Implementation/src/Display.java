public class Display {

    public Display() {

    }

    public static void main(String[] args) {

    }

    public void displayContinue() {
        System.out.println("Press N to continue");
    }

    public void goBack_enter() {
        System.out.println();
        System.out.println("Press B to go back");
        System.out.println("Press Enter to continue");
    }

    public void goBack() {
        System.out.println();
        System.out.println("Press B to go back");
    }


    public void displayLoginUsername() {
        System.out.println(" ");
        System.out.println("*** Welcome to Login Screen ***");
        System.out.println();
        System.out.println("   Please enter your account");
        System.out.println(" ");
        System.out.print("   Username: ");
    }

    public void displayLoginPassword() {
        System.out.print("   Password: ");
    }


    // feature 1 login fail
    public void displayLoginFailed() {
        System.out.println();
        System.out.println("           ***");
        System.out.println("       Login Failed");
        System.out.println("           ***");
        System.out.println();
        System.out.println("Wrong username or password");
        goBack();
    }

    // feature 1 login successful
    public void displayLoginSuccessful(String username) {
        System.out.println();
        System.out.println("             ***");
        System.out.println("      Login Successful");
        System.out.println("             ***");
        System.out.println(" ");
        System.out.println("       Hi! " + username + " =)");
        System.out.println();
    }



    // log out successful
    public void displayLogOutSuccessful() {
        System.out.println();
        System.out.println("             ***");
        System.out.println("    Logged out successful");
        System.out.println("             ***");
        System.out.println();
        System.out.println(" The system will shut down now");
    }

    // display operation selections for administrator
    public void displayOperationAdmin() {
        System.out.println();
        System.out.println("*** Operation Selection ***");
        System.out.println();
        System.out.println("Please select your operation:");
        System.out.println();
        System.out.println("   1. Modify a mission");
        System.out.println("   2. Select a space shuttle");
        System.out.println("   3. Create selection criteria");
        System.out.println("   4. Select candidates");
        System.out.println("   5. Log out");
        System.out.println();
    }

    // display operation selections for coordinator
    public void displayOperationCoordinator() {
        System.out.println();
        System.out.println("*** Operation Selection ***");
        System.out.println();
        System.out.println("Please select your operation:");
        System.out.println();
        System.out.println("    1. Create a mission");
        System.out.println("    2. Log out");
        System.out.println();
    }

    // display operation selections for candidate
    public void displayOperationCandidate() {
        System.out.println();
        System.out.println("*** Operation Selection ***");
        System.out.println();
        System.out.println("Please select your operation:");
        System.out.println();
        System.out.println("    1. Log out");
        System.out.println();
    }

    // display log out
    public void displayLogOut() {
        System.out.println();
        System.out.println("          *** Log Out ***");
        System.out.println();
        System.out.println("     Are you sure to log out?");
        System.out.println();
        displayLogOutConfirmation();
    }

    // display log out confirmation message
    public void displayLogOutConfirmation() {
        System.out.println("    Press Y to log out");
        System.out.println("    Press N to go back");
    }

    // feature 1 create mission
    public void displayCreateMission() {
        System.out.println("\n\n\n\n\n");
        System.out.println("        Create Mission");
        System.out.println("\n\n\n\n\n\n\n");
        displayContinue();
    }


    public void displayOperationValid() {
        System.out.println();
        System.out.println("Please enter a valid operation");
    }

    public void missionInfo() {
        System.out.println("\n\n");
        System.out.println("  *** Mission Information ***");
        System.out.println("\n\n");
        System.out.println("Enter the following information:");
        System.out.println(" ");
        System.out.println("      Mission name:");
        System.out.println("      Description:");
        System.out.println("      Country of origin:");
        System.out.println("      Countries allowed:");
    }

    // feature 1 create mission and enter mission info
    public void displayMissionInfo() {
        missionInfo();
        goBack_enter();
    }

    // feature 1 create mission and enter mission info
    public void displayMissionInfoValid() {
        missionInfo();
        System.out.println(" ");
        System.out.println("Mission information shouldn't be empty.");
        goBack_enter();
    }

    public void missionStatus() {
        System.out.println("\n\n");
        System.out.println("   *** Mission Status ***");
        System.out.println("\n\n");
        System.out.println("Select current mission status:");
        System.out.println(" ");
        System.out.println("      1. Planning phase");
        System.out.println("      2. Departed Earth");
        System.out.println("      3. Landed on Mars");
        System.out.println("      4. Mission in progress");
        System.out.println("      5. Returned to Earth");
        System.out.println("      6. Mission completed");
    }

    // feature 1 create mission select mission status
    public void displayMissionStatus() {
        missionStatus();
        goBack_enter();
    }

    // feature 1 create mission select mission status
    public void displayMissionStatusValid() {
        missionStatus();
        System.out.println("\n");
        System.out.println("Please enter 1 to 6 only~");
        goBack_enter();
    }

    public void launchDate() {
        System.out.println("\n\n");
        System.out.println("   *** Mission Information ***");
        System.out.println("\n\n");
        System.out.println("Enter the following information:");
        System.out.println(" ");
        System.out.println("Launch date:");
        System.out.println("Location of the destination:");
        System.out.println("Duration of the mission");
    }

    // feature 1 mission info
    public void enterLaunchDate() {
        launchDate();
        goBack_enter();
    }

    // feature 1 mission info
    public void enterLaunchDateValid() {
        launchDate();
        System.out.println(" ");
        System.out.println("Mission information shouldn't be empty.");
        goBack_enter();
    }

    public void jobRequire() {
        System.out.println("\n\n");
        System.out.println("   *** Job Information ***");
        System.out.println(" *** Employee Assignment ***");
        System.out.println("\n\n");
        System.out.println("Enter the following information:");
        System.out.println(" ");
        System.out.println("Job name:");
        System.out.println("Job description:");
        System.out.println("Titles");
        System.out.println("Number of employees for each job:");
    }

    // feature 1 job requirement
    public void displayJobRequire() {
        jobRequire();
        System.out.println("\n\n");
        System.out.println("Press A to add another job");
        goBack_enter();
    }

    // feature 1 job requirement
    public void displayJobRequireValid() {
        jobRequire();
        System.out.println("\n\n");
        System.out.println("Job information shouldn't be empty.");
        System.out.println(" ");
        System.out.println("Press A to add another job");
        goBack_enter();
    }

    public void cargoRequire() {
        System.out.println("\n\n");
        System.out.println("   *** Cargo Requirement ***");
        System.out.println("\n\n");
        System.out.println("Enter the following information:");
        System.out.println(" ");
        System.out.println("Cargo requirement for the jounery:");
        System.out.println("Cargo requirement for the mission:");
        System.out.println("Cargo requirement for other missions");
    }

    //feature 1 cargo requirement
    public void displayCargoRequire() {
        cargoRequire();
        goBack_enter();
    }

    //feature 1 cargo requirement
    public void displayCargoRequireValid() {
        cargoRequire();
        System.out.println("\n\n");
        System.out.println("Cargo requirement shouldn't be empty.");
        goBack_enter();
    }

    public void assignCoordin() {
        System.out.println("\n\n");
        System.out.println("   *** Assigning Coordinator ***");
        System.out.println("\n\n");
        System.out.println("Enter the following information:");
        System.out.println(" ");
        System.out.println("Coordinator ID:");
        System.out.println("Name:");
        System.out.println("Email:");
    }

    // feature 1 create mission assigning coordinator
    public void displayAssignCoordin() {
        assignCoordin();
        goBack_enter();
    }

    // feature 1 create mission assigning coordinator
    public void displayAssignCoordinValid() {
        assignCoordin();
        System.out.println("\n\n");
        System.out.println("Coordinator information shouldn't be empty.");
        goBack_enter();
    }

    // log out
    public void displayMissionAborted() {
        System.out.println("\n\n\n\n");
        System.out.println("             ***");
        System.out.println("         Logged out ");
        System.out.println("             ***");
        System.out.println(" ");
        System.out.println("      Mission Aborted.");
        System.out.println("\n\n\n");
        System.out.println("Press enter to Role Selection");
    }

    // feature 1 mission information
    public void displayMissionInfo(String name, String description, String CouOrigin, String CouAllowed) {
        System.out.println("\n\n");
        System.out.println("   *** Mission Information***");
        System.out.println("\n\n");
        System.out.println("Mission name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Country of origin: " + CouOrigin);
        System.out.println("Countries allowed: " + CouAllowed);
        System.out.println("\n\n");
        System.out.println("Please make sure all the information above is correct.");
        goBack_enter();
    }

    // feature 1 Confirmation
    public void displayConfirmMission() {
        System.out.println("\n\n\n\n\n");
        System.out.println("                ***");
        System.out.println("        NEW MISSION CREATED");
        System.out.println("                ***");
        System.out.println("\n\n\n\n\n");
        System.out.println("Please enter to Operation Selection");
    }

    // feature 2 select your shuttle
    public void displaySelectShuttle() {
        System.out.println("\n\n\n\n\n");
        System.out.println("       Select Your Shuttle");
        System.out.println("\n\n\n\n\n\n\n");
        goBack_enter();
    }

    // feature 2 enter shuttle ID
    public void enterShuttleID() {
        System.out.println("\n\n");
        System.out.println("   *** Shuttle Selection ***");
        System.out.println("\n\n");
        System.out.println("Enter your preferred shuttle ID:");
        System.out.println(" ");
        System.out.println("Or press enter to look up all the shuttles");
        System.out.println("\n\n\n\n");
        goBack();
    }

    // feature 2 selected shuttle info
    public void selectedShuttle(int id, String name, int year, String fuel, String payload, String speed) {
        System.out.println("\n\n");
        System.out.println("   *** Selected Shuttle ***");
        System.out.println("\n\n");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Fuel: " + fuel);
        System.out.println("Speed: " + speed);
        System.out.println("Payload: " + payload);
        goBack_enter();
    }

    // feature 2 shuttle not exist
    public void displayShuttleNotExist(int id) {
        System.out.println("\n\n\n\n\n");
        System.out.println("                 ***");
        System.out.println("Sorry, Shuttle " + id + " does not exist.");
        System.out.println("                 ***");
        System.out.println("\n\n\n\n\n");
        goBack();
    }

    // feature 2 Successfully selected shuttle
    public void displaySuccessfullySelectedShuttle(String id) {
        System.out.println("\n\n");
        System.out.println("Successfully selected Shuttle " + id + " !");
        System.out.println("\n\n");
        System.out.println("                /\\      ");
        System.out.println("              -/  \\-");
        System.out.println("              [ (M) ]");
        System.out.println("         --==||     ||==--");
        System.out.println("               " + id);
        System.out.println("         -==+=|     |=+==- ");
        System.out.println("              \\    /");
        System.out.println("             % \\  / %");
        System.out.println("               ^^ ^^");
        System.out.println("              !!! !!!");
    }

    // feature 2 run through all shuttles
    public void displayEndShutte() {
        System.out.println("\n\n\n\n\n");
        System.out.println("                 ***");
        System.out.println("You have run through all the shuttles.");
        System.out.println("                 ***");
        System.out.println("\n\n\n\n\n");
        displayContinue();
    }

    // feature 3 create selection criteria
    public void displayCreateSelectionCriteria() {
        System.out.println("\n\n\n\n\n");
        System.out.println("       Create Selection Criteria");
        System.out.println("\n\n\n\n\n\n\n");
        goBack_enter();
    }

    // feature 5 Select candidates
    public void displaySelectCandidates() {
        System.out.println("\n\n\n\n\n");
        System.out.println("        Select Candidates");
        System.out.println("\n\n\n\n\n\n\n");
        goBack_enter();
    }

    public void displayCandidates(String[] candidates) {
        for (int i = 0; i < candidates.length; i++) {
            System.out.println(i+1 + ". " + candidates[i]);
        }

    }

}

