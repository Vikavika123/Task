package com.epam.akhadova.Task2;


import java.util.Arrays;

// ����������� � ������� ����� � ������� ����������� (��������) �������� �� �����.
public class Task2_2 {
	
	public static void increaseOfLength(int[] arr) {
		
			Arrays.sort(arr);
			System.out.println("increaseOfLength");
			for(int incr :arr)
			System.out.print(incr+" ");	
	}
	public static void decreaseOfLength(int[] arr) {
		
		Arrays.sort(arr);
		System.out.println("decreaseOfLength");
		for(int decr=arr.length-1; decr>=0;decr--){
		System.out.print(arr[decr]+" ");	
}}
}

