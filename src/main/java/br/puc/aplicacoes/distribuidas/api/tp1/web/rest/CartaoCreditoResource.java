package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.CartaoCreditoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.service.CartaoCreditoService;

@RestController
@RequestMapping("/api")
public class CartaoCreditoResource {

	private final CartaoCreditoService cartaoCreditoService;

	public CartaoCreditoResource(CartaoCreditoService cartaoCreditoService) {
		this.cartaoCreditoService = cartaoCreditoService;
	}

	/**
	 * POST /cartao-creditos : Create a new cartaoCredito.
	 *
	 * @param cartaoCreditoDTO
	 *            the CartaoCreditoDTO to create
	 * @return with body the new cartaoCreditoDTO
	 */
	@PostMapping("/cartao-creditos")
	public CartaoCreditoDTO createCartaoCredito(@RequestBody CartaoCreditoDTO cartaoCreditoDTO) {
		return cartaoCreditoService.salvar(cartaoCreditoDTO);
	}
	
	/**
	 * GET /cartao-creditos/ : update the cartaoCredito.
	 *
	 * @param id
	 *            the id of the cartaoCreditoDTO to retrieve
	 * @return with body the cartaoCreditoDTO
	 */
	@PutMapping("/cartao-creditos")
	public CartaoCreditoDTO updateCartaoCredito(@RequestBody CartaoCreditoDTO cartaoCreditoDTO) {
		return cartaoCreditoService.alterar(cartaoCreditoDTO);
	}

	/**
	 * GET /cartao-creditos/:id : get the "id" cartaoCredito.
	 *
	 * @param id
	 *            the id of the cartaoCreditoDTO to retrieve
	 * @return with body the cartaoCreditoDTO
	 */
	@GetMapping("/cartao-creditos/{id}")
	public CartaoCreditoDTO getCartaoCredito(@PathVariable Long id) {
		return cartaoCreditoService.getCartaoCredito(id);
	}

	/**
	 * GET /cartao-creditos/
	 *
	 * @param id
	 *            the id of the cartaoCreditoDTO to retrieve
	 * @return with body the cartaoCreditoDTO
	 */
	@GetMapping("/cartao-creditos")
	public List<CartaoCreditoDTO> getAllAlturas() {
		return cartaoCreditoService.getAllCartaoCreditos();
	}

}
