import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 class Employee
{
    //Properties Declaration
    
    private String empname;
    private int empid;
    
    public Employee(int empid, String empname)
    {
        this.empid = empid;
        this.empname = empname;
    }
    
    public String getEmpname()
    {
        return empname;
    }
    
    public void setEmpname(String empname)
    {
        this.empname = empname;
    }
    
    public int getEmpid() {
        return empid;
    }
    
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    
    public static Comparator<Employee> getStuNameComparator() {
        return EmpNameComparator;
    }
    public static void setStuNameComparator(Comparator<Employee> empNameComparator) {
        EmpNameComparator = empNameComparator;
    }
    public static Comparator<Employee> getStuRollno() {
        return EmpID;
    }
    public static void setStuRollno(Comparator<Employee> empId) {
        EmpID = empId;
    }
    
    public static Comparator<Employee> EmpNameComparator = new Comparator<Employee>() {
    
    public int compare(Employee s1, Employee s2) {
    String StudentName1 = s1.getEmpname().toUpperCase();
    String StudentName2 = s2.getEmpname().toUpperCase();
    
    //ascending order
    return StudentName1.compareTo(StudentName2);
    
    //descending order
    //return StudentName2.compareTo(StudentName1);
}};

/*Comparator for sorting the list by roll no*/
public static Comparator<Employee> EmpID = new Comparator<Employee>() {

public int compare(Employee s1, Employee s2) {

int rollno1 = s1.getEmpid();
int rollno2 = s2.getEmpid();

/*For ascending order*/
return rollno1-rollno2;

/*For descending order*/
//rollno2-rollno1;
}};
@Override
public String toString() {
return "[ rollno=" + empid + ", name=" + empname + "]";
}

public static class Details  {
    
    public static void main(String args[]){
        ArrayList<Employee> arraylist = new ArrayList<Employee>();
        arraylist.add(new Employee(4304, "Abhishek"));
        arraylist.add(new Employee(4306, "Satyam"));
        arraylist.add(new Employee(4305, "Abhay"));
        
        /*Sorting based on empNameName*/
        System.out.println("empName Sorting:");
        Collections.sort(arraylist, Employee.EmpNameComparator);
        
        for(Employee str: arraylist){
            System.out.println(str);
        }
        
        /* Sorting on empId property*/
        System.out.println("empid Sorting:");
        Collections.sort(arraylist, Employee.EmpID);
        for(Employee str: arraylist){
            System.out.println(str);
        }
    }
}
}
