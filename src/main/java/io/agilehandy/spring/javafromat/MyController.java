package io.agilehandy.spring.javafromat;

import io.agilehandy.deals.Discount;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyController {

	Discount discount;

	public MyController(Discount d) {
		this.discount = d;
	}

	@GetMapping("/deal")
	public String getDeal() {
		return this.discount.printDiscountTicket();
	}

}
