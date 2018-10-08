package demoseleniunm;

public class Methods {
	
	

	public static void main(String[] args) {
		int a=10;
//		multiplication(a);
		multiplication(11,12);
		
		}
	
	public static void  multiplication(int number){
		int multi;
		for(int i=1;i<=10;i++){
			multi=i*number;
			System.out.println(multi);
       		}
	}
	public static void  multiplication(int number,int number2){
		int multi;
		for(int i=1;i<=10;i++){
			multi=i*number;
			System.out.println(multi);
       		}
		for(int j=1;j<=10;j++){
			multi=j*number2;
			System.out.println(multi);
       		}
		
		
		
	}

}
