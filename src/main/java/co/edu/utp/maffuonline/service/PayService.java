package co.edu.utp.maffuonline.service;

import java.util.List;

import co.edu.utp.maffuonline.dto.Pay;

public interface PayService {

	public List<Pay> getAllPay();

	public Pay getById(Long id);
	
	public void saveOrUpdate(Pay pay);
	
	public void deletePay(Long id);
}
