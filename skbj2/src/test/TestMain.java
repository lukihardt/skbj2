package test;

import java.util.Calendar;
import java.util.Scanner;

import utils.Skbj1;

public class TestMain {

	public static void main(String[] args) {
		System.out.print("�����뿪ʼ�Ĺ��������: ");
		Scanner scanner = new Scanner(System.in);
		int startYear = scanner.nextInt();

		System.out.print("�����뿪ʼ�Ĺ������·�: ");
		int startMonth = scanner.nextInt();

		System.out.print("�����뿪ʼ�Ĺ���������: ");
		int startDay = scanner.nextInt();
		
		System.out.print("����������Ĺ��������: ");
		int endYear = scanner.nextInt();
		
		System.out.print("����������Ĺ������·�: ");
		int endMonth = scanner.nextInt();
		
		System.out.print("����������Ĺ���������: ");
		int endDay = scanner.nextInt();
		
		Calendar startCal = Calendar.getInstance();
		startCal.set( startYear, startMonth - 1, startDay);
		
		Calendar endCal = Calendar.getInstance();
		endCal.set( endYear, endMonth - 1, endDay);
		
		// TODO Auto-generated method stub
		Skbj1 skbj1 = new Skbj1();
		while( startCal.before(endCal)) {
			String words=skbj1.defaultMain( startCal.get( Calendar.YEAR), startCal.get( Calendar.MONTH) + 1, startCal.get( Calendar.DAY_OF_MONTH));
			int month = startCal.get( Calendar.MONTH) + 1;
			System.out.println( month + "��" +startCal.get( Calendar.DAY_OF_MONTH) + "�ţ�" +words);
			startCal.add( Calendar.DAY_OF_MONTH, 1);
		}
		
		scanner.close();
	}

}
