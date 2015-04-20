package com.epam.akhadova.Task2;

import java.util.Random;
import java.util.Scanner;

public class Main_9 {

	static int a;
	static int n;
	static int[][] array = null;

	public static void main(String[] args) {
		input();
		array = mass();
		System.out.println();
		
		System.out.println("1 TASK: ����������� ������ (�������) ������� � ������� ����������� ��������");
		Task2_9_1.increaseRow(array);
		System.out.println();
		
		Task2_9_1.increaseColumn(array);
		System.out.println();
		
		System.out.println("2 TASK: ��������� ����������� ����� �������� ������� �� k ������� ������ (�����, �����, ����)");
		Task2_9_2.shiftLeft(array,1);
		Task2_9_2.print(array);
		System.out.println();
		Task2_9_2.shiftRight(array,1);
		Task2_9_2.print(array);
		System.out.println();
		Task2_9_2.shiftUp(array, 1);
		Task2_9_2.print(array);
		System.out.println();
		Task2_9_2.shiftDown(array,1);
		Task2_9_2.print(array);
		
		
		System.out.println("4 TASK: ����� ����� ��������� �������, ������������� ����� ������ � ������ �������������� ���������� ������ ������.");
		Task2_9_4.summElem(array,n);
		System.out.println();

		System.out.println("5 TASK: ��������� ������� �� 90 �������� ");
		Task2_9_5.turn(array);
		
		System.out.println("6 TASK: ��������� �������, ������� �� ��������� ������ ������ ������� �� ������� ��������������");
		Task2_9_6.average(array, n);	
		System.out.println("");

		
		
		System.out.println("8 TASK: ������������� ������ ������� ����� �������, ����� ��������, ������ ����, ������������� ����� ���� ���������");
		Task2_9_8.zeroEnd(array);
	}

	public static void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the dimension of the array ");
		n = in.nextInt();
		System.out.println("Enter the interval of values ");
		a = in.nextInt();
		in.close();

	}

	public static int[][] mass() {
		int[][] array = new int[n][n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = (random.nextInt(a * 2) - a);
			}
		}
		for (int i = 0; i < n; i++, System.out.println()) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
		return array;
	}

}

