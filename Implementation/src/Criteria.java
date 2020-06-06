// Author: @Team 32

public class Criteria {
    private String type;
    private String information;

    public Criteria() {

    }

    public Criteria(String type, String information) {
        this.type = type;
        this.information = information;
    }

    public static void main(String args[]) {

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