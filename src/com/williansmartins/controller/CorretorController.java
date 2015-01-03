package com.williansmartins.controller;
 
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.williansmartins.entity.ClienteEntity;
import com.williansmartins.massa.ClienteMassa;
import com.williansmartins.utils.Constantes;
import com.williansmartins.utils.Responses;
import com.williansmartins.vo.JSONReturn;
 
@Path("/corretor")
public class CorretorController {
 
	@GET
	@Path("dados")
	@Produces(Constantes.JSON)
	public Response hello() {
		List<ClienteEntity> lista = new ArrayList<ClienteEntity>();		
		ClienteEntity corretor1 = new ClienteMassa().popularEntity();
		ClienteEntity corretor2 = new ClienteMassa().popularEntity();
		lista.add(corretor1);
		corretor2.setId(2);
		lista.add(corretor2);
		
		JSONReturn jsonReturn = new JSONReturn();
		jsonReturn.setMensagem("retornando uma lista de clientes");
		jsonReturn.setDado(lista);
		jsonReturn.setTipo("sucesso");

		return new Responses().retorno(jsonReturn);
	}
 
}