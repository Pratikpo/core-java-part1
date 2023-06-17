package entities;

public class Address {
    String FlatNum;
    String lineNum;
    String taluka;
    String district;
    String State;

    public Address() {
    }

    public String getFlatNum() {
        return FlatNum;
    }

    public void setFlatNum(String flatNum) {
        this.FlatNum = flatNum;
    }

    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public String getTaluka() {
        return taluka;
    }

    public void setTaluka(String taluka) {
        this.taluka = taluka;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "FlatNum='" + FlatNum + '\'' +
                ", lineNum='" + lineNum + '\'' +
                ", taluka='" + taluka + '\'' +
                ", district='" + district + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
