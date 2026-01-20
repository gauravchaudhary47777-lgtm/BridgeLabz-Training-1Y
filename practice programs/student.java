public class Student {
    static void displayDetails(int id, String name, int age, String status) {  
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        int id = 101;
        String name = "Gaurav";
        int age = 19;
        String status = "Active";

        displayDetails(id, name, age, status);  
    }
}
