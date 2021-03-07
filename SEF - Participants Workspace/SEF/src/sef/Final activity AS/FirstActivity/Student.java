package FirstActivity;

public class Student extends Person {

    //in file Students
    //                3.1 Create file students from scratch
    //                3.2 Add method for introduce of person ->
    //                      "I am study in university <schoolName>"

    private String schoolName;

    public Student(){
        this.schoolName = "No title";
    }

    public Student (String schoolName){
        this.schoolName = schoolName;
    }

    public String getSchoolName() { return schoolName; }

    public void setSchoolName(){ return schoolName;}

    public void introduce(){
        System.out.println("My name is " + firstName() + " "+ lastName() "and i am " +age() "years old." +
                " I study in university" + this.schoolName + ".");
    }
}