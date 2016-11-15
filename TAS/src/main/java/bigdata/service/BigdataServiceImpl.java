package bigdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import bigdata.dao.BigdataDAO;
import bigdata.dto.BigdataDTO;
@Service
public class BigdataServiceImpl implements BigdataService{
	@Autowired
	@Qualifier("bigdatadao")
	BigdataDAO dao;
	@Override
	public List<BigdataDTO> getTopicnews(String ndate) {
		
		return dao.getTopicnews(ndate);
	}
	@Override
	public List<BigdataDTO> getIndustrynews(String ndate) {
		// TODO Auto-generated method stub
		return dao.getIndustrynews(ndate);
	}
	@Override
	public List<BigdataDTO> getSmallnews(String ndate) {
		return dao.getSmallnews(ndate);
	}
	@Override
	public List<BigdataDTO> getLargenews(String ndate) {
		return dao.getLargenews(ndate);
	}
	@Override
	public List<BigdataDTO> getMediumnews(String ndate) {
		return dao.getMediumnews(ndate);
	}
	
}
