/*A university called “CTU” preserves a database of all its members. Now, this database is

categorized into numerous classes whose relations (hierarchical) are something like-
AcademicStaff (empID, empName)

Faculty (courseName, noofPublications) is a AcademicStaff
Dean (grade (Assistant/Associate/Full grade Dean)) is a AcademicStaff
OfficeAssistant (empLeaveRecord, typingSpeed) is a AcademicStaff
FulltimeOfficeAssistant (renumeration) is a OfficeAssistant
ContractualOfficeAssistant (perDayWages) is a OfficeAssistant
Generate all the related classes and the corresponding getters and setters and the other
methods associated with the classes. Subsequently, retrieve individual data when
required. You can create constructors (as per your requirements). Write a driver class to
test all the classes.*/

class AcademicStaff{
    private String empID;
    private String empName;
    
    public void setEmpID(String empID){
        this.empID = empID;
    }
    
    public String getEmpID(){
        return this.empID;
    }
    
    public void setEmpName(String empName){
        this.empName = empName;
    }
    
    public String getEmpName(){
        return this.empName;
    }
    
    public AcademicStaff(String empID, String empName){
        setEmpID(empID);
        setEmpName(empName);
    }
    
    public void viewAcademicDetails(){
        System.out.println(getEmpID());
        System.out.println(getEmpName());
    }
}

class Faculty extends AcademicStaff{
    private String courseName;
    private int noofPublications;
    
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    
    public void setNoofPublications(int noofPublications){
        this.noofPublications = noofPublications;
    }
    
    public int getNoofPublications(){
        return this.noofPublications;
    }
    
    public Faculty(String courseName, int noofPublications, String empID, String empName){
        super(empID, empName);
        setCourseName(courseName);
        setNoofPublications(noofPublications);
    }
    
    public void displayFaculty(){
        super.viewAcademicDetails();
        System.out.println(getCourseName());
        System.out.println(getNoofPublications());
    }
}

class Dean extends AcademicStaff{
    private String grade;
    public void setGrade(String grade){
        this.grade = grade;
    }
    
    public String getGrade(){
        return this.grade;
    }
    
    public Dean(String grade, String empID, String empName){
        super(empID, empName);
        setGrade(grade);
    }
    
    public void displayDean(){
        super.viewAcademicDetails();
        System.out.println(getGrade());
    }
}

class OfficeAssistant extends AcademicStaff{
    private int empLeaveRecord;
    private double typingSpeed;
    
    public void setEmpLeaveRecord(int empLeaveRecord){
        this.empLeaveRecord = empLeaveRecord;
    }
    
    public int getEmpLeaveRecord(){
        return this.empLeaveRecord;
    }
    
    public void setTypingSpeed(double typingSpeed){
        this.typingSpeed = typingSpeed;
    }
    
    public double getTypingSpeed(){
        return this.typingSpeed;
    }
    
    public OfficeAssistant(int empLeaveRecord, double typingSpeed, String empID, String empName){
        super(empID, empName);
        setEmpLeaveRecord(empLeaveRecord);
        setTypingSpeed(typingSpeed);
    }
    
    public void displayOfficeAssistant(){
        super.viewAcademicDetails();
        System.out.println(getEmpLeaveRecord());
        System.out.println(getTypingSpeed());
    }
}

class FullTimeOfficeAssistant extends OfficeAssistant{
    private double renumeration;
    
    public void setRenumeration(double renumeration){
        this.renumeration = renumeration;
    }
    
    public double getRenumeration(){
        return this.renumeration;
    }
    
    public FullTimeOfficeAssistant(double renumeration, int empLeaveRecord, double typingSpeed, String empID, String empName){
        super(empLeaveRecord, typingSpeed,empID, empName);
        setRenumeration(renumeration);
    }
    
    public void displayFullTimeOfficeAssistant(){
        super.displayOfficeAssistant();
        System.out.println(getRenumeration());
    }
}

class ContractualOfficeAssistant extends OfficeAssistant{
    private double perDayWages;
    
    public void setPerDayWages(double perDayWages){
        this.perDayWages = perDayWages;
    }
    
    public double getPerDayWages(){
        return this.perDayWages;
    }
    
    public ContractualOfficeAssistant(double perDayWages, int empLeaveRecord, double typingSpeed, String empID, String empName){
        super(empLeaveRecord, typingSpeed,empID, empName);
        setPerDayWages(perDayWages);
    }
    
    public void displayContractualOfficeAssistant(){
        super.displayOfficeAssistant();
        System.out.println(getPerDayWages());
    }
}

public class TestDriver{
    public static void main(String[] args){
        ContractualOfficeAssistant fac = new ContractualOfficeAssistant( 100 ,5, 10, "23ucs***", "name");
        fac.displayContractualOfficeAssistant();
    }
}
