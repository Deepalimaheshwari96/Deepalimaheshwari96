package arrayProgram;

public class Program10 {

	public static void main(String[] args) {
		String temp;
		String []arr = {"YashTechnologies","Wipro","IBM","Infosys","TCS","Accenture","Cognizant","TechMahindra"};
		
		for (int i = 0; i < arr.length; i++) {
			String str1 = arr[i];
			int length1 = str1.length();
			
			for (int j = i+1; j < arr.length; j++) {
				String str2 = arr[j];
				int length2 = str2.length();
				
				if(length1 > length2) {
					temp = arr[j];
					arr[i] = arr[j];
					temp = arr[i];
				}
		
			}
			System.out.println("I "+arr[i]);
		}
	
	}

}
