package utils;

import java.util.Calendar;

@SuppressWarnings( {"Duplicates", "ConstantConditions"})
public class Skbj1 {


	public String defaultMain(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		//noinspection MagicConstant
		calendar.set(year, month - 1, day);
		utils.LunarUtil lunarUtil = new utils.LunarUtil(calendar);

		// ũ�����·�
		int lunarMonth = lunarUtil.getmMonth();
		//����
		// System.out.println( "lunarMonth:" + lunarMonth);
		// ũ��������
		int lunarDay = lunarUtil.getmDay();
		// ũ�������
		int lunarYear = lunarUtil.getmYear();
		
		// ����

		int flag = 0;
		String cause = "";


		switch (lunarMonth) {
		case 1:
			switch (lunarDay) {
				case 1 -> cause = cause + "��������˷��ÿ��ͬ�������У��������»������»��ͣ�ʮ����Ϊһ�ͣ�һ����Ϊһ�㣬��Ͷ��㶼�Ǽ��٣���";
				case 3 -> cause = cause + "������ÿ��ͬ�������񶼻ᣬ��ͣ�";
				case 5 -> cause = cause + "����ɣ���ҽ�ƣ���ϸ��Ƥ����й��ǰ����ʳ���롢��������Ϊ���飩����ͣ�";
				case 6 -> cause = cause + "���ļɣ����������ޡ������硢�������µ����ֲ�����ի�գ�ÿ��ͬ�������٣�";
				case 7 -> cause = cause + "�ϻ��գ����٣�";
				case 8 -> cause = cause + "����������ӵ���������Ѳ�У�ÿ��ͬ������ͣ�";
				case 9 -> cause = cause + "����ϵ۵�����ͣ�";
				case 13 -> cause = cause + "��ɣ�null��";
				case 14 -> cause = cause + "��Ԫ����������Ѳ�У�ÿ��ͬ�������٣�";
				case 15 -> cause = cause + "��Ԫ����������ÿ��ͬ������Ԫ��ᣬ������Ѳ�У�ÿ��ͬ�������ٶ�ͣ�";
				case 16 -> cause = cause + "��Ԫ�������٣�";
				case 19 -> cause = cause + "�������˵���null��";
				case 23 -> cause = cause + "������Ѳ�У�ÿ��ͬ������ʬ�����£�null��";
				case 25 -> cause = cause + "�»��գ�ÿ��ͬ������زֿ��գ����٣����١��Ӵ�����";
				case 27 -> cause = cause + "������ÿ��ͬ������ͣ�";
				case 28 -> cause = cause + "��������������һ�ռ��䣬ÿ��ͬ�����ò���";
				case 29 -> cause = cause + "������Ѳ�У�ÿ��ͬ����null��";
				case 30 -> cause = cause + "�»ޡ�˾�����£�ÿ��ͬ����������Ѳ�У�ÿ��ͬ������С�¼���إ�ţ������٣����٣�";
				default -> flag = 1;
			}
		break;
		case 2:
			switch (lunarDay) {
				case 1 -> cause = cause + "��˷��һ���ع���������ͣ�";
				case 2 -> cause = cause + "���񶼻ᣬ�����������񵮣���ͣ��û���";
				case 3 -> cause = cause + "�������Ĳ��۾�������»����ͣ�";
				case 6 -> cause = cause + "��ի�գ������۾��������٣�";
				case 8 -> cause = cause + "����Ĳ�����ҡ������ε��������Ŵ�۵���������Ѳ�У���ͣ�";
				case 11 -> cause = cause + "��ɣ�null��";
				case 14 -> cause = cause + "������Ѳ�У�null��";
				case 15 -> cause = cause + "����Ĳ�������������(���°�)��̫���Ͼ�����������Ѳ�У���»����ͣ�";
				case 17 -> cause = cause + "�����Ž�������null��";
				case 18 -> cause = cause + "�ĵ������������ʥ��ʦ���ӻ䳽����»����ͣ�";
				case 19 -> cause = cause + "������ʿ������ͣ�";
				case 21 -> cause = cause + "������������null��";
				case 23 -> cause = cause + "������Ѳ��2��null��";
				case 25 -> cause = cause + "�»��գ����٣�";
				case 27 -> cause = cause + "��������ͣ�";
				case 28 -> cause = cause + "�����������ò���";
				case 29 -> cause = cause + "������Ѳ��3��null��";
				case 30 -> cause = cause + "�»ޡ�˾�����£�������Ѳ�У���С����إ�ţ������٣�";
				default -> flag = 1;
			}
		break;
		case 3:
			switch (lunarDay) {
				case 1 -> cause = cause + "��˷�����������������ͣ�";
				case 3 -> cause = cause + "�����������ϵ۵�����ͣ�";
				case 6 -> cause = cause + "��ի�գ����٣�";
				case 8 -> cause = cause + "������������������Ѳ�У���ͣ�";
				case 9 -> cause = cause + "ţ���������ɣ�����̥��";
				case 12 -> cause = cause + "�����������null��";
				case 14 -> cause = cause + "������Ѳ�У�null��";
				case 15 -> cause = cause + "����������ϵ۵�����̳����������Ѳ�У���ͣ�";
				case 16 -> cause = cause + "׼������������ͣ�";
				case 18 -> cause = cause + "������۵����������ﵮ����é����null��";
				case 20 -> cause = cause + "��زֿ��գ��������ﵮ�����٣�";
				case 23 -> cause = cause + "������Ѳ��2��null��";
				case 25 -> cause = cause + "�»��գ����٣�";
				case 27 -> cause = cause + "�������ߵ�̩ɽ��������ͣ�";
				case 28 -> cause = cause + "���������������ʥ��ʦ�����ò�����ͣ�";
				case 29 -> cause = cause + "������Ѳ��3��null��";
				case 30 -> cause = cause + "�»ޡ�˾�����£�������Ѳ�У���С����إ�ţ������٣�";
				default -> flag = 1;
			}
		break;
		case 4:
			switch (lunarDay) {
				case 1 -> cause = cause + "��˷���˵����������ͣ�";
				case 3 -> cause = cause + "��������ͣ�";
				case 4 -> cause = cause + "�����ƻᣬ������������ʧ����ز̥��";
				case 6 -> cause = cause + "��ի�գ����٣�";
				case 7 -> cause = cause + "�϶���������ͬ������ɣ����٣�";
				case 8 -> cause = cause + "����Ĳ��𵮣������ƻᣬ�ƶ�ͯ�ӽ����ŵ�ƽ��������������Ѳ�У���ͣ�ʧ����ز̥��Ѫ����";
				case 14 -> cause = cause + "������ʦ����������Ѳ�У����٣�";
				case 15 -> cause = cause + "������������ʦ����������Ѳ�У���ͣ�";
				case 16 -> cause = cause + "��زֿ��գ����٣�";
				case 17 -> cause = cause + "ʮ��ת����������ͣ�";
				case 18 -> cause = cause + "��زֿ��ա���΢��۵������٣�";
				case 20 -> cause = cause + "�۹�ʥĸ����null��";
				case 23 -> cause = cause + "������Ѳ�У�null��";
				case 25 -> cause = cause + "�»��գ����٣�";
				case 27 -> cause = cause + "����2����ͣ�";
				case 28 -> cause = cause + "�����������ò���";
				case 29 -> cause = cause + "������Ѳ��2��null��";
				case 30 -> cause = cause + "�»ޡ�˾�����£�������Ѳ�У�����С����إ�ţ������٣�";
				default -> flag = 1;
			}
		break;
		case 5:
			switch (lunarDay) {
				case 1 -> cause = cause + "��˷���ϼ�������۵�����ͣ�";
				case 3 -> cause = cause + "��������ͣ�";
				case 5 -> cause = cause + "���������У���˹پ����Ŷ��գ���ɣ���»��ͣ�ز����������⣻";
				case 6 -> cause = cause + "�Ŷ��ա���ի�գ�ز����������⣻";
				case 7 -> cause = cause + "�Ŷ��գ�ز����������⣻";
				case 8 -> cause = cause + "�Ϸ��������������Ѳ�У�null��";
				case 11 -> cause = cause + "��ֿ��գ����¶����򵮣����٣�";
				case 12 -> cause = cause + "���鹫����null��";
				case 13 -> cause = cause + "��ʥ������»����ͣ�";
				case 14 -> cause = cause + "������Ѳ�У�ҹ��ʱΪ��ؽ�̩�������ڷ򸾾�����";
				case 15 -> cause = cause + "������������Ѳ�У��Ŷ��գ�ز�����������";
				case 16 -> cause = cause + "�Ŷ��գ����Ԫ���컯����֮����ز����������⣬�����ڷ򸾾�����";
				case 17 -> cause = cause + "�Ŷ���2��ز����������⣻";
				case 18 -> cause = cause + "����ʦ����null��";
				case 22 -> cause = cause + "Т���񵮣���ͣ�";
				case 23 -> cause = cause + "������Ѳ�У�null��";
				case 25 -> cause = cause + "�Ŷ��ա��»��գ�ز����������⣻";
				case 26 -> cause = cause + "�Ŷ���3��ز����������⣻";
				case 27 -> cause = cause + "�Ŷ��գ�������ز����������⣻";
				case 28 -> cause = cause + "�����������ò���";
				case 29 -> cause = cause + "������Ѳ�У�null��";
				case 30 -> cause = cause + "�»ޡ�˾�����£�������Ѳ�У���С����إ�ţ������٣�";
				default -> flag = 1;
			}
		break;
		case 6:
			switch (lunarDay) {
				case 1 -> cause = cause + "��˷����ͣ�";
				case 3 -> cause = cause + "��������ɣ���ͣ�";
				case 4 -> cause = cause + "���Ĳ���ת���֣����٣�";
				case 6 -> cause = cause + "��ֿ��ա���ի�գ����٣�";
				case 8 -> cause = cause + "������Ѳ�У�null��";
				case 10 -> cause = cause + "������������null��";
				case 13 -> cause = cause + "��Ȫ��������null��";
				case 14 -> cause = cause + "������Ѳ��2��null��";
				case 15 -> cause = cause + "������������Ѳ�У���ͣ�";
				case 19 -> cause = cause + "������ʿ�ɵ��գ���ͣ�";
				case 23 -> cause = cause + "�Ϸ����񵮣�������Ѳ�У����»��";
				case 24 -> cause = cause + "���浮���ص۵�����»����ͣ�";
				case 25 -> cause = cause + "�»��գ����٣�";
				case 27 -> cause = cause + "��������ͣ�";
				case 28 -> cause = cause + "�����������ò���";
				case 29 -> cause = cause + "������Ѳ��3��null��";
				case 30 -> cause = cause + "�»ޡ�˾�����£�������Ѳ�У���С����إ�ţ������٣�";
				default -> flag = 1;
			}
		break;
		case 7:
			switch (lunarDay) {
				case 1 -> cause = cause + "��˷����ɣ���ͣ�";
				case 3 -> cause = cause + "��������ͣ�";
				case 5 -> cause = cause + "�л��գ�һ�����ߣ������٣�";
				case 6 -> cause = cause + "��ի�գ����٣�";
				case 7 -> cause = cause + "�����������У�����ƶ񡢿��ǵ�����»����ͣ�";
				case 8 -> cause = cause + "������Ѳ�У�null";
				case 10 -> cause = cause + "�����գ���ɣ���null";
				case 12 -> cause = cause + "����̷���˵���null��";
				case 13 -> cause = cause + "������������������";
				case 14 -> cause = cause + "��Ԫ����������Ѳ�У����٣�";
				case 15 -> cause = cause + "��������Ԫ�����ع�У����������Ѳ�У���ͣ�";
				case 16 -> cause = cause + "��Ԫ�������٣�";
				case 18 -> cause = cause + "����ĸ������ͣ�";
				case 19 -> cause = cause + "̫�굮����ͣ�";
				case 22 -> cause = cause + "�������񵮣���»����ͣ�";
				case 23 -> cause = cause + "������Ѳ�У�null��";
				case 25 -> cause = cause + "�»��գ����٣�";
				case 27 -> cause = cause + "����2����ͣ�";
				case 28 -> cause = cause + "�����������ò���";
				case 29 -> cause = cause + "��ɡ�������Ѳ�У�null��";
				case 30 -> cause = cause + "�ز����������»ޡ�˾�����£�������Ѳ�У���С����إ�ţ�����ͣ����٣�";
				default -> flag = 1;
			}
		break;
		case 8:
			switch (lunarDay) {
				case 1 -> cause = cause + "��˷�������������ͣ�";
				case 3 -> cause = cause + "��������������˾�����������»����ͣ����»��";
				case 5 -> cause = cause + "������۵�����ͣ�";
				case 6 -> cause = cause + "��ի�գ����٣�";
				case 8 -> cause = cause + "������Ѳ�У�null��";
				case 10 -> cause = cause + "������۵���null��";
				case 12 -> cause = cause + "�����������null��";
				case 14 -> cause = cause + "������Ѳ��2��null��";
				case 15 -> cause = cause + "������������Ѳ�У�̫����Ԫ���˷�����ҹ����������";
				case 16 -> cause = cause + "�����ˢ�������ƶز��";
				case 18 -> cause = cause + "�����˸�֮������ի�䡢���뼪�£���null��";
				case 23 -> cause = cause + "������Ѳ�С�����������������null��";
				case 24 -> cause = cause + "������˵���null��";
				case 25 -> cause = cause + "�»��գ����٣�";
				case 27 -> cause = cause + "��������ʥ��ʦ���ӵ�����ɣ���»����ͣ�";
				case 28 -> cause = cause + "����������������£��ò���";
				case 29 -> cause = cause + "������Ѳ��3��null��";
				case 30 -> cause = cause + "�»ޡ�˾�����£�����У��������Ѳ�У���С����إ�ţ������٣����㣻";
				default -> flag = 1;
			}
		break;
		case 9:
			switch (lunarDay) {
				case 1 -> cause = cause + "��˷���϶������Գ�һ�����ű������ǽ����˾��վ���ի�䣩����»��ͣ���ͣ�";
				case 3 -> cause = cause + "�����񵮣�null��";
				case 8 -> cause = cause + "������Ѳ�У�null��";
				case 9 -> cause = cause + "��ĸ����ۺ����۵��������ϵ۷�������»��ͣ�";
				case 10 -> cause = cause + "��ĸ������ͣ�";
				case 11 -> cause = cause + "���˽䣩��null��";
				case 13 -> cause = cause + "�������񵮣�null��";
				case 14 -> cause = cause + "������Ѳ��2��null��";
				case 15 -> cause = cause + "������������Ѳ�У���ͣ�";
				case 17 -> cause = cause + "�����Ĵ���������ˮ��";
				case 19 -> cause = cause + "�չ��¹���ϣ��������������ң����٣�";
				case 23 -> cause = cause + "������Ѳ��3��null��";
				case 25 -> cause = cause + "�»��գ���ɣ����٣�";
				case 27 -> cause = cause + "��������ͣ�";
				case 28 -> cause = cause + "�����������ò���";
				case 29 -> cause = cause + "������Ѳ��4��null��";
				case 30 -> cause = cause + "ҩʦ������𵮣��»��ա�˾�����£�������Ѳ�У���С����إ�ţ�����Σ�������٣�";
				default -> flag = 1;
			}
		break;
		case 10:
			switch (lunarDay) {
				case 1 -> cause = cause + "��˷����������������������ͣ�һ��������";
				case 3 -> cause = cause + "��������é������ͣ�";
				case 5 -> cause = cause + "�»��գ���Ħ��ʦ�������٣�";
				case 6 -> cause = cause + "��ܿ��죬��ͣ�";
				case 8 -> cause = cause + "�������գ����ɫ������������Ѳ�У�unknown��";
				case 10 -> cause = cause + "����������һ��������";
				case 11 -> cause = cause + "���˽䣩��null��";
				case 14 -> cause = cause + "��Ԫ����������Ѳ�У����٣�";
				case 15 -> cause = cause + "��������Ԫ������Ԫˮ��У����������Ѳ�У���ͣ�";
				case 16 -> cause = cause + "��Ԫ�������٣�";
				case 23 -> cause = cause + "��ɡ�������Ѳ�У�null��";
				case 25 -> cause = cause + "�»��գ����٣�";
				case 27 -> cause = cause + "������������ޱ��۽�����ͣ�";
				case 28 -> cause = cause + "�����������ò���";
				case 29 -> cause = cause + "������Ѳ�У�null��";
				case 30 -> cause = cause + "�»��ա�˾�����£�������Ѳ�У���С����إ�ţ������٣�";
				default -> flag = 1;
			}
		break;
		case 11:
			switch (lunarDay) {
				case 1 -> cause = cause + "��˷����ͣ�";
				case 3 -> cause = cause + "��������ͣ�";
				case 4 -> cause = cause + "��ʥ��ʦ���ӵ�������ʷ�϶Կ��ӵĵ����в�ͬ�۵㣬���Դ˽��ڱ��г����˰���إ�߼�������������ʥ��ʦ���ӵ�������������ע������»��ͣ�";
				case 6 -> cause = cause + "������۵���null��";
				case 8 -> cause = cause + "������Ѳ�У�null��";
				case 11 -> cause = cause + "��ֿ��ա�̫�Ҿȿ����𵮣���»��ͣ�";
				case 14 -> cause = cause + "������Ѳ��2��null��";
				case 15 -> cause = cause + "������������Ѳ�У��ϰ�ҹ���������°�ҹ��Ů����";
				case 17 -> cause = cause + "�����ӷ𵮣�null��";
				case 19 -> cause = cause + "̫���չ������������";
				case 21 -> cause = cause + "��ɣ�null��";
				case 23 -> cause = cause + "���ɵ���������Ѳ�У����ã�";
				case 25 -> cause = cause + "��ˢ��򽵡��»��գ�����ף�";
				case 26 -> cause = cause + "�����������null��";
				case 27 -> cause = cause + "����2����ͣ�";
				case 28 -> cause = cause + "�����������ò���";
				case 29 -> cause = cause + "������Ѳ��3��null��";
				case 30 -> cause = cause + "�»ޡ�˾�����£���С����إ�ţ���������Ѳ�У����٣�";
				default -> flag = 1;
			}
		break;
		case 12:
			switch (lunarDay) {
				case 1 -> cause = cause + "��˷����ͣ�";
				case 3 -> cause = cause + "��������ͣ�";
				case 6 -> cause = cause + "��ֿ��ա���ի�գ����٣�";
				case 7 -> cause = cause + "��ˢ��򽵣��ö񼲣�";
				case 8 -> cause = cause + "����������Ѯ������ҲΪ�������������������ɷ�֮�գ�������Ѳ�У���ͣ�";
				case 12 -> cause = cause + "̫����Ԫ�����棬null��";
				case 14 -> cause = cause + "������Ѳ�У�null��";
				case 15 -> cause = cause + "������������Ѳ�У���ͣ�";
				case 16 -> cause = cause + "������۵���null��";
				case 19 -> cause = cause + "��ɣ�null��";
				case 20 -> cause = cause + "��ؽ��������٣��٣����̣���";
				case 21 -> cause = cause + "�����ϵ۵���null��";
				case 23 -> cause = cause + "�����񽵡�������Ѳ�У�null��";
				case 24 -> cause = cause + "˾�����������ƶ񣬴����";
				case 25 -> cause = cause + "�������ͬ�������ƶ������";
				case 27 -> cause = cause + "����2����ͣ�";
				case 28 -> cause = cause + "�����������ò���";
				case 29 -> cause = cause + "������������������Ѳ�У�null��";
				case 30 -> cause = cause + "�����½�������ƶ���Ů������";
				default -> flag = 1;
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
		/*
		  ������
		*/
		// ������
		Calendar tempCal = Calendar.getInstance();
		tempCal.set(year, Calendar.FEBRUARY, liChun);
		int i = 0;

		int chunSheMonth; // ����
		int chunSheDay; // ����
		while (true) {
			utils.LunarUtil lunarUtil2 = new LunarUtil(tempCal);
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
			tempCal.add(Calendar.DATE, 1);
		}
		// �ж��Ƿ�Ϊ������
		if (month == chunSheMonth && day == chunSheDay) {
			flag = 0;
			cause += "�Ǵ����գ�";
		}
		// ������
		tempCal.set(year, Calendar.AUGUST, liQiu);
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
			tempCal.add(Calendar.DATE, 1);
		}
		// �ж��Ƿ�Ϊ������
		if (month == qiuSheMonth && day == qiuSheDay) {
			flag = 0;
			cause += "�������գ�";
		}

		/*
		 * ������
		*/
		// �����
		Calendar calendar3 = Calendar.getInstance();
		calendar3.set(year, Calendar.JUNE, summerSolstice);
		Calendar rufuCalendar;
		int i1 = 0;
		while (true) {
			LunarUtil lunarUtil3 = new LunarUtil(calendar3);
			String ganzhi = lunarUtil3.Ganzhi(calendar3);

			if (ganzhi.contains("��")) {
				i1++;
				if (i1 == 3) {
					rufuCalendar = calendar3;
					break;
				}
			}
			calendar3.add(Calendar.DAY_OF_MONTH, 1);
		}
		// ������
		Calendar calendar4 = Calendar.getInstance();
		calendar4.set(year, Calendar.AUGUST, liQiu);
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
		int lunarMonthDays = LunarUtil.lunarMonthDays( lunarYear, lunarMonth);
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
			cause += "ֵ��̫���գ�";
		}
		
		// ������
		if ( ganzhi.contains( "��") || ganzhi.contains( "��")) {
			flag = 0;
			cause += "�����գ�";
		}

		// �ٰ���
		// ����
		// System.out.println( "lunarMonthDays:" + lunarMonthDays);
		if ( lunarMonthDays == 30 && lunarDay == 18) {
			flag = 0;
			cause += "�ٰ��գ�";
		}
		if ( lunarMonthDays == 29 && lunarDay == 17) {
			flag = 0;
			cause += "�ٰ��գ�";
		}
		
		// ʮ������
		String yearGanzhi = lunarUtil.cyclicalYear();
		boolean b = (lunarMonth == 3 && ganzhi.equals("����")) || (lunarMonth == 7 && ganzhi.equals("�ﺥ")) || (lunarMonth == 10 && ganzhi.equals("����")) || (lunarMonth == 11 && ganzhi.equals("����"));
		if( yearGanzhi.contains( "��") && b) {
			flag = 0;
			cause += "ʮ�����գ�";
		}
		if( yearGanzhi.contains( "��") && b) {
			flag = 0;
			cause += "ʮ�����գ�";
		}
		boolean b1 = (lunarMonth == 4 && ganzhi.equals("����")) || (lunarMonth == 9 && ganzhi.equals("����"));
		if( yearGanzhi.contains( "��") && b1) {
			flag = 0;
			cause += "ʮ�����գ�";
		}
		if( yearGanzhi.contains( "��") && b1) {
			flag = 0;
			cause += "ʮ�����գ�";
		}
		boolean b2 = (lunarMonth == 3 && ganzhi.equals("����")) || (lunarMonth == 9 && ganzhi.equals("����")) || (lunarMonth == 10 && ganzhi.equals("�׳�"));
		if( yearGanzhi.contains( "��") && b2) {
			flag = 0;
			cause += "ʮ�����գ�";
		}
		if( yearGanzhi.contains( "��") && b2) {
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
		tempCal2.set( year, Calendar.DECEMBER, winterSolstice);
		Calendar gengCal;
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
		@SuppressWarnings( "UnnecessaryLocalVariable")
		Calendar xinCal = tempCal1;
		if( xinCal.get( Calendar.YEAR) == calendar.get( Calendar.YEAR) && xinCal.get( Calendar.MONTH) == calendar.get( Calendar.MONTH) && xinCal.get( Calendar.DAY_OF_MONTH) == calendar.get( Calendar.DAY_OF_MONTH)) {
			flag = 0;
			cause += "���������գ� ";
		}
		
		// ���������������
		Calendar tempCal3 = Calendar.getInstance();
		tempCal3.set( year, Calendar.DECEMBER, winterSolstice);
		Calendar wuCal;
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
		
		return flag + ": " + cause;
	}
}
