import java.util.Date;
import java.util.Scanner;

public class SpaceShuttle {
    private int shuttleId;
    private String shuttleName;
    private Date manYear;
    private float fuelCapacity;
    private int passengerCapacity;
    private int cargoCapacity;
    private float speed;

    public static void main(String[] arg) {
        System.out.println("213123");
        Scanner scanner = new Scanner(System.in);
        int abc = scanner.nextInt();
        System.out.println(abc);
        SpaceShuttle spaceShuttle = new SpaceShuttle();
        spaceShuttle.setCargoCapacity(abc);
        System.out.println(spaceShuttle.getCargoCapacity());
    }

    public SpaceShuttle() {

        }

    public SpaceShuttle( int ShuttleId, String shuttleName, Date manYear,float fuelCapacity, int passengerCapacity,
        int cargoCapacity, int speed){
            this.shuttleId = ShuttleId; //
            this.shuttleName = shuttleName;
            this.manYear = manYear;
            this.fuelCapacity = fuelCapacity;
            this.passengerCapacity = passengerCapacity;
            this.cargoCapacity = cargoCapacity;
            this.speed = speed;
        }

        public void selectSpaceShuttle(){

        }

        public void setShuttleId ( int shuttleId){
            this.shuttleId = shuttleId;
        }

        public int getShuttleId () {
            return shuttleId;
        }

        public void setShuttleName (String shuttleName){
            this.shuttleName = shuttleName;
        }

        public String getShuttleName () {
            return shuttleName;
        }

        public void setManYear (Date manYear){
            this.manYear = manYear;
        }

        public Date getManYear () {
            return manYear;
        }

        public void setFuelCapacity ( float fuelCapacity){
            this.fuelCapacity = fuelCapacity;
        }

        public float getFuelCapacity () {
            return fuelCapacity;
        }

        public void setPassengerCapacity ( int passengerCapacity){
            this.passengerCapacity = passengerCapacity;
        }

        public int getPassengerCapacity () {
            return passengerCapacity;
        }

        public void setCargoCapacity ( int cargoCapacity){
            this.cargoCapacity = cargoCapacity;
        }

        public int getCargoCapacity () {
            return cargoCapacity;
        }

        public void setSpeed ( float speed){
            this.speed = speed;
        }

        public float getSpeed () {
            return speed;
        }
}