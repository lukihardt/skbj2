package test;

import java.util.Calendar;
import java.util.Scanner;

import util.LunarUtil;

public class Skbj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�����빫�������: ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();

		System.out.print("�����빫�����·�: ");
		int month = scanner.nextInt();

		System.out.print("�����빫��������: ");
		int day = scanner.nextInt();

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);
		LunarUtil lunarUtil = new LunarUtil(calendar);

		// ũ�����·�
		int lunarMonth = lunarUtil.getmMonth();
		int lunarDay = lunarUtil.getmDay();
		
//		//����
//		System.out.println(lunarMonth);
//		System.out.println(lunarDay);

		int flag = 0;
		String cause = "";

		switch (lunarMonth) {
		case 1:
			switch (lunarDay) {
			case 1:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 3:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 5:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 6:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 7:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 8:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 9:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 13:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 14:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 15:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 16:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 19:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 23:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 25:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 27:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 28:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 29:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 30:
				cause = cause + "ÿ�¹̶����գ�";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 2:
			switch (lunarDay) {
			case 1:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 2:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 3:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 6:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 8:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 11:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 14:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 15:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 17:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 18:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 19:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 21:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 23:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 25:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 27:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 28:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 29:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 30:
				cause = cause + "ÿ�¹̶����գ�";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 3:
			switch (lunarDay) {
			case 1:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 3:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 6:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 8:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 9:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 12:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 14:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 15:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 16:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 18:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 20:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 23:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 25:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 27:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 28:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 29:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 30:
				cause = cause + "ÿ�¹̶����գ�";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 4:
			switch (lunarDay) {
			case 1:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 3:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 4:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 6:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 7:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 8:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 14:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 15:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 16:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 17:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 18:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 20:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 23:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 25:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 27:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 28:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 29:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 30:
				cause = cause + "ÿ�¹̶����գ�";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 5:
			switch (lunarDay) {
			case 1:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 3:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 5:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 6:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 7:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 8:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 11:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 12:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 13:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 14:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 15:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 16:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 17:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 18:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 22:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 23:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 25:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 26:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 27:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 28:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 29:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 30:
				cause = cause + "ÿ�¹̶����գ�";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 6:
			switch (lunarDay) {
			case 1:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 3:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 4:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 6:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 8:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 10:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 13:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 14:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 15:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 19:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 23:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 24:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 25:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 27:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 28:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 29:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 30:
				cause = cause + "ÿ�¹̶����գ�";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 7:
			switch (lunarDay) {
			case 1:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 3:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 5:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 6:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 7:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 8:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 10:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 12:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 13:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 14:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 15:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 16:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 18:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 19:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 22:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 23:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 25:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 27:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 28:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 29:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 30:
				cause = cause + "ÿ�¹̶����գ�";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 8:
			switch (lunarDay) {
			case 1:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 3:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 5:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 6:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 8:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 10:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 12:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 14:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 15:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 16:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 18:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 23:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 24:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 25:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 27:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 28:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 29:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 30:
				cause = cause + "ÿ�¹̶����գ�";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 9:
			switch (lunarDay) {
			case 1:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 3:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 8:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 9:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 10:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 11:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 13:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 14:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 15:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 17:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 19:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 23:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 25:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 27:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 28:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 29:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 30:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			default:
				flag = 1;
				break;
			}
		break;
		case 10:
			switch (lunarDay) {
			case 1:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 3:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 5:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 6:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 8:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 10:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 11:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 14:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 15:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 16:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 23:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 25:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 27:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 28:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 29:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 30:
				cause = cause + "ÿ�¹̶����գ�";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 11:
			switch (lunarDay) {
			case 1:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 3:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 4:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 6:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 8:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 11:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 14:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 15:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 17:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 19:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 21:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 23:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 25:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 26:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 27:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 28:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 29:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 30:
				cause = cause + "ÿ�¹̶����գ�";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 12:
			switch (lunarDay) {
			case 1:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 3:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 6:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 7:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 8:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 12:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 14:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 15:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 16:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 19:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 20:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 21:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 23:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 24:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 25:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 27:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 28:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 29:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			case 30:
				cause = cause + "ÿ�¹̶����գ�";
				break;
			default:
				flag = 1;
				break;
			}
		break;

		default:
		break;
		}

//////////////////////////////////////////////////////////////////////////////////////////////////
		// ��������
		int vernalEquinox;
		vernalEquinox = (int) Math.floor((year % 100) * 0.2422 + 20.646) - (int) Math.floor((year % 100) / (double) 4);
		if (month == 3) {
			if (day - vernalEquinox <= 3 && day - vernalEquinox >= -3) {
				flag = 0;
				cause += "���ַ�Χ�ڣ�";
			}
		}

		// �������
		int autumnalEquinox;
		autumnalEquinox = (int) Math.floor(year % 100 * 0.2422 + 23.042) - (int) Math.floor(year % 100 / (double) 4);
		if (month == 9) {
			if (day - autumnalEquinox <= 3 && day - autumnalEquinox >= -3) {
				flag = 0;
				cause += "��ַ�Χ�ڣ�";
			}
		}

		// ��������
		int summerSolstice;
		summerSolstice = (int) Math.floor((year % 100) * 0.2422 + 21.37) - (int) Math.floor((year % 100) / (double) 4);
		if (month == 6) {
			if (day - summerSolstice <= 3 && day - summerSolstice >= -3) {
				flag = 0;
				cause += "������Χ�ڣ�";
			}
		}

		// ��������
		int winterSolstice;
		winterSolstice = (int) Math.floor((year % 100) * 0.2422 + 21.94) - (int) Math.floor((year % 100) / (double) 4);
		if (year == 2021) {
			winterSolstice--;
		}
		if (month == 12) {
			if (day - winterSolstice <= 3 && day - winterSolstice >= -3) {
				flag = 0;
				cause += "������Χ�ڣ�";
			}
		}
		
		
		

		// ��Ԫ��
		if (lunarDay == 15 && (lunarMonth == 1 || lunarMonth == 7 || lunarMonth == 10)) {
			flag = 0;
			cause += "��Ԫ�գ�";
		}

		// ������ && �ľ���
		// ������
		int liChun;
		liChun = (int) Math.floor((year % 100) * 0.2422 + 3.87) - (int) Math.floor(((year % 100) - 1) / (double) 4);
		if (month == 2) {
			if (day == liChun || day == liChun - 1) {
				flag = 0;
				cause += "������Χ�ڣ�";
			}
		}

		// ������
		int liXia;
		liXia = (int) Math.floor((year % 100) * 0.2422 + 5.52) - (int) Math.floor((year % 100) / (double) 4);
		if (month == 5) {
			if (day == liXia || day == liXia - 1) {
				flag = 0;
				cause += "���ķ�Χ�ڣ�";
			}
		}

		// ������
		int liQiu;
		liQiu = (int) Math.floor((year % 100) * 0.2422 + 7.5) - (int) Math.floor((year % 100) / (double) 4);
		if (year == 2002) {
			++liQiu;
		}
		if (month == 8) {
			if (day == liQiu || day == liQiu - 1) {
				flag = 0;
				cause += "���ﷶΧ�ڣ�";
			}
		}

		// ������
		int liDong;
		liDong = (int) Math.floor((year % 100) * 0.2422 + 7.438) - (int) Math.floor((year % 100) / (double) 4);
		if (month == 11) {
			if (day == liDong || day == liDong - 1) {
				flag = 0;
				cause += "������Χ�ڣ�";
			}
		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/**
		 * ������
		 */
		// ������
		Calendar tempCal = Calendar.getInstance();
		tempCal.set(year, 1, liChun);
		int i = 0;

		int chunSheMonth; // ����
		int chunSheDay; // ����
		while (true) {
			LunarUtil lunarUtil2 = new LunarUtil(tempCal);
			String ganzhi = lunarUtil2.Ganzhi(tempCal); // ��õ��ո�֧

			if (ganzhi.contains("��")) {
				i++;
			}
			if (i == 5) {
				chunSheMonth = tempCal.get(Calendar.MONTH) + 1;
				chunSheDay = tempCal.get(Calendar.DAY_OF_MONTH);
				// System.out.println("������Ϊ����" + tempCal.get(Calendar.YEAR) + "��" + chunSheMonth + "��" + chunSheDay + "��");
				break;
			}
			tempCal.add(5, 1);
		}
		// �ж��Ƿ�Ϊ������
		if (month == chunSheMonth && day == chunSheDay) {
			flag = 0;
			cause += "�Ǵ����գ�";
		}
		// ������
		tempCal.set(year, 7, liQiu);
		int i2 = 0;

		int qiuSheMonth; // ����
		int qiuSheDay; // ����
		while (true) {
			LunarUtil lunarUtil2 = new LunarUtil(tempCal);
			String ganzhi = lunarUtil2.Ganzhi(tempCal); // ��õ��ո�֧

			if (ganzhi.contains("��")) {
				i2++;
			}
			if (i2 == 5) {
				qiuSheMonth = tempCal.get(Calendar.MONTH) + 1;
				qiuSheDay = tempCal.get(Calendar.DAY_OF_MONTH);
				// System.out.println("������Ϊ����" + tempCal.get(Calendar.YEAR) + "��" + qiuSheMonth + "��" + qiuSheDay + "��");
				break;
			}
			tempCal.add(5, 1);
		}
		// �ж��Ƿ�Ϊ������
		if (month == qiuSheMonth && day == qiuSheDay) {
			flag = 0;
			cause += "�������գ�";
		}

		/**
		 * ������
		 */
		// �����
		Calendar calendar3 = Calendar.getInstance();
		calendar3.set(year, 5, summerSolstice);
		// int rufuMonth;
		// int rufuDay;
		Calendar rufuCalendar;
		int i1 = 0;
		while (true) {
			LunarUtil lunarUtil3 = new LunarUtil(calendar3);
			String ganzhi = lunarUtil3.Ganzhi(calendar3);

			if (ganzhi.contains("��")) {
				i1++;
				if (i1 == 3) {
					rufuCalendar = calendar3;
					// rufuMonth = calendar3.get( Calendar.MONTH) + 1;
					// rufuDay = calendar3.get( Calendar.DAY_OF_MONTH);
					break;
				}
			}
			calendar3.add(Calendar.DAY_OF_MONTH, 1);
		}
		// ������
		Calendar calendar4 = Calendar.getInstance();
		calendar4.set(year, 7, liQiu);
		// int chufuMonth;
		// int chufuqianDay;
		Calendar chufuCalendar;
		int i11 = 0;
		while (true) {
			LunarUtil lunarUtil4 = new LunarUtil(calendar4);
			String ganzhi = lunarUtil4.Ganzhi(calendar4);

			if (ganzhi.contains("��")) {
				i11++;
				if (i11 == 2) {
					calendar4.add(Calendar.DAY_OF_MONTH, -1);
					chufuCalendar = calendar4;
					// chufuMonth = calendar4.get( Calendar.MONTH) + 1;
					// chufuqianDay = calendar4.get( Calendar.DAY_OF_MONTH);
					break;
				}
			}
			calendar4.add(Calendar.DAY_OF_MONTH, 1);
		}

		Calendar temp_rufuCalendar = rufuCalendar;
		temp_rufuCalendar.add(Calendar.DAY_OF_MONTH, -1);
		if (calendar.after(temp_rufuCalendar) && calendar.before(chufuCalendar)) {
			flag = 0;
			cause += "�������ڣ�";
		}

		// ����
		if (lunarDay == 7 || lunarDay == 8) {
			flag = 0;
			cause += "�����գ�";
		}
		if (lunarDay == 22 || lunarDay == 23) {
			flag = 0;
			cause += "�����գ�";
		}

		// ����
		int lunarMonthDays = LunarUtil.lunarMonthDays(year, lunarMonth);
		if (lunarDay == lunarMonthDays) {
			flag = 0;
			cause += "���գ�";
		}

		// ������
		String ganzhi = lunarUtil.Ganzhi(calendar);
		if (ganzhi.contains("��")) {
			flag = 0;
			cause += "�����գ�";
		}

		// �����գ������գ�ֵ��̫����
		if (ganzhi.equals("����")) {
			flag = 0;
			cause += "������";
		}
		if( ganzhi.equals( "����")) {
			flag = 0;
			cause += "������";
		}
		if( lunarUtil.cyclicalYear().equals( ganzhi)) {
			flag = 0;
			cause += "ֵ��̫����";
		}
		
		// ������
		if ( ganzhi.contains( "��") || ganzhi.contains( "��")) {
			flag = 0;
			cause += "�����գ�";
		}

		// �ٰ���
		if ( lunarMonthDays == 30 && lunarDay == 18) {
			flag = 0;
			cause += "�ٰ���";
		}
		if ( lunarMonthDays == 29 && lunarDay == 17) {
			flag = 0;
			cause += "�ٰ���";
		}
		
		// ʮ������
		String yearGanzhi = lunarUtil.cyclicalYear();
		if( yearGanzhi.contains( "��") && (( lunarMonth == 3 && ganzhi.equals( "����")) || (lunarMonth == 7 && ganzhi.equals( "�ﺥ")) || (lunarMonth == 10 && ganzhi.equals( "����")) || (lunarMonth == 11 && ganzhi.equals( "����")))) {
			flag = 0;
			cause += "ʮ�����գ�";
		}
		if( yearGanzhi.contains( "��") && (( lunarMonth == 3 && ganzhi.equals( "����")) || (lunarMonth == 7 && ganzhi.equals( "�ﺥ")) || (lunarMonth == 10 && ganzhi.equals( "����")) || (lunarMonth == 11 && ganzhi.equals( "����")))) {
			flag = 0;
			cause += "ʮ�����գ�";
		}
		if( yearGanzhi.contains( "��") && (( lunarMonth == 4 && ganzhi.equals( "����")) || ( lunarMonth == 9 && ganzhi.equals( "����")))) {
			flag = 0;
			cause += "ʮ�����գ�";
		}
		if( yearGanzhi.contains( "��") && (( lunarMonth == 4 && ganzhi.equals( "����")) || ( lunarMonth == 9 && ganzhi.equals( "����")))) {
			flag = 0;
			cause += "ʮ�����գ�";
		}
		if( yearGanzhi.contains( "��") && (( lunarMonth == 3 && ganzhi.equals( "����")) || ( lunarMonth == 9 && ganzhi.equals( "����")) || ( lunarMonth == 10 && ganzhi.equals( "�׳�")))) {
			flag = 0;
			cause += "ʮ�����գ�";
		}
		if( yearGanzhi.contains( "��") && (( lunarMonth == 3 && ganzhi.equals( "����")) || ( lunarMonth == 9 && ganzhi.equals( "����")) || ( lunarMonth == 10 && ganzhi.equals( "�׳�")))) {
			flag = 0;
			cause += "ʮ�����գ�";
		}
		if( yearGanzhi.contains( "��") && (lunarMonth == 6 && ganzhi.equals( "����"))) {
			flag = 0;
			cause += "ʮ�����գ�";
		}
		if( yearGanzhi.contains( "��") && (lunarMonth == 6 && ganzhi.equals( "����"))) {
			flag = 0;
			cause += "ʮ�����գ�";
		}
		
		// �������������
		Calendar tempCal2 = Calendar.getInstance();
		tempCal2.set( year, 11, winterSolstice);
		Calendar gengCal = Calendar.getInstance();
		while( true) {
			LunarUtil lunarUtil2 = new LunarUtil(tempCal2);
			String tempGanzhi = lunarUtil2.Ganzhi( tempCal2);
			if ( tempGanzhi.contains( "��")) {
				gengCal = tempCal2;
				break;
			}
			tempCal2.add( Calendar.DAY_OF_MONTH, 1);
		}
		if( gengCal.get( Calendar.YEAR) == calendar.get( Calendar.YEAR) && gengCal.get( Calendar.MONTH) == calendar.get( Calendar.MONTH) && gengCal.get( Calendar.DAY_OF_MONTH) == calendar.get( Calendar.DAY_OF_MONTH)) {
			flag = 0;
			cause += "��������գ� ";
		}
		
		Calendar tempCal1 = gengCal;
		tempCal1.add( Calendar.DAY_OF_MONTH, 1);
		Calendar xinCal = tempCal1;
		if( xinCal.get( Calendar.YEAR) == calendar.get( Calendar.YEAR) && xinCal.get( Calendar.MONTH) == calendar.get( Calendar.MONTH) && xinCal.get( Calendar.DAY_OF_MONTH) == calendar.get( Calendar.DAY_OF_MONTH)) {
			flag = 0;
			cause += "���������գ� ";
		}
		
		// ���������������
		Calendar tempCal3 = Calendar.getInstance();
		tempCal3.set( year, 11, winterSolstice);
		Calendar wuCal = Calendar.getInstance();
		int i111 = 0;
		while( true) {
			LunarUtil lunarUtil3 = new LunarUtil( tempCal3);
			String tempGanzhi = lunarUtil3.Ganzhi( tempCal3);
			if( tempGanzhi.contains( "��")) {
				i111++;
				if( i111 == 3) {
					wuCal = tempCal3;
					break;
				}
			}
			tempCal3.add( Calendar.DAY_OF_MONTH, 1);
		}
		if( wuCal.get( Calendar.YEAR) == calendar.get( Calendar.YEAR) && wuCal.get( Calendar.MONTH) == calendar.get( Calendar.MONTH) && wuCal.get( Calendar.DAY_OF_MONTH) == calendar.get( Calendar.DAY_OF_MONTH)) {
			flag = 0;
			cause += "��������������գ�";
		}
		
		// ������
		if ( lunarMonth == 1) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 2) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 3) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 4) {
			if ( ganzhi.equals( "��δ")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 5) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 6) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 7) {
			if ( ganzhi.equals( "�׳�")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 8) {
			if ( ganzhi.equals( "��î")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 9) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 10) {
			if ( ganzhi.equals( "���")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 11) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 12) {
			if ( ganzhi.equals( "�ﺥ")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		// ������
		if ( lunarMonth == 1) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 2) {
			if ( ganzhi.equals( "��î")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 3) {
			if ( ganzhi.equals( "�׳�")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 4) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 5) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 6) {
			if ( ganzhi.equals( "��δ")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 7) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 8) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 9) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 10) {
			if ( ganzhi.equals( "�ﺥ")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 11) {
			if ( ganzhi.equals( "����")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		if ( lunarMonth == 12) {
			if ( ganzhi.equals( "���")) {
				flag = 0;
				cause += "�����գ�";
			}
		}
		
		if( lunarDay == 1 || lunarDay == 8 || lunarDay == 14 || lunarDay == 15 || lunarDay == 18 || lunarDay == 23 || lunarDay == 24 || lunarDay == 28 || lunarDay == 29 || lunarDay == 30) {
			flag = 0;
			cause += "�ز�ʮի�գ�";
		}
		
		System.out.println( flag + ":" + cause);
		
		scanner.close();
	}

}
