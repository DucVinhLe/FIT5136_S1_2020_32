public class Display {

    public Display() {

    }

    public static void main(String[] args) {

    }

    public void displayContinue() {
        System.out.println("Press N to continue");
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
        System.out.println("Please select your operation(Administrator):");
        System.out.println();
        System.out.println("   1. Select a space shuttle");
        System.out.println("   2. Create selection criteria");
        System.out.println("   3. Select candidates");
        System.out.println("   4. Log out");
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

    // display the invalid input operation message
    public void displayValidInput() {
        System.out.println();
        System.out.println("Please enter a valid input");
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

    public void missionInfo() {
        System.out.println("Please Enter the following information:");
        System.out.print("Mission name: ");
    }

    public void missionDescription() {
        System.out.print("Description: ");
    }

    public void missionCountryOrigin() {
        System.out.print("Country of origin: ");
    }

    public void missionCountryAllowed() {
        System.out.print("Countries allowed: ");
    }

    public void missionStatus() {
        System.out.println("Select the current mission status from:");
        System.out.println("      1. Planning phase");
        System.out.println("      2. Departed Earth");
        System.out.println("      3. Landed on Mars");
        System.out.println("      4. Mission in progress");
        System.out.println("      5. Returned to Earth");
        System.out.println("      6. Mission completed");
        System.out.print("Mission Status: ");
    }

    public void displayLaunchDate() {
        System.out.print("Launch date: ");
    }

    public void displayLocation() {
        System.out.print("Location of the destination(coordinates or address): ");
    }

    public void displayDuration() {
        System.out.print("Duration of the mission: ");
    }

    public void displayJob() {
        System.out.print("Job name and description: ");
    }

    public void displayEmployment() {
        System.out.print("Title and numbers: ");
        System.out.println("e.g. 5 engineers, 4 builders");
    }

    public void displayCargoRequirements() {
        System.out.print("Cargo requirements(for journey, mission and other missions): ");
    }

    public void displayCoordinator() {
        System.out.print("Coordinator's name and contact: ");
    }

    public void displayConfirmMission() {
        System.out.println();
        System.out.println("                ***");
        System.out.println("        NEW MISSION CREATED");
        System.out.println("                ***");
        System.out.println();
    }


    // feature 2 enter shuttle ID
    public void enterShuttleID() {
        System.out.println();
        System.out.println("   *** Shuttle Selection ***");
        System.out.println();
        System.out.println("Enter your preferred shuttle ID:");
        System.out.println(" ");
        System.out.println("Or press enter to look up all the shuttles");
        System.out.println();
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
    }

    // feature 2 shuttle not exist
    public void displayShuttleNotExist(int id) {
        System.out.println();
        System.out.println("                 ***");
        System.out.println("Sorry, Shuttle " + id + " does not exist.");
        System.out.println("                 ***");
        System.out.println();
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

}

