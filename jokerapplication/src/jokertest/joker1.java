package jokertest;
import java.util.*;

public class joker1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random dice = new Random();
		int number145[] = new int[6];
		int number120[] = new int[2];
		
		// for 1-45 numbers;
		int k = 1;
		int v = 1;
		int numput;
		do {
			try {
		System.out.println("Will you insert numbers between 1-45 ?");
		System.out.println("NOTE : Accepted input is true or false.");
		boolean insert1 = input.nextBoolean();
			if (insert1 == true) {
				
				do{
					System.out.println("How many numbers will you put : ");
					numput = input.nextInt();
					if (numput>0 && numput<6) {
						v = 2;
					} else {
						v = 1;
					}
				}while(v==1);
					
				v = 1;
					switch (numput) {
					case 1:
					do{
						System.out.println("Insert one number between 1-45 ");
						number145[numput-1] = input.nextInt();
						if (number145[numput-1]>=1 && number145[numput-1]<=45) {
							
							
							for(int counter=1; counter<5;counter++) {
								do {
									number145[counter] = 1+dice.nextInt(45);
									if (number145[numput-1] != number145[counter]) {
										v = 2;
									} else {
										v = 1; 
									}
								}while(v==1);
							}
							
							
						} else {
							v = 1; 
						}
					}while(v==1);
					break; 
					case 2:
					do{
						System.out.println("Insert two number between 1-45 ");
						number145[numput-2] = input.nextInt();
						number145[numput-1] = input.nextInt();
						if (number145[numput-2] != number145[numput-1]) {
							if ((number145[numput-1]>=1 && number145[numput-1]<=45) && (number145[numput-2]>=1 && number145[numput-2]<=45)) {
							
							
							for(int counter=2; counter<5;counter++) {
								do {
									number145[counter] = 1+dice.nextInt(45);
									if ((number145[numput-1] != number145[counter]) && (number145[numput-2] != number145[counter])) {
										v = 2;
									} else {
										v = 1; 
									}
								}while(v==1);
							}
							
							
							}else {v = 1;}
						}else {
							System.out.println("You entered equal numbers!!!");
							v = 1; 
						}
					}while(v==1);
					break; 
					case 3:
					do{
						System.out.println("Insert three number between 1-45 ");
						number145[numput-3] = input.nextInt();
						number145[numput-2] = input.nextInt();
						number145[numput-1] = input.nextInt();
						if ((number145[numput-1] != number145[numput-2]) && (number145[numput-1] != number145[numput-3]) 
								&& (number145[numput-2] != number145[numput-3])) {
							if ((number145[numput-1]>=1 && number145[numput-1]<=45) 
									&& (number145[numput-2]>=1 && number145[numput-2]<=45) 
									&& (number145[numput-3]>=1 && number145[numput-3]<=45)) {
								
								
								for(int counter=3; counter<5;counter++) {
									do {
										number145[counter] = 1+dice.nextInt(45);
										if ((number145[numput-1] != number145[counter]) && (number145[numput-2] != number145[counter]) && (number145[numput-3] != number145[counter])) {
											v = 2;
										} else {
											v = 1; 
										}
									}while(v==1);
								}
								
								
							} else {v = 1;}
						}else {
							System.out.println("You entered equal numbers!!!");
							v = 1; 
						}
					}while(v==1);
					break; 
					case 4:
					do{
						System.out.println("Insert four number between 1-45 ");
						number145[numput-4] = input.nextInt();
						number145[numput-3] = input.nextInt();
						number145[numput-2] = input.nextInt();
						number145[numput-1] = input.nextInt();
						if ((number145[numput-1] != number145[numput-2]) && (number145[numput-1] != number145[numput-3]) && (number145[numput-1] != number145[numput-4]) 
								&& (number145[numput-2] != number145[numput-3]) && (number145[numput-2] != number145[numput-4]) 
								&& (number145[numput-3] != number145[numput-4])) {
							if ((number145[numput-1]>=1 && number145[numput-1]<=45) 
									&& (number145[numput-2]>=1 && number145[numput-2]<=45) 
									&& (number145[numput-3]>=1 && number145[numput-3]<=45)
									&& (number145[numput-4]>=1 && number145[numput-4]<=45)) {
								
								
								for(int counter=4; counter<5;counter++) {
									do {
										number145[counter] = 1+dice.nextInt(45);
										if ((number145[numput-1] != number145[counter]) && (number145[numput-2] != number145[counter]) && (number145[numput-3] != number145[counter])) {
											v = 2;
										} else {
											v = 1; 
										}
									}while(v==1);
								}
								
								
							} else {v = 1;}
						}else {
							System.out.println("You entered equal numbers!!!");
							v = 1; 
						}
					}while(v==1);
					break;
					case 5:
					do{
						System.out.println("Insert five number between 1-45 ");
						number145[numput-5] = input.nextInt();
						number145[numput-4] = input.nextInt();
						number145[numput-3] = input.nextInt();
						number145[numput-2] = input.nextInt();
						number145[numput-1] = input.nextInt();
						if ((number145[numput-1] != number145[numput-2]) && (number145[numput-1] != number145[numput-3]) && (number145[numput-1] != number145[numput-4]) && (number145[numput-1] != number145[numput-5])
								&& (number145[numput-2] != number145[numput-3]) && (number145[numput-2] != number145[numput-4]) && (number145[numput-2] != number145[numput-5])
								&& (number145[numput-3] != number145[numput-4]) && (number145[numput-3] != number145[numput-5]) 
								&& (number145[numput-4] != number145[numput-5])) {
							v = 2;
						}else {
							System.out.println("You entered equal numbers!!!");
							v = 1; 
						}
					}while(v==1);
					break;
					}
			}else if(insert1 == false) {
				for(int counter=0; counter<5;counter++) {
					number145[counter] = 1+dice.nextInt(45);
				}
			}
		k = 2;
		   }catch (Exception e) { 
				System.out.println("You inserted an invalid value. Valid inserts are true either false.");  
				input.next();
			}
		}while(k==1);
		
		///for 1-20 numbers
		k=1;
		do {
			try {
				System.out.println("Will you insert the joker number between 1-20 ?");
				System.out.println("NOTE : Accepted input is true or false.");
				boolean insert2 = input.nextBoolean();
					if(insert2 == true) {
						do{
							System.out.println("Enter the number between 1-20:");
							number120[0] = input.nextInt();
							if (number120[0]>0 && number120[0]<21) {
								v = 2;
							} else {
								v = 1;
							}
						}while(v==1);
					}else if(insert2 == false) {
						number120[0] = 1+dice.nextInt(20);
					}
				k = 2;
			}catch(Exception e) {
				System.out.println("You inserted an invalid value. Valid inserts are true either false.");  
				input.next();
			}
		}while(k==1);
		 
		System.out.println("the five numbers are: ");
		display(number145);
		System.out.println();
		
		System.out.println("the joker number is: ");
		display(number120);
		
	input.close();
	}
	public static void display(int x[]) {
		for(int row=0;row<(x.length-1);row++) {
			System.out.println(x[row]);
		}
	}
	
	
}
