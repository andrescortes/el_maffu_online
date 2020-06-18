package co.edu.utp.maffuonline.payment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.utp.maffuonline.payment.dto.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer>{

}
