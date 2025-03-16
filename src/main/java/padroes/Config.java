package padroes;

public class Config {
  private Config() {}

  private static Config instance = new Config();

  public static Config getInstance() {
    return instance;
  }

  private String secretKey;
  private String dbUrl;

  public String getSecretKey() {
    return this.secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public String getDbUrl() {
    return this.dbUrl;
  }

  public void setDbUrl(String dbUrl) {
    this.dbUrl = dbUrl;
  }
}
