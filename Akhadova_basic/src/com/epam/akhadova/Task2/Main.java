package com.epam.akhadova.Task2;

import java.util.Scanner;

public class Main {
	static int[] mas = null;

	public static void main(String[] args) {
		input();
// 1 �������: ����� ����� �������� � ����� ������� �����. ������� ��������� ����� � �� �����.
		Task2_1.minElement(mas);
		Task2_1.maxElement(mas);
		System.out.println();
		
//2 �������: ����������� � ������� ����� � ������� ����������� (��������) �������� �� �����.
		Task2_2.increaseOfLength(mas);
		System.out.println();
		Task2_2.decreaseOfLength(mas);
		System.out.println();
		
//3 �������: ������� �� ������� �� �����, ����� ������� ������ (������) �������, � ����� �����.
		System.out.println();
		System.out.println("������� ����� ����� = "+Task2_3.averageLengs(mas));
		Task2_3.minAverage(mas);
		System.out.println();
		Task2_3.maxAverage(mas);
		System.out.println();
		
	
//4 �������: ����� �����, � ������� ����� ��������� ���� ����������. ���� ����� ����� ���������, ����� ������ �� ���.
		System.out.println("�����, � ������� ����� ��������� ���� ����������");
		Task2_4.col(mas);
		System.out.println();
		
//5 �������: ����� ���������� �����, ���������� ������ ������ �����,
		     //� ����� ��� ���������� ����� � ������ ������ ������ � �������� ����.
System.out.println("���������� �����, ���������� ������ ������ ����� = " + Task2_5.evenCount(mas));
System.out.println(" ���������� ����� � ������ ������ ������ = " + Task2_5.evenEvenCount(mas));
System.out.println(" ���������� ����� � ������ ������ �������� = " + Task2_5.oddEvenCount(mas));
System.out.println();
	

//6 �������: ����� �����, ����� � ������� ���� � ������� ������� �����������.
 							//���� ����� ����� ���������, ����� ������ �� ���.
System.out.println("�����, � ������� ����� ���� � ������� ������� �����������: ");
       Task2_6.ascendingOrder(mas);
	
	
//7 �������: ����� �����, ��������� ������ �� ��������� ����. ���� ����� ����� ���������, ����� ������ �� ���.
	System.out.println();
       Task2_7.checkDifferent(mas);
       
	}	
	public static int[] input() {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ �������");
		int l = in.nextInt();
		mas = new int[l];
		System.out.println("������� �����");
		for (int i = 0; i < mas.length; i++)
			mas[i] = in.nextInt();
		in.close();
		return mas;
	}

}
