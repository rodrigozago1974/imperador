package br.com.cripto.imperador.model;

import java.io.Serializable;

public class MensagemOut implements Serializable {
	private String msg;
	private String status;
	
	public MensagemOut() {
	}	
	
	public MensagemOut(String msg, String status) {
		super();
		this.msg = msg;
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
