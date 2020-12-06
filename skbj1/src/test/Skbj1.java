package test;

import java.util.Calendar;
import java.util.Scanner;

import util.LunarUtil;

public class Skbj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入公历的年份: ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();

		System.out.print("请输入公历的月份: ");
		int month = scanner.nextInt();

		System.out.print("请输入公历的日子: ");
		int day = scanner.nextInt();

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);
		LunarUtil lunarUtil = new LunarUtil(calendar);

		// 农历的月份
		int lunarMonth = lunarUtil.getmMonth();
		int lunarDay = lunarUtil.getmDay();
		
//		//调试
//		System.out.println(lunarMonth);
//		System.out.println(lunarDay);

		int flag = 0;
		String cause = "";

		switch (lunarMonth) {
		case 1:
			switch (lunarDay) {
			case 1:
				cause = cause + "每月固定节日，";
				break;
			case 3:
				cause = cause + "每月固定节日，";
				break;
			case 5:
				cause = cause + "每月固定节日，";
				break;
			case 6:
				cause = cause + "每月固定节日，";
				break;
			case 7:
				cause = cause + "每月固定节日，";
				break;
			case 8:
				cause = cause + "每月固定节日，";
				break;
			case 9:
				cause = cause + "每月固定节日，";
				break;
			case 13:
				cause = cause + "每月固定节日，";
				break;
			case 14:
				cause = cause + "每月固定节日，";
				break;
			case 15:
				cause = cause + "每月固定节日，";
				break;
			case 16:
				cause = cause + "每月固定节日，";
				break;
			case 19:
				cause = cause + "每月固定节日，";
				break;
			case 23:
				cause = cause + "每月固定节日，";
				break;
			case 25:
				cause = cause + "每月固定节日，";
				break;
			case 27:
				cause = cause + "每月固定节日，";
				break;
			case 28:
				cause = cause + "每月固定节日，";
				break;
			case 29:
				cause = cause + "每月固定节日，";
				break;
			case 30:
				cause = cause + "每月固定节日，";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 2:
			switch (lunarDay) {
			case 1:
				cause = cause + "每月固定节日，";
				break;
			case 2:
				cause = cause + "每月固定节日，";
				break;
			case 3:
				cause = cause + "每月固定节日，";
				break;
			case 6:
				cause = cause + "每月固定节日，";
				break;
			case 8:
				cause = cause + "每月固定节日，";
				break;
			case 11:
				cause = cause + "每月固定节日，";
				break;
			case 14:
				cause = cause + "每月固定节日，";
				break;
			case 15:
				cause = cause + "每月固定节日，";
				break;
			case 17:
				cause = cause + "每月固定节日，";
				break;
			case 18:
				cause = cause + "每月固定节日，";
				break;
			case 19:
				cause = cause + "每月固定节日，";
				break;
			case 21:
				cause = cause + "每月固定节日，";
				break;
			case 23:
				cause = cause + "每月固定节日，";
				break;
			case 25:
				cause = cause + "每月固定节日，";
				break;
			case 27:
				cause = cause + "每月固定节日，";
				break;
			case 28:
				cause = cause + "每月固定节日，";
				break;
			case 29:
				cause = cause + "每月固定节日，";
				break;
			case 30:
				cause = cause + "每月固定节日，";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 3:
			switch (lunarDay) {
			case 1:
				cause = cause + "每月固定节日，";
				break;
			case 3:
				cause = cause + "每月固定节日，";
				break;
			case 6:
				cause = cause + "每月固定节日，";
				break;
			case 8:
				cause = cause + "每月固定节日，";
				break;
			case 9:
				cause = cause + "每月固定节日，";
				break;
			case 12:
				cause = cause + "每月固定节日，";
				break;
			case 14:
				cause = cause + "每月固定节日，";
				break;
			case 15:
				cause = cause + "每月固定节日，";
				break;
			case 16:
				cause = cause + "每月固定节日，";
				break;
			case 18:
				cause = cause + "每月固定节日，";
				break;
			case 20:
				cause = cause + "每月固定节日，";
				break;
			case 23:
				cause = cause + "每月固定节日，";
				break;
			case 25:
				cause = cause + "每月固定节日，";
				break;
			case 27:
				cause = cause + "每月固定节日，";
				break;
			case 28:
				cause = cause + "每月固定节日，";
				break;
			case 29:
				cause = cause + "每月固定节日，";
				break;
			case 30:
				cause = cause + "每月固定节日，";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 4:
			switch (lunarDay) {
			case 1:
				cause = cause + "每月固定节日，";
				break;
			case 3:
				cause = cause + "每月固定节日，";
				break;
			case 4:
				cause = cause + "每月固定节日，";
				break;
			case 6:
				cause = cause + "每月固定节日，";
				break;
			case 7:
				cause = cause + "每月固定节日，";
				break;
			case 8:
				cause = cause + "每月固定节日，";
				break;
			case 14:
				cause = cause + "每月固定节日，";
				break;
			case 15:
				cause = cause + "每月固定节日，";
				break;
			case 16:
				cause = cause + "每月固定节日，";
				break;
			case 17:
				cause = cause + "每月固定节日，";
				break;
			case 18:
				cause = cause + "每月固定节日，";
				break;
			case 20:
				cause = cause + "每月固定节日，";
				break;
			case 23:
				cause = cause + "每月固定节日，";
				break;
			case 25:
				cause = cause + "每月固定节日，";
				break;
			case 27:
				cause = cause + "每月固定节日，";
				break;
			case 28:
				cause = cause + "每月固定节日，";
				break;
			case 29:
				cause = cause + "每月固定节日，";
				break;
			case 30:
				cause = cause + "每月固定节日，";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 5:
			switch (lunarDay) {
			case 1:
				cause = cause + "每月固定节日，";
				break;
			case 3:
				cause = cause + "每月固定节日，";
				break;
			case 5:
				cause = cause + "每月固定节日，";
				break;
			case 6:
				cause = cause + "每月固定节日，";
				break;
			case 7:
				cause = cause + "每月固定节日，";
				break;
			case 8:
				cause = cause + "每月固定节日，";
				break;
			case 11:
				cause = cause + "每月固定节日，";
				break;
			case 12:
				cause = cause + "每月固定节日，";
				break;
			case 13:
				cause = cause + "每月固定节日，";
				break;
			case 14:
				cause = cause + "每月固定节日，";
				break;
			case 15:
				cause = cause + "每月固定节日，";
				break;
			case 16:
				cause = cause + "每月固定节日，";
				break;
			case 17:
				cause = cause + "每月固定节日，";
				break;
			case 18:
				cause = cause + "每月固定节日，";
				break;
			case 22:
				cause = cause + "每月固定节日，";
				break;
			case 23:
				cause = cause + "每月固定节日，";
				break;
			case 25:
				cause = cause + "每月固定节日，";
				break;
			case 26:
				cause = cause + "每月固定节日，";
				break;
			case 27:
				cause = cause + "每月固定节日，";
				break;
			case 28:
				cause = cause + "每月固定节日，";
				break;
			case 29:
				cause = cause + "每月固定节日，";
				break;
			case 30:
				cause = cause + "每月固定节日，";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 6:
			switch (lunarDay) {
			case 1:
				cause = cause + "每月固定节日，";
				break;
			case 3:
				cause = cause + "每月固定节日，";
				break;
			case 4:
				cause = cause + "每月固定节日，";
				break;
			case 6:
				cause = cause + "每月固定节日，";
				break;
			case 8:
				cause = cause + "每月固定节日，";
				break;
			case 10:
				cause = cause + "每月固定节日，";
				break;
			case 13:
				cause = cause + "每月固定节日，";
				break;
			case 14:
				cause = cause + "每月固定节日，";
				break;
			case 15:
				cause = cause + "每月固定节日，";
				break;
			case 19:
				cause = cause + "每月固定节日，";
				break;
			case 23:
				cause = cause + "每月固定节日，";
				break;
			case 24:
				cause = cause + "每月固定节日，";
				break;
			case 25:
				cause = cause + "每月固定节日，";
				break;
			case 27:
				cause = cause + "每月固定节日，";
				break;
			case 28:
				cause = cause + "每月固定节日，";
				break;
			case 29:
				cause = cause + "每月固定节日，";
				break;
			case 30:
				cause = cause + "每月固定节日，";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 7:
			switch (lunarDay) {
			case 1:
				cause = cause + "每月固定节日，";
				break;
			case 3:
				cause = cause + "每月固定节日，";
				break;
			case 5:
				cause = cause + "每月固定节日，";
				break;
			case 6:
				cause = cause + "每月固定节日，";
				break;
			case 7:
				cause = cause + "每月固定节日，";
				break;
			case 8:
				cause = cause + "每月固定节日，";
				break;
			case 10:
				cause = cause + "每月固定节日，";
				break;
			case 12:
				cause = cause + "每月固定节日，";
				break;
			case 13:
				cause = cause + "每月固定节日，";
				break;
			case 14:
				cause = cause + "每月固定节日，";
				break;
			case 15:
				cause = cause + "每月固定节日，";
				break;
			case 16:
				cause = cause + "每月固定节日，";
				break;
			case 18:
				cause = cause + "每月固定节日，";
				break;
			case 19:
				cause = cause + "每月固定节日，";
				break;
			case 22:
				cause = cause + "每月固定节日，";
				break;
			case 23:
				cause = cause + "每月固定节日，";
				break;
			case 25:
				cause = cause + "每月固定节日，";
				break;
			case 27:
				cause = cause + "每月固定节日，";
				break;
			case 28:
				cause = cause + "每月固定节日，";
				break;
			case 29:
				cause = cause + "每月固定节日，";
				break;
			case 30:
				cause = cause + "每月固定节日，";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 8:
			switch (lunarDay) {
			case 1:
				cause = cause + "每月固定节日，";
				break;
			case 3:
				cause = cause + "每月固定节日，";
				break;
			case 5:
				cause = cause + "每月固定节日，";
				break;
			case 6:
				cause = cause + "每月固定节日，";
				break;
			case 8:
				cause = cause + "每月固定节日，";
				break;
			case 10:
				cause = cause + "每月固定节日，";
				break;
			case 12:
				cause = cause + "每月固定节日，";
				break;
			case 14:
				cause = cause + "每月固定节日，";
				break;
			case 15:
				cause = cause + "每月固定节日，";
				break;
			case 16:
				cause = cause + "每月固定节日，";
				break;
			case 18:
				cause = cause + "每月固定节日，";
				break;
			case 23:
				cause = cause + "每月固定节日，";
				break;
			case 24:
				cause = cause + "每月固定节日，";
				break;
			case 25:
				cause = cause + "每月固定节日，";
				break;
			case 27:
				cause = cause + "每月固定节日，";
				break;
			case 28:
				cause = cause + "每月固定节日，";
				break;
			case 29:
				cause = cause + "每月固定节日，";
				break;
			case 30:
				cause = cause + "每月固定节日，";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 9:
			switch (lunarDay) {
			case 1:
				cause = cause + "每月固定节日，";
				break;
			case 3:
				cause = cause + "每月固定节日，";
				break;
			case 8:
				cause = cause + "每月固定节日，";
				break;
			case 9:
				cause = cause + "每月固定节日，";
				break;
			case 10:
				cause = cause + "每月固定节日，";
				break;
			case 11:
				cause = cause + "每月固定节日，";
				break;
			case 13:
				cause = cause + "每月固定节日，";
				break;
			case 14:
				cause = cause + "每月固定节日，";
				break;
			case 15:
				cause = cause + "每月固定节日，";
				break;
			case 17:
				cause = cause + "每月固定节日，";
				break;
			case 19:
				cause = cause + "每月固定节日，";
				break;
			case 23:
				cause = cause + "每月固定节日，";
				break;
			case 25:
				cause = cause + "每月固定节日，";
				break;
			case 27:
				cause = cause + "每月固定节日，";
				break;
			case 28:
				cause = cause + "每月固定节日，";
				break;
			case 29:
				cause = cause + "每月固定节日，";
				break;
			case 30:
				cause = cause + "每月固定节日，";
				break;
			default:
				flag = 1;
				break;
			}
		break;
		case 10:
			switch (lunarDay) {
			case 1:
				cause = cause + "每月固定节日，";
				break;
			case 3:
				cause = cause + "每月固定节日，";
				break;
			case 5:
				cause = cause + "每月固定节日，";
				break;
			case 6:
				cause = cause + "每月固定节日，";
				break;
			case 8:
				cause = cause + "每月固定节日，";
				break;
			case 10:
				cause = cause + "每月固定节日，";
				break;
			case 11:
				cause = cause + "每月固定节日，";
				break;
			case 14:
				cause = cause + "每月固定节日，";
				break;
			case 15:
				cause = cause + "每月固定节日，";
				break;
			case 16:
				cause = cause + "每月固定节日，";
				break;
			case 23:
				cause = cause + "每月固定节日，";
				break;
			case 25:
				cause = cause + "每月固定节日，";
				break;
			case 27:
				cause = cause + "每月固定节日，";
				break;
			case 28:
				cause = cause + "每月固定节日，";
				break;
			case 29:
				cause = cause + "每月固定节日，";
				break;
			case 30:
				cause = cause + "每月固定节日，";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 11:
			switch (lunarDay) {
			case 1:
				cause = cause + "每月固定节日，";
				break;
			case 3:
				cause = cause + "每月固定节日，";
				break;
			case 4:
				cause = cause + "每月固定节日，";
				break;
			case 6:
				cause = cause + "每月固定节日，";
				break;
			case 8:
				cause = cause + "每月固定节日，";
				break;
			case 11:
				cause = cause + "每月固定节日，";
				break;
			case 14:
				cause = cause + "每月固定节日，";
				break;
			case 15:
				cause = cause + "每月固定节日，";
				break;
			case 17:
				cause = cause + "每月固定节日，";
				break;
			case 19:
				cause = cause + "每月固定节日，";
				break;
			case 21:
				cause = cause + "每月固定节日，";
				break;
			case 23:
				cause = cause + "每月固定节日，";
				break;
			case 25:
				cause = cause + "每月固定节日，";
				break;
			case 26:
				cause = cause + "每月固定节日，";
				break;
			case 27:
				cause = cause + "每月固定节日，";
				break;
			case 28:
				cause = cause + "每月固定节日，";
				break;
			case 29:
				cause = cause + "每月固定节日，";
				break;
			case 30:
				cause = cause + "每月固定节日，";
				break;

			default:
				flag = 1;
				break;
			}
		break;
		case 12:
			switch (lunarDay) {
			case 1:
				cause = cause + "每月固定节日，";
				break;
			case 3:
				cause = cause + "每月固定节日，";
				break;
			case 6:
				cause = cause + "每月固定节日，";
				break;
			case 7:
				cause = cause + "每月固定节日，";
				break;
			case 8:
				cause = cause + "每月固定节日，";
				break;
			case 12:
				cause = cause + "每月固定节日，";
				break;
			case 14:
				cause = cause + "每月固定节日，";
				break;
			case 15:
				cause = cause + "每月固定节日，";
				break;
			case 16:
				cause = cause + "每月固定节日，";
				break;
			case 19:
				cause = cause + "每月固定节日，";
				break;
			case 20:
				cause = cause + "每月固定节日，";
				break;
			case 21:
				cause = cause + "每月固定节日，";
				break;
			case 23:
				cause = cause + "每月固定节日，";
				break;
			case 24:
				cause = cause + "每月固定节日，";
				break;
			case 25:
				cause = cause + "每月固定节日，";
				break;
			case 27:
				cause = cause + "每月固定节日，";
				break;
			case 28:
				cause = cause + "每月固定节日，";
				break;
			case 29:
				cause = cause + "每月固定节日，";
				break;
			case 30:
				cause = cause + "每月固定节日，";
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
		// 春分日期
		int vernalEquinox;
		vernalEquinox = (int) Math.floor((year % 100) * 0.2422 + 20.646) - (int) Math.floor((year % 100) / (double) 4);
		if (month == 3) {
			if (day - vernalEquinox <= 3 && day - vernalEquinox >= -3) {
				flag = 0;
				cause += "春分范围内，";
			}
		}

		// 秋分日期
		int autumnalEquinox;
		autumnalEquinox = (int) Math.floor(year % 100 * 0.2422 + 23.042) - (int) Math.floor(year % 100 / (double) 4);
		if (month == 9) {
			if (day - autumnalEquinox <= 3 && day - autumnalEquinox >= -3) {
				flag = 0;
				cause += "秋分范围内，";
			}
		}

		// 夏至日期
		int summerSolstice;
		summerSolstice = (int) Math.floor((year % 100) * 0.2422 + 21.37) - (int) Math.floor((year % 100) / (double) 4);
		if (month == 6) {
			if (day - summerSolstice <= 3 && day - summerSolstice >= -3) {
				flag = 0;
				cause += "夏至范围内，";
			}
		}

		// 冬至日期
		int winterSolstice;
		winterSolstice = (int) Math.floor((year % 100) * 0.2422 + 21.94) - (int) Math.floor((year % 100) / (double) 4);
		if (year == 2021) {
			winterSolstice--;
		}
		if (month == 12) {
			if (day - winterSolstice <= 3 && day - winterSolstice >= -3) {
				flag = 0;
				cause += "冬至范围内，";
			}
		}
		
		
		

		// 三元日
		if (lunarDay == 15 && (lunarMonth == 1 || lunarMonth == 7 || lunarMonth == 10)) {
			flag = 0;
			cause += "三元日，";
		}

		// 四立日 && 四绝日
		// 立春日
		int liChun;
		liChun = (int) Math.floor((year % 100) * 0.2422 + 3.87) - (int) Math.floor(((year % 100) - 1) / (double) 4);
		if (month == 2) {
			if (day == liChun || day == liChun - 1) {
				flag = 0;
				cause += "立春范围内，";
			}
		}

		// 立夏日
		int liXia;
		liXia = (int) Math.floor((year % 100) * 0.2422 + 5.52) - (int) Math.floor((year % 100) / (double) 4);
		if (month == 5) {
			if (day == liXia || day == liXia - 1) {
				flag = 0;
				cause += "立夏范围内，";
			}
		}

		// 立秋日
		int liQiu;
		liQiu = (int) Math.floor((year % 100) * 0.2422 + 7.5) - (int) Math.floor((year % 100) / (double) 4);
		if (year == 2002) {
			++liQiu;
		}
		if (month == 8) {
			if (day == liQiu || day == liQiu - 1) {
				flag = 0;
				cause += "立秋范围内，";
			}
		}

		// 立冬日
		int liDong;
		liDong = (int) Math.floor((year % 100) * 0.2422 + 7.438) - (int) Math.floor((year % 100) / (double) 4);
		if (month == 11) {
			if (day == liDong || day == liDong - 1) {
				flag = 0;
				cause += "立冬范围内，";
			}
		}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/**
		 * 二社日
		 */
		// 春社日
		Calendar tempCal = Calendar.getInstance();
		tempCal.set(year, 1, liChun);
		int i = 0;

		int chunSheMonth; // 公历
		int chunSheDay; // 公历
		while (true) {
			LunarUtil lunarUtil2 = new LunarUtil(tempCal);
			String ganzhi = lunarUtil2.Ganzhi(tempCal); // 获得当日干支

			if (ganzhi.contains("戊")) {
				i++;
			}
			if (i == 5) {
				chunSheMonth = tempCal.get(Calendar.MONTH) + 1;
				chunSheDay = tempCal.get(Calendar.DAY_OF_MONTH);
				// System.out.println("春社日为公历" + tempCal.get(Calendar.YEAR) + "年" + chunSheMonth + "月" + chunSheDay + "日");
				break;
			}
			tempCal.add(5, 1);
		}
		// 判断是否为春社日
		if (month == chunSheMonth && day == chunSheDay) {
			flag = 0;
			cause += "是春社日，";
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
				// System.out.println("秋社日为公历" + tempCal.get(Calendar.YEAR) + "年" + qiuSheMonth + "月" + qiuSheDay + "日");
				break;
			}
			tempCal.add(5, 1);
		}
		// 判断是否为秋社日
		if (month == qiuSheMonth && day == qiuSheDay) {
			flag = 0;
			cause += "是秋社日，";
		}

		/**
		 * 三伏日
		 */
		// 入伏日
		Calendar calendar3 = Calendar.getInstance();
		calendar3.set(year, 5, summerSolstice);
		// int rufuMonth;
		// int rufuDay;
		Calendar rufuCalendar;
		int i1 = 0;
		while (true) {
			LunarUtil lunarUtil3 = new LunarUtil(calendar3);
			String ganzhi = lunarUtil3.Ganzhi(calendar3);

			if (ganzhi.contains("庚")) {
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
		// 出伏日
		Calendar calendar4 = Calendar.getInstance();
		calendar4.set(year, 7, liQiu);
		// int chufuMonth;
		// int chufuqianDay;
		Calendar chufuCalendar;
		int i11 = 0;
		while (true) {
			LunarUtil lunarUtil4 = new LunarUtil(calendar4);
			String ganzhi = lunarUtil4.Ganzhi(calendar4);

			if (ganzhi.contains("庚")) {
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
			cause += "三伏日内，";
		}

		// 弦日
		if (lunarDay == 7 || lunarDay == 8) {
			flag = 0;
			cause += "上弦日，";
		}
		if (lunarDay == 22 || lunarDay == 23) {
			flag = 0;
			cause += "下弦日，";
		}

		// 晦日
		int lunarMonthDays = LunarUtil.lunarMonthDays(year, lunarMonth);
		if (lunarDay == lunarMonthDays) {
			flag = 0;
			cause += "晦日，";
		}

		// 三辛日
		String ganzhi = lunarUtil.Ganzhi(calendar);
		if (ganzhi.contains("辛")) {
			flag = 0;
			cause += "三辛日，";
		}

		// 甲子日，庚申日，值年太岁日
		if (ganzhi.equals("甲子")) {
			flag = 0;
			cause += "甲子日";
		}
		if( ganzhi.equals( "庚申")) {
			flag = 0;
			cause += "庚申日";
		}
		if( lunarUtil.cyclicalYear().equals( ganzhi)) {
			flag = 0;
			cause += "值年太岁日";
		}
		
		// 丙丁日
		if ( ganzhi.contains( "丙") || ganzhi.contains( "丁")) {
			flag = 0;
			cause += "丙丁日，";
		}

		// 毁败日
		if ( lunarMonthDays == 30 && lunarDay == 18) {
			flag = 0;
			cause += "毁败日";
		}
		if ( lunarMonthDays == 29 && lunarDay == 17) {
			flag = 0;
			cause += "毁败日";
		}
		
		// 十大恶败日
		String yearGanzhi = lunarUtil.cyclicalYear();
		if( yearGanzhi.contains( "甲") && (( lunarMonth == 3 && ganzhi.equals( "戊戌")) || (lunarMonth == 7 && ganzhi.equals( "癸亥")) || (lunarMonth == 10 && ganzhi.equals( "丙申")) || (lunarMonth == 11 && ganzhi.equals( "丁亥")))) {
			flag = 0;
			cause += "十大恶败日，";
		}
		if( yearGanzhi.contains( "己") && (( lunarMonth == 3 && ganzhi.equals( "戊戌")) || (lunarMonth == 7 && ganzhi.equals( "癸亥")) || (lunarMonth == 10 && ganzhi.equals( "丙申")) || (lunarMonth == 11 && ganzhi.equals( "丁亥")))) {
			flag = 0;
			cause += "十大恶败日，";
		}
		if( yearGanzhi.contains( "乙") && (( lunarMonth == 4 && ganzhi.equals( "壬申")) || ( lunarMonth == 9 && ganzhi.equals( "乙巳")))) {
			flag = 0;
			cause += "十大恶败日，";
		}
		if( yearGanzhi.contains( "庚") && (( lunarMonth == 4 && ganzhi.equals( "壬申")) || ( lunarMonth == 9 && ganzhi.equals( "乙巳")))) {
			flag = 0;
			cause += "十大恶败日，";
		}
		if( yearGanzhi.contains( "丙") && (( lunarMonth == 3 && ganzhi.equals( "辛巳")) || ( lunarMonth == 9 && ganzhi.equals( "庚辰")) || ( lunarMonth == 10 && ganzhi.equals( "甲辰")))) {
			flag = 0;
			cause += "十大恶败日，";
		}
		if( yearGanzhi.contains( "辛") && (( lunarMonth == 3 && ganzhi.equals( "辛巳")) || ( lunarMonth == 9 && ganzhi.equals( "庚辰")) || ( lunarMonth == 10 && ganzhi.equals( "甲辰")))) {
			flag = 0;
			cause += "十大恶败日，";
		}
		if( yearGanzhi.contains( "戊") && (lunarMonth == 6 && ganzhi.equals( "己丑"))) {
			flag = 0;
			cause += "十大恶败日，";
		}
		if( yearGanzhi.contains( "癸") && (lunarMonth == 6 && ganzhi.equals( "己丑"))) {
			flag = 0;
			cause += "十大恶败日，";
		}
		
		// 冬至后庚，辛日
		Calendar tempCal2 = Calendar.getInstance();
		tempCal2.set( year, 11, winterSolstice);
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
		if( gengCal.get( Calendar.YEAR) == calendar.get( Calendar.YEAR) && gengCal.get( Calendar.MONTH) == calendar.get( Calendar.MONTH) && gengCal.get( Calendar.DAY_OF_MONTH) == calendar.get( Calendar.DAY_OF_MONTH)) {
			flag = 0;
			cause += "冬至后庚日， ";
		}
		
		Calendar tempCal1 = gengCal;
		tempCal1.add( Calendar.DAY_OF_MONTH, 1);
		Calendar xinCal = tempCal1;
		if( xinCal.get( Calendar.YEAR) == calendar.get( Calendar.YEAR) && xinCal.get( Calendar.MONTH) == calendar.get( Calendar.MONTH) && xinCal.get( Calendar.DAY_OF_MONTH) == calendar.get( Calendar.DAY_OF_MONTH)) {
			flag = 0;
			cause += "冬至后辛日， ";
		}
		
		// 冬至后第三个戌日
		Calendar tempCal3 = Calendar.getInstance();
		tempCal3.set( year, 11, winterSolstice);
		Calendar wuCal = Calendar.getInstance();
		int i111 = 0;
		while( true) {
			LunarUtil lunarUtil3 = new LunarUtil( tempCal3);
			String tempGanzhi = lunarUtil3.Ganzhi( tempCal3);
			if( tempGanzhi.contains( "戌")) {
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
			cause += "冬至后第三个戌日，";
		}
		
		// 阴错日
		if ( lunarMonth == 1) {
			if ( ganzhi.equals( "庚戌")) {
				flag = 0;
				cause += "阴错日，";
			}
		}
		if ( lunarMonth == 2) {
			if ( ganzhi.equals( "辛酉")) {
				flag = 0;
				cause += "阴错日，";
			}
		}
		if ( lunarMonth == 3) {
			if ( ganzhi.equals( "庚申")) {
				flag = 0;
				cause += "阴错日，";
			}
		}
		if ( lunarMonth == 4) {
			if ( ganzhi.equals( "丁未")) {
				flag = 0;
				cause += "阴错日，";
			}
		}
		if ( lunarMonth == 5) {
			if ( ganzhi.equals( "丙午")) {
				flag = 0;
				cause += "阴错日，";
			}
		}
		if ( lunarMonth == 6) {
			if ( ganzhi.equals( "丁巳")) {
				flag = 0;
				cause += "阴错日，";
			}
		}
		if ( lunarMonth == 7) {
			if ( ganzhi.equals( "甲辰")) {
				flag = 0;
				cause += "阴错日，";
			}
		}
		if ( lunarMonth == 8) {
			if ( ganzhi.equals( "乙卯")) {
				flag = 0;
				cause += "阴错日，";
			}
		}
		if ( lunarMonth == 9) {
			if ( ganzhi.equals( "甲寅")) {
				flag = 0;
				cause += "阴错日，";
			}
		}
		if ( lunarMonth == 10) {
			if ( ganzhi.equals( "癸丑")) {
				flag = 0;
				cause += "阴错日，";
			}
		}
		if ( lunarMonth == 11) {
			if ( ganzhi.equals( "壬子")) {
				flag = 0;
				cause += "阴错日，";
			}
		}
		if ( lunarMonth == 12) {
			if ( ganzhi.equals( "癸亥")) {
				flag = 0;
				cause += "阴错日，";
			}
		}
		// 阳错日
		if ( lunarMonth == 1) {
			if ( ganzhi.equals( "甲寅")) {
				flag = 0;
				cause += "阳错日，";
			}
		}
		if ( lunarMonth == 2) {
			if ( ganzhi.equals( "乙卯")) {
				flag = 0;
				cause += "阳错日，";
			}
		}
		if ( lunarMonth == 3) {
			if ( ganzhi.equals( "甲辰")) {
				flag = 0;
				cause += "阳错日，";
			}
		}
		if ( lunarMonth == 4) {
			if ( ganzhi.equals( "丁巳")) {
				flag = 0;
				cause += "阳错日，";
			}
		}
		if ( lunarMonth == 5) {
			if ( ganzhi.equals( "丙午")) {
				flag = 0;
				cause += "阳错日，";
			}
		}
		if ( lunarMonth == 6) {
			if ( ganzhi.equals( "丁未")) {
				flag = 0;
				cause += "阳错日，";
			}
		}
		if ( lunarMonth == 7) {
			if ( ganzhi.equals( "庚申")) {
				flag = 0;
				cause += "阳错日，";
			}
		}
		if ( lunarMonth == 8) {
			if ( ganzhi.equals( "辛酉")) {
				flag = 0;
				cause += "阳错日，";
			}
		}
		if ( lunarMonth == 9) {
			if ( ganzhi.equals( "庚戌")) {
				flag = 0;
				cause += "阳错日，";
			}
		}
		if ( lunarMonth == 10) {
			if ( ganzhi.equals( "癸亥")) {
				flag = 0;
				cause += "阳错日，";
			}
		}
		if ( lunarMonth == 11) {
			if ( ganzhi.equals( "壬子")) {
				flag = 0;
				cause += "阳错日，";
			}
		}
		if ( lunarMonth == 12) {
			if ( ganzhi.equals( "癸丑")) {
				flag = 0;
				cause += "阳错日，";
			}
		}
		
		if( lunarDay == 1 || lunarDay == 8 || lunarDay == 14 || lunarDay == 15 || lunarDay == 18 || lunarDay == 23 || lunarDay == 24 || lunarDay == 28 || lunarDay == 29 || lunarDay == 30) {
			flag = 0;
			cause += "地藏十斋日，";
		}
		
		System.out.println( flag + ":" + cause);
		
		scanner.close();
	}

}
