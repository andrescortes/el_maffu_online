package co.edu.utp.maffuonline.payment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.utp.maffuonline.payment.dto.Payment;
import co.edu.utp.maffuonline.payment.repository.PaymentRepository;

@Service
public class PaymentServiceImplement implements PaymentService {

	@Autowired
	PaymentRepository repository;
	

	@Override
	public List<Payment> getAllPay() {

		return (List<Payment>) repository.findAll();
	}

	@Override
	public Payment getById(int id) {

		return repository.findById(id).get();
	}

	@Override
	public Payment saveOrUpdate(Payment pay) {

		return repository.save(pay);
	}

	@Override
	public void deletePay(int id) {

		repository.deleteById(id);

	}

}
