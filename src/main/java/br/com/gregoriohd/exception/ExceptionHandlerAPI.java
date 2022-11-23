package br.com.gregoriohd.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAPI {

	@ExceptionHandler(ResourceNotFoundExceptioon.class)
	public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundExceptioon ex) {

		ErroMessage em = new ErroMessage("Não Encontrado", HttpStatus.NOT_FOUND.value(), ex.getMessage());

		return new ResponseEntity<>(em, HttpStatus.NOT_FOUND);

	}
}
