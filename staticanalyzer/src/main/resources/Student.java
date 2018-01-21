import java.io.Serializable;

public class Student implements Serializable {

    private String firstName;
    private String secondName;
    private String lastName;
    private int age;
    private int height;
    private transient int edition = 1;


    public Student(String firstName, String secondName, String lastName, int age, int height, int edition) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Student{Name: " + firstName + ", SecondName: " + secondName + ", LastName: " + lastName + ", Age: " + age + ", Height: " + height + ", Edition: " + edition;
    }


}