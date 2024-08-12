// import javax.lang.model.element.Name;

class Student {
    int Roll;
    String Name;

    @Override
    public String toString() {
        // return "Example Output";
        return "Roll Number of Student is " + Roll + " and name is " + Name;
    }

    @Override
    public boolean equals(Object obj) {
        Student obj1 = (Student) obj;
        if (this.Roll == obj1.Roll && this.Name.equals(obj1.Name))
            return true;
        else
            return false;
    }
}

public class p40_obj_class {
    // public static void main(String[] args) {
    // Student s1 = new Student();
    // Student s2 = new Student();
    // s1.Roll = 123;
    // s1.Name = "Neeraj";
    // System.out.println(s1); // same as s1.toString();
    // System.out.println(s2);
    // System.out.println(s1.equals(s2));

    ///////

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.Roll = 123;
        s1.Name = "Neeraj";

        // s2.Roll = 123;
        // s2.Name = "Neeraj"; // true

        ///////

        s2.Roll = 124;
        s2.Name = "Neeraj";
        System.out.println(s1.equals(s2)); // still false
    }
}
