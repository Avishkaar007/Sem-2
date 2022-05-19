//Practise Set Number 1

public class Student{
    public static void main(String args[]){
        // Name,RollNo,Course,college
        Student stu1 = new Student(args);
        stu1.display();

  }
   
    public void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Roll NO is "+this.rollno);
        System.out.println("Marks Scored : "+this.course);
        System.out.println("College : "+this.college);
    }
    public String name;
    public String course;
    public int rollno;
    public String college;
    public Student(String args[]){
        name=args[0];
        rollno=Integer.parseInt(args[1]);
        course=args[2];
        
        college=args[3];
    }
    
}
