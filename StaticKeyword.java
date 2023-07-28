public class StaticKeyword {
    public static void main(String args[]){
Student s1=new Student();
s1.SchoolName="jmv";
Student s2=new Student();
System.out.println(s2.SchoolName);//same memory for schoolname for all objects so s1=s2=s3 value
Student s3=new Student();
s1.SchoolName="ABC";
System.out.println(s2.SchoolName);
    }
    
}
class Student{
    String name;
    int roll;
    static String SchoolName;//static variable
    void setName(String name){
        this.name=name;
    }
    String getName(){
return this.name;
    }
    static int returnPercent(int mat,int phy,int che){//static function
        return (mat+phy+che)/3;
    }
}