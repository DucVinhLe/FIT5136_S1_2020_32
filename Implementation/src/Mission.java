import java.util.ArrayList;

public class Mission {
    private int missionId;
    private String name;
    private String description;
    private String countryOfOrigin;
    private String countriesAllowed;
    private String coordinatorInfo;
    private ArrayList<String> jobInfo;
    private String employmentRequirements;
    private String cargoRequirements;
    private String launchDate;
    private String location;
    private String duration;
    private String status;

    public Mission() {

    }

    public static void main(String[] args){

    }

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
        return jobInfo;
    }

    private String getEmploymentRequirements(){
        return employmentRequirements;
    }

    private String getCargoRequirements(){
        return cargoRequirements;
    }

    private String getLaunchDate(){
        return launchDate;
    }

    private String getLocation(){
        return location;
    }

    private String getDuration(){
        return duration;
    }

    private String getStatus(){
        return status;
    }

    private void setMissionId(int id){
        this.missionId = id;
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

    private void setLaunchDate(String date){
        this.launchDate = date;
    }

    private void setLocation(String location){
        this.location = location;
    }

    private void setDuration(String duration){
        this.duration = duration;
    }

    private void setStatus(String status){
        this.status = status;
    }

}
