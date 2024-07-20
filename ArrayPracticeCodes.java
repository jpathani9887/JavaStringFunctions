package com.ArrayCodes;

public class ArrayPracticeCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPracticeCodes arr=new ArrayPracticeCodes();
		
		
		  arr.getMissingNumber(); arr.findDuplicateinArray(); arr.checkforDigit();
		  arr.getMaxSumofThreeCells(); arr.arrayResizing();
		 
		arr.equalSumIndex();
	}
	
	
	public void getMissingNumber() {
		int a[]= {1,2,3,4,6,7,8,9,10,11};
		
		int count=1;
		System.out.println("---------------------------------GET MISSING NUMBER---------------------------------");
		
		for(int i=0;i<a.length;i++) {
			
			if(count==a[i]) {
				
			}else {
				System.out.println("Number Missing from the Array is-"+count);
				count=a[i];
			}
			count++;
		}
	}
	
	public void findDuplicateinArray() {
		int a[]= {1,2,6,4,3,8,4,2,3,6,3,4,6,7,1};
		
		System.out.println("-------------------------------FIND DUPLICATE IN ARRAY------------------------------");
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate Number "+a[i]+" Found at Location-"+j);
				}
			}
		}
	}
	
	public void checkforDigit() {
		char a[]= {'N','e','i','@','$','1','6','r'};
		int uCase = 0, lCase=0 , digits=0;
		System.out.println("-------------------------------------FIND DIGITS------------------------------------");
		
		
		for(int i=0;i<a.length;i++) {
			int ascCode = a[i];
			if(ascCode>=65 && ascCode<=90) {
				uCase++;
			}else if(ascCode>=97 && ascCode<=122) {
				lCase++;
			}else if(ascCode>=48 && ascCode<=57) {
				digits++;
			}
		}
		System.out.println("Number of Upper Case-"+uCase);
		System.out.println("Number of Lower Case-"+lCase);
		System.out.println("Number of Digits Case-"+digits);
	}
	
	public void getMaxSumofThreeCells() {
		int a[]= {1,311,221,5,721,4,2,7,947,5,4,2,2,4,7,9,1000,11,23,46,78,543,32};
		
		int max = 0;
		System.out.println("-------------------------------GET MAX SUM OF 3 CELLS-------------------------------");
		
		for(int i=0;i<a.length;i++) {
			int sum=0;
			if(i==a.length-2) {  //Check to avoid Index Out of Bounds Exception
				break;
			}
			sum=sum+a[i]+a[i+1]+a[i+2];
			if(i==0) {
				max=sum;
			}
			
			if(sum>max) {
				max=sum;
			}
			
		}
		
		System.out.println("Maximum of Sum of 3 Cells-"+max);
		
		char c='z';
		char b='b';
		
		int ascC=c;
		int ascB=b;
		//boolean flag= false;
		if(ascC>ascB) {
			System.out.println("Characters Equal");
		}
		
	}
	
	public void arrayResizing() {
		int[] a1 = {2,2,2,2,5,6,7};
        int[] b1 = {1,2,3,4,5,6,7,8,9};
        System.out.println("------------------------------------RESIZE ARRAY------------------------------------");
        
        System.out.println("Size of A="+a1.length);
        System.out.println("Size of B="+b1.length); 
        a1 = b1;      //Compiler checks only type, not the size
        System.out.println("Size of A="+a1.length);
        System.out.println("Size of B="+b1.length);
        a1[8]=10;
        for(int i=0;i<a1.length;i++) {
        	System.out.println("A1="+a1[i]);
        }
	}
	
	
	public void equalSumIndex() {
		
		int [] arr1= {1,1,3,4,5,4};
		int countRight=0, countLeft=0;
		boolean flag=false;
		
		  for(int i=0;i<arr1.length;i++) {
		  
		  int sumLeft=0, sumRight=0; countLeft=i; countRight=countLeft+1;
		  
		  for(int j=0;j<=countLeft;j++) { 
			  sumLeft=sumLeft+arr1[j];
			    
		  
		  } for(int k=countRight;k<=arr1.length-1;k++) { 
			  sumRight=sumRight+arr1[k];
		  
		  } //sumRight=sumRight+arr1[arr1.length-1-i]; 
		  
		  if(sumLeft==sumRight) {
			  System.out.println("Equal Sum Found at Index-"+i); 
		  	  flag=true; 
		  }
		  		  
		  	
	/*
	 * for(int i=0;i<arr1.length;i++) {
	 * 
	 * sumRight=sumRight+arr1[arr1.length-1-i]; sumLeft=sumLeft+arr1[i];
	 * 
	 * if(sumLeft<sumRight) { sumLeft=sumLeft+arr1[i+1]; } if(sumLeft>sumRight) {
	 * sumRight=sumRight+arr1[arr1.length-i-2]; }
	 * 
	 * if(sumLeft==sumRight) { System.out.println("Equal Sum Found at Index-"+i);
	 * flag=true; }
	 * 
	 * } if(!flag) { System.out.println("No Index Found"); }
	 */
		  }
		  if(!flag) { 
			  System.out.println("No Index Found"); 
		  	}

	}
}