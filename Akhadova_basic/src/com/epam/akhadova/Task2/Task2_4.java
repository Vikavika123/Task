package com.epam.akhadova.Task2;

import java.util.Hashtable;


//����� �����, � ������� ����� ��������� ���� ����������. ���� ����� ����� ���������, ����� ������ �� ���.
public class Task2_4 {

	public static void col(int[] arr) {
		int u;
		int min = 11, minElem=arr[0];
		for (int i = 0; i < arr.length; i++) {
			int q = arr[i];
			u = count(q);
			if (u < min) {
				min = u;
				minElem = arr[i];
			}
		}
		System.out.println("���������� ��������� ���� =  "+min + ", ����� =  " + minElem);
	}

	public static int count(int qq) {
		Hashtable hash = new Hashtable();
		Integer y;
		while (qq != 0) {
			y = qq % 10;
			hash.put(y.toString(), y);
			qq = qq / 10;
		}
		return hash.size();
	}

}
