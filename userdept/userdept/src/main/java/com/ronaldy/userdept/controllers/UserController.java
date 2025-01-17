package com.ronaldy.userdept.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldy.userdept.entities.User;
import com.ronaldy.userdept.repositories.UserRepository;

@RestController //controlador rest
@RequestMapping(value = "/users") // caminho desejado de acesso
public class UserController {
	
	@Autowired
	private UserRepository repository; // pegando a classe que foi criada para lista os usuários
	
	@GetMapping  // ingeção de independência
	public List<User> findAll() {  // lista os usuários
		return repository.findAll();// lista os usuários
	}

	@GetMapping(value = "/{id}") //pesquisar um usuário pelo id
	public User findById(@PathVariable Long id) { //pesquisar um usuário pelo id
		return repository.findById(id).get(); //pesquisar um usuário pelo id
	}
	
	@PostMapping  // informa o tipo de requisição desta aplicação, no caso, GET
	public User insert(@RequestBody User user) { //inserindo novo usuário
		return repository.save(user);//inserindo novo usuário
	}

}
