package com.williansmartins.massa;

import com.williansmartins.entity.ClienteEntity;

public class ClienteMassa {
	
	public ClienteMassa(){

	}
	
	public ClienteEntity popularEntity( ){
		ClienteEntity entity = new ClienteEntity();
		entity.setNome("Cliente1");
		entity.setCelular("(11) 993-650-220");
		entity.setTelefone("(11) 4148-4583");
		entity.setEmail("cliente1@gmail.com");
		entity.setInteresse("imovel x");
		return entity;
	}

}
