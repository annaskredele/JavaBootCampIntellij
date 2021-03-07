package FirstActivity;

public class Employee extends Person {

    //2) In file Employee
    //                2.1 Add different constructors
    //                2.2 Add getters and setters
    //                2.3 Add method for introduce of person ->
    //                "My name is <name> and i am <age> years old
    //                 I am work as <jobTitle> in <company>"

    private String jobTitle;
    private String company;
    //private int salary;

    public Employee(){
        this.jobTitle = "No title";
        this.company = "no company";
    }

    public Employee (String jobTitle, String company){
        this.jobTitle = jobTitle;
        this. company = company;
    }

    public String getJobTitle() { return jobTitle; }
    public String getCompany() { return company; }

    public void setJobTitle(){ return jobTitle;}
    public void setCompany(){ return company;}

    public void introduce(){
        System.out.println("My name is " + firstName() + " "+ lastName() "and i am " +age() "years old." +
                " I work as " + this.jobTitle + " in a company " + this.company + ".");
    }
}