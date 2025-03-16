package padroes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConfigTest {

  @Test
  public void shouldReturnSecretKey() {
    Config.getInstance().setSecretKey("secret");
    assertEquals("secret", Config.getInstance().getSecretKey());
  }

  @Test
  public void shouldReturnDbUrl() {
    Config.getInstance().setDbUrl("localhost");
    assertEquals("localhost", Config.getInstance().getDbUrl());
  }
}
