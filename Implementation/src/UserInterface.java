// Author: @Team 32

public class UserInterface {
    public UserInterface() { }

    public static void main(String[] args) { }

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
        System.out.println("      Hi! " + username + " =)");
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
        System.out.println("Please select your operation (Administrator):");
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
        System.out.println("Please select your operation (Coordinator):");
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
        System.out.println("Please select your operation (Candidate):");
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
        System.out.println("   *** Log Out ***");
        System.out.println();
        System.out.println("Are you sure to log out?");
        System.out.println();
        displayLogOutConfirmation();
    }

    // display log out confirmation message
    public void displayLogOutConfirmation() {
        System.out.println("    Press Y to log out");
        System.out.println("    Press N to go back");
    }

    public void displayCreateMission() {
        System.out.println("                ***");
        System.out.println("          Create a Mission");
        System.out.println("                ***");
    }

    public void missionInfo() {
        System.out.println("Please enter the following information");
        System.out.print("Mission name: ");
    }

    public void displayNotEmpty() {
        System.out.print("The input cannot be empty");
    }

    public void displayDescriptionShort() {
        System.out.print("The input needs to be at least 10 words long\n");
    }

    public void displayDurationYears() {
        System.out.print("The input needs to be a number (years)\n");
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
        System.out.println("     1. Planning phase");
        System.out.println("     2. Departed Earth");
        System.out.println("     3. Landed on Mars");
        System.out.println("     4. Mission in progress");
        System.out.println("     5. Returned to Earth");
        System.out.println("     6. Mission completed\n");
        System.out.print("Mission Status: ");
    }

    public void displayLaunchDate() {
        System.out.print("Launch date: ");
    }

    public void displayLocation() {
        System.out.print("Location of the destination (coordinates or address): ");
    }

    public void displayDuration() {
        System.out.print("Duration of the mission (years): ");
    }

    public void displayJob() {
        System.out.print("Job name and description: ");
    }

    public void displayEmployment() {
        System.out.print("Title and numbers: ");
        System.out.println("e.g. 5 engineers, 4 builders");
    }

    public void displayCargoRequirements() {
        System.out.print("Cargo requirements (for journey, mission and other missions): ");
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
    }

    // feature 2 selected shuttle info
    public void selectedShuttle(String id, String name, String year, String fuel,String passengerCapacity,String payload, String speed,String origin ) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Fuel: " + fuel);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Payload: " + payload);
        System.out.println("Speed: " + speed);
        System.out.println("Origin: "+ origin);
    }

    // feature 2 shuttle not exist
    public void displayShuttleNotExist(String id) {
        System.out.println("                 ***");
        System.out.println("Sorry, Shuttle " + id + " does not exist.");
        System.out.println("                 ***");
    }

    // feature 2 Successfully selected shuttle
    public void displaySuccessfullySelectedShuttle(String id) {
        System.out.print('\u000C');
        System.out.println();
        System.out.println("Successfully selected Shuttle " + id + " !");
        System.out.println();
        System.out.println("                /\\      ");
        System.out.println("              -/  \\-");
        System.out.println("              [ (M) ]");
        System.out.println("         --==||     ||==--");
        System.out.println("                " + id);
        System.out.println("         -==+=|     |=+==- ");
        System.out.println("              \\    /");
        System.out.println("             % \\  / %");
        System.out.println("               ^^ ^^");
        System.out.println("              !!! !!!");
    }
    
    // feature 3 create criteria
    public void displayCreateCriteria() {
        System.out.println("                ***");
        System.out.println("       Create Selection Criteria");
        System.out.println("                ***");
        System.out.println();
        System.out.println("Please enter the following information:");
        System.out.print("Range of Age: ");
    }

    public void displayHealthRecord() {
        System.out.print("Health Record: ");
    }

    public void displayCriminalRecord() {
        System.out.print("Criminal Record: ");
    }

    public void displayConfirmCriteria(){
        System.out.println();
        System.out.println("                ***");
        System.out.println("          CRITERIA CREATED");
        System.out.println("                ***");
        System.out.println();
    }

    public void displaySelectPriority() {
        System.out.println("Please select the prioritized criteria:");
        System.out.println("  1. range of age");
        System.out.println("  2. health record");
        System.out.println("  3. criminal record");
    }

    public void displaySelectedAge() {
        System.out.println("Range of Age has been selected as the prioritized criteria");
        System.out.println("The creation process has finished!\n");
    }

    public void displaySelectedHealth() {
        System.out.println("Health Record has been selected as the prioritized criteria");
        System.out.println("The creation process has finished!\n");
    }

    public void displaySelectedCriminal() {
        System.out.println("Criminal Record has been selected as the prioritized criteria");
        System.out.println("The creation process has finished!\n");
    }

    // feature 4 select candidates
    public void displaySelectCandidates() {
        System.out.println();
        System.out.println("   *** Select Candidates ***");
        System.out.println();
    }

    //display selected candidates
    public void displayCandidates(String...strings){
        System.out.println("The selected candidates are: \n" + strings[0] + "\n" + strings[1] + "\n" + strings[2] + "\n" + strings[3] + "\n" + strings[4]);
        System.out.println();
    }

    // display send invitation message
    public void displaySendInvitation() {
        System.out.println("Now the system will send an invitation to them automatically");
        System.out.println("Sending......\n");
    }

    // display invitation sent message
    public void displaySent() {
        System.out.println("The invitations have been sent successfully");
        System.out.println("press N to view their feedback ");
    }

    //display candidate refused
    public void displayCandidateRefuse(String...strings){
        System.out.println(strings[0]+" has refused the invitation\n" + "The system will now send invitation to the replacement candidates");
        System.out.println("Sending......\n");
    }

    //display candidate accept
    public void displayCandidateAccept() {
        System.out.println("Congratulations!!!");
        System.out.println("All the candidates accepted the invitation");
        System.out.println("Now the system will generate the selected candidates list\n");
    }

    public void displayInform() {
        System.out.println("Now the system will send a notification to the coordinator");
        System.out.println("Sending......\n");
    }

    public void displayInformSuccessful() {
        System.out.println("The coordinator has been informed, the selection process finished");
        System.out.println("Press N to continue");
    }

    public static void displayShuttleInfo() {
        System.out.println("*** Space Shuttle Information ***");
    }

    public static void displayStar() {
        System.out.println("*********************************");
    }
}
