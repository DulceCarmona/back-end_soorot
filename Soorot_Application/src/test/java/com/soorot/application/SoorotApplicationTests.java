package com.soorot.application;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.soorot.application.model.Usuario;

import org.springframework.http.MediaType; 

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureMockMvc
class SoorotApplicationTests {
	private final String token = "Bearer: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJtYWNlbC42YkBnbWFpbC5jb20iLCJyb2xlIjoidXNlciIsImlhdCI6MTc0ODYyMjg3NiwiZXhwIjoxNzQ4NzA5Mjc2fQ.oHzYYI1vi8XyU2SBM_hUjdu3k2rtbJrbZdt4w3O9XoM" ;
	@Autowired
	private MockMvc mockMvc; // punto de partida para probar los métodos
	
	@Test
	@DisplayName("Se prueba obtener todos los Usuarios con el método Get del endpoint http://localhost:8080/soorot/usuarios/")
	void pruebaGETUsuarios() throws Exception{
		this.mockMvc.perform(get("/soorot/usuarios/7/")
				.header("Authorization", token))
		.andDo(print())
		.andExpect(status().isOk() )
		.andExpect(content ().string(containsString("macel_6b")));
	}//pruebaGET
	
	@Test
	@Disabled("Probado una vez, deshabilitado para futuras ocasiones")
	@DisplayName("Se prueba el Delete del endpoint http://localhost:8080/soorot/usuarios/9")
	void pruebaDeleteUsuarios() throws Exception{
		this.mockMvc.perform(delete("/soorot/usuarios/9/")
				.header("Authorization", token))
		.andDo(print())
		.andExpect(status().isOk() )
		.andExpect(content ().string(containsString("5542310268")));
	}//pruebaGET
	
	@Test
	@DisplayName("Se prueba el actualizar contraseña con PUT del endpoint http://localhost:8080/soorot/usuarios/7")
	void pruebaPUTUsuariosPWD() throws Exception{
		String jsonBody = """
		        {
		          "password": "contra123",
		          "npassword": "UnViernesMasSinVidaSocial"
		        }
		    """;
		this.mockMvc.perform(put("/soorot/usuarios/7/")
				.header("Authorization", token)
				.contentType(MediaType.APPLICATION_JSON)
				.content(jsonBody))
		.andDo(print())
		.andExpect(status().isOk());
	}//pruebaPUTUsuarios
	
	@Test
	@DisplayName("Se prueba crear un usuario con POST en el endpoint http://localhost:8080/soorot/usuarios/14")
	void pruebaPOSTUsuario() throws Exception{
		Usuario u = new Usuario("IntegranteExtra2", "extra2_extrmmma@gmail.com", "contra123", "5542454748");
		
		this.mockMvc.perform(post("/soorot/usuarios/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(u))				
				.header("Authorization", token))
		.andDo(print())
		.andExpect(status().isOk() )
		.andExpect(content ().string(containsString("Integrante")));
	}//pruebaPOSTUsuario
	
	private static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}//catch
	}//asJsonString

}//SoorotApplicationTests