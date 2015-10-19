package main.parsers;

public interface TokenMapper<T> {
  public T getVariable(String name);
}
