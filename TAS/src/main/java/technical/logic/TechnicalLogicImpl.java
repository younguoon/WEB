package technical.logic;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import technical.dto.MovingAverageDTO;
import technical.dto.RsiDTO;
import technical.dto.StockDInfoDTO;

@Repository("technicallogic")
public class TechnicalLogicImpl implements TechnicalLogic {
	
	//주식정보 리스트의 인덱스가 0일때 가장 최근 날짜 정보
	@Override
	public List<MovingAverageDTO> getMovingAvgList(List<StockDInfoDTO> stockInfoList) {

		List<MovingAverageDTO> movingAvgList = new ArrayList<MovingAverageDTO>();

		int listSize = stockInfoList.size();
		for (int i = 0; i < listSize; i++) {
			// 5일 평균 종가 계산
			int fiveTotal = 0;
			int fiveAvg = 0;
			if (listSize - i >= 5) {
				for (int j = 0; j < 5; j++) {
					fiveTotal = fiveTotal + stockInfoList.get(i + j).getEndPrice();
				}
				fiveAvg = fiveTotal / 5;
			}

			// 20일 평균 종가 계산
			int twentyTotal = 0;
			int twentyAvg = 0;
			if (listSize - i >= 20) {
				for (int j = 0; j < 20; j++) {
					twentyTotal = twentyTotal + stockInfoList.get(i + j).getEndPrice();
				}
				twentyAvg = twentyTotal / 20;
			}

			// 60일 평균 종가 계산
			int sixtyTotal = 0;
			int sixtyAvg = 0;
			if (listSize - i >= 60) {
				for (int j = 0; j < 60; j++) {
					sixtyTotal = sixtyTotal + stockInfoList.get(i + j).getEndPrice();
				}
				sixtyAvg = sixtyTotal / 60;
			}

			// 120일 평균 종가 계산
			int oneTwentyTotal = 0;
			int oneTwentyAvg = 0;
			// if (listSize - i >= 120) {
			// for (int j = 0; j < 120; j++) {
			// oneTwentyTotal = oneTwentyTotal + stockInfoList.get(i +
			// j).getEndPrice();
			// }
			// oneTwentyAvg = oneTwentyTotal / 120;
			// }

			String day = stockInfoList.get(i).getDay();
			int endPrice = stockInfoList.get(i).getEndPrice();
			MovingAverageDTO movingAvg = new MovingAverageDTO(day, endPrice, fiveAvg, twentyAvg, sixtyAvg,
					oneTwentyAvg);
			movingAvgList.add(movingAvg);

		}
		return movingAvgList;
	}
	
	//주식정보 리스트의 인덱스가 0일때 가장 오래된 날짜 정보
	@Override
	public List<MovingAverageDTO> getMovingAvgListOderByOld(List<StockDInfoDTO> stockInfoList) {
		List<MovingAverageDTO> movingAvgList = new ArrayList<MovingAverageDTO>();

		int listSize = stockInfoList.size();
		for (int i = 0; i < listSize; i++) {
			// 5일 평균 종가 계산
			int fiveTotal = 0;
			int fiveAvg = 0;
			if ( i >= 5) {
				for (int j = 0; j < 5; j++) {
					fiveTotal = fiveTotal + stockInfoList.get(i - j).getEndPrice();
				}
				fiveAvg = fiveTotal / 5;
			}

			// 20일 평균 종가 계산
			int twentyTotal = 0;
			int twentyAvg = 0;
			if (i >= 20) {
				for (int j = 0; j < 20; j++) {
					twentyTotal = twentyTotal + stockInfoList.get(i - j).getEndPrice();
				}
				twentyAvg = twentyTotal / 20;
			}

			// 60일 평균 종가 계산
			int sixtyTotal = 0;
			int sixtyAvg = 0;
			if (i >= 60) {
				for (int j = 0; j < 60; j++) {
					sixtyTotal = sixtyTotal + stockInfoList.get(i - j).getEndPrice();
				}
				sixtyAvg = sixtyTotal / 60;
			}

			// 120일 평균 종가 계산
			int oneTwentyTotal = 0;
			int oneTwentyAvg = 0;
			// if (i >= 120) {
			// for (int j = 0; j < 120; j++) {
			// oneTwentyTotal = oneTwentyTotal + stockInfoList.get(i - j).getEndPrice();
			// }
			// oneTwentyAvg = oneTwentyTotal / 120;
			// }

			String day = stockInfoList.get(i).getDay();
			int endPrice = stockInfoList.get(i).getEndPrice();
			MovingAverageDTO movingAvg = new MovingAverageDTO(day, endPrice, fiveAvg, twentyAvg, sixtyAvg,
					oneTwentyAvg);
			movingAvgList.add(movingAvg);

		}
		return movingAvgList;
	}
	
	
	//주식정보 리스트의 인덱스가 0일때 가장 최근 날짜 정보
	@Override
	public Boolean isGoldencross(List<MovingAverageDTO> movingAvgList, String mode) {
		int count = 0;
		boolean result = false;
		if (mode.equals("20")) {
			int nextFiveAvg = movingAvgList.get(3).getFiveAvg();
			int nextTwentyAvg = movingAvgList.get(3).getTwentyAvg();

			int preFiveAvg = movingAvgList.get(4).getFiveAvg();
			int preTwentyAvg = movingAvgList.get(4).getTwentyAvg();

			if (preFiveAvg <= preTwentyAvg & nextFiveAvg >= nextTwentyAvg) {
				for (int i = 0; i < 4; i++) {
					int fiveAvg = movingAvgList.get(i).getFiveAvg();
					int twentyAvg = movingAvgList.get(i).getTwentyAvg();

					if (fiveAvg > twentyAvg) {
						count = count + 1;
					}

				}
			}
			if (count > 3) {
				result = true;
			}
			// System.out.println("count: "+count);
		} else if (mode.equals("60")) {

			int nextTwentyAvg = movingAvgList.get(3).getTwentyAvg();
			int nextSixtyAvg = movingAvgList.get(3).getSixtyAvg();

			int preTwentyAvg = movingAvgList.get(4).getTwentyAvg();
			int preSixtyAvg = movingAvgList.get(4).getSixtyAvg();
			// System.out.println(nextTwentyAvg+","+nextSixtyAvg);
			if (preTwentyAvg <= preSixtyAvg & nextTwentyAvg >= nextSixtyAvg) {
				for (int i = 0; i < 4; i++) {
					int sixtyAvg = movingAvgList.get(i).getSixtyAvg();
					int twentyAvg = movingAvgList.get(i).getTwentyAvg();

					if (twentyAvg > sixtyAvg) {
						count = count + 1;
					}

				}
			}
			if (count > 3) {
				result = true;
			}
		}

		return result;
	}

