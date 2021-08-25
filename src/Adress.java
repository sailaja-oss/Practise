public class Adress {
    private String state;
    private String city;
    private String area;
    private String buildingWithFlatNo;
    private long pinCode;

    public Adress(){
        System.out.println("Default constructor of Address is called");
        state="";
        city="";
        area="";
        buildingWithFlatNo="";
        pinCode=0;
    }

    public Adress(String state, String city, String area, String buildingWithFlatNo, long pinCode) {
        System.out.println("Parameterised constructor of Address is called");
        this.state = state;
        this.city = city;
        this.area = area;
        this.buildingWithFlatNo = buildingWithFlatNo;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "\nAddress{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", buildingWithFlatNo='" + buildingWithFlatNo + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}


