package Encapsulation;

public class Student {

    private String name;
    private int rollNumber;
    private String email;
    private String address;

    public Student(String name, int rollNumber, String email, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.email = email;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", rollNumber=" + rollNumber + ", email=" + email + ", address=" + address + '}';
    }
}
