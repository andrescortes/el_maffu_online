package co.edu.utp.maffuonline.payment.service;

import java.util.List;

import co.edu.utp.maffuonline.payment.dto.Payment;

public interface PaymentService {

	public List<Payment> getAllPay();

	public Payment getById(int id);
	
	public Payment saveOrUpdate(Payment pay);
	
	public void deletePay(int id);
}
