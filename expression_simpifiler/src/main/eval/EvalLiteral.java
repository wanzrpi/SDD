package main.eval;

import main.Expression;
import main.Literal;

import java.util.Map;

public class EvalLiteral<K> extends EvalRule<K> {
  @Override
  public boolean evaluate(Expression<K> expression, Map<String, EvalRule<K>> rules) {
    Literal<K> literal = (Literal<K>) expression;
    return literal.getValue();
  }
}
