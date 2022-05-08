package product.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import product.Product;
import product.data.ProductRepository;

@Controller
@RequestMapping("/update")
public class UpdateController {
	private final ProductRepository productRepo;
	
	@Autowired
	public UpdateController(ProductRepository productRepo) {
		this.productRepo = productRepo;
	}
	
//	@RequestMapping(value="/edit}", method = RequestMethod.GET)
//	public String edit(Model model, @RequestParam(value="productCode", required=false) String code) {
//		Product prd = productRepo.findByCode(code);
//		model.addAttribute("products", prd);
//		return "edit";
//	}
}
