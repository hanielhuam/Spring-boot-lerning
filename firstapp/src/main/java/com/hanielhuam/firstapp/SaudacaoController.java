package com.hanielhuam.firstapp;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {

	private static final String template = "Hello, %s!";
	private static final AtomicLong counter = new AtomicLong();

	@GetMapping("/saudacao")
	public Saudacao saudacao(@RequestParam(value = "nome", defaultValue = "World") String nome) {
		return new Saudacao(counter.incrementAndGet(), String.format(template, nome));
	}

}
