public class Mission {

    private String name;
    private String description;
    private String countryOfOrigin;
    private String countriesAllowed;
    private String status;
    private String launchDate;
    private String location;
    private String duration;
    private String jobInfo;
    private String employmentRequirements;
    private String cargoRequirements;
    private String coordinatorInfo;

    public Mission() {

    }

    public static void main(String[] args){

    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getCountryOfOrigin(){
        return countryOfOrigin;
    }

    public String getCountriesAllowed(){
        return countriesAllowed;
    }

    public String getCoordinatorInfo(){
        return coordinatorInfo;
    }

    public String getJobInfo(){
        return jobInfo;
    }

    public String getEmploymentRequirements(){
        return employmentRequirements;
    }

    public String getCargoRequirements(){
        return cargoRequirements;
    }

    public String getLaunchDate(){
        return launchDate;
    }

    public String getLocation(){
        return location;
    }

    public String getDuration(){
        return duration;
    }

    public String getStatus(){
        return status;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCountryOfOrigin(String countryOfOrigin){
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setCountriesAllowed(String countriesAllowed){
        this.countriesAllowed = countriesAllowed;
    }

    public void setCoordinatorInfo(String coordinatorInfo){
        this.coordinatorInfo = coordinatorInfo;
    }

    public void setJobInfo(String jobInfo){
        this.jobInfo = jobInfo;
    }

    public void setEmploymentRequirements(String employmentRequirements){
        this.employmentRequirements = employmentRequirements;
    }

    public void setCargoRequirements(String cargoRequirements){
        this.cargoRequirements = cargoRequirements;
    }

    public void setLaunchDate(String date){
        this.launchDate = date;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setDuration(String duration){
        this.duration = duration;
    }

    public void setStatus(String status){
        this.status = status;
    }

}
