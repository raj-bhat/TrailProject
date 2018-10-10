package demoseleniunm;

public class stringdemo {

	public static void main(String[] args) {
		String name="Raashekhara Bhata";
		boolean Status=name.startsWith("Raj");
		boolean Status1=name.endsWith("Raj");
		System.out.println("chat at " +name.charAt(0));
		
		boolean test=name.equalsIgnoreCase("rajashekhara bhata");
		
		String []toolname=name.split(" ");
	
		for (int i=0;i<toolname.length;i++){
			System.out.println(toolname[i]);
			
			if(toolname[i].equalsIgnoreCase("Rajashekhara")){
				System.out.println("match found");
				break;
			}
			
		}
	
		
		System.out.println(Status);
		System.out.println(Status1);
		System.out.println(test);
	}

}
