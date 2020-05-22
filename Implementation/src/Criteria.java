public class Criteria {
    private int criteriaId;
    private String type;
    private String information;
// comment
    public Criteria() {

    }

    public Criteria(int id, String type, String information) {
        this.criteriaId = id;
        this.type = type;
        this.information = information;
    }

    public static void main(String args[]) {

        // Test creating Criteria1 using constructor
        Criteria criteria1 = new Criteria(1, "Range of Age", "18-70");
        System.out.println("Criteria ID: " + criteria1.getCriteriaId());
        System.out.println("Criteria Type: " + criteria1.getType());
        System.out.println("Criteria Information: " + criteria1.getInformation() + "\n");

        // Test creating Criteria2 using mutator
        Criteria criteria2 = new Criteria();
        criteria2.setCriteriaId(2);
        criteria2.setType("Health Record");
        criteria2.setInformation("Heart Disease, Asthma");
        System.out.println("Criteria ID: " + criteria2.getCriteriaId());
        System.out.println("Criteria Type: " + criteria2.getType());
        System.out.println("Criteria Information: " + criteria2.getInformation());

    }

    public int getCriteriaId() {
        return this.criteriaId;
    }

    public void setCriteriaId(int criteriaId) {
        this.criteriaId = criteriaId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInformation() {
        return this.information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}