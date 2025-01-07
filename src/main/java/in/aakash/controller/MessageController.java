package in.aakash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.aakash.binding.Product;

@Controller
public class MessageController {

	/*
	 * @GetMapping("/") public String getWelcomeMessage(Model model) {
	 * model.addAttribute("bindingProduct", new Product());
	 * 
	 * return "index"; }
	 * 
	 * @PostMapping("/product") public String handlSubmitBtn( Product product ,Model
	 * model) { System.out.println(product); // save the data in db logic
	 * model.addAttribute("msg", "Product Saved Successfully");
	 * 
	 * return "index"; }
	 */
}
