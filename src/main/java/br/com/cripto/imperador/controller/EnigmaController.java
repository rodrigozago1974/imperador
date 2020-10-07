package br.com.cripto.imperador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cripto.imperador.model.MensagemIn;
import br.com.cripto.imperador.model.MensagemOut;
import br.com.cripto.imperador.service.Enigma;


@RestController
@RequestMapping("/imperador")
public class EnigmaController {
	
	@Autowired
	private Enigma enigma;

	@PostMapping(value = "/cripto", consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<MensagemOut> cripto(@RequestBody MensagemIn request) {
       MensagemOut mensagem = new MensagemOut(enigma.criptografar(request.getMsg()),"ok");	
	   return new ResponseEntity<>(mensagem, HttpStatus.OK);
	}	
	
	
	@PostMapping(value = "/descripto", consumes = MediaType.APPLICATION_JSON_VALUE ,  produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<MensagemOut> descripto(@RequestBody MensagemIn request) {
	  MensagemOut mensagem = new MensagemOut(enigma.descriptografar(request.getMsg()),"ok");	
	  return new ResponseEntity<>(mensagem, HttpStatus.OK);
	}	
	
}







