package utils;

import java.util.Calendar;

@SuppressWarnings( {"Duplicates", "ConstantConditions"})
public class Skbj1 {


	public String defaultMain(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		//noinspection MagicConstant
		calendar.set(year, month - 1, day);
		utils.LunarUtil lunarUtil = new utils.LunarUtil(calendar);

		// 农历的月份
		int lunarMonth = lunarUtil.getmMonth();
		//调试
		// System.out.println( "lunarMonth:" + lunarMonth);
		// 农历的日子
		int lunarDay = lunarUtil.getmDay();
		// 农历的年份
		int lunarYear = lunarUtil.getmYear();
		
		// 调试

		int flag = 0;
		String cause = "";


		switch (lunarMonth) {
		case 1:
			switch (lunarDay) {
				case 1 -> cause = cause + "天腊、月朔（每月同），玉帝校世人神气禄命，削禄夺纪（十二年为一纪，一百日为一算，夺纪夺算都是减寿）；";
				case 3 -> cause = cause + "斗降（每月同）、万神都会，夺纪；";
				case 5 -> cause = cause + "五虚忌（中医称：脉细、皮寒、泄痢前后、饮食不入、真气不足为五虚），夺纪；";
				case 6 -> cause = cause + "六耗忌（阴、阳、晦、明、风、雨所导致的六种病）雷斋日（每月同），减寿；";
				case 7 -> cause = cause + "上会日，损寿；";
				case 8 -> cause = cause + "五殿阎罗天子诞，四天王巡行（每月同），夺纪；";
				case 9 -> cause = cause + "玉皇上帝诞，夺纪；";
				case 13 -> cause = cause + "杨公忌，null；";
				case 14 -> cause = cause + "三元降，四天王巡行（每月同），减寿；";
				case 15 -> cause = cause + "三元降，月望（每月同）、上元神会，四天王巡行（每月同），减寿夺纪；";
				case 16 -> cause = cause + "三元降，减寿；";
				case 19 -> cause = cause + "长春真人诞，null；";
				case 23 -> cause = cause + "四天王巡行（每月同）、三尸神奏事，null；";
				case 25 -> cause = cause + "月晦日（每月同），天地仓开日，减寿，损寿、子带疾；";
				case 27 -> cause = cause + "斗降（每月同），夺纪；";
				case 28 -> cause = cause + "人神在阴（宜先一日即戒，每月同），得病；";
				case 29 -> cause = cause + "四天王巡行（每月同），null；";
				case 30 -> cause = cause + "月晦、司命奏事（每月同），四天王巡行（每月同），（小月即戒廿九），减寿，减寿；";
				default -> flag = 1;
			}
		break;
		case 2:
			switch (lunarDay) {
				case 1 -> cause = cause + "月朔、一殿秦广王诞，夺纪；";
				case 2 -> cause = cause + "万神都会，福德土地正神诞，夺纪，得祸；";
				case 3 -> cause = cause + "斗降，文昌帝君诞，削禄，夺纪；";
				case 6 -> cause = cause + "雷斋日，东岳帝君诞，减寿；";
				case 8 -> cause = cause + "释迦牟尼佛出家、三殿宋帝王诞，张大帝诞、四天王巡行，夺纪；";
				case 11 -> cause = cause + "杨公忌，null；";
				case 14 -> cause = cause + "四天王巡行，null；";
				case 15 -> cause = cause + "释迦牟尼佛涅槃，月望(即月半)、太上老君诞，四天王巡行，削禄，夺纪；";
				case 17 -> cause = cause + "东方杜将军诞，null；";
				case 18 -> cause = cause + "四殿五官王诞，至圣先师孔子讳辰，削禄，夺纪；";
				case 19 -> cause = cause + "观音大士诞，夺纪；";
				case 21 -> cause = cause + "普贤菩萨诞，null；";
				case 23 -> cause = cause + "四天王巡行2，null；";
				case 25 -> cause = cause + "月晦日，减寿；";
				case 27 -> cause = cause + "斗降，夺纪；";
				case 28 -> cause = cause + "人神在阴，得病；";
				case 29 -> cause = cause + "四天王巡行3，null；";
				case 30 -> cause = cause + "月晦、司命奏事，四天王巡行（月小即戒廿九），减寿；";
				default -> flag = 1;
			}
		break;
		case 3:
			switch (lunarDay) {
				case 1 -> cause = cause + "月朔、二殿楚江王诞，夺纪；";
				case 3 -> cause = cause + "斗降、玄天上帝诞，夺纪；";
				case 6 -> cause = cause + "雷斋日，减寿；";
				case 8 -> cause = cause + "六殿卞城王诞，四天王巡行，夺纪；";
				case 9 -> cause = cause + "牛鬼神出，杨公忌，产恶胎；";
				case 12 -> cause = cause + "中央五道诞，null；";
				case 14 -> cause = cause + "四天王巡行，null；";
				case 15 -> cause = cause + "月望、昊天上帝诞、玄坛诞，四天王巡行，夺纪；";
				case 16 -> cause = cause + "准提菩萨诞，夺纪；";
				case 18 -> cause = cause + "中岳大帝诞、后土娘娘诞、三茅降，null；";
				case 20 -> cause = cause + "天地仓开日，子孙娘娘诞，损寿；";
				case 23 -> cause = cause + "四天王巡行2，null；";
				case 25 -> cause = cause + "月晦日，减寿；";
				case 27 -> cause = cause + "斗降，七殿泰山王诞，夺纪；";
				case 28 -> cause = cause + "人神在阴，苍颉至圣先师诞，得病，夺纪；";
				case 29 -> cause = cause + "四天王巡行3，null；";
				case 30 -> cause = cause + "月晦、司命奏事，四天王巡行（月小即戒廿九），减寿；";
				default -> flag = 1;
			}
		break;
		case 4:
			switch (lunarDay) {
				case 1 -> cause = cause + "月朔、八殿都市王诞，夺纪；";
				case 3 -> cause = cause + "斗降，夺纪；";
				case 4 -> cause = cause + "万神善会，文殊菩萨诞，失音，夭胎；";
				case 6 -> cause = cause + "雷斋日，减寿；";
				case 7 -> cause = cause + "南斗北斗西斗同降，杨公忌，减寿；";
				case 8 -> cause = cause + "释迦牟尼佛诞，万神善会，善恶童子降，九殿平等王诞、四天王巡行，夺纪，失音、夭胎，血死；";
				case 14 -> cause = cause + "纯阳祖师诞，四天王巡行，减寿；";
				case 15 -> cause = cause + "月望，钟离祖师诞、四天王巡行，夺纪；";
				case 16 -> cause = cause + "天地仓开日，损寿；";
				case 17 -> cause = cause + "十殿转轮王诞，夺纪；";
				case 18 -> cause = cause + "天地仓开日、紫微大帝诞，减寿；";
				case 20 -> cause = cause + "眼光圣母诞，null；";
				case 23 -> cause = cause + "四天王巡行，null；";
				case 25 -> cause = cause + "月晦日，减寿；";
				case 27 -> cause = cause + "斗降2，夺纪；";
				case 28 -> cause = cause + "人神在阴，得病；";
				case 29 -> cause = cause + "四天王巡行2，null；";
				case 30 -> cause = cause + "月晦、司命奏事，四天王巡行（逢月小即戒廿九），减寿；";
				default -> flag = 1;
			}
		break;
		case 5:
			switch (lunarDay) {
				case 1 -> cause = cause + "月朔、南极长生大帝诞，夺纪；";
				case 3 -> cause = cause + "斗降，夺纪；";
				case 5 -> cause = cause + "地腊、五帝校定人官爵，九毒日，杨公忌，削禄夺纪，夭亡、奇祸不测；";
				case 6 -> cause = cause + "九毒日、雷斋日，夭亡、奇祸不测；";
				case 7 -> cause = cause + "九毒日，夭亡、奇祸不测；";
				case 8 -> cause = cause + "南方五道诞、四天王巡行，null；";
				case 11 -> cause = cause + "天仓开日，天下都城隍诞，损寿；";
				case 12 -> cause = cause + "炳灵公诞，null；";
				case 13 -> cause = cause + "关圣降神，削禄、夺纪；";
				case 14 -> cause = cause + "四天王巡行，夜子时为天地交泰，三年内夫妇俱亡；";
				case 15 -> cause = cause + "月望、四天王巡行，九毒日，夭亡、奇祸不测";
				case 16 -> cause = cause + "九毒日，天地元气造化万物之辰，夭亡、奇祸不测，三年内夫妇俱亡；";
				case 17 -> cause = cause + "九毒日2，夭亡、奇祸不测；";
				case 18 -> cause = cause + "张天师诞，null；";
				case 22 -> cause = cause + "孝蛾神诞，夺纪；";
				case 23 -> cause = cause + "四天王巡行，null；";
				case 25 -> cause = cause + "九毒日、月晦日，夭亡、奇祸不测；";
				case 26 -> cause = cause + "九毒日3，夭亡、奇祸不测；";
				case 27 -> cause = cause + "九毒日，斗降，夭亡、奇祸不测；";
				case 28 -> cause = cause + "人神在阴，得病；";
				case 29 -> cause = cause + "四天王巡行，null；";
				case 30 -> cause = cause + "月晦、司命奏事，四天王巡行（月小即戒廿九），减寿；";
				default -> flag = 1;
			}
		break;
		case 6:
			switch (lunarDay) {
				case 1 -> cause = cause + "月朔，夺纪；";
				case 3 -> cause = cause + "斗降，杨公忌，夺纪；";
				case 4 -> cause = cause + "南赡部洲转大法轮，损寿；";
				case 6 -> cause = cause + "天仓开日、雷斋日，损寿；";
				case 8 -> cause = cause + "四天王巡行，null；";
				case 10 -> cause = cause + "金粟如来诞，null；";
				case 13 -> cause = cause + "井泉龙王诞，null；";
				case 14 -> cause = cause + "四天王巡行2，null；";
				case 15 -> cause = cause + "月望，四天王巡行，夺纪；";
				case 19 -> cause = cause + "观音大士成道日，夺纪；";
				case 23 -> cause = cause + "南方火神诞，四天王巡行，遭回禄；";
				case 24 -> cause = cause + "雷祖诞、关帝诞，削禄，夺纪；";
				case 25 -> cause = cause + "月晦日，减寿；";
				case 27 -> cause = cause + "斗降，夺纪；";
				case 28 -> cause = cause + "人神在阴，得病；";
				case 29 -> cause = cause + "四天王巡行3，null；";
				case 30 -> cause = cause + "月晦、司命奏事，四天王巡行（月小即戒廿九），减寿；";
				default -> flag = 1;
			}
		break;
		case 7:
			switch (lunarDay) {
				case 1 -> cause = cause + "月朔，杨公忌，夺纪；";
				case 3 -> cause = cause + "斗降，夺纪；";
				case 5 -> cause = cause + "中会日（一作初七），损寿；";
				case 6 -> cause = cause + "雷斋日，减寿；";
				case 7 -> cause = cause + "道德腊，五帝校生人善恶、魁星诞，削禄、夺纪；";
				case 8 -> cause = cause + "四天王巡行，null";
				case 10 -> cause = cause + "阴毒日（大忌），null";
				case 12 -> cause = cause + "长真谭真人诞，null；";
				case 13 -> cause = cause + "大势至菩萨诞，减寿";
				case 14 -> cause = cause + "三元降，四天王巡行，减寿；";
				case 15 -> cause = cause + "月望、三元降、地官校籍，四天王巡行，夺纪；";
				case 16 -> cause = cause + "三元降，减寿；";
				case 18 -> cause = cause + "西王母诞，夺纪；";
				case 19 -> cause = cause + "太岁诞，夺纪；";
				case 22 -> cause = cause + "增福财神诞，削禄、夺纪；";
				case 23 -> cause = cause + "四天王巡行，null；";
				case 25 -> cause = cause + "月晦日，减寿；";
				case 27 -> cause = cause + "斗降2，夺纪；";
				case 28 -> cause = cause + "人神在阴，得病；";
				case 29 -> cause = cause + "杨公忌、四天王巡行，null；";
				case 30 -> cause = cause + "地藏菩萨诞，月晦、司命奏事，四天王巡行（月小即戒廿九），夺纪，减寿；";
				default -> flag = 1;
			}
		break;
		case 8:
			switch (lunarDay) {
				case 1 -> cause = cause + "月朔，许真君诞，夺纪；";
				case 3 -> cause = cause + "斗降、北斗诞，司命灶君诞，削禄、夺纪，遭回禄；";
				case 5 -> cause = cause + "雷声大帝诞，夺纪；";
				case 6 -> cause = cause + "雷斋日，减寿；";
				case 8 -> cause = cause + "四天王巡行，null；";
				case 10 -> cause = cause + "北斗大帝诞，null；";
				case 12 -> cause = cause + "西方五道诞，null；";
				case 14 -> cause = cause + "四天王巡行2，null；";
				case 15 -> cause = cause + "月望、四天王巡行，太阴朝元（宜焚香守夜），暴亡；";
				case 16 -> cause = cause + "天曹掠刷真君降，贫夭；";
				case 18 -> cause = cause + "天人兴福之辰（宜斋戒、存想吉事），null；";
				case 23 -> cause = cause + "四天王巡行、汉桓侯张显王诞，null；";
				case 24 -> cause = cause + "灶君夫人诞，null；";
				case 25 -> cause = cause + "月晦日，减寿；";
				case 27 -> cause = cause + "斗降，至圣先师孔子诞，杨公忌，削禄、夺纪；";
				case 28 -> cause = cause + "人神在阴，四天会事，得病；";
				case 29 -> cause = cause + "四天王巡行3，null；";
				case 30 -> cause = cause + "月晦、司命奏事，诸神考校，四天王巡行（月小即戒廿九），减寿，夺算；";
				default -> flag = 1;
			}
		break;
		case 9:
			switch (lunarDay) {
				case 1 -> cause = cause + "月朔、南斗诞，自初一至初九北斗九星降（此九日俱宜斋戒），削禄夺纪，夺纪；";
				case 3 -> cause = cause + "五瘟神诞，null；";
				case 8 -> cause = cause + "四天王巡行，null；";
				case 9 -> cause = cause + "斗母诞，酆都大帝诞、玄天上帝飞升，削禄夺纪；";
				case 10 -> cause = cause + "斗母降，夺纪；";
				case 11 -> cause = cause + "（宜戒），null；";
				case 13 -> cause = cause + "孟婆尊神诞，null；";
				case 14 -> cause = cause + "四天王巡行2，null；";
				case 15 -> cause = cause + "月望、四天王巡行，夺纪；";
				case 17 -> cause = cause + "金龙四大王诞，遭水厄；";
				case 19 -> cause = cause + "日宫月宫会合，观世音菩萨出家，减寿；";
				case 23 -> cause = cause + "四天王巡行3，null；";
				case 25 -> cause = cause + "月晦日，杨公忌，减寿；";
				case 27 -> cause = cause + "斗降，夺纪；";
				case 28 -> cause = cause + "人神在阴，得病；";
				case 29 -> cause = cause + "四天王巡行4，null；";
				case 30 -> cause = cause + "药师琉璃光佛诞，月晦日、司命奏事，四天王巡行（月小即戒廿九），得危疾，减寿；";
				default -> flag = 1;
			}
		break;
		case 10:
			switch (lunarDay) {
				case 1 -> cause = cause + "月朔、民岁腊，四天王降，夺纪，一年内死；";
				case 3 -> cause = cause + "斗降，三茅诞，夺纪；";
				case 5 -> cause = cause + "下会日，达摩祖师诞，损寿；";
				case 6 -> cause = cause + "天曹考察，夺纪；";
				case 8 -> cause = cause + "佛涅槃日（大忌色欲），四天王巡行，unknown；";
				case 10 -> cause = cause + "四天王降，一年内死；";
				case 11 -> cause = cause + "（宜戒），null；";
				case 14 -> cause = cause + "三元降，四天王巡行，减寿；";
				case 15 -> cause = cause + "月望、三元降、下元水府校籍，四天王巡行，夺纪；";
				case 16 -> cause = cause + "三元降，减寿；";
				case 23 -> cause = cause + "杨公忌、四天王巡行，null；";
				case 25 -> cause = cause + "月晦日，减寿；";
				case 27 -> cause = cause + "斗降，北极紫薇大帝降，夺纪；";
				case 28 -> cause = cause + "人神在阴，得病；";
				case 29 -> cause = cause + "四天王巡行，null；";
				case 30 -> cause = cause + "月晦日、司命奏事，四天王巡行（月小即戒廿九），减寿；";
				default -> flag = 1;
			}
		break;
		case 11:
			switch (lunarDay) {
				case 1 -> cause = cause + "月朔，夺纪；";
				case 3 -> cause = cause + "斗降，夺纪；";
				case 4 -> cause = cause + "至圣先师孔子诞（因历史上对孔子的诞辰有不同观点，所以此戒期表中出现了八月廿七及该日两处“至圣先师孔子诞辰”——译者注），削禄夺纪；";
				case 6 -> cause = cause + "西岳大帝诞，null；";
				case 8 -> cause = cause + "四天王巡行，null；";
				case 11 -> cause = cause + "天仓开日、太乙救苦天尊诞，削禄夺纪；";
				case 14 -> cause = cause + "四天王巡行2，null；";
				case 15 -> cause = cause + "月望、四天王巡行，上半夜犯男死，下半夜犯女死；";
				case 17 -> cause = cause + "阿弥陀佛诞，null；";
				case 19 -> cause = cause + "太阳日宫诞，得奇祸；";
				case 21 -> cause = cause + "杨公忌，null；";
				case 23 -> cause = cause + "张仙诞，四天王巡行，绝嗣；";
				case 25 -> cause = cause + "掠刷大夫降、月晦日，遭大凶；";
				case 26 -> cause = cause + "北方五道诞，null；";
				case 27 -> cause = cause + "斗降2，夺纪；";
				case 28 -> cause = cause + "人神在阴，得病；";
				case 29 -> cause = cause + "四天王巡行3，null；";
				case 30 -> cause = cause + "月晦、司命奏事（月小即戒廿九），四天王巡行，损寿；";
				default -> flag = 1;
			}
		break;
		case 12:
			switch (lunarDay) {
				case 1 -> cause = cause + "月朔，夺纪；";
				case 3 -> cause = cause + "斗降，夺纪；";
				case 6 -> cause = cause + "天仓开日、雷斋日，减寿；";
				case 7 -> cause = cause + "掠刷大夫降，得恶疾；";
				case 8 -> cause = cause + "王侯腊（初旬内戊日也为王侯腊），释迦如来成佛之日，四天王巡行，夺纪；";
				case 12 -> cause = cause + "太素三元君朝真，null；";
				case 14 -> cause = cause + "四天王巡行，null；";
				case 15 -> cause = cause + "月望，四天王巡行，夺纪；";
				case 16 -> cause = cause + "南岳大帝诞，null；";
				case 19 -> cause = cause + "杨公忌，null；";
				case 20 -> cause = cause + "天地交道，促寿（促：缩短）；";
				case 21 -> cause = cause + "天猷上帝诞，null；";
				case 23 -> cause = cause + "五岳神降、四天王巡行，null；";
				case 24 -> cause = cause + "司命朝天奏人善恶，大祸；";
				case 25 -> cause = cause + "三清玉帝同降考察善恶，奇祸；";
				case 27 -> cause = cause + "斗降2，夺纪；";
				case 28 -> cause = cause + "人神在阴，得病；";
				case 29 -> cause = cause + "华严菩萨诞，四天王巡行，null；";
				case 30 -> cause = cause + "诸神下降，察访善恶，男女俱亡；";
				default -> flag = 1;
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
		/*
		  二社日
		*/
		// 春社日
		Calendar tempCal = Calendar.getInstance();
		tempCal.set(year, Calendar.FEBRUARY, liChun);
		int i = 0;

		int chunSheMonth; // 公历
		int chunSheDay; // 公历
		while (true) {
			utils.LunarUtil lunarUtil2 = new LunarUtil(tempCal);
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
			tempCal.add(Calendar.DATE, 1);
		}
		// 判断是否为春社日
		if (month == chunSheMonth && day == chunSheDay) {
			flag = 0;
			cause += "是春社日，";
		}
		// 秋社日
		tempCal.set(year, Calendar.AUGUST, liQiu);
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
			tempCal.add(Calendar.DATE, 1);
		}
		// 判断是否为秋社日
		if (month == qiuSheMonth && day == qiuSheDay) {
			flag = 0;
			cause += "是秋社日，";
		}

		/*
		 * 三伏日
		*/
		// 入伏日
		Calendar calendar3 = Calendar.getInstance();
		calendar3.set(year, Calendar.JUNE, summerSolstice);
		Calendar rufuCalendar;
		int i1 = 0;
		while (true) {
			LunarUtil lunarUtil3 = new LunarUtil(calendar3);
			String ganzhi = lunarUtil3.Ganzhi(calendar3);

			if (ganzhi.contains("庚")) {
				i1++;
				if (i1 == 3) {
					rufuCalendar = calendar3;
					break;
				}
			}
			calendar3.add(Calendar.DAY_OF_MONTH, 1);
		}
		// 出伏日
		Calendar calendar4 = Calendar.getInstance();
		calendar4.set(year, Calendar.AUGUST, liQiu);
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
		int lunarMonthDays = LunarUtil.lunarMonthDays( lunarYear, lunarMonth);
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
			cause += "值年太岁日，";
		}
		
		// 丙丁日
		if ( ganzhi.contains( "丙") || ganzhi.contains( "丁")) {
			flag = 0;
			cause += "丙丁日，";
		}

		// 毁败日
		// 调试
		// System.out.println( "lunarMonthDays:" + lunarMonthDays);
		if ( lunarMonthDays == 30 && lunarDay == 18) {
			flag = 0;
			cause += "毁败日，";
		}
		if ( lunarMonthDays == 29 && lunarDay == 17) {
			flag = 0;
			cause += "毁败日，";
		}
		
		// 十大恶败日
		String yearGanzhi = lunarUtil.cyclicalYear();
		boolean b = (lunarMonth == 3 && ganzhi.equals("戊戌")) || (lunarMonth == 7 && ganzhi.equals("癸亥")) || (lunarMonth == 10 && ganzhi.equals("丙申")) || (lunarMonth == 11 && ganzhi.equals("丁亥"));
		if( yearGanzhi.contains( "甲") && b) {
			flag = 0;
			cause += "十大恶败日，";
		}
		if( yearGanzhi.contains( "己") && b) {
			flag = 0;
			cause += "十大恶败日，";
		}
		boolean b1 = (lunarMonth == 4 && ganzhi.equals("壬申")) || (lunarMonth == 9 && ganzhi.equals("乙巳"));
		if( yearGanzhi.contains( "乙") && b1) {
			flag = 0;
			cause += "十大恶败日，";
		}
		if( yearGanzhi.contains( "庚") && b1) {
			flag = 0;
			cause += "十大恶败日，";
		}
		boolean b2 = (lunarMonth == 3 && ganzhi.equals("辛巳")) || (lunarMonth == 9 && ganzhi.equals("庚辰")) || (lunarMonth == 10 && ganzhi.equals("甲辰"));
		if( yearGanzhi.contains( "丙") && b2) {
			flag = 0;
			cause += "十大恶败日，";
		}
		if( yearGanzhi.contains( "辛") && b2) {
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
		tempCal2.set( year, Calendar.DECEMBER, winterSolstice);
		Calendar gengCal;
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
		@SuppressWarnings( "UnnecessaryLocalVariable")
		Calendar xinCal = tempCal1;
		if( xinCal.get( Calendar.YEAR) == calendar.get( Calendar.YEAR) && xinCal.get( Calendar.MONTH) == calendar.get( Calendar.MONTH) && xinCal.get( Calendar.DAY_OF_MONTH) == calendar.get( Calendar.DAY_OF_MONTH)) {
			flag = 0;
			cause += "冬至后辛日， ";
		}
		
		// 冬至后第三个戌日
		Calendar tempCal3 = Calendar.getInstance();
		tempCal3.set( year, Calendar.DECEMBER, winterSolstice);
		Calendar wuCal;
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
		
		return flag + ": " + cause;
	}
}
