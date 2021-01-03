package test;

import java.util.Calendar;

import util.LunarUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2017, 0, 23);
		LunarUtil lunarUtil = new LunarUtil(cal);
		System.out.println( "mYear:" + lunarUtil.getmYear());
		System.out.println(lunarUtil);
		System.out.println( "���֧��" + lunarUtil.cyclicalYear());
		System.out.println(lunarUtil.Ganzhi(cal));

		int vernalEquinox;
		int year = 2016;
		vernalEquinox = (int) Math.floor(year % 100 * 0.2422 + 20.646) - (int) Math.floor(year % 100 / (double) 4);
		System.out.println(vernalEquinox);

		int autumnalEquinox;
		autumnalEquinox = (int) Math.floor(year % 100 * 0.2422 + 23.042) - (int) Math.floor(year % 100 / (double) 4);
		System.out.println("����� : " + autumnalEquinox + "��");

		int summerSolstice;
		summerSolstice = (int) Math.floor((year % 100) * 0.2422 + 21.37) - (int) Math.floor((year % 100) / (double) 4);
		System.out.println("������ : " + summerSolstice + "��");

		int winterSolstice;
		winterSolstice = (int) Math.floor((year % 100) * 0.2422 + 21.94) - (int) Math.floor((year % 100) / (double) 4);
		System.out.println("������ : " + winterSolstice + "��");

		int liChun;
		liChun = (int) Math.floor((year % 100) * 0.2422 + 3.87) - (int) Math.floor(((year % 100) - 1) / (double) 4);
		System.out.println("������ : " + liChun + "��");

		int liXia;
		liXia = (int) Math.floor((year % 100) * 0.2422 + 5.52) - (int) Math.floor((year % 100) / (double) 4);
		System.out.println("������ : " + liXia + "��");

		int liQiu;
		liQiu = (int) Math.floor((year % 100) * 0.2422 + 7.5) - (int) Math.floor((year % 100) / (double) 4);
		System.out.println("������ : " + liQiu + "��");

		int liDong;
		liDong = (int) Math.floor((year % 100) * 0.2422 + 7.438) - (int) Math.floor((year % 100) / (double) 4);
		System.out.println("������ : " + liDong + "��");

		System.out.println(lunarUtil.getmMonth());
		System.out.println(lunarUtil.getmDay());

		int i = 1;
		int j = 0;
		if (i == j + 1) {
			System.out.println("yes");
			System.out.println(i);
			System.out.println(j);
		}

		Calendar calendar = Calendar.getInstance();
		calendar.set(2020, 10, 30);
		calendar.add(5, 1);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

		// ������
		Calendar tempCal = Calendar.getInstance();
		tempCal.set(year, 1, liChun);
		int i1 = 0;
		while (true) {
			LunarUtil lunarUtil2 = new LunarUtil(tempCal);
			String ganzhi = lunarUtil2.Ganzhi(tempCal); // ��õ��ո�֧

			if (ganzhi.contains("��")) {
				i1++;
			}
			if (i1 == 5) {
				int chunSheMonth = tempCal.get(Calendar.MONTH) + 1;
				System.out.println("������Ϊ����" + tempCal.get(Calendar.YEAR) + "��" + chunSheMonth + "��"
						+ tempCal.get(Calendar.DAY_OF_MONTH) + "��");
				break;
			}
			tempCal.add(5, 1);
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
				System.out.println("������Ϊ����" + tempCal.get(Calendar.YEAR) + "��" + qiuSheMonth + "��" + qiuSheDay + "��");
				break;
			}
			tempCal.add(5, 1);
		}

		// �����
		Calendar calendar3 = Calendar.getInstance();
		calendar3.set(year, 5, summerSolstice);
		int rufuMonth;
		int rufuDay;
		Calendar rufuCalendar;
		int i11 = 0;
		while (true) {
			LunarUtil lunarUtil3 = new LunarUtil(calendar3);
			String ganzhi = lunarUtil3.Ganzhi(calendar3);

			if (ganzhi.contains("��")) {
				i11++;
				if (i11 == 3) {
					rufuCalendar = calendar3;
					rufuMonth = calendar3.get(Calendar.MONTH) + 1;
					rufuDay = calendar3.get(Calendar.DAY_OF_MONTH);
					break;
				}
			}
			calendar3.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("����գ�" + year + "��" + rufuMonth + "��" + rufuDay + "��");

		// ������
		Calendar calendar4 = Calendar.getInstance();
		calendar4.set(year, 7, liQiu);
		int chufuMonth;
		int chufuqianDay;
		Calendar chufuCalendar;
		int i111 = 0;
		while (true) {
			LunarUtil lunarUtil4 = new LunarUtil(calendar4);
			String ganzhi = lunarUtil4.Ganzhi(calendar4);

			if (ganzhi.contains("��")) {
				i111++;
				if (i111 == 2) {
					calendar4.add(Calendar.DAY_OF_MONTH, -1);
					chufuCalendar = calendar4;
					chufuMonth = calendar4.get(Calendar.MONTH) + 1;
					chufuqianDay = calendar4.get(Calendar.DAY_OF_MONTH);
					break;
				}
			}
			calendar4.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("������ǰ��" + year + "��" + chufuMonth + "��" + chufuqianDay + "��");

		Calendar temp_rufuCalendar = rufuCalendar;
		temp_rufuCalendar.add( Calendar.DAY_OF_MONTH, -1);
		if( cal.after( temp_rufuCalendar) && cal.before(chufuCalendar)) {
			System.out.println( "��������");
		}
		
		// ũ��ÿ������
		System.out.println( "ũ��" + lunarUtil.getmMonth() + "��" + LunarUtil.lunarMonthDays(year, lunarUtil.getmMonth()) + "��");
		
		if ( lunarUtil.Ganzhi(cal).equals("����")) {
			System.out.println( "������");
		}
		
		System.out.println( "���������-----------------------------------------------");
		Calendar tempCal1 = Calendar.getInstance();
		Calendar endCal = Calendar.getInstance();
		tempCal1.set( 2020, 0, 1);
		endCal.set( 2021, 0, 1);
		
		while( tempCal1.before( endCal)) {
			LunarUtil tempLunarUtil = new LunarUtil( tempCal1);
			if ( tempLunarUtil.Ganzhi(tempCal1).equals( "����")) {
				int tempMonth = tempCal1.get( Calendar.MONTH) + 1;
				System.out.println( tempCal1.get( Calendar.YEAR) + "��" + tempMonth + "��" + tempCal1.get( Calendar.DAY_OF_MONTH) + "��");
			}
			tempCal1.add( Calendar.DAY_OF_MONTH, 1);
		}
		
		System.out.println( "--------------------------------------------------------");
		
		if( lunarUtil.cyclicalYear().equals( lunarUtil.Ganzhi(cal))) {
			System.out.println( "ֵ��̫����");
		}
		
		if ( lunarUtil.Ganzhi(cal).contains( "��") || lunarUtil.Ganzhi(cal).contains( "��")) {
			System.out.println( "������");
		}
		
		if ( LunarUtil.lunarMonthDays( cal.get( Calendar.YEAR), lunarUtil.getmMonth()) == 30 && lunarUtil.getmDay() == 18) {
			System.out.println( "�ٰ���");
		}
		System.out.println( LunarUtil.lunarMonthDays( cal.get( Calendar.YEAR), lunarUtil.getmMonth()));
		if ( LunarUtil.lunarMonthDays( cal.get( Calendar.YEAR), lunarUtil.getmMonth()) == 29 && lunarUtil.getmDay() == 17) {
			System.out.println( "�ٰ���");
		}
		
		// ʮ������
		System.out.println( "����ʮ������------------------------------------------------");
		Calendar tempCal11 = Calendar.getInstance();
		Calendar endCal1 = Calendar.getInstance();
		tempCal11.set( 1996, 0, 1);
		endCal1.set( 2050, 0, 1);
		
		while( tempCal11.before( endCal1)) {
			LunarUtil tempLunarUtil = new LunarUtil( tempCal11);
			String yearGanzhi = tempLunarUtil.cyclicalYear();
			String ganzhi = tempLunarUtil.Ganzhi( tempCal11);
			int lunarMonth = tempLunarUtil.getmMonth();
			
			if( yearGanzhi.contains( "��") && (( lunarMonth == 3 && ganzhi.equals( "����")) || (lunarMonth == 7 && ganzhi.equals( "�ﺥ")) || (lunarMonth == 10 && ganzhi.equals( "����")) || (lunarMonth == 11 && ganzhi.equals( "����")))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "��" + tempMonth1 + "��" + tempCal11.get( Calendar.DAY_OF_MONTH) + "��");
			}
			if( yearGanzhi.contains( "��") && (( lunarMonth == 3 && ganzhi.equals( "����")) || (lunarMonth == 7 && ganzhi.equals( "�ﺥ")) || (lunarMonth == 10 && ganzhi.equals( "����")) || (lunarMonth == 11 && ganzhi.equals( "����")))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "��" + tempMonth1 + "��" + tempCal11.get( Calendar.DAY_OF_MONTH) + "��");
			}
			if( yearGanzhi.contains( "��") && (( lunarMonth == 4 && ganzhi.equals( "����")) || ( lunarMonth == 9 && ganzhi.equals( "����")))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "��" + tempMonth1 + "��" + tempCal11.get( Calendar.DAY_OF_MONTH) + "��");
			}
			if( yearGanzhi.contains( "��") && (( lunarMonth == 4 && ganzhi.equals( "����")) || ( lunarMonth == 9 && ganzhi.equals( "����")))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "��" + tempMonth1 + "��" + tempCal11.get( Calendar.DAY_OF_MONTH) + "��");
			}
			if( yearGanzhi.contains( "��") && (( lunarMonth == 3 && ganzhi.equals( "����")) || ( lunarMonth == 9 && ganzhi.equals( "����")) || ( lunarMonth == 10 && ganzhi.equals( "�׳�")))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "��" + tempMonth1 + "��" + tempCal11.get( Calendar.DAY_OF_MONTH) + "��");
			}
			if( yearGanzhi.contains( "��") && (( lunarMonth == 3 && ganzhi.equals( "����")) || ( lunarMonth == 9 && ganzhi.equals( "����")) || ( lunarMonth == 10 && ganzhi.equals( "�׳�")))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "��" + tempMonth1 + "��" + tempCal11.get( Calendar.DAY_OF_MONTH) + "��");
			}
			if( yearGanzhi.contains( "��") && (lunarMonth == 6 && ganzhi.equals( "����"))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "��" + tempMonth1 + "��" + tempCal11.get( Calendar.DAY_OF_MONTH) + "��");
			}
			if( yearGanzhi.contains( "��") && (lunarMonth == 6 && ganzhi.equals( "����"))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "��" + tempMonth1 + "��" + tempCal11.get( Calendar.DAY_OF_MONTH) + "��");
			}
			
			tempCal11.add( Calendar.DAY_OF_MONTH, 1);
		}
		
		System.out.println( "-------------------------------------------------------------");
		
		// �������������
		Calendar tempCal2 = Calendar.getInstance();
		tempCal2.set( 2014, 11, winterSolstice);
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
		int gengMonth = gengCal.get( Calendar.MONTH) + 1;
		System.out.println( gengCal.get( Calendar.YEAR) + "��" + gengMonth + "��" + gengCal.get( Calendar.DAY_OF_MONTH) + "��");
		
		if( gengCal.get( Calendar.YEAR) == cal.get( Calendar.YEAR) && gengCal.get( Calendar.MONTH) == cal.get( Calendar.MONTH) && gengCal.get( Calendar.DAY_OF_MONTH) == cal.get( Calendar.DAY_OF_MONTH)) {
			System.out.println( gengCal.get( Calendar.YEAR) + "��" + gengMonth + "��" + gengCal.get( Calendar.DAY_OF_MONTH) + "��" + "���Ƕ��������");
		}
		
		Calendar tempCal3 = Calendar.getInstance();
		tempCal3.set( year, 11, winterSolstice);
		Calendar wuCal = Calendar.getInstance();
		int i1111 = 0;
		while( true) {
			LunarUtil lunarUtil3 = new LunarUtil( tempCal3);
			String tempGanzhi = lunarUtil3.Ganzhi( tempCal3);
			if( tempGanzhi.contains( "��")) {
				i1111++;
				if( i1111 == 3) {
					wuCal = tempCal3;
					break;
				}
			}
			tempCal3.add( Calendar.DAY_OF_MONTH, 1);
		}
		
		int wuMonth = wuCal.get( Calendar.MONTH) + 1;
		System.out.println( "����������������ǣ�" + wuCal.get( Calendar.YEAR) + "��" + wuMonth + "��" + wuCal.get( Calendar.DAY_OF_MONTH) + "��");
		
		if( wuCal.get( Calendar.YEAR) == cal.get( Calendar.YEAR) && wuCal.get( Calendar.MONTH) == cal.get( Calendar.MONTH) && wuCal.get( Calendar.DAY_OF_MONTH) == cal.get( Calendar.DAY_OF_MONTH)) {
			System.out.println( "�Ƕ��������������");
		}
	}
}
