package main.parsers;

public class IdentityMap implements TokenMapper<String> {

  public String getVariable(String name) {
    return name;
  }
}
