package br.com.gregoriohd.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptioon extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExceptioon(String mensagem) {
		super(mensagem); 
	}
}
