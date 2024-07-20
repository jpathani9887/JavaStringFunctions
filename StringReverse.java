package com.JavaString;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringReverse {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		StringReverse str1=new StringReverse();
		
		
		/*
		 * str1.reverseString(); str1.reverseSentence(); str1.reverseSentenceandChars();
		 * str1.reverseCharsbutnotWordSequence(); str1.printDuplicateChars();
		 * str1.getDigitsinString(); str1.substringOccurence();
		 * str1.readTagValuesfromXML(); str1.getLatestBuildVersion();
		 * 
		 * 
		 * 
		 * str1.removeDuplicates(); str1.createRandomNames();
		 */
		
		str1.stringComparison();
				
	}
	
	public void reverseString() {
		
		String newStr="Nishant Pathak";
		System.out.println("-----------------------REVERSE STRING-----------------------");
		System.out.println("Original String-"+newStr);
		
		char [] strArr=newStr.toCharArray();
		String revString="";
		for(int i=strArr.length-1;i>=0;i--)
		{
			revString=revString+strArr[i];
		}
		
		System.out.println("Reversed String-"+revString);
		
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
	}
	
	public void reverseSentence() {
		
		System.out.println("----------------------REVERSE SENTENCE----------------------");
		String newStr="I Love My India";
		

		
		String [] stringArr=newStr.split(" ");
		String revString="";
		//System.out.println("Original String-"+newStr);
		
		
		for(int i=stringArr.length-1;i>=0;i--) {
			//revString=revString+stringArr[i]+" ";
			System.out.println(stringArr[i]);
	
			
			
		}
		System.out.println("Reversed Sentence-"+revString);
		
	}
	
	public void reverseSentenceandChars() {
		
		String newStr="I Love My India";
		String [] stringArr=newStr.split(" ");
		String revString="";
		System.out.println("--------------REVERSE SENTENCE AND CHARACTERS---------------");
						    
		System.out.println("Original String-"+newStr);
		
		for(int i=stringArr.length-1;i>=0;i--) {
			char [] charArr=stringArr[i].toCharArray();
			String revChars="";
			for(int j=charArr.length-1;j>=0;j--)
			{
				revChars=revChars+charArr[j];   //Reversing the Characters of the Word
			}
			
			revString=revString+revChars+" ";   //Reversing the Sentence
			 
			
		}
		System.out.println("Reversed Sentence with Reversed Characters by using Split-"+revString);
		System.out.println();
		//System.out.println("------------------------------------------------------------");
		
		revString="";
		for(int i=newStr.length()-1;i>=0;i--) {
			//revString=revString+stringArr[i]+" ";
			revString=revString+newStr.charAt(i);
			newStr.indexOf(i);
			
		}
		System.out.println("Reversed Sentence and Characters without using Split-"+revString);
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
	}
	
