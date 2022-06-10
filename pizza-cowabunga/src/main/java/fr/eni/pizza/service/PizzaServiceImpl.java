package fr.eni.pizza.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import fr.eni.pizza.bo.Pizza;

@Service
public class PizzaServiceImpl implements PizzaService{

	private List<Pizza> listePizzas;

	public PizzaServiceImpl() {
		listePizzas = new ArrayList<>();
		listePizzas.add(new Pizza(1, "chèvre-nutella", "Inspirée du sucré-salé de la chèvre-miel, la pizza vitrine du restaurant.", 15.99, Base64Converter.encodeFileToBase64Binary("src/main/resources/static/img/pizza-chevre-nutella.png")));
		listePizzas.add(new Pizza(2, "nature", "Sortez aussi léger que lorsque vous êtes entré.", 10.99, "toto"));
		listePizzas.add(new Pizza(3, "lardon-confiture", "Alliance subtile de saveurs s'approchant dangereusement du mauvais goût.", 12.50, Base64Converter.encodeFileToBase64Binary("src/main/resources/static/img/pizza_lardon-confiture.png")));
		
	}
	
	@Override
	public List<Pizza> getPizzas() {
		return listePizzas;
	}

	@Override
	public Pizza getPizzaById(int id) {
		Pizza pizzaARetourner=null;
		for(Pizza pizza:listePizzas)
		{
			if(pizza.getId()==id)
			{
				pizzaARetourner=pizza;
				break;
			}
		}
		return pizzaARetourner;
	}

	@Override
	public void ajouterPizza(Pizza pizza) {
		listePizzas.add(pizza);
		
	}

	@Override
	public void modifierPizza(Pizza Pizza) {
		for(Pizza c:listePizzas)
		{
			if(c.getId()==Pizza.getId())
			{
				BeanUtils.copyProperties(Pizza, c);
				break;
			}
		}
		
	}

	@Override
	public void supprimerPizza(Integer id) {
		for(Pizza c:listePizzas)
		{
			if(c.getId()==id)
			{
				listePizzas.remove(c);
				break;
			}
		}
		
		
	}

	@Override
	public void modifierLibellePizza(Integer id, Pizza Pizza) {
		for(Pizza c:listePizzas)
		{
			if(c.getId()==id)
			{
				if( !c.getLibelle().equals("") ) {
				c.setLibelle(Pizza.getLibelle());	
				}
				if(c.getType()!= null ) {
				c.setType(Pizza.getType());	
				}
				
				break;
			}
		}
		
	}


	@Override
	public void modifierPrixPizza(Integer id, Pizza Pizza) {
		// TODO Auto-generated method stub
		
	}
	
}
