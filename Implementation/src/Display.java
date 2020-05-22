public class Display {
    public static void main(String[] args) {
        Display a = new Display();
        System.out.println('\u000C');
        a.displayLoginSuccessful("Yiwei");
        a.displaySuccessfullySelectedShuttle("008");
    }
// sth
    public Display() {
    }

        public void enterToContinue() {
            System.out.println("\n\n\n");
            System.out.println("Press Enter to continue");
        }

        public void goBack_enter() {
            System.out.println("\n\n\n");
            System.out.println("Press B to go back");
            System.out.println("Press Enter to continue");
        }

        public void goBack() {
            System.out.println("\n\n\n");
            System.out.println("Press B to go back");
        }

        public void roleSelect() {
            System.out.println(" ");
            System.out.println("*** Welcome to Mission to Mars ***");
            System.out.println("\n\n");
            System.out.println("   Please select your option:");
            System.out.println(" ");
            System.out.println("   1. Administrator");
            System.out.println("   2. Coordinator");
        }

        // feature 1 selection role screen
        public void displayRoleSelection(){
            roleSelect();
            enterToContinue();
        }

        // feature 1 selection role screen validation
        public void displayRoleSelectionValid(){
            roleSelect();
            System.out.println("\n");
            System.out.println("Please enter 1 or 2 only~");
            enterToContinue();
        }

        public void loginScreen() {
            System.out.println(" ");
            System.out.println("*** Welcome to Login Screen ***");
            System.out.println("\n\n");
            System.out.println("   Please enter your account");
            System.out.println(" ");
            System.out.println("   Username:");
            System.out.println("   Password:");
        }
        // feature 1 login screen
        public void displayLoginScreen(){
            loginScreen();
            goBack_enter();
        }

        // feature 1 login screen validation
        public void displayLoginScreenValid(){
            loginScreen();
            System.out.println("\n\n\n");
            System.out.println("Username or password shouldn't be empty!");
        }

        // feature 1 login fail
        public void displayLoginFailed(){
            System.out.println("\n\n\n");
            System.out.println("           ***");
            System.out.println("       Login Failed");
            System.out.println("           ***");
            System.out.println("\n\n");
            System.out.println("Wrong username or password");
            goBack();
        }

        // feature 1 login successful
        public void displayLoginSuccessful(String username){
            System.out.println("\n\n");
            System.out.println("             ***");
            System.out.println("      Login Successful");
            System.out.println("             ***");
            System.out.println(" ");
            System.out.println("       Hi! " + username + " =)");
            enterToContinue();
            System.out.println("Log out anytime by pressing X");
        }

        public void displayLogOutX() {
            System.out.println("                                   X");
        }

        // feature 1 log out
        public void displayLogOut() {
            System.out.println("\n\n");
            System.out.println("          *** Log Out ***");
            System.out.println("\n\n");
            System.out.println("     Are you sure to log out?");
            System.out.println("Your current mission will be aborted.");
            goBack_enter();
        }

        // feature 1 log out successful
        public void displayLogOutSuccessful() {
            System.out.println("\n\n\n\n");
            System.out.println("             ***");
            System.out.println("    Logged out successful");
            System.out.println("             ***");
            System.out.println(" ");
            enterToContinue();
        }

        // feature 1 operation selection page for coordinator
        public void displayOperationSelectionCoordin() {
            displayLogOutX();
            System.out.println("\n\n");
            System.out.println("*** Operation Selection ***");
            System.out.println("\n\n");
            System.out.println("Please select your option:");
            System.out.println("\n\n");
            System.out.println("    1. Create a mission");
            enterToContinue();
        }

        // feature 1 create mission
        public void displayCreateMission () {
            displayLogOutX();
            System.out.println("\n\n\n\n\n");
            System.out.println("        Create Mission");
            System.out.println("\n\n\n\n\n\n\n");
            enterToContinue();
        }

        public void displayOperSelection() {
            System.out.println("\n\n");
            System.out.println("*** Operation Selection ***");
            System.out.println("\n\n");
            System.out.println("Please select your option:");
            System.out.println(" ");
            System.out.println("   1. Modify a mission");
            System.out.println("   2. Select a space shuttle");
            System.out.println("   3. Create selection criteria");
            System.out.println("   4. Select candidates");
        }
        // feature 1 operation selection page for Administrator
        public void displayOperationSelectionAdmin() {
            displayLogOutX();
            displayOperSelection();
            enterToContinue();
        }

        public void displayOperationSelectionAdminValid () {
            displayLogOutX();
            displayOperSelection();
            System.out.println("\n");
            System.out.println("Please enter 1 to 4 only~");
            enterToContinue();
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
        public void displayMissionInfo () {
            displayLogOutX();
            missionInfo();
            goBack_enter();
        }

        // feature 1 create mission and enter mission info
        public void displayMissionInfoValid () {
            displayLogOutX();
            missionInfo();
            System.out.println(" ");
            System.out.println("Mission information shouldn't be empty.");
            goBack_enter();
        }
        public void missionStatus(){
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
        public void displayMissionStatus () {
            displayLogOutX();
            missionStatus();
            goBack_enter();
        }

        // feature 1 create mission select mission status
        public void displayMissionStatusValid () {
            displayLogOutX();
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
            displayLogOutX();
            launchDate();
            goBack_enter();
        }

        // feature 1 mission info
        public void enterLaunchDateValid() {
            displayLogOutX();
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
            displayLogOutX();
            jobRequire();
            System.out.println("\n\n");
            System.out.println("Press A to add another job");
            goBack_enter();
        }

        // feature 1 job requirement
        public void displayJobRequireValid() {
            displayLogOutX();
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
            displayLogOutX();
            cargoRequire();
            goBack_enter();
        }

        //feature 1 cargo requirement
        public void displayCargoRequireValid() {
            displayLogOutX();
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
            displayLogOutX();
            assignCoordin();
            goBack_enter();
        }

        // feature 1 create mission assigning coordinator
        public void displayAssignCoordinValid() {
            displayLogOutX();
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
            displayLogOutX();
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
            displayLogOutX();
            System.out.println("\n\n\n\n\n");
            System.out.println("                ***");
            System.out.println("        NEW MISSION CREATED");
            System.out.println("                ***");
            System.out.println("\n\n\n\n\n");
            System.out.println("Please enter to Operation Selection");
        }

        // feature 2 select your shuttle
        public void displaySelectShuttle () {
            displayLogOutX();
            System.out.println("\n\n\n\n\n");
            System.out.println("       Select Your Shuttle");
            System.out.println("\n\n\n\n\n\n\n");
            goBack_enter();
        }

        // feature 2 enter shuttle ID
        public void enterShuttleID() {
            displayLogOutX();
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
            displayLogOutX();
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
            displayLogOutX();
            System.out.println("\n\n\n\n\n");
            System.out.println("                 ***");
            System.out.println("Sorry, Shuttle " + id +" does not exist.");
            System.out.println("                 ***");
            System.out.println("\n\n\n\n\n");
            goBack();
        }

        // feature 2 Successfully selected shuttle
        public void displaySuccessfullySelectedShuttle(String id) {
            displayLogOutX();
            System.out.println("\n\n");
            System.out.println("Successfully selected Shuttle "+ id +" !");
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
            displayLogOutX();
            System.out.println("\n\n\n\n\n");
            System.out.println("                 ***");
            System.out.println("You have run through all the shuttles.");
            System.out.println("                 ***");
            System.out.println("\n\n\n\n\n");
            enterToContinue();
        }

        // feature 3 create selection criteria
        public void displayCreateSelectionCriteria () {
            System.out.println("\n\n\n\n\n");
            System.out.println("       Create Selection Criteria");
            System.out.println("\n\n\n\n\n\n\n");
            goBack_enter();
        }

        // feature 5 Select candidates
        public void displaySelectCandidates () {
            System.out.println("\n\n\n\n\n");
            System.out.println("        Select Candidates");
            System.out.println("\n\n\n\n\n\n\n");
            goBack_enter();
        }

    }

