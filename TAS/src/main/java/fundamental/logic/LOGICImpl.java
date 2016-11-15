package fundamental.logic;

import org.springframework.stereotype.Repository;

import fundamental.dto.BpsDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EpsDTO;

@Repository("fundamentallogic")
public class LOGICImpl implements LOGIC {

	@Override
	public BpsDTO bps(EnterpriseFinanceDTO info, int totalStock, String code) {
			
			//가져온 값
			double asset_07y = info.getAsset_06y();
			double asset_08y = info.getAsset_07y();
			double asset_09y = info.getAsset_08y();
			double asset_10y = info.getAsset_09y();
			double asset_11y = info.getAsset_10y();
			double asset_12y = info.getAsset_11y();
			double asset_13y = info.getAsset_12y();
			double asset_14y = info.getAsset_13y();
			double asset_15y = info.getAsset_14y();
			double asset_16y = info.getAsset_15y();
			
			
			//계산해야될 값
			double asset_17y = info.getAsset_16y();
			double asset_18y = info.getAsset_17y();
			double asset_19y = info.getAsset_18y();
			double asset_20y = info.getAsset_19y();
			
			
			//06년도 자산DB 보유여부 확인 없으면 16년도 예상 자산 계산
//			if(info.getAsset_06y()==0){
//				
//			}else if(info.getAsset_06y()!=0){
//				
//			}
			
			// `17~`20년 예상 자산을 구하기 위한 `13~`19년도 예상 자산 증가율 계산
			double asset_1314y_increaseRatio_notyet = (double)(asset_13y / asset_14y);
//			System.out.println("LOGIC - asset_1314y_increaseRatio_notyet : "+asset_1314y_increaseRatio_notyet);
			double asset_1415y_increaseRatio_notyet = (double)(asset_14y / asset_15y);
			double asset_1516y_increaseRatio_notyet = (double)(asset_15y / asset_16y);
			double asset_1314y_increaseRatio = Math.round(asset_1314y_increaseRatio_notyet * 10d) / 10d;
//			System.out.println("LOGIC - asset_1314y_increaseRatio : "+asset_1314y_increaseRatio);
			double asset_1415y_increaseRatio = Math.round(asset_1415y_increaseRatio_notyet * 10d) / 10d;
			double asset_1516y_increaseRatio = Math.round(asset_1516y_increaseRatio_notyet * 10d) / 10d;


			// `16년도 이후 예상 자산 계산을 위한 가중치 부여 가장 최근 증가율부터 비율(3:2:1)
			double asset_1617y_increaseRatio_notyet = (((asset_1314y_increaseRatio * 1)
					+ (asset_1415y_increaseRatio * 2) + (asset_1516y_increaseRatio * 3)) / 6);
			double asset_1617y_increaseRatio = Math.round(asset_1617y_increaseRatio_notyet * 1000d) / 1000d;
			
			double asset_1718y_increaseRatio_notyet = (((asset_1415y_increaseRatio * 1)
					+ (asset_1516y_increaseRatio * 2) + (asset_1617y_increaseRatio * 3)) / 6);
			double asset_1718y_increaseRatio = Math.round(asset_1718y_increaseRatio_notyet * 1000d) / 1000d;
			
			double asset_1819y_increaseRatio_notyet = (((asset_1516y_increaseRatio * 1)
					+ (asset_1617y_increaseRatio * 2) + (asset_1718y_increaseRatio * 3)) / 6);
			double asset_1819y_increaseRatio = Math.round(asset_1819y_increaseRatio_notyet * 1000d) / 1000d;
			
			double asset_1920y_increaseRatio_notyet = (((asset_1617y_increaseRatio * 1)
					+ (asset_1718y_increaseRatio * 2) + (asset_1819y_increaseRatio * 3)) / 6);
			double asset_1920y_increaseRatio = Math.round(asset_1920y_increaseRatio_notyet * 1000d) / 1000d;
			
			
			// `17~`20년 예상 자산
			double asset_17y_notyet = (asset_1617y_increaseRatio * asset_16y)/10.0 + asset_16y;
			double asset_18y_notyet = (asset_1718y_increaseRatio * asset_17y_notyet)/10.0 + asset_17y_notyet;
			double asset_19y_notyet = (asset_1819y_increaseRatio * asset_18y_notyet)/10.0 + asset_18y_notyet;
			double asset_20y_notyet = (asset_1920y_increaseRatio * asset_19y_notyet)/10.0 + asset_19y_notyet;

			
			
			// `17~`20년 예상 자산 소수점 둘째자리에서 반올림
			asset_17y = Math.round(asset_17y_notyet * 1d) / 1d;
			asset_18y = Math.round(asset_18y_notyet * 1d) / 1d;
			asset_19y = Math.round(asset_19y_notyet * 1d) / 1d;
			asset_20y = Math.round(asset_20y_notyet * 1d) / 1d;
			
			
			BpsDTO bps = new BpsDTO();
			int billion = 100000000;
			
			// BPS 계산
			bps.setBps07y((int)(Math.round((asset_07y * billion / totalStock) * 1d) / 1d));
			bps.setBps07y2((int)(Math.round(((asset_07y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps07y3((int)(Math.round(((asset_07y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps07y4((int)(Math.round(((asset_07y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps07y_04((int)(Math.round(((asset_07y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps07y_06((int)(Math.round(((asset_07y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps07y_08((int)(Math.round(((asset_07y * billion / totalStock) * 0.8) * 1d) / 1d));
			
			bps.setBps08y((int)(Math.round((asset_08y * billion / totalStock) * 1d) / 1d));
			bps.setBps08y2((int)(Math.round(((asset_08y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps08y3((int)(Math.round(((asset_08y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps08y4((int)(Math.round(((asset_08y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps08y_04((int)(Math.round(((asset_08y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps08y_06((int)(Math.round(((asset_08y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps08y_08((int)(Math.round(((asset_08y * billion / totalStock) * 0.8) * 1d) / 1d));
			
			bps.setBps09y((int)(Math.round((asset_09y * billion / totalStock) * 1d) / 1d));
			bps.setBps09y2((int)(Math.round(((asset_09y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps09y3((int)(Math.round(((asset_09y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps09y4((int)(Math.round(((asset_09y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps09y_04((int)(Math.round(((asset_09y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps09y_06((int)(Math.round(((asset_09y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps09y_08((int)(Math.round(((asset_09y * billion / totalStock) * 0.8) * 1d) / 1d));
			
			bps.setBps10y((int)(Math.round((asset_10y * billion / totalStock) * 1d) / 1d));
			bps.setBps10y2((int)(Math.round(((asset_10y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps10y3((int)(Math.round(((asset_10y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps10y4((int)(Math.round(((asset_10y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps10y_04((int)(Math.round(((asset_10y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps10y_06((int)(Math.round(((asset_10y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps10y_08((int)(Math.round(((asset_10y * billion / totalStock) * 0.8) * 1d) / 1d));
			
			bps.setBps11y((int)(Math.round((asset_11y * billion / totalStock) * 1d) / 1d));
			bps.setBps11y2((int)(Math.round(((asset_11y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps11y3((int)(Math.round(((asset_11y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps11y4((int)(Math.round(((asset_11y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps11y_04((int)(Math.round(((asset_11y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps11y_06((int)(Math.round(((asset_11y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps11y_08((int)(Math.round(((asset_11y * billion / totalStock) * 0.8) * 1d) / 1d));
			
			bps.setBps12y((int)(Math.round((asset_12y * billion / totalStock) * 1d) / 1d));
			bps.setBps12y2((int)(Math.round(((asset_12y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps12y3((int)(Math.round(((asset_12y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps12y4((int)(Math.round(((asset_12y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps12y_04((int)(Math.round(((asset_12y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps12y_06((int)(Math.round(((asset_12y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps12y_08((int)(Math.round(((asset_12y * billion / totalStock) * 0.8) * 1d) / 1d));
			
			bps.setBps13y((int)(Math.round((asset_13y * billion / totalStock) * 1d) / 1d));
			bps.setBps13y2((int)(Math.round(((asset_13y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps13y3((int)(Math.round(((asset_13y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps13y4((int)(Math.round(((asset_13y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps13y_04((int)(Math.round(((asset_13y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps13y_06((int)(Math.round(((asset_13y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps13y_08((int)(Math.round(((asset_13y * billion / totalStock) * 0.8) * 1d) / 1d));
			
			bps.setBps14y((int)(Math.round((asset_14y * billion / totalStock) * 1d) / 1d));
			bps.setBps14y2((int)(Math.round(((asset_14y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps14y3((int)(Math.round(((asset_14y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps14y4((int)(Math.round(((asset_14y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps14y_04((int)(Math.round(((asset_14y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps14y_06((int)(Math.round(((asset_14y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps14y_08((int)(Math.round(((asset_14y * billion / totalStock) * 0.8) * 1d) / 1d));
			
			bps.setBps15y((int)(Math.round((asset_15y * billion / totalStock) * 1d) / 1d));
			bps.setBps15y2((int)(Math.round(((asset_15y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps15y3((int)(Math.round(((asset_15y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps15y4((int)(Math.round(((asset_15y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps15y_04((int)(Math.round(((asset_15y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps15y_06((int)(Math.round(((asset_15y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps15y_08((int)(Math.round(((asset_15y * billion / totalStock) * 0.8) * 1d) / 1d));
			
			// 16년, 17년, 18년, 19년도 예상 bps 계산 시작
			bps.setBps16y((int)(Math.round((asset_16y * billion / totalStock) * 1d) / 1d));
			bps.setBps16y2((int)(Math.round(((asset_16y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps16y3((int)(Math.round(((asset_16y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps16y4((int)(Math.round(((asset_16y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps16y_04((int)(Math.round(((asset_16y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps16y_06((int)(Math.round(((asset_16y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps16y_08((int)(Math.round(((asset_16y * billion / totalStock) * 0.8) * 1d) / 1d));
			
//			System.out.println("~!~!~!~!~!~!~!~! bps check 1 : "+(int)(Math.round(((asset_16y * billion / totalStock) * 1d) * 1d) / 1d));
//			System.out.println("bps check1 :" + Math.round((asset_16y * billion / totalStock)));
//			
//			System.out.println("totalStock : "+totalStock);
			
			bps.setBps17y((int)(Math.round((asset_17y * billion / totalStock) * 1d) / 1d));
			bps.setBps17y2((int)(Math.round(((asset_17y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps17y3((int)(Math.round(((asset_17y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps17y4((int)(Math.round(((asset_17y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps17y_04((int)(Math.round(((asset_17y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps17y_06((int)(Math.round(((asset_17y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps17y_08((int)(Math.round(((asset_17y * billion / totalStock) * 0.8) * 1d) / 1d));
			
//			System.out.println("bps check2 :" + Math.round((asset_17y * billion / totalStock)));
			
			bps.setBps18y((int)(Math.round((asset_18y * billion / totalStock) * 1d) / 1d));
			bps.setBps18y2((int)(Math.round(((asset_18y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps18y3((int)(Math.round(((asset_18y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps18y4((int)(Math.round(((asset_18y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps18y_04((int)(Math.round(((asset_18y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps18y_06((int)(Math.round(((asset_18y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps18y_08((int)(Math.round(((asset_18y * billion / totalStock) * 0.8) * 1d) / 1d));
			
			bps.setBps19y((int)(Math.round((asset_19y * billion / totalStock) * 1d) / 1d));
			bps.setBps19y2((int)(Math.round(((asset_19y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps19y3((int)(Math.round(((asset_19y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps19y4((int)(Math.round(((asset_19y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps19y_04((int)(Math.round(((asset_19y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps19y_06((int)(Math.round(((asset_19y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps19y_08((int)(Math.round(((asset_19y * billion / totalStock) * 0.8) * 1d) / 1d));
			
			bps.setBps20y((int)(Math.round((asset_20y * billion / totalStock) * 1d) / 1d));
			bps.setBps20y2((int)(Math.round(((asset_20y * billion / totalStock) * 2) * 1d) / 1d));
			bps.setBps20y3((int)(Math.round(((asset_20y * billion / totalStock) * 3) * 1d) / 1d));
			bps.setBps20y4((int)(Math.round(((asset_20y * billion / totalStock) * 4) * 1d) / 1d));
			bps.setBps20y_04((int)(Math.round(((asset_20y * billion / totalStock) * 0.4) * 1d) / 1d));
			bps.setBps20y_06((int)(Math.round(((asset_20y * billion / totalStock) * 0.6) * 1d) / 1d));
			bps.setBps20y_08((int)(Math.round(((asset_20y * billion / totalStock) * 0.8) * 1d) / 1d));
			
			
			
//			System.out.println("logic - 13년도 자산 : "+asset_13y);
//			System.out.println("logic - 14년도 자산 : "+asset_14y);
//			System.out.println("logic - 15년도 자산 : "+asset_15y);
//			System.out.println("logic - 16년도 자산 : "+asset_16y);
//			System.out.println("logic - 17년도 자산 : "+asset_17y);
//			System.out.println();
//			
//			System.out.println("LOGIC - 15년도 bps : "+bps.getBps15y());
//			System.out.println("LOGIC - 16년도 bps : "+bps.getBps16y());
//			System.out.println("LOGIC - 17년도 bps : "+bps.getBps17y());
			
			
			
			bps.setCode(info.getCode());
			
			// 16년, 17년, 18년, 19년도 예상 bps 계산 끝
			
		return bps;
	}


	@Override
	public EpsDTO eps(EnterpriseFinanceDTO info, int totalStock, String code) {
		
		double profit_07y = info.getProfit_06y();
		double profit_08y = info.getProfit_07y();
		double profit_09y = info.getProfit_08y();
		double profit_10y = info.getProfit_09y();
		double profit_11y = info.getProfit_10y();
		double profit_12y = info.getProfit_11y();
		double profit_13y = info.getProfit_12y();
		double profit_14y = info.getProfit_13y();
		double profit_15y = info.getProfit_14y();
		double profit_16y = info.getProfit_15y();
		
		//계산할 값
		double profit_17y = info.getProfit_16y();
		double profit_18y = info.getProfit_17y();
		double profit_19y = info.getProfit_18y();
		double profit_20y = info.getProfit_19y();
		
		
		// `16~`19년 예상 자산을 구하기 위한 `12~`19년도 예상 자산 증가율 계산
		double profit_1314y_increaseRatio_notyet = (double) profit_13y / profit_14y;
		double profit_1415y_increaseRatio_notyet = (double) profit_14y / profit_15y;
		double profit_1516y_increaseRatio_notyet = (double) profit_15y / profit_16y;
		double profit_1314y_increaseRatio = Math.round(profit_1314y_increaseRatio_notyet * 10d) / 10d;
		double profit_1415y_increaseRatio = Math.round(profit_1415y_increaseRatio_notyet * 10d) / 10d;
		double profit_1516y_increaseRatio = Math.round(profit_1516y_increaseRatio_notyet * 10d) / 10d;

//		System.out.println("profit_1415y_increaseRatio : " + profit_1415y_increaseRatio);

		// `16년도 이후 예상 자산 계산을 위한 가중치 부여 가장 최근 증가율부터 비율(3:2:1)
		double profit_1617y_increaseRatio_notyet = (((profit_1314y_increaseRatio * 1)
				+ (profit_1415y_increaseRatio * 2) + (profit_1516y_increaseRatio * 3)) / 6) / 10;
		double profit_1617y_increaseRatio = Math.round(profit_1617y_increaseRatio_notyet * 1000d) / 1000d;
		double profit_1718y_increaseRatio_notyet = (((profit_1415y_increaseRatio * 1)
				+ (profit_1516y_increaseRatio * 2) + (profit_1617y_increaseRatio * 3)) / 6) / 10;
		double profit_1718y_increaseRatio = Math.round(profit_1718y_increaseRatio_notyet * 1000d) / 1000d;
		double profit_1819y_increaseRatio_notyet = (((profit_1516y_increaseRatio * 1)
				+ (profit_1617y_increaseRatio * 2) + (profit_1718y_increaseRatio * 3)) / 6) / 10;
		double profit_1819y_increaseRatio = Math.round(profit_1819y_increaseRatio_notyet * 1000d) / 1000d;
		double profit_1920y_increaseRatio_notyet = (((profit_1617y_increaseRatio * 1)
				+ (profit_1718y_increaseRatio * 2) + (profit_1819y_increaseRatio * 3)) / 6) / 10;
		double profit_1920y_increaseRatio = Math.round(profit_1920y_increaseRatio_notyet * 1000d) / 1000d;

		
		// `17~`20년 예상 자산
		double profit_17y_notyet = (profit_1617y_increaseRatio * profit_16y) + profit_16y;
		double profit_18y_notyet = (profit_1718y_increaseRatio * profit_17y_notyet) + profit_17y_notyet;
		double profit_19y_notyet = (profit_1819y_increaseRatio * profit_18y_notyet) + profit_18y_notyet;
		double profit_20y_notyet = (profit_1920y_increaseRatio * profit_18y_notyet) + profit_18y_notyet;
		
		
		// `17~`20년 예상 자산 소수점 둘째자리에서 반올림
		profit_17y = Math.round(profit_17y_notyet * 1d) / 1d;
		profit_18y = Math.round(profit_18y_notyet * 1d) / 1d;
		profit_19y = Math.round(profit_19y_notyet * 1d) / 1d;
		profit_20y = Math.round(profit_20y_notyet * 1d) / 1d;
		

		EpsDTO eps = new EpsDTO();
		int billion = 100000000;
		
		// EPS 계산
		eps.setEps07y((int)(Math.round(profit_07y * billion / totalStock) / 1d));
		eps.setEps07y6((int)(Math.round((profit_07y * billion / totalStock) * 6.0) / 1d));
		eps.setEps07y9((int)(Math.round(((profit_07y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps07y12((int)(Math.round(((profit_07y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps07y16((int)(Math.round(((profit_07y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps07y20((int)(Math.round(((profit_07y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps07y30((int)(Math.round(((profit_07y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps07y50((int)(Math.round(((profit_07y * billion / totalStock) * 50.0) * 1d) / 1d));
		
		
		eps.setEps08y((int)(Math.round(profit_08y * billion / totalStock) / 1d));
		eps.setEps08y6((int)(Math.round((profit_08y * billion / totalStock) * 6.0) / 1d));
		eps.setEps08y9((int)(Math.round(((profit_08y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps08y12((int)(Math.round(((profit_08y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps08y16((int)(Math.round(((profit_08y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps08y20((int)(Math.round(((profit_08y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps08y30((int)(Math.round(((profit_08y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps08y50((int)(Math.round(((profit_08y * billion / totalStock) * 50.0) * 1d) / 1d));
		
		
		eps.setEps09y((int)(Math.round(profit_09y * billion / totalStock) / 1d));
		eps.setEps09y6((int)(Math.round((profit_09y * billion / totalStock) * 6.0) / 1d));
		eps.setEps09y9((int)(Math.round(((profit_09y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps09y12((int)(Math.round(((profit_09y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps09y16((int)(Math.round(((profit_09y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps09y20((int)(Math.round(((profit_09y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps09y30((int)(Math.round(((profit_09y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps09y50((int)(Math.round(((profit_09y * billion / totalStock) * 50.0) * 1d) / 1d));
			
		
		eps.setEps10y((int)(Math.round(profit_10y * billion / totalStock) / 1d));
		eps.setEps10y6((int)(Math.round((profit_10y * billion / totalStock) * 6.0) / 1d));
		eps.setEps10y9((int)(Math.round(((profit_10y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps10y12((int)(Math.round(((profit_10y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps10y16((int)(Math.round(((profit_10y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps10y20((int)(Math.round(((profit_10y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps10y30((int)(Math.round(((profit_10y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps10y50((int)(Math.round(((profit_10y * billion / totalStock) * 50.0) * 1d) / 1d));
		
		
		eps.setEps11y((int)(Math.round(profit_11y * billion / totalStock) / 1d));
		eps.setEps11y6((int)(Math.round((profit_11y * billion / totalStock) * 6.0) / 1d));
		eps.setEps11y9((int)(Math.round(((profit_11y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps11y12((int)(Math.round(((profit_11y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps11y16((int)(Math.round(((profit_11y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps11y20((int)(Math.round(((profit_11y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps11y30((int)(Math.round(((profit_11y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps11y50((int)(Math.round(((profit_11y * billion / totalStock) * 50.0) * 1d) / 1d));
		
		
		eps.setEps12y((int)(Math.round(profit_12y * billion / totalStock) / 1d));
		eps.setEps12y6((int)(Math.round((profit_12y * billion / totalStock) * 6.0) / 1d));
		eps.setEps12y9((int)(Math.round(((profit_12y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps12y12((int)(Math.round(((profit_12y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps12y16((int)(Math.round(((profit_12y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps12y20((int)(Math.round(((profit_12y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps12y30((int)(Math.round(((profit_12y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps12y50((int)(Math.round(((profit_12y * billion / totalStock) * 50.0) * 1d) / 1d));
		
		
		eps.setEps13y((int)(Math.round(profit_13y * billion / totalStock) / 1d));
		eps.setEps13y6((int)(Math.round((profit_13y * billion / totalStock) * 6.0) / 1d));
		eps.setEps13y9((int)(Math.round(((profit_13y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps13y12((int)(Math.round(((profit_13y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps13y16((int)(Math.round(((profit_13y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps13y20((int)(Math.round(((profit_13y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps13y30((int)(Math.round(((profit_13y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps13y50((int)(Math.round(((profit_13y * billion / totalStock) * 50.0) * 1d) / 1d));
		
		
		eps.setEps14y((int)(Math.round(profit_14y * billion / totalStock) / 1d));
		eps.setEps14y6((int)(Math.round((profit_14y * billion / totalStock) * 6.0) / 1d));
		eps.setEps14y9((int)(Math.round(((profit_14y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps14y12((int)(Math.round(((profit_14y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps14y16((int)(Math.round(((profit_14y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps14y20((int)(Math.round(((profit_14y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps14y30((int)(Math.round(((profit_14y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps14y50((int)(Math.round(((profit_14y * billion / totalStock) * 50.0) * 1d) / 1d));
		
		
		eps.setEps15y((int)(Math.round(profit_15y * billion / totalStock) / 1d));
		eps.setEps15y6((int)(Math.round((profit_15y * billion / totalStock) * 6.0) / 1d));
		eps.setEps15y9((int)(Math.round(((profit_15y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps15y12((int)(Math.round(((profit_15y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps15y16((int)(Math.round(((profit_15y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps15y20((int)(Math.round(((profit_15y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps15y30((int)(Math.round(((profit_15y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps15y50((int)(Math.round(((profit_15y * billion / totalStock) * 50.0) * 1d) / 1d));
		
		
		// 16년, 17년, 18년, 19년도 예상 eps 계산 시작
		eps.setEps16y((int)(Math.round(profit_16y * billion / totalStock) / 1d));
		eps.setEps16y6((int)(Math.round((profit_16y * billion / totalStock) * 6.0) / 1d));
		eps.setEps16y9((int)(Math.round(((profit_16y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps16y12((int)(Math.round(((profit_16y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps16y16((int)(Math.round(((profit_16y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps16y20((int)(Math.round(((profit_16y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps16y30((int)(Math.round(((profit_16y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps16y50((int)(Math.round(((profit_16y * billion / totalStock) * 50.0) * 1d) / 1d));
		
		
		eps.setEps17y((int)(Math.round(profit_17y * billion / totalStock) / 1d));
		eps.setEps17y6((int)(Math.round((profit_17y * billion / totalStock) * 6.0) / 1d));
		eps.setEps17y9((int)(Math.round(((profit_17y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps17y12((int)(Math.round(((profit_17y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps17y16((int)(Math.round(((profit_17y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps17y20((int)(Math.round(((profit_17y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps17y30((int)(Math.round(((profit_17y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps17y50((int)(Math.round(((profit_17y * billion / totalStock) * 50.0) * 1d) / 1d));
		
		
		eps.setEps18y((int)(Math.round(profit_18y * billion / totalStock) / 1d));
		eps.setEps18y6((int)(Math.round((profit_18y * billion / totalStock) * 6.0) / 1d));
		eps.setEps18y9((int)(Math.round(((profit_18y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps18y12((int)(Math.round(((profit_18y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps18y16((int)(Math.round(((profit_18y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps18y20((int)(Math.round(((profit_18y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps18y30((int)(Math.round(((profit_18y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps18y50((int)(Math.round(((profit_18y * billion / totalStock) * 50.0) * 1d) / 1d));
		
		
		eps.setEps19y((int)(Math.round(profit_19y * billion / totalStock) / 1d));
		eps.setEps19y6((int)(Math.round((profit_19y * billion / totalStock) * 6.0) / 1d));
		eps.setEps19y9((int)(Math.round(((profit_19y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps19y12((int)(Math.round(((profit_19y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps19y16((int)(Math.round(((profit_19y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps19y20((int)(Math.round(((profit_19y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps19y30((int)(Math.round(((profit_19y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps19y50((int)(Math.round(((profit_19y * billion / totalStock) * 50.0) * 1d) / 1d));
		
		
		eps.setEps20y((int)(Math.round(profit_20y * billion / totalStock) / 1d));
		eps.setEps20y6((int)(Math.round((profit_20y * billion / totalStock) * 6.0) / 1d));
		eps.setEps20y9((int)(Math.round(((profit_20y * billion / totalStock) * 9.0) * 1d) / 1d));
		eps.setEps20y12((int)(Math.round(((profit_20y * billion / totalStock) * 12.0) * 1d) / 1d));
		eps.setEps20y16((int)(Math.round(((profit_20y * billion / totalStock) * 16.0) * 1d) / 1d));
		eps.setEps20y20((int)(Math.round(((profit_20y * billion / totalStock) * 20.0) * 1d) / 1d));
		eps.setEps20y30((int)(Math.round(((profit_20y * billion / totalStock) * 30.0) * 1d) / 1d));
		eps.setEps20y50((int)(Math.round(((profit_20y * billion / totalStock) * 50.0) * 1d) / 1d));
		
		
//		bps eps 계산 확인
//		System.out.println("-------------------------");
//		System.out.println("eps09y6 : "+eps.getEps09y6());
//		System.out.println("eps09y9 : "+eps.getEps09y9());
//		System.out.println("eps09y12 : "+eps.getEps09y12());
//		System.out.println("eps09y16 : "+eps.getEps09y16());
//		System.out.println("--------------------------");
//		System.out.println("eps11y6 : "+eps.getEps11y6());
//		System.out.println("eps11y9 : "+eps.getEps11y9());
//		System.out.println("eps11y12 : "+eps.getEps11y12());
//		System.out.println("eps11y16 : "+eps.getEps11y16());
		
		
		eps.setCode(info.getCode());
		
		return eps;
	}

}
