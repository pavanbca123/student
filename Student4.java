package Branch.branch.Demojenkins;

public class Student4 {
        String name;
        int age;
        String dob;
    
        
        void details(String name, int age, String dob) {
            this.name = name;
            this.age = age;
            this.dob = dob;
    
            
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Birthdate: " + dob);
        }
    
        public static void main(String[] args) {
            Student4 s1 = new Student4(); 
            s1.details("Chetan", 22, "27-May-2003");
        }
    }
    

