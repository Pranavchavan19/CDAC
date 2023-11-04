//package inheritance;
//
//class person {
//
//    private String name;
//    private Address address;
//
//    public person(String name, Address address) {
//        this.name = name;
//        this.address = address;
//    }
//
//    void PersonDetails() {
//        System.out.println("Person Name " + name);
//        System.out.println("Person Address " + address);
//    }
//}
//
//class Address {
//
//    private int houseNo;
//    private int landMark;
//    private int city;
//    private int state;
//    private int pincode;
//
//    public Address(int houseNo, int landMark, int city, int state, int pincode) {
//        this.houseNo = houseNo;
//        this.landMark = landMark;
//        this.city = city;
//        this.state = state;
//        this.pincode = pincode;
//    }
//
//    @Override
//    public String toString() {
//        return "Address{"+"houseNo"+houseNo +"Landmark"+landMark+"city"+"state"+state+"pincode"+pincode +"}";
//
//    }
//
//}
//
//public class TestAssociation {
//
//    public static void main(String[] args) {
////ddress ad=new Address 
//    }
//
//}
package inheritance;

class Person {

    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void personDetails() {
        System.out.println("Person Name: " + name);
        System.out.println("Person Address: " + address);
    }
}

class Address {

    private int houseNo;
    private int landMark;
    private String city;  // Assuming city is a String
    private String state;  // Assuming state is a String
    private int pincode;

    public Address(int houseNo, int landMark, String city, String state, int pincode) {
        this.houseNo = houseNo;
        this.landMark = landMark;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" + "houseNo=" + houseNo + ", Landmark=" + landMark + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "}";
    }
}

public class TestAssociation {

    public static void main(String[] args) {
        Address address = new Address(123, 456, "CityName", "StateName", 789012);
        Person person = new Person("John Doe", address);

        person.personDetails();
    }
}
