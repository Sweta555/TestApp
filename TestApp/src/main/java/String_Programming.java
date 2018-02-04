
public class String_Programming {
	static int i;
	 static int j;
	public static void main(String[] args) {
		String_Programming obj = new String_Programming();
		
		// TODO Auto-generated method stub

//		String str = "DOT SAW I WAS TOD";
//		char[] ar = new char[str.length()];
//		int i;
//		int len = str.length();
//		for(i=0; i<ar.length;i++)
//		{
//			
//			ar[i] = str.charAt(len-(i+1));
//			
//		}
//		System.out.print(ar);
//		
//		String rev = new String(ar);
//		System.out.println(rev);
//		
//		if(rev.equals(str)){
//			System.out.println("String is palindrome");
//		}
//		else
//		System.out.println("String is not palindrome");
		
		String str1 = "SWAEETATS";
		System.out.println(str1.length());
		
		char[] ar1 = new char[str1.length()];
		char[] ar2 = new char[str1.length()];
		
		//char[] ch = str1.toCharArray();
		for(i=0;i<str1.length()-1;i++){
			for(j=i+1; j<str1.length();j++)
			{
				if(str1.charAt(i)==str1.charAt(j)){
					System.out.println(str1.charAt(i));
					break;
				}
			}
			
		}
		
		obj.removeWhiteSpaces();
		
//		int len1 = str1.length();
//		System.out.println(len1);
//		
//		for(i=0;i<ar1.length;i++){
//		ar1[i] = str1.charAt(i);
//		ar2[i] = str1.charAt(len1-(i+1));
//		}
//		
//		System.out.println(ar1);
//		System.out.println(ar2);
//		
//		for(i=0;i<ar1.length;i++){
//			
//			if(ar1[i] == ar2[i]){
//				System.out.println("String is palindrome");
//			}
//			//System.out.println("Pass");
			
		}
	
	public void removeWhiteSpaces(){
		int count = 0;
		String str = "OTT SASW DTT IM DTP DTT";
		String str2= "DTT";
		System.out.println(str.indexOf(str2));
		
		char[] ch= str.toCharArray();
		
		for(i=0;i<str.length();i++){
			if(ch[i]== ' '){
				count++;
				//if(ch[i]== ' '){
					//System.out.print(ch[i+1]);	
				//}
			}
			else{
				
				
			}
			
			
		}
		
		System.out.print(count+1);
	}
		
		}
		
		
	
	
	


