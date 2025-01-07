package in.aakash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.aakash.binding.Product;
import jakarta.validation.Valid;

@Controller
public class ProductController {

	@GetMapping("/")
	public String loadProductForm(Model model) {
		model.addAttribute("product", new Product());
		return "index";
	}

	@PostMapping("/product")
	public String handlSubmitBtn(@Valid Product product, BindingResult bindingResult, Model model) {

		System.out.println(product);
		if (bindingResult.hasErrors()) {
			return "index";
		} else {
			// save the data in db logic
			model.addAttribute("msg", product.getPname() + " Saved Success");
		}
		return "index";
	}
}
