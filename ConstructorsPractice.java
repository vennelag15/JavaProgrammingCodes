public class ConstructorsPractice {
        public static void main(String args[])
        {
    Student s1=new Student();
    Student s2=new Student("Vennela");
    Student s3=new Student(123);
    //gives error-because no constructor like this is defined -Student s4=new Student("Venne",1234);
    }}
    class Student
    {String name;
        int rollno;
        Student()//non parameterized constructor
        {System.out.println("Constructor is called");}
        Student(String name)//parameterized constructor//constructor overloading-polymorphism
        {this.name=name;}
        Student(int rollno)//parameterized constructor
        {this.rollno=rollno;}
    }
    
