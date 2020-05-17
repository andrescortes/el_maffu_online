package co.edu.utp.maffuonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import co.edu.utp.maffuonline.dto.Pay;

import co.edu.utp.maffuonline.service.PayService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/pay")
public class PayController {

	@Autowired
	PayService service;

	@PostMapping("/save")
	public Pay save(@RequestBody Pay pay) {
		service.saveOrUpdate(pay);
		return pay;
	}

	@GetMapping("/list")
	public List<Pay> list() {
		return service.getAllPay();
	}

	@GetMapping("/list/{id}")
	public Pay getById(@PathVariable Long id) {

		return service.getById(id);
	}

	public String deletePay(@PathVariable (value = "id") Long id) {
		service.deletePay(id);
		return "Delete sucessfully id = " + id;
	}
}
