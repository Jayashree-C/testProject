
public class A {

	public void empID(int id) {
		System.out.println(id);

	}
	public void empDetails(String name, int empID) {
		System.out.println("Name and empID is: " +name +" " +empID);

	}
	public static void main(String[] args) {
		A b=new A();
		b.empID(25);
		b.empDetails("Jai", 10);

	}

}
