public class StringFun{

	public static void main(String args[]){

		String s = args[0];
		String otherString = args[1];
		String subString = args[2];

	//Here I utilize the String methods 

		System.out.println("The length of " + s +" is " + s.length());
		System.out.println(s+ " = "+otherString +  " is " +s.equals(otherString));
		System.out.println("The first two characters of " + s +" are " + s.substring(0, 2));
		System.out.println(s + " without spaces looks like: " + s.trim());
		System.out.println(subString+"'s index in "+ s + " is " + s.indexOf(subString));
		System.out.println(subString+"'s last occurence-index in "+ s + " is " +s.lastIndexOf(subString));
		System.out.println("The first character of " + s + " is " + s.charAt(0));

	//Here are the two additional String methods that I chose to use 
		//stringVariable.upperCase()-- takes a string and converts it to UPPERCASE 
		//stringVariable.lowerCase()-- takes a STRING and converts it to a lowercase string 

		System.out.println(s + " all uppercased looks like "+ s.toUpperCase());
		System.out.println(s + " all lowercased looks like "+ s.toLowerCase());



		

		

		


	}
}