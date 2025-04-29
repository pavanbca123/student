package Branch.branch.Demojenkins;

public class Student4 {
    String name;
    int age;
    String dob;

    void details(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;

        // Print instance variables instead of the method parameters
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Birthdate: " + this.dob);
    }

    public static void main(String[] args) {
        Student4 s1 = new Student4(); 
        s1.details("Chetan", 22, "27-May-2003");
    }
}
