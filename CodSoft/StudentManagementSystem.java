import java.util.Scanner;
import java.io.FileWriter;

public class StudentManagementSystem {

    Scanner sc = new Scanner(System.in);

    // Student class inside same file
    class Student {

        int rollNo;
        String name;
        String grade;

        Student(int r,String n,String g){
            rollNo = r;
            name = n;
            grade = g;
        }

        void display(){
            System.out.println("Roll Number : " + rollNo);
            System.out.println("Name        : " + name);
            System.out.println("Grade       : " + grade);
            System.out.println("---------------------");
        }

    }

    Student students[] = new Student[100];
    int count = 0;


    void addStudent(){

        if(count==100){
            System.out.println("Storage Full");
            return;
        }

        System.out.print("Enter Roll Number: ");
        int roll=sc.nextInt();
        sc.nextLine();

        // Duplicate roll check
        for(int i=0;i<count;i++){
            if(students[i].rollNo==roll){
                System.out.println("Roll Number Already Exists");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name=sc.nextLine();

        if(name.equals("")){
            System.out.println("Name cannot be empty");
            return;
        }

        System.out.print("Enter Grade: ");
        String grade=sc.nextLine();

        students[count]=new Student(roll,name,grade);

        count++;

        System.out.println("Student Added Successfully");
    }



    void removeStudent(){

        System.out.print("Enter Roll Number to Remove: ");
        int roll=sc.nextInt();

        for(int i=0;i<count;i++){

            if(students[i].rollNo==roll){

                for(int j=i;j<count-1;j++){
                    students[j]=students[j+1];
                }

                count--;

                System.out.println("Student Removed");
                return;
            }

        }

        System.out.println("Student Not Found");
    }



    void searchStudent(){

        System.out.print("Enter Roll Number: ");
        int roll=sc.nextInt();

        for(int i=0;i<count;i++){

            if(students[i].rollNo==roll){
                students[i].display();
                return;
            }

        }

        System.out.println("Student Not Found");
    }



    void displayStudents(){

        if(count==0){
            System.out.println("No Students Available");
            return;
        }

        for(int i=0;i<count;i++){
            students[i].display();
        }

    }



    void editStudent(){

        System.out.print("Enter Roll Number to Edit: ");
        int roll=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<count;i++){

            if(students[i].rollNo==roll){

                System.out.print("Enter New Name: ");
                students[i].name=sc.nextLine();

                System.out.print("Enter New Grade: ");
                students[i].grade=sc.nextLine();

                System.out.println("Student Updated Successfully");
                return;
            }

        }

        System.out.println("Student Not Found");
    }



    void saveToFile(){

        try{

            FileWriter fw = new FileWriter("students.txt");

            for(int i=0;i<count;i++){

                fw.write(
                    students[i].rollNo + " " +
                    students[i].name + " " +
                    students[i].grade + "\n"
                );

            }

            fw.close();

            System.out.println("Data Saved Successfully");

        }

        catch(Exception e){
            System.out.println("Error Saving File");
        }

    }



    public static void main(String args[]) {

        StudentManagementSystem obj =
                new StudentManagementSystem();

        int choice;

        do{

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1 Add Student");
            System.out.println("2 Remove Student");
            System.out.println("3 Search Student");
            System.out.println("4 Display All Students");
            System.out.println("5 Edit Student");
            System.out.println("6 Save To File");
            System.out.println("7 Exit");

            System.out.print("Enter Choice: ");
            choice=obj.sc.nextInt();

            if(choice==1)
                obj.addStudent();

            else if(choice==2)
                obj.removeStudent();

            else if(choice==3)
                obj.searchStudent();

            else if(choice==4)
                obj.displayStudents();

            else if(choice==5)
                obj.editStudent();

            else if(choice==6)
                obj.saveToFile();

        }

        while(choice!=7);

        System.out.println("Program Ended");

    }

}
