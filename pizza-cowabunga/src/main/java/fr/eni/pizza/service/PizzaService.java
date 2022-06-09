package fr.eni.pizza.service;

import java.util.List;

import fr.eni.pizza.bo.Pizza;

public interface PizzaService {

	List<Pizza> getPizzas();

	Pizza getPizzaById(int id);

	void ajouterPizza(Pizza Pizza);

	void modifierPizza(Pizza Pizza);

	void supprimerPizza(Integer id);

	void modifierLibellePizza(Integer id, Pizza Pizza);
	
	void modifierPrixPizza(Integer id, Pizza Pizza);
}
