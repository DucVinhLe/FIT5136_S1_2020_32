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

        System.out.print(user1.getUserId() + " ");
        System.out.print(user1.getName() + " ");
        System.out.print(user1.getType() + " ");
        System.out.print(user1.getContact() + " ");
        System.out.println();

        boolean shutdown = false;
        int operation = 0;

    }

    // user login function, include password validation
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
            }

        }

    }

    public int selectOperation(User user) {
        int operation = 0;
        return operation;
    }

}