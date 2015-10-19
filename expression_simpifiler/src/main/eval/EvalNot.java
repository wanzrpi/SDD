package main.eval;

import main.Expression;
import main.Not;

import java.util.Map;

public class EvalNot<K> extends EvalRule<K> {
  @Override
  public boolean evaluate(Expression<K> expression, Map<String, EvalRule<K>> rules) {
    Not<K> not = (Not<K>) expression;
    return !evaluateInternal(not.getE(), rules);
  }
}
