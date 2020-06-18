package co.edu.utp.maffuonline.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import co.edu.utp.maffuonline.payment.dto.Payment;
import co.edu.utp.maffuonline.payment.service.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

	@Autowired
	PaymentService service;

	@PostMapping
	public ResponseEntity<Payment> save(@RequestBody Payment pay) {

		return ResponseEntity.ok(service.saveOrUpdate(pay));
	}

	@GetMapping
	public ResponseEntity<List<Payment>> list() {
		return ResponseEntity.ok(service.getAllPay());
	}


	@GetMapping("/{id}")
	public ResponseEntity<Payment> getById(@PathVariable int id) {

		return ResponseEntity.ok(service.getById(id));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePay(@PathVariable(value = "id") int id) {
		service.deletePay(id);
		return ResponseEntity.ok("Se Elimino con Exito el id =" + id);
	}
	
	
	
}
