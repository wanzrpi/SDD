package main.eval;

import main.And;
import main.Expression;

import java.util.Map;

public class EvalAnd<K> extends EvalRule<K> {
  @Override
  public boolean evaluate(Expression<K> expression, Map<String, EvalRule<K>> rules) {
    And<K> and = (And<K>) expression;

    boolean value = true;
    for(Expression<K> e: and.expressions){
      value &= evaluateInternal(e, rules);
    }
    return value;
  }
}
