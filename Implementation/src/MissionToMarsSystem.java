import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MissionToMarsSystem {

    public MissionToMarsSystem() {

    }

    public static void main(String args[]) {
        MissionToMarsSystem system = new MissionToMarsSystem();
        Staff staff1 = new Staff();
        system.login(staff1);


        System.out.print(staff1.getStaffId() + " ");
        System.out.print(staff1.getName() + " ");
        System.out.print(staff1.getRole() + " ");
        System.out.print(staff1.getContact() + " ");
        System.out.println();

        boolean shutdown = false;
        int operation = 0;

        if (staff1.getRole().equals("Coordinator")) {
            while (!shutdown) {
                operation = system.selectOperation(staff1);
                // validate operation selection
                if (operation == 1) {
                    // createMission(staff1);
                } else {
                    // display error input message
                }
            }
        }
        // updateProfile(candidate)

        if (staff1.getRole().equals("Administrator")) {
            while (!shutdown) {
                operation = system.selectOperation(staff1);
                if (operation == 1) {
                    // modifyMission(staff1);
                } else if (operation == 2) {
                    int missionID = 1;
                    // selectSpaceShuttle(staff1, missionID);
                } else if (operation == 3) {

                } else if (operation == 4) {

                }
            }
        }




    }

    public int selectOperation(Staff staff1) {
        int operation = 0;




        return operation;
    }


    public void login(Staff staff) {
        Display screen = new Display();
        boolean success = false;

        while (!success) {
            screen.displayLoginUsername();
            Scanner scanner = new Scanner(System.in);
            String username = scanner.next();
            screen.displayLoginPassword();
            String password = scanner.next();

            // load staff information from staff.txt
            // store each staff's information into an ArrayList info
            ArrayList<String> info = new ArrayList<>();
            try {
                File f = new File("staff.txt");
                BufferedReader buff = new BufferedReader(new FileReader(f));
                String str;
                while((str = buff.readLine()) != null) {
                    info.add(str);
                }
                info.remove(0); // remove the first row
                buff.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.exit(1);
            }  catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }

            // validate the staff's username and password
            String[] singleInfo = {};
            for (int i = 0; i < info.size(); i++) {
                singleInfo = info.get(i).split(" ");

                // login success
                if (username.equals(singleInfo[3]) && password.equals(singleInfo[4])) {
                    // store the corresponding information into staff1
                    staff.setStaffId(Integer.parseInt(singleInfo[0]));
                    staff.setName(singleInfo[1]);
                    staff.setRole(singleInfo[2]);
                    staff.setContact(singleInfo[5]);
                    success = true;
                    screen.displayLoginSuccessful(staff.getName());
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
            }

        }

    }


}
