package ch02.test01;

public class Cout {

	    String con;
	    double see;
		
		public Cout() {}

		public Cout(String con, double see) {
			this.con = con;
			this.see = see;
		}
		
		double getCout() {
			return see;
		}
		public void Action(double shot) {
			see += shot ;
		}
		public void Assist(double can) {
			see -= can ;
		}
		





        public static void main (String[]agrs) {

        	Cout a1= new Cout("한경민" , 100000) ;
        	
        	a1.Action(10000);
        	a1.Assist(20020);
        	
        	System.out.println(a1.getCout());
        	

        
        
}
        }