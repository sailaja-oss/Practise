public class FamilyDetails {
    private int familyMembers;
    private String fatherName;
    private String surname;

    public FamilyDetails(){
        System.out.println("Default constructor of FamilyMembers is called");
        familyMembers=0;
        fatherName="";
        surname="";
    }


    public FamilyDetails(int familyMembers, String fatherName, String surname) {
        System.out.println("Parameterised constructor of FamilyMembers is called");
        this.familyMembers = familyMembers;
        this.fatherName = fatherName;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return ":- FamilyDetails{" +
                "familyMembers=" + familyMembers +
                ", fatherName='" + fatherName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}



