package fr.eni.pizza.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.pizza.bo.Pizza;
import fr.eni.pizza.service.PizzaService;


@RestController
@RequestMapping("/rest")
public class PizzaRestController {
	
	private PizzaService PizzaService;
	
	public PizzaRestController(PizzaService PizzaService) {
		this.PizzaService = PizzaService;
	}
	@CrossOrigin
	@GetMapping("/Pizzas")
	public List<Pizza> getPizzas(){
	
		return PizzaService.getPizzas();

	}

	@CrossOrigin
	@GetMapping("/Pizzas/{id}")
	public Pizza getPizza(@PathVariable("id") int id)
	{
		Pizza Pizza = PizzaService.getPizzaById(id);
		System.out.println("getPizza : " + Pizza);
		return Pizza;
	}
	
//	@PostMapping("/Pizzas")
//	@ResponseStatus(code = HttpStatus.CREATED)
//	public Pizza ajouterPizza(@RequestBody Pizza Pizza)
//	{
//		PizzaService.ajouterPizza(Pizza);
//		
//		return Pizza;
//	}
	@CrossOrigin
	@PostMapping("/Pizzas")
	public ResponseEntity<Pizza> ajouterPizza(@RequestBody Pizza Pizza)
	{
		
		if(Pizza.getId()<=0) {
			return new ResponseEntity<Pizza>(HttpStatus.BAD_REQUEST);
		}
		
		PizzaService.ajouterPizza(Pizza);
		
		return new ResponseEntity<Pizza>(Pizza, HttpStatus.CREATED);
	}
	@CrossOrigin
	//@RequestMapping(path = "/Pizzas", method = RequestMethod.PUT)
	@PutMapping("/Pizzas")
	public Pizza modifierPizza(@RequestBody Pizza Pizza)
	{
		PizzaService.modifierPizza(Pizza);
		
		return Pizza;
	}
	@CrossOrigin
	@PatchMapping("/Pizzas/Libelle/{id}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public void modifierCouleurPizza(@PathVariable Integer id, @RequestBody Pizza Pizza)
	{
		PizzaService.modifierLibellePizza(id, Pizza);
				
	}
	@CrossOrigin
	@PatchMapping("/Pizzas/Prix/{id}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public void modifierPrixPizza(@PathVariable Integer id, @RequestBody Pizza Pizza)
	{
		PizzaService.modifierPrixPizza(id, Pizza);
		}
				
	
	@CrossOrigin
	//@RequestMapping(path = "/Pizzas/{id}", method = RequestMethod.DELETE)
	@DeleteMapping("/Pizzas/{id}")
	public void supprimerPizza(@PathVariable("id") Integer id)
	{
		PizzaService.supprimerPizza(id);
		
	}
}
