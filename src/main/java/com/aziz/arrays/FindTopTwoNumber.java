package com.aziz.arrays;

public class FindTopTwoNumber {
	private void findSecondMaxNumber(int[] i) {
		// TODO Auto-generated method stub
		
		int max1=0;
		int max2=0; 
		int max3=0;
		for(int number:i){			
			if(number > max1){
				max3=max2;
				max2=max1;
				max1=number;
			}else if(number > max2){
				max3=max2;
				max2=number;
			}else if(number > max3){
				max3=number;
			}
		}
		System.out.println(max1+" "+max2+" "+max3);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindTopTwoNumber f=new FindTopTwoNumber();
		int[] i= {7,3,6,8,5,3,9,1};
		f.findSecondMaxNumber(i);
		}

	

}