	@Override
	public String getSearchStartDay(String mode) {
		// String 타입의 현재 날짜를 구하고 월을 변경
		Date today = new Date();
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyyMMdd");
		String day = dayFormat.format(today);

		String month = day.substring(4, 6);
		String newMonth = null;
		if (mode.equals("20")) {
			newMonth = Integer.toString((Integer.parseInt(month) - 2));
		} else if (mode.equals("60")) {
			newMonth = Integer.toString((Integer.parseInt(month) - 4));
		} else {
			newMonth = Integer.toString((Integer.parseInt(month) - 1));
		}

		if (newMonth.equals("0")) {
			newMonth = "12";
		} else if (newMonth.equals("-1")) {
			newMonth = "11";
		} else if (newMonth.equals("-2")) {
			newMonth = "10";
		} else if (newMonth.equals("-3")) {
			newMonth = "09";
		}

		if (newMonth.length() == 1) {
			newMonth = "0" + newMonth;
		}
		day = day.replace(month, newMonth).trim();

		return day;

	}
	
	//주식정보 리스트의 인덱스가 0일때 가장 최근 날짜 정보
	@Override
	public List<RsiDTO> getRsiList(List<StockDInfoDTO> stockInfoList) {
		int listSize = stockInfoList.size();
		List<RsiDTO> rsiList = new ArrayList<RsiDTO>();
		for (int i = 0; i < listSize; i++) {
			
			int upTotal = 0;
			float upAvg = 0;
			int downTotal = 0;
			float downAvg = 0;
			float sevenRsi=0;
			float fourteenRsi=0;
			float twentyOneRsi =0;
			if ((listSize - i) > 7) {
				for (int j = 0; j < 7; j++) {

					if (stockInfoList.get(i + j).getChangePrice() > 0) {
						upTotal = upTotal + stockInfoList.get(i + j).getChangePrice();
					} else if (stockInfoList.get(i + j).getChangePrice() < 0) {
						downTotal = downTotal + stockInfoList.get(i + j).getChangePrice();
					}
				}
				upAvg = upTotal / 7;
				downAvg = -1*(downTotal / 7);
				sevenRsi = upAvg / (upAvg + downAvg) * 100;
			}

			upTotal = 0;
			upAvg = 0;
			downTotal = 0;
			downAvg = 0;
			
			
			if ((listSize - i) > 14) {
				for (int j = 0; j < 14; j++) {

					if (stockInfoList.get(i + j).getChangePrice() > 0) {
						upTotal = upTotal + stockInfoList.get(i + j).getChangePrice();
					} else if (stockInfoList.get(i + j).getChangePrice() < 0) {
						downTotal = downTotal + stockInfoList.get(i + j).getChangePrice();
					}
				}

				upAvg = upTotal / 14;
				downAvg = -1*(downTotal / 14);
				fourteenRsi = upAvg / (upAvg + downAvg) * 100;

			}

			upTotal = 0;
			upAvg = 0;
			downTotal = 0;
			downAvg = 0;
			if ((listSize - i) > 21) {
				for (int j = 0; j < 21; j++) {

					if (stockInfoList.get(i + j).getChangePrice() > 0) {
						upTotal = upTotal + stockInfoList.get(i + j).getChangePrice();
					} else if (stockInfoList.get(i + j).getChangePrice() < 0) {
						downTotal = downTotal + stockInfoList.get(i + j).getChangePrice();
					}
				}

				upAvg = upTotal / 21;
				downAvg = -1*(downTotal / 21);
				twentyOneRsi = upAvg / (upAvg + downAvg) * 100;

			}
			
			String day = stockInfoList.get(i).getDay();
			int endPrice = stockInfoList.get(i).getEndPrice();
			RsiDTO rsiDto = new RsiDTO(day, endPrice, sevenRsi,fourteenRsi,twentyOneRsi);

			rsiList.add(rsiDto);
		}
		return rsiList;
	}
	
	//주식정보 리스트의 인덱스가 0일때 가장 최근 날짜 정보
	@Override
	public Boolean isLowRsi(List<RsiDTO> rsiList,String mode) {
		Boolean result=false;
		int count=0;
		for (int i=0 ; i<3;i++){
			if(mode.equals("7")){
				if(rsiList.get(i).getSevenRsi()<=30){
					count= count+1;
				}
			}else if(mode.equals("14")){
				if(rsiList.get(i).getFourteenRsi()<=30){
					count= count+1;
				}
			}else if(mode.equals("21")){
				if(rsiList.get(i).getTwentyOneRsi()<=30){
					count= count+1;
				}
			}
		}
		if(count==3){
			result=true;
		}
		
		return result;
	}

	

}
