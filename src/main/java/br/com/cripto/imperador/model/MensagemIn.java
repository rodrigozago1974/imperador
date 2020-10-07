package br.com.cripto.imperador.model;

import java.io.Serializable;

public class MensagemIn implements Serializable {
	private String msg;
	
	public MensagemIn() {
	}
	
	public MensagemIn(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
