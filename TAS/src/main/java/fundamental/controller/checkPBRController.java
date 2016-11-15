package fundamental.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fundamental.dto.BpsDTO;
import fundamental.dto.CheckDTO;
import fundamental.dto.EnterpriseFinanceDTO;
import fundamental.dto.EnterpriseTotalDTO;
import fundamental.dto.EpsDTO;
import fundamental.dto.StockCloseWDTO;
import fundamental.service.FundamentalService;

@Controller
public class checkPBRController extends HttpServlet{
	@Autowired
	FundamentalService service;
	
	@RequestMapping(value = "/checkpbrper_pbr.do", method = RequestMethod.GET)
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView();
		List<EnterpriseTotalDTO> codeList 		   = service.codeList();
		List<CheckDTO>			 closeCheck		   = service.closeCheck();
		int closeCheckSize = closeCheck.size();
		
		for(int i=0; i<closeCheckSize;i++){
			String code = closeCheck.get(i).getCode();
			int totalStock = codeList.get(i).getTotalstock();
		//	System.out.println("code:"+code+" ,name:"+ closeCheck.get(i).getName()+" ,totalstock:"+totalStock);
			EnterpriseFinanceDTO 	 enterpriseFinance = service.enterpriseFinance(code);
			BpsDTO 					 bps 		       = service.bps(enterpriseFinance, totalStock, code);
			EpsDTO					 eps			   = service.eps(enterpriseFinance, totalStock, code);
//			System.out.println("code : "+code);
//			System.out.println("name : "+closeCheck.get(i).getName());
//			System.out.println("price : "+closeCheck.get(i).getPrice());
//			System.out.println("week : "+closeCheck.get(i).getWeek());
//			System.out.println("bps : "+bps.getBps16y());
//			System.out.println("eps : "+eps.getEps16y());
			
			if(closeCheck.get(i).getPrice()< bps.getBps16y()){
		//		System.out.println("111111~!~!!~!~!~!~!~!~!code:"+code+",name:"+closeCheck.get(i).getName()+",price:"+closeCheck.get(i).getPrice()+",bps1:"+bps.getBps16y());
		//		System.out.println();
				closeCheck.get(i).setName1(closeCheck.get(i).getName()); 
				closeCheck.get(i).setCode1(code);
				closeCheck.get(i).setPrice1(closeCheck.get(i).getPrice());
				closeCheck.get(i).setWeek1(closeCheck.get(i).getWeek());
				closeCheck.get(i).setBps1(bps.getBps16y());
				closeCheck.get(i).setEps1(eps.getEps16y());
			}
			if(closeCheck.get(i).getPrice()>= bps.getBps16y() &  closeCheck.get(i).getPrice()< bps.getBps16y2()){
		//		System.out.println("22222~!~!!~!~!~!~!~!~!code:"+code+",name:"+codeList.get(i).getName()+",price:"+closeCheck.get(i).getPrice()+",bps1:"+bps.getBps16y()+",bps2:"+bps.getBps16y2());
		//		System.out.println();
				closeCheck.get(i).setName2(closeCheck.get(i).getName()); 
				closeCheck.get(i).setCode2(code);
				closeCheck.get(i).setPrice2(closeCheck.get(i).getPrice());
				closeCheck.get(i).setWeek2(closeCheck.get(i).getWeek());
				closeCheck.get(i).setBps2(bps.getBps16y());
				closeCheck.get(i).setEps2(eps.getEps16y());
			}
			if(closeCheck.get(i).getPrice()>= bps.getBps16y2() &  closeCheck.get(i).getPrice()< bps.getBps16y3()){
		//		System.out.println("333333~!~!!~!~!~!~!~!~!code:"+code+",name:"+codeList.get(i).getName()+",price:"+closeCheck.get(i).getPrice()+",bps2:"+bps.getBps16y2()+",bps3:"+bps.getBps16y3());
		//		System.out.println();
				closeCheck.get(i).setName3(closeCheck.get(i).getName()); 
				closeCheck.get(i).setCode3(code);
				closeCheck.get(i).setPrice3(closeCheck.get(i).getPrice());
				closeCheck.get(i).setWeek3(closeCheck.get(i).getWeek());
				closeCheck.get(i).setBps3(bps.getBps16y());
				closeCheck.get(i).setEps3(eps.getEps16y());
			}
			if(closeCheck.get(i).getPrice()>= bps.getBps16y3() &  closeCheck.get(i).getPrice()<= bps.getBps16y4()){
	//			System.out.println("444444~!~!!~!~!~!~!~!~!code:"+code+",name:"+codeList.get(i).getName()+",price:"+closeCheck.get(i).getPrice()+",bps3:"+bps.getBps16y3()+",bps4:"+bps.getBps16y4());
	//			System.out.println();
				closeCheck.get(i).setName4(closeCheck.get(i).getName()); 
				closeCheck.get(i).setCode4(code);
				closeCheck.get(i).setPrice4(closeCheck.get(i).getPrice());
				closeCheck.get(i).setWeek4(closeCheck.get(i).getWeek());
				closeCheck.get(i).setBps4(bps.getBps16y());
				closeCheck.get(i).setEps4(eps.getEps16y());
			}
			if(closeCheck.get(i).getPrice()> bps.getBps16y4()){
		//		System.out.println("444444~!~!!~!~!~!~!~!~!code:"+code+",name:"+codeList.get(i).getName()+",price:"+closeCheck.get(i).getPrice()+",bps3:"+bps.getBps16y3()+",bps4:"+bps.getBps16y4());
		//		System.out.println();
				closeCheck.get(i).setName5(closeCheck.get(i).getName()); 
				closeCheck.get(i).setCode5(code);
				closeCheck.get(i).setPrice5(closeCheck.get(i).getPrice());
				closeCheck.get(i).setWeek5(closeCheck.get(i).getWeek());
				closeCheck.get(i).setBps5(bps.getBps16y());
				closeCheck.get(i).setEps5(eps.getEps16y());
			}
			
			
//PER 구간 검색  -----------------------------------------------------------------------------------------------------
			
			if(closeCheck.get(i).getPrice()< eps.getEps16y6()){
//				System.out.println("111111~!~!!~!~!~!~!~!~!code:"+code+",name:"+closeCheck.get(i).getName()+",price:"+closeCheck.get(i).getPrice()+",bps1:"+bps.getBps16y());
//				System.out.println();
				closeCheck.get(i).setName6(closeCheck.get(i).getName()); 
				closeCheck.get(i).setCode6(code);
				closeCheck.get(i).setPrice6(closeCheck.get(i).getPrice());
				closeCheck.get(i).setWeek6(closeCheck.get(i).getWeek());
				closeCheck.get(i).setBps6(bps.getBps16y());
				closeCheck.get(i).setEps6(eps.getEps16y6());
			}
			if(closeCheck.get(i).getPrice()>= eps.getEps16y6() &  closeCheck.get(i).getPrice()< eps.getEps16y9()){
//				System.out.println("22222~!~!!~!~!~!~!~!~!code:"+code+",name:"+codeList.get(i).getName()+",price:"+closeCheck.get(i).getPrice()+",bps1:"+bps.getBps16y()+",bps2:"+bps.getBps16y2());
//				System.out.println();
				closeCheck.get(i).setName9(closeCheck.get(i).getName()); 
				closeCheck.get(i).setCode9(code);
				closeCheck.get(i).setPrice9(closeCheck.get(i).getPrice());
				closeCheck.get(i).setWeek9(closeCheck.get(i).getWeek());
				closeCheck.get(i).setBps9(bps.getBps16y());
				closeCheck.get(i).setEps9(eps.getEps16y());
			}
			if(closeCheck.get(i).getPrice()>= eps.getEps16y9() &  closeCheck.get(i).getPrice()< eps.getEps16y12()){
//				System.out.println("333333~!~!!~!~!~!~!~!~!code:"+code+",name:"+codeList.get(i).getName()+",price:"+closeCheck.get(i).getPrice()+",bps2:"+bps.getBps16y2()+",bps3:"+bps.getBps16y3());
//				System.out.println();
				closeCheck.get(i).setName12(closeCheck.get(i).getName()); 
				closeCheck.get(i).setCode12(code);
				closeCheck.get(i).setPrice12(closeCheck.get(i).getPrice());
				closeCheck.get(i).setWeek12(closeCheck.get(i).getWeek());
				closeCheck.get(i).setBps12(bps.getBps16y());
				closeCheck.get(i).setEps12(eps.getEps16y());
			}
			if(closeCheck.get(i).getPrice()>= eps.getEps16y12() &  closeCheck.get(i).getPrice()<= eps.getEps16y16()){
//				System.out.println("444444~!~!!~!~!~!~!~!~!code:"+code+",name:"+codeList.get(i).getName()+",price:"+closeCheck.get(i).getPrice()+",bps3:"+bps.getBps16y3()+",bps4:"+bps.getBps16y4());
//				System.out.println();
				closeCheck.get(i).setName16(closeCheck.get(i).getName()); 
				closeCheck.get(i).setCode16(code);
				closeCheck.get(i).setPrice16(closeCheck.get(i).getPrice());
				closeCheck.get(i).setWeek16(closeCheck.get(i).getWeek());
				closeCheck.get(i).setBps16(bps.getBps16y());
				closeCheck.get(i).setEps16(eps.getEps16y());
			}
			if(closeCheck.get(i).getPrice() > eps.getEps16y16()){
//				System.out.println("444444~!~!!~!~!~!~!~!~!code:"+code+",name:"+codeList.get(i).getName()+",price:"+closeCheck.get(i).getPrice()+",bps3:"+bps.getBps16y3()+",bps4:"+bps.getBps16y4());
//				System.out.println();
				closeCheck.get(i).setName17(closeCheck.get(i).getName()); 
				closeCheck.get(i).setCode17(code);
				closeCheck.get(i).setPrice17(closeCheck.get(i).getPrice());
				closeCheck.get(i).setWeek17(closeCheck.get(i).getWeek());
				closeCheck.get(i).setBps17(bps.getBps16y());
				closeCheck.get(i).setEps17(eps.getEps16y());
			}
		}
		mav.addObject("closeCheck",closeCheck);
		mav.addObject("codeList", codeList);
//		mav.addObject("enterpriseFinance",enterpriseFinance);
//		mav.addObject("bps",bps);
		mav.setViewName("check_pbrper_pbr");
		return mav;
	}
}


