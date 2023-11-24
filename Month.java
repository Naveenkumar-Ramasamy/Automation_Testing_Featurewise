package org.com;

public class Month {
	public static void main(String[] args) {
		int Days=4;
		switch (Days) {
		case 1:
			System.out.println("monday");
			
			break;case 2:
				System.out.println("tuesday");
				
				break;case 3:
					System.out.println("wenseday");
					
					break;case 4:
						System.out.println("thursday");
						
		// without using break statement
						// days is 8 default valve is printed
						case 5:
							System.out.println("friday");
							
							break;case 6:
								System.out.println("sarutaday");
								
								break;case 7:
									System.out.println("sunday");
									
									
										break;

		default:
			System.out.println("no day found");
			break;
		}
	}

}
