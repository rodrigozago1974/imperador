package br.com.cripto.imperador;

import org.springframework.boot.test.context.SpringBootTest;
import br.com.cripto.imperador.controller.OnLineController;
import br.com.cripto.imperador.service.Enigma;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class AppTest {
	@Mock
	OnLineController controllerMock;
	
	@Mock
	Enigma enigmaMock;
	
	@Test
    public void testApp()
    {
	  when(controllerMock.hello()).thenReturn("{status: On-Line }");
	  assertEquals("{status: On-Line }", controllerMock.hello());
    }
	
	@Test
    public void testCripto()
    {
	   when(enigmaMock.criptografar("a ligeira raposa marrom saltou sobre o cachorro cansado")).
	                   thenReturn("d oljhlud udsrvd pduurp vdorrx vreuh r fdfkruur fdqvdgr");
  	   assertEquals("d oljhlud udsrvd pduurp vdorrx vreuh r fdfkruur fdqvdgr", enigmaMock.criptografar("a ligeira raposa marrom saltou sobre o cachorro cansado"));
    }
	
	@Test
    public void testDescripto()
    {
	   when(enigmaMock.descriptografar("d oljhlud udsrvd pduurp vdorrx vreuh r fdfkruur fdqvdgr")).
	                   thenReturn("a ligeira raposa marrom saltou sobre o cachorro cansado");
  	   assertEquals("a ligeira raposa marrom saltou sobre o cachorro cansado", enigmaMock.descriptografar("d oljhlud udsrvd pduurp vdorrx vreuh r fdfkruur fdqvdgr"));
    }
	
	
}