public void reverseCharsbutnotWordSequence() {
		
		String newStr="I Love My India";
		String [] stringArr=newStr.split(" ");
		String revString="";
		System.out.println("--------------REVERSE CHARACTERS BUT NOT WORDS SEQUENCE---------------");
						    
		System.out.println("Original String-"+newStr);
		
		for(int i=0;i<=stringArr.length-1;i++) {
			char [] charArr=stringArr[i].toCharArray();
			String revChars="";
			for(int j=charArr.length-1;j>=0;j--)
			{
				revChars=revChars+charArr[j];   //Reversing the Characters of the Word
			}
			
			revString=revString+revChars+" ";   //Reversing the Sentence
			 
			
		}
		System.out.println("Original Sentence with Reversed Characters-"+revString);
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
	}
	
	public void printDuplicateChars() {
		String newStr="dfafasdaaasdasdfrerytjhhmjmhjmkiki";
		
		char [] strarr=newStr.toCharArray();
		List<String> duplicates=new ArrayList<String>(); 
		System.out.println("----------------------FIND DUPLICATES-----------------------");
		System.out.println("Original String-"+newStr);
		
		for(int i=0;i<strarr.length;i++) {
			for(int j=i+1;j<strarr.length;j++) {
				if(strarr[i]==strarr[j])
				{
					if(!duplicates.contains(strarr[i]+"")) {  //! is used to restrict the re-adding of a Duplicate char
						duplicates.add(strarr[i]+"");
					}
				}
			}
		}
		
		System.out.println("Duplicates in the String-"+duplicates);
		System.out.println("------------------------------------------------------------");
		
	}
	
	public void getDigitsinString() {
		String newStr="India Won the Cricket World Cup 2011 by 5 Wickets and 4 Overs";
		char [] strarr=newStr.toCharArray();
		int uCase = 0, lCase=0 , digits=0;

		System.out.println("----------------------FIND OCCURENCES-----------------------");
		System.out.println("Original String-"+newStr);
		
		
		for(int i=0;i<strarr.length;i++) {
			int ascCode=strarr[i];
			//char str1=(char) ascCode;
			
			if(ascCode>=65 && ascCode<=90) {
				uCase=uCase+1;
			}else if(ascCode>=97 && ascCode<=122) {
				lCase=lCase+1;
			}else if(ascCode>=48 && ascCode<=57) {
				digits=digits+1;
			
		}
		
		}
		
		System.out.println("Number of Upper Case-"+uCase);
		System.out.println("Number of Lower Case-"+lCase);
		System.out.println("Number of Digits Case-"+digits);
		System.out.println("------------------------------------------------------------");
	}
	
	public void substringOccurence() {
		String newStr="abcdkokpodfakabckjkhhabcabcklkkoabcjlkjaclaslabc";
		String substr="abc";
		char [] strarr=newStr.toCharArray();
		int count=0;
		
		System.out.println("-----------------------FIND SUBSTRING-----------------------");
		
		System.out.println("Original String-"+newStr);
		
		for(int i=0;i<strarr.length;i++) {
			String temp="";
			if(i==strarr.length-2) {  //Check to avoid Index Out of Bounds Exception
				break;
			}
			temp=strarr[i]+""+strarr[i+1]+""+strarr[i+2]+"";  //Fetching 3 characters from main string to compare it with substring 
			//Can also use split function on the substring to check whether the string
			//is present in the main string
			if(substr.equals(temp)) {
				System.out.println("Susbtring Found at-"+i);
				count++;
			}
		}
		System.out.println("SubString Found In Main String at "+count+" Occurences Using Temp Variable");
		
		String[] stringArr=newStr.split(substr);    //To Find the Number of Occurrences of the Sub String in the Main String
		if(stringArr.length>0) {
			System.out.println("SubString Found In Main String at "+stringArr.length+" Occurences Using Split Function");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
	}
	
	public void readTagValuesfromXML() throws IOException {
		File file1 = new File("C:\\Users\\jpathani\\Documents\\MyXML.txt");
		Reader reader = new FileReader(file1);
		BufferedReader bmw = new BufferedReader(reader);
		String str = bmw.readLine();
		System.out.println("----------------------PRINT TAG VALUES----------------------");
		String whiteCount = "";

		int initLoc = 0, destLoc = 0;

		while (str != null) {
			initLoc = str.indexOf(">");
			destLoc = str.indexOf("</");
			
			if (initLoc < destLoc ) {
				String text = str.substring(initLoc + 1, destLoc);
				System.out.println(text.trim());
			}
			whiteCount = whiteCount + str;
			str = bmw.readLine();
			}
		bmw.close();
	}
	
	public void getLatestBuildVersion() {
		String build1= "9.1.6.9";
		String build2= "9.1.6.10";
		
		String[] arr1=build1.split("[.]");
		String[] arr2=build2.split("[.]");
		
		String flag="";
		
		for(int i=0;i<arr1.length;i++) {
			
			int dig1= Integer.parseInt(arr1[i]);
			int dig2= Integer.parseInt(arr2[i]);
			
			if(dig2==dig1) {			
				continue;
			}
			if(dig1<dig2) {
				flag="Build2";
			}
			if(dig1>dig2){
				flag="Build1";
			}
		}
		
		if(flag.equals("Build1")) {
			System.out.println("Build1 is Latest");
		}else {
			System.out.println("Build2 is Latest");
		}
	}

	public void removeDuplicates() {
		
		String str1="ahujwloaklasjkaasowioqwoaalqweoiqlaaqoiqelqaaqoeqwiuaaqoiuqoeqoqqaaqoueqijkaa";
		System.out.println("-----------------------REPLACE STRING-----------------------");
		char [] strChar=str1.toCharArray();
		String modiString= "";		
		
		for(int i=0;i<strChar.length;i++) {
			
			if(strChar[i]=='a' && strChar[i+1]=='a') {
				strChar[i]='_';
				strChar[i+1]='_';
				modiString=modiString+strChar[i];
				continue;
			}
			modiString=modiString+strChar[i];
		}
		System.out.println("ORIGINAL STRING-"+str1+"aa TO BE REPLACED WITH __\"");
		System.out.println("MODIFIED STRING-"+modiString);
		System.out.println("------------------------------------------------------------");
		
				
	}
	
	public void createRandomNames() {
		
		String firstName="Tarun";
		String lastName="Dagar";
		
		firstName=firstName.substring(0,3);
		lastName=lastName.substring(0,3);
		
		int max=10000;
		int min=100;
		
		int  randNum = (int) (Math.random() * ((max - min) + 1)) + min;
		System.out.println(firstName+randNum+lastName);
		
	}
	
	public void stringComparison() {
		
		String s1="Nishant";
		String s2=new String();
		String s3="Pathak";
		
		s2=s3;
		
		if(s2==s1) {
			System.out.println("s1=s2");
		}
		
		if(s3.equals(s2)) {
			System.out.println("s1.equals(s2)");
		}
	}
}
