package lotterie;

public class Person {

    private String name;
    private String address;
    private String phonenumber;
    private int points;

    public Person(String name, String address, String phonenumber, int points) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public String getAddres() {
        return address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public int getPoints() {
        return points;
    }

    public String toString() {
        return this.name + " lives in " + address + " with telephone number " + phonenumber + " has archieved " + points
                + "!";
    }
}
