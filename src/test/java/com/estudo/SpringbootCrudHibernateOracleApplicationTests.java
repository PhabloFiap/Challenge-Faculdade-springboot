package com.estudo;

import com.estudo.entity.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import lombok.*;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@NoArgsConstructor
@AllArgsConstructor
class SpringbootCrudHibernateOracleApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

//	@Test
//	void testCreateClienteSucess() {
//		var cliente = new Cliente("Cliente Teste", 22, 5000, 300);
//
//		webTestClient
//				.post()
//				.uri("/clientes")
//				.bodyValue(cliente)
//				.exchange()
//				.expectStatus().isOk()
//				.expectBody()
//				.jsonPath("$").isArray()
//				.jsonPath("$.length()").isEqualTo(1)
//				.jsonPath("$[0].nome").isEqualTo(cliente.getNome())
//				.jsonPath("$[0].idade").isEqualTo(cliente.getIdade())
//				.jsonPath("$[0].rendaMensal").isEqualTo(cliente.getRendaMensal())
//				.jsonPath("$[0].scoreCredito").isEqualTo(cliente.getScoreCredito());
//
//
//	}

//	@Test
//	void testCreateClienteError() {
//		webTestClient
//				.post()
//				.uri("/clientes")
//				.bodyValue(new Cliente("", 0, 5000, 300))
//				.exchange()
//				.expectStatus().isBadRequest();
//
//	}
}