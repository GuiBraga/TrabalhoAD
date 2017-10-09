package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.CartaoCreditoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.CartaoCreditoService;

@RestController
@RequestMapping("/cartao-credito")
public class CartaoCreditoResource {

	private final CartaoCreditoService cartaoCreditoService;

	public CartaoCreditoResource(CartaoCreditoService cartaoCreditoService) {
		this.cartaoCreditoService = cartaoCreditoService;
	}
	
	@DeleteMapping("/{codigo}")
	public Boolean deletarCartaoCredito(@PathVariable Long codigo) {
		return Boolean.FALSE;
	}

	@PostMapping
	public CartaoCreditoDTO criarCartaoCredito(@RequestBody CartaoCreditoDTO cartaoCreditoDTO) {
		return cartaoCreditoService.salvar(cartaoCreditoDTO);
	}
	
	@PutMapping
	public CartaoCreditoDTO alterarCartaoCredito(@RequestBody CartaoCreditoDTO cartaoCreditoDTO) {
		return cartaoCreditoService.salvar(cartaoCreditoDTO);
	}

	@GetMapping("/{codigo}")
	public CartaoCreditoDTO buscarCartaoCredito(@PathVariable Long codigo) {
		return cartaoCreditoService.getCartaoCredito(codigo);
	}

	@GetMapping("/{codigoUsuario}/todos")
	public List<CartaoCreditoDTO> buscarTodosCartaoCredito(@PathVariable Long codigoUsuario) {
		return cartaoCreditoService.getAllCartaoCreditos(codigoUsuario);
	}

}
