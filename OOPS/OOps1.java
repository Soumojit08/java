package OOPS;

public class OOps1 {

    //Create a new data type with different properties
    public static class Student{
        String name;
        int rno;
        double percent;
    }

    public static void fun(Student s){
        System.out.println(s.name);
    }

    public static void main(String[] args) {
        Student x = new Student(); //Create object to store data
        x.name = "Soumojit";
        x.rno = 44;
        x.percent = 100.0;

        fun(x);
    }
}
