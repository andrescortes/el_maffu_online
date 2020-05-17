package co.edu.utp.maffuonline.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.utp.maffuonline.dto.Pay;
import co.edu.utp.maffuonline.repository.PayRepository;

@Service
@Transactional
public class PayServiceImplement implements PayService {

	@Autowired
	PayRepository repository;

	@Override
	public List<Pay> getAllPay() {

		return (List<Pay>) repository.findAll();
	}

	@Override
	public Pay getById(Long id) {

		return repository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Pay pay) {

		repository.save(pay);
	}

	@Override
	public void deletePay(Long id) {

		repository.deleteById(id);

	}

}
