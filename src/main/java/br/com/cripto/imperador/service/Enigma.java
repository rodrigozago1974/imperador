package br.com.cripto.imperador.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class Enigma {
	
    public static Map<String, String> mapCripto = new HashMap<>();
	public static Map<String, String> mapDescripto = new HashMap<>();
	
	public Enigma() {
	  mapCripto.put("a", "d");
	  mapCripto.put("b", "e");
	  mapCripto.put("c", "f");
	  mapCripto.put("d", "g");
      mapCripto.put("e", "h");
	  mapCripto.put("f", "f");
	  mapCripto.put("g", "j");
	  mapCripto.put("h", "k");	 	
	  mapCripto.put("i", "l");
	  mapCripto.put("j", "j");
	  mapCripto.put("k", "k");
	  mapCripto.put("l", "o");
	  mapCripto.put("m", "p");
	  mapCripto.put("n", "q");	 	  
	  mapCripto.put("o", "r");
	  mapCripto.put("p", "s");
	  mapCripto.put("q", "q");
	  mapCripto.put("r", "u");
	  mapCripto.put("s", "v");
	  mapCripto.put("t", "r");
	  mapCripto.put("u", "x");
	  mapCripto.put("v", "v");
	  mapCripto.put("x", "x");
	  mapCripto.put("z", "z");
	  mapCripto.put("y", "y");
	  mapCripto.put("w", "w");
      //----
	  mapDescripto.put("a", "a");
	  mapDescripto.put("b", "b");
	  mapDescripto.put("c", "c");
	  mapDescripto.put("d", "a");
	  mapDescripto.put("e", "b");
	  mapDescripto.put("f", "c");
	  mapDescripto.put("g", "d");
	  mapDescripto.put("h", "e");
	  mapDescripto.put("i", "i");
	  mapDescripto.put("j", "g");
	  mapDescripto.put("k", "h");	 	
	  mapDescripto.put("l", "i");
	  mapDescripto.put("m", "m");
	  mapDescripto.put("n", "n");	 	
	  mapDescripto.put("o", "l");
	  mapDescripto.put("p", "m");
	  mapDescripto.put("q", "n");
	  mapDescripto.put("r", "o");
	  mapDescripto.put("s", "p");
	  mapDescripto.put("t", "t");
	  mapDescripto.put("u", "r");
	  mapDescripto.put("v", "s");
	  mapDescripto.put("x", "u");
	  mapDescripto.put("z", "z");
	  mapDescripto.put("y", "y");
	  mapDescripto.put("w", "t");
	  //  Normal:   a ligeira raposa marrom saltou sobre o cachorro cansado
   	 //  Cifrado:   d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr  
	}
		
	
	public String criptografar(String msg)  {
	  String frase = "";
	  for (int i=0; i < msg.length(  ); i++){
         String value = mapCripto.get(Character.toString(msg.charAt(i)));
         if (value==null){
       	   frase = frase+Character.toString(msg.charAt(i)); 
         }else{
           frase = frase+value; 
         }	  
	  }
     return frase;		
	}
	
	
	public String descriptografar(String msg)  {
	  String frase = "";
	  for (int i=0; i < msg.length(  ); i++){
         String value = mapDescripto.get(Character.toString(msg.charAt(i)));
         if (value==null){
       	   frase = frase+Character.toString(msg.charAt(i)); 
         }else{
           frase = frase+value; 
         }	  
	  }
     return frase;		
	}

}
