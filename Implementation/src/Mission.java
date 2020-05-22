package MissionToMars;

import com.sun.deploy.net.MessageHeader;
import com.sun.xml.internal.bind.v2.runtime.Coordinator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Mission {


    public static void main(String[] args){
   
}
    //fields
    private int missionId = 0;
    private String name = "";
    private String description = "";
    private String countryOfOrigin = "";
    private String countriesAllowed = "";
    private String coordinatorInfo = ""; // I made it String, because I want to use coordinator.getName()
    private ArrayList<String> jobInfo;
    private String employmentRequirements = "";
    private String cargoRequirements = "";
    private Date launchDate = Mission.getCurrentDate();
    private String location = "";
    private final Date[] duration = new Date[2];
    private String status = "";

    private static String dateFormat(Date input) {
    String pattern = "yyyy-MM-dd 'at' HH:mm:ss z";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date;
        date = simpleDateFormat.format(new Date());
        return date;
    }
    private static Date getCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date;
        date = new Date(System.currentTimeMillis());
        return date;
    }

    //accessors
    private int getMissionId(){
        return missionId;
    }

    private String getName(){
        return name;
    }

    private String getDescription(){
        return description;
    }

    private String getCountryOfOrigin(){
        return countryOfOrigin;
    }

    private String getCountriesAllowed(){
        return countriesAllowed;
    }

    private String getCoordinatorInfo(){
        return coordinatorInfo;
    }

    private ArrayList<String> getJobInfo(){
        return getJobInfo();
    }

    private String getEmploymentRequirements(){
        return employmentRequirements;
    }

    private String getCargoRequirements(){
        return cargoRequirements;
    }

    private String getLaunchDate(){
        return dateFormat(launchDate);
    }

    private String getLocation(){
        return location;
    }

    private String getDuration(){
        String startDate = dateFormat(duration[0]);
        String finishDate = dateFormat(duration[1]);
        return "Thie mission is from " + startDate + "to " + finishDate;
    }

    private String getStatus(){
        return status;
    }
    //mutators
    private void setMissionId(int missionId){
        this.missionId = missionId;
    }

    private void setName(String name){
        this.name = name;
    }

    private void setDescription(String description){
        this.description = description;
    }

    private void setCountryOfOrigin(String countryOfOrigin){
        this.countryOfOrigin = countryOfOrigin;
    }

    private void setCountriesAllowed(String countriesAllowed){
        this.countriesAllowed = countriesAllowed;
    }

    private void setCoordinatorInfo(String coordinatorInfo){
        this.coordinatorInfo = coordinatorInfo;
    }

    private void setJobInfo(ArrayList<String> jobInfo){
        this.jobInfo = jobInfo;
    }

    private void setEmploymentRequirements(String employmentRequirements){
        this.employmentRequirements = employmentRequirements;
    }

    private void setCargoRequirements(String cargoRequirements){
        this.cargoRequirements = cargoRequirements;
    }

    private void setLaunchDate(Date launchDate){
        this.launchDate = launchDate;
    }

    private void setLocation(String location){
        this.location = location;
    }

    private void setDuration(Date[] duration){
        this.duration[0] = duration[0];
        this.duration[1] = duration[1];
    }

    private void setStatus(String status){
        this.status = status;
    }
}
