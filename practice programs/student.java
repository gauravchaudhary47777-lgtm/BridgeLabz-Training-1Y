public class Student {

    static void displayDetails(int id, String name, int age) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        int id = 101;
        String name = "Gaurav";
        int age = 19;

        displayDetails(id, name, age);
    }
}
