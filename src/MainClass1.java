public class MainClass1 {
    public static void main(String[] args) {


        System.out.println("\n\n*********************  e2 ************************");
        Employee e2 = new Employee(101, "Peter", 10000, new FamilyDetails(4, "Mark", "Anthony"), new Adress("Maharashtra", "Pune", "ABC", "TEMP-10002", 411011));
        System.out.println(e2);
        System.out.println("\n\n*********************  e3 ************************");
        Employee e3 = new Employee(102, "ABC", 20000, 4, "XYZ", "PQR", "Maharashtra", "Mumbai", "Bandra", "A-2002", 311023);
        e3.addNewAddress("TEMP STATE", "TEMP CITY", "TEMP AREA", "TEMP BUILD", 0000);
        System.out.println(e3);
    }
}