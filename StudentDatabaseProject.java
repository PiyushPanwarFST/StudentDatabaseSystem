import java.util.HashMap;
import java.util.Scanner;

class Student{
    public String name;
    public int rollNo;
    public int marks;
    public int age;
    public Student (String name, int rollNo,int marks, int age){
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.rollNo = rollNo;
    }


    public void viewStudent(){
        System.out.println("Name"+ name);
        System.out.println("Roll No"+ rollNo);
        System.out.println("Marks"+ marks);
        System.out.println("Age"+ age);
    }
}
public class StudentDatabaseProject {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            HashMap <Integer,Student> map = new HashMap<>();
        while(true){
        System.out.println("1. Add Student");
        System.out.println("2. View Student");
        System.out.println("3. Search Student");
        System.out.println("4. Calculate Average marks");
        System.out.println("5. Exist");
        System.out.println("Enter your choice");
         int choice = sc.nextInt();

        switch (choice) {
        case 1:System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your Roll no");
        int rollNo = sc.nextInt();
        System.out.println("Enter your Marks");
        int marks = sc.nextInt();
        System.out.println("Enter your Age");
        int age = sc.nextInt();

        Student std = new Student(name, rollNo ,age, marks);
        map.put(rollNo, std);

        break;


        case 2: System.out.println("List of student");
        for(Student i: map.values()){
            i.viewStudent();
        }
        break;

        case 3: System.out.println("Enter your rollno.");
        int rollno1 = sc.nextInt();
        if(map.containsKey(rollno1)){
            System.out.println(map.get(rollno1));
        }
        else{
            System.out.println("Student not found");

        }
        break;

        case 4:
        int sum = 0;
        for (Student i: map.values()){
            sum+= i.marks;
        }
        int averageMarks= sum/map.size();
        System.out.println("Average marks "+ averageMarks);
        break;

        case 5:
            System.exit(0);

            }
    
        }
    
    } 
}