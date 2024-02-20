package assignmentR;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// W.A.J.P to compare a given string to the specified character sequence. Comparing 
		//topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false 
		
		String str="topsint.com";
		String str2="topsint.com";
		
		boolean result=str.equals(str2);
		System.out.println(result);
		
		String st="Topsint.com";
		String st1="topsint.com";
		
		boolean ans=st.equals(st1);
		System.out.println(ans);
		

	}

}
