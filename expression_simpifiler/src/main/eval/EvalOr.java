package main.eval;

import main.Expression;
import main.Or;

import java.util.Map;

public class EvalOr<K> extends EvalRule<K> {
  @Override
  public boolean evaluate(Expression<K> expression, Map<String, EvalRule<K>> rules) {
    Or<K> or = (Or<K>) expression;

    boolean value = false;
    for(Expression<K> e: or.expressions){
      value |= evaluateInternal(e, rules);
    }
    return value;
  }
}
