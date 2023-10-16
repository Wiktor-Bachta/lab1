package lab.tp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

  @Test
  public void shouldAnswerWithTrue() {
    assertEquals(1, 1);
    Zbior zbior = new Zbior();
    zbior.usunksiazke(zbior.lista.get(0));
    assertEquals(3, zbior.lista.size());
  }
}
