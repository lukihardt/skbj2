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
		System.out.println( "年干支：" + lunarUtil.cyclicalYear());
		System.out.println(lunarUtil.Ganzhi(cal));

		int vernalEquinox;
		int year = 2016;
		vernalEquinox = (int) Math.floor(year % 100 * 0.2422 + 20.646) - (int) Math.floor(year % 100 / (double) 4);
		System.out.println(vernalEquinox);

		int autumnalEquinox;
		autumnalEquinox = (int) Math.floor(year % 100 * 0.2422 + 23.042) - (int) Math.floor(year % 100 / (double) 4);
		System.out.println("秋分日 : " + autumnalEquinox + "号");

		int summerSolstice;
		summerSolstice = (int) Math.floor((year % 100) * 0.2422 + 21.37) - (int) Math.floor((year % 100) / (double) 4);
		System.out.println("夏至日 : " + summerSolstice + "号");

		int winterSolstice;
		winterSolstice = (int) Math.floor((year % 100) * 0.2422 + 21.94) - (int) Math.floor((year % 100) / (double) 4);
		System.out.println("冬至日 : " + winterSolstice + "号");

		int liChun;
		liChun = (int) Math.floor((year % 100) * 0.2422 + 3.87) - (int) Math.floor(((year % 100) - 1) / (double) 4);
		System.out.println("立春日 : " + liChun + "号");

		int liXia;
		liXia = (int) Math.floor((year % 100) * 0.2422 + 5.52) - (int) Math.floor((year % 100) / (double) 4);
		System.out.println("立夏日 : " + liXia + "号");

		int liQiu;
		liQiu = (int) Math.floor((year % 100) * 0.2422 + 7.5) - (int) Math.floor((year % 100) / (double) 4);
		System.out.println("立秋日 : " + liQiu + "号");

		int liDong;
		liDong = (int) Math.floor((year % 100) * 0.2422 + 7.438) - (int) Math.floor((year % 100) / (double) 4);
		System.out.println("立冬日 : " + liDong + "号");

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

		// 春社日
		Calendar tempCal = Calendar.getInstance();
		tempCal.set(year, 1, liChun);
		int i1 = 0;
		while (true) {
			LunarUtil lunarUtil2 = new LunarUtil(tempCal);
			String ganzhi = lunarUtil2.Ganzhi(tempCal); // 获得当日干支

			if (ganzhi.contains("戊")) {
				i1++;
			}
			if (i1 == 5) {
				int chunSheMonth = tempCal.get(Calendar.MONTH) + 1;
				System.out.println("春社日为公历" + tempCal.get(Calendar.YEAR) + "年" + chunSheMonth + "月"
						+ tempCal.get(Calendar.DAY_OF_MONTH) + "日");
				break;
			}
			tempCal.add(5, 1);
		}

		// 秋社日
		tempCal.set(year, 7, liQiu);
		int i2 = 0;

		int qiuSheMonth; // 公历
		int qiuSheDay; // 公历
		while (true) {
			LunarUtil lunarUtil2 = new LunarUtil(tempCal);
			String ganzhi = lunarUtil2.Ganzhi(tempCal); // 获得当日干支

			if (ganzhi.contains("戊")) {
				i2++;
			}
			if (i2 == 5) {
				qiuSheMonth = tempCal.get(Calendar.MONTH) + 1;
				qiuSheDay = tempCal.get(Calendar.DAY_OF_MONTH);
				System.out.println("秋社日为公历" + tempCal.get(Calendar.YEAR) + "年" + qiuSheMonth + "月" + qiuSheDay + "日");
				break;
			}
			tempCal.add(5, 1);
		}

		// 入伏日
		Calendar calendar3 = Calendar.getInstance();
		calendar3.set(year, 5, summerSolstice);
		int rufuMonth;
		int rufuDay;
		Calendar rufuCalendar;
		int i11 = 0;
		while (true) {
			LunarUtil lunarUtil3 = new LunarUtil(calendar3);
			String ganzhi = lunarUtil3.Ganzhi(calendar3);

			if (ganzhi.contains("庚")) {
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
		System.out.println("入伏日：" + year + "年" + rufuMonth + "月" + rufuDay + "日");

		// 出伏日
		Calendar calendar4 = Calendar.getInstance();
		calendar4.set(year, 7, liQiu);
		int chufuMonth;
		int chufuqianDay;
		Calendar chufuCalendar;
		int i111 = 0;
		while (true) {
			LunarUtil lunarUtil4 = new LunarUtil(calendar4);
			String ganzhi = lunarUtil4.Ganzhi(calendar4);

			if (ganzhi.contains("庚")) {
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
		System.out.println("出伏日前：" + year + "年" + chufuMonth + "月" + chufuqianDay + "日");

		Calendar temp_rufuCalendar = rufuCalendar;
		temp_rufuCalendar.add( Calendar.DAY_OF_MONTH, -1);
		if( cal.after( temp_rufuCalendar) && cal.before(chufuCalendar)) {
			System.out.println( "三伏日内");
		}
		
		// 农历每月天数
		System.out.println( "农历" + lunarUtil.getmMonth() + "月" + LunarUtil.lunarMonthDays(year, lunarUtil.getmMonth()) + "天");
		
		if ( lunarUtil.Ganzhi(cal).equals("甲子")) {
			System.out.println( "甲子日");
		}
		
		System.out.println( "计算庚子日-----------------------------------------------");
		Calendar tempCal1 = Calendar.getInstance();
		Calendar endCal = Calendar.getInstance();
		tempCal1.set( 2020, 0, 1);
		endCal.set( 2021, 0, 1);
		
		while( tempCal1.before( endCal)) {
			LunarUtil tempLunarUtil = new LunarUtil( tempCal1);
			if ( tempLunarUtil.Ganzhi(tempCal1).equals( "庚子")) {
				int tempMonth = tempCal1.get( Calendar.MONTH) + 1;
				System.out.println( tempCal1.get( Calendar.YEAR) + "年" + tempMonth + "月" + tempCal1.get( Calendar.DAY_OF_MONTH) + "日");
			}
			tempCal1.add( Calendar.DAY_OF_MONTH, 1);
		}
		
		System.out.println( "--------------------------------------------------------");
		
		if( lunarUtil.cyclicalYear().equals( lunarUtil.Ganzhi(cal))) {
			System.out.println( "值年太岁日");
		}
		
		if ( lunarUtil.Ganzhi(cal).contains( "丙") || lunarUtil.Ganzhi(cal).contains( "丁")) {
			System.out.println( "丙丁日");
		}
		
		if ( LunarUtil.lunarMonthDays( cal.get( Calendar.YEAR), lunarUtil.getmMonth()) == 30 && lunarUtil.getmDay() == 18) {
			System.out.println( "毁败日");
		}
		System.out.println( LunarUtil.lunarMonthDays( cal.get( Calendar.YEAR), lunarUtil.getmMonth()));
		if ( LunarUtil.lunarMonthDays( cal.get( Calendar.YEAR), lunarUtil.getmMonth()) == 29 && lunarUtil.getmDay() == 17) {
			System.out.println( "毁败日");
		}
		
		// 十大恶败日
		System.out.println( "计算十大恶败日------------------------------------------------");
		Calendar tempCal11 = Calendar.getInstance();
		Calendar endCal1 = Calendar.getInstance();
		tempCal11.set( 1996, 0, 1);
		endCal1.set( 2050, 0, 1);
		
		while( tempCal11.before( endCal1)) {
			LunarUtil tempLunarUtil = new LunarUtil( tempCal11);
			String yearGanzhi = tempLunarUtil.cyclicalYear();
			String ganzhi = tempLunarUtil.Ganzhi( tempCal11);
			int lunarMonth = tempLunarUtil.getmMonth();
			
			if( yearGanzhi.contains( "甲") && (( lunarMonth == 3 && ganzhi.equals( "戊戌")) || (lunarMonth == 7 && ganzhi.equals( "癸亥")) || (lunarMonth == 10 && ganzhi.equals( "丙申")) || (lunarMonth == 11 && ganzhi.equals( "丁亥")))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "年" + tempMonth1 + "月" + tempCal11.get( Calendar.DAY_OF_MONTH) + "日");
			}
			if( yearGanzhi.contains( "己") && (( lunarMonth == 3 && ganzhi.equals( "戊戌")) || (lunarMonth == 7 && ganzhi.equals( "癸亥")) || (lunarMonth == 10 && ganzhi.equals( "丙申")) || (lunarMonth == 11 && ganzhi.equals( "丁亥")))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "年" + tempMonth1 + "月" + tempCal11.get( Calendar.DAY_OF_MONTH) + "日");
			}
			if( yearGanzhi.contains( "乙") && (( lunarMonth == 4 && ganzhi.equals( "壬申")) || ( lunarMonth == 9 && ganzhi.equals( "乙巳")))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "年" + tempMonth1 + "月" + tempCal11.get( Calendar.DAY_OF_MONTH) + "日");
			}
			if( yearGanzhi.contains( "庚") && (( lunarMonth == 4 && ganzhi.equals( "壬申")) || ( lunarMonth == 9 && ganzhi.equals( "乙巳")))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "年" + tempMonth1 + "月" + tempCal11.get( Calendar.DAY_OF_MONTH) + "日");
			}
			if( yearGanzhi.contains( "丙") && (( lunarMonth == 3 && ganzhi.equals( "辛巳")) || ( lunarMonth == 9 && ganzhi.equals( "庚辰")) || ( lunarMonth == 10 && ganzhi.equals( "甲辰")))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "年" + tempMonth1 + "月" + tempCal11.get( Calendar.DAY_OF_MONTH) + "日");
			}
			if( yearGanzhi.contains( "辛") && (( lunarMonth == 3 && ganzhi.equals( "辛巳")) || ( lunarMonth == 9 && ganzhi.equals( "庚辰")) || ( lunarMonth == 10 && ganzhi.equals( "甲辰")))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "年" + tempMonth1 + "月" + tempCal11.get( Calendar.DAY_OF_MONTH) + "日");
			}
			if( yearGanzhi.contains( "戊") && (lunarMonth == 6 && ganzhi.equals( "己丑"))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "年" + tempMonth1 + "月" + tempCal11.get( Calendar.DAY_OF_MONTH) + "日");
			}
			if( yearGanzhi.contains( "癸") && (lunarMonth == 6 && ganzhi.equals( "己丑"))) {
				int tempMonth1 = tempCal11.get( Calendar.MONTH) + 1;
				System.out.println( tempCal11.get( Calendar.YEAR) + "年" + tempMonth1 + "月" + tempCal11.get( Calendar.DAY_OF_MONTH) + "日");
			}
			
			tempCal11.add( Calendar.DAY_OF_MONTH, 1);
		}
		
		System.out.println( "-------------------------------------------------------------");
		
		// 冬至后庚，辛日
		Calendar tempCal2 = Calendar.getInstance();
		tempCal2.set( 2014, 11, winterSolstice);
		Calendar gengCal = Calendar.getInstance();
		while( true) {
			LunarUtil lunarUtil2 = new LunarUtil(tempCal2);
			String tempGanzhi = lunarUtil2.Ganzhi( tempCal2);
			if ( tempGanzhi.contains( "庚")) {
				gengCal = tempCal2;
				break;
			}
			tempCal2.add( Calendar.DAY_OF_MONTH, 1);
		}
		int gengMonth = gengCal.get( Calendar.MONTH) + 1;
		System.out.println( gengCal.get( Calendar.YEAR) + "年" + gengMonth + "月" + gengCal.get( Calendar.DAY_OF_MONTH) + "日");
		
		if( gengCal.get( Calendar.YEAR) == cal.get( Calendar.YEAR) && gengCal.get( Calendar.MONTH) == cal.get( Calendar.MONTH) && gengCal.get( Calendar.DAY_OF_MONTH) == cal.get( Calendar.DAY_OF_MONTH)) {
			System.out.println( gengCal.get( Calendar.YEAR) + "年" + gengMonth + "月" + gengCal.get( Calendar.DAY_OF_MONTH) + "日" + "，是冬至后庚日");
		}
		
		Calendar tempCal3 = Calendar.getInstance();
		tempCal3.set( year, 11, winterSolstice);
		Calendar wuCal = Calendar.getInstance();
		int i1111 = 0;
		while( true) {
			LunarUtil lunarUtil3 = new LunarUtil( tempCal3);
			String tempGanzhi = lunarUtil3.Ganzhi( tempCal3);
			if( tempGanzhi.contains( "戌")) {
				i1111++;
				if( i1111 == 3) {
					wuCal = tempCal3;
					break;
				}
			}
			tempCal3.add( Calendar.DAY_OF_MONTH, 1);
		}
		
		int wuMonth = wuCal.get( Calendar.MONTH) + 1;
		System.out.println( "冬至后第三个戌日是：" + wuCal.get( Calendar.YEAR) + "年" + wuMonth + "月" + wuCal.get( Calendar.DAY_OF_MONTH) + "日");
		
		if( wuCal.get( Calendar.YEAR) == cal.get( Calendar.YEAR) && wuCal.get( Calendar.MONTH) == cal.get( Calendar.MONTH) && wuCal.get( Calendar.DAY_OF_MONTH) == cal.get( Calendar.DAY_OF_MONTH)) {
			System.out.println( "是冬至后第三个戌日");
		}
	}
}
