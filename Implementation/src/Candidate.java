import java.util.Date;

public class Candidate {
    private int candidateId;
    private String name;
    private Date dateOfBirth;
    private String address;
    private String nationality;
    private String contact;
    private String identificationNumber;
    private String gender;
    private String[] allergies;
    private String foodPreference;
    private String qualification;
    private String workExperience;
    private String occupation;
    private String[] computerSkill;
    private String[] languageKnown;

    public static void main(String[] args) {
            System.out.println("Testing Git Hub");
    }

    public Candidate (){

    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAllergies(String[] allergies) {
        this.allergies = allergies;
    }

    public String[] getAllergies() {
        return allergies;
    }

    public void setFoodPreference(String foodPreference) {
        this.foodPreference = foodPreference;
    }

    public String getFoodPreference() {
        return foodPreference;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setComputerSkill(String[] computerSkill) {
        this.computerSkill = computerSkill;
    }

    public String[] getComputerSkill() {
        return computerSkill;
    }

    public void setLanguageKnown(String[] languageKnown) {
        this.languageKnown = languageKnown;
    }

    public String[] getLanguageKnown() {
        return languageKnown;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getWorkExperience() {
        return workExperience;
    }
}
