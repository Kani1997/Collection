import java.util.Scanner;
import java.util.*;

public class Employee {
	private int empno;
	private String ename;
	private int salary;
	private String eemail;

	Employee(int empno,String ename,int salary,String eemail){
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
		this.eemail=eemail;
		}
public int getEmpno() {
	return empno;
	
}
public int getSalary() {
	return salary;
}
public String getEname() {
	return ename;
}
public String geteemail() {
	return eemail;
	
}
public String toString() {
	return empno+" "+ename+" "+salary+""+eemail;
}
}
class CRUDDemo{
	public static void main(String args[]) {
		//Collection<Employee> c=new ArrayList<Employee>();
		List<Employee> c=new ArrayList<Employee>();
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		
		
		int ch;
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("ENTER YOUR CHOOICE:\n");
			ch=s.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter Empno: \n");
				int eno=s.nextInt();
				System.out.println("Enter Ename: \n");
				String ename=s1.nextLine();
				System.out.println("Enter salary: \n");
				int salary=s.nextInt();
				System.out.println("Enter EmailId: \n");
				String eemail=s1.nextLine();
			
				
				c.add(new Employee(eno,ename,salary,eemail)); // object to getting the collection
				break;
			case 2:
				//System.out.println(c); // printing the collections
				System.out.println("---------------------------------------------");
				
				Iterator<Employee> i=c.iterator();
				while(i.hasNext()) {
					Employee e=i.next();
					System.out.println(e);
				}
				System.out.println("-----------------------------------------------");
				break;
				
			case 3:
			boolean found=false;
			System.out.println("Enter employee Number to search:");
			int empno=s.nextInt();
			System.out.println("---------------------------------");
			i=c.iterator();
			while(i.hasNext()) {
				Employee e=i.next();
				if(e.getEmpno()== empno) {
					System.out.println(e);
					found=true;
					
				}
			}
			if(!found) {
				System.out.println("Record is not found");
			}
			System.out.println("----------------------------------");
			
			break;
			case 4:
			found=false;
			System.out.println("Enter employee Number to Delete:");
			empno =s.nextInt();
			System.out.println("---------------------------------");
			i=c.iterator();
			while(i.hasNext()) {
				Employee e=i.next();
				if(e.getEmpno()== empno) {
					i.remove();		// removing the particular element			
					found=true;
		}
			}
			if(!found) {
				System.out.println("Record is not Found \n");
			}else {
				System.out.println("Record is delted Succefully......! \n");
			}
			System.out.println("-----------------------------------------");
			break;
			case 5:
				found=false;
				System.out.println("Enter employee Number to Update:");
				empno =s.nextInt();
				System.out.println("---------------------------------");
				ListIterator<Employee>li=c.listIterator();
				
				while(li.hasNext()) {
					Employee e=li.next();
					if(e.getEmpno()== empno) {
						System.out.println("Enter the new Name:\n");	
						ename =s1.nextLine();
						System.out.println("Enter the new Salary:\n");
						salary =s.nextInt();
						System.out.println("Enter The EmailId:\n");
						eemail=s.nextLine();
						li.set(new Employee(empno,ename,salary,eemail));
						
						found=true;
			}
				}
				if(!found) {
					System.out.println("Record is not Found \n");
				}else {
					System.out.println("Record is Updated  Succefully......! \n");
				}
				System.out.println("-----------------------------------------");
				break;
			}
		}while(ch!=0);
	
		}
	}
