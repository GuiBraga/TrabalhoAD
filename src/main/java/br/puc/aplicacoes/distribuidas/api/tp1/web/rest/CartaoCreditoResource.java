package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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

@CrossOrigin
@RestController
@RequestMapping("/cartao-credito")
public class CartaoCreditoResource {

	private final CartaoCreditoService cartaoCreditoService;

	public CartaoCreditoResource(CartaoCreditoService cartaoCreditoService) {
		this.cartaoCreditoService = cartaoCreditoService;
	}

	@DeleteMapping("/{codigo}")
	public ResponseEntity<Boolean> deletarCartaoCredito(@PathVariable Long codigo) {
		try {
			cartaoCreditoService.deletarCartaoCredito(codigo);
			return ResponseEntity.status(HttpStatus.OK).body(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false);

	}

	@PostMapping
	public ResponseEntity<CartaoCreditoDTO> criarCartaoCredito(@RequestBody CartaoCreditoDTO cartaoCreditoDTO) {
		try {
			CartaoCreditoDTO result = cartaoCreditoService.salvar(cartaoCreditoDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@PutMapping
	public ResponseEntity<CartaoCreditoDTO> alterarCartaoCredito(@RequestBody CartaoCreditoDTO cartaoCreditoDTO) {
		try {
			CartaoCreditoDTO result = cartaoCreditoService.salvar(cartaoCreditoDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@GetMapping("/{codigo}")
	public ResponseEntity<CartaoCreditoDTO> buscarCartaoCredito(@PathVariable Long codigo) {
		try {
			CartaoCreditoDTO result = cartaoCreditoService.getCartaoCredito(codigo);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}

	@GetMapping("/todos/{codigoUsuario}")
	public ResponseEntity<List<CartaoCreditoDTO>> buscarTodosCartaoCredito(@PathVariable Long codigoUsuario) {
		try {
			List<CartaoCreditoDTO> result = cartaoCreditoService.getAllCartaoCreditos(codigoUsuario);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}

}
