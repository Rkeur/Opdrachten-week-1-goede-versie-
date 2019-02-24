package letters;

public class letteraantal {
	
		   public static void main(String[] args) {
			   String org = "Deze regel heeft best wel veel eees.";
			 
			  int a =(org.length());
			   
			  org = org.replace("e", ""); {
				   
		      System.out.println(a - org.length()+ " Letters");
		       
		   }
		}
}
