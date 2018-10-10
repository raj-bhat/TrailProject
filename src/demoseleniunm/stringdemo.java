package demoseleniunm;

public class stringdemo {

	public static void main(String[] args) {
		String name="Rajashekhara Bhata";
		boolean Status=name.startsWith("Raj");
		boolean Status1=name.endsWith("Raj");
		
		boolean test=name.equalsIgnoreCase("rajashekhara bhata");
		
		System.out.println(Status);
		System.out.println(Status1);
		System.out.println(test);
	}

}
