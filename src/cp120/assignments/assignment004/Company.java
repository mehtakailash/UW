package cp120.assignments.assignment004;

public class Company {
    private String compName;
    private String compStreetAddress;
    private String compCity;
    private String compCounty;
    private String compState;
    private String compZipcode;
    private String compPhoneNo;
    private String compWebsite;

    Company(String compName, String compStreetAddress, String compCity, String compCounty, String compState, String compZipcode, String compPhoneNo, String compWebsite){
        this.compName=compName;
        this.compCity=compCity;
        this.compStreetAddress=compStreetAddress;
        this.compCounty=compCounty;
        this.compState=compState;
        this.compZipcode=compZipcode;
        this.compPhoneNo=compPhoneNo;
        this.compWebsite=compWebsite;
    }
    public String getCompName() {
        return compName;
    }
    public String getCompStreetAddress() {
        return compStreetAddress;
    }
    public String getCompCitys() {
        return compCity;
    }
    public String getCompCounty() {
        return compCounty;
    }
    public String getCompState() {
        return compState;
    }
    public String getCompZipcode() {
        return compZipcode;
    }
    public String getCompPhoneNo() {
        return compPhoneNo;
    }
    public String getCompWebsite() {
        return compWebsite;
    }
}