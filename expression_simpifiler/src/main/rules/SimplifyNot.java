package main.rules;

import main.Expression;
import main.Literal;
import main.Not;

public class SimplifyNot<K> extends Rule<Not<K>, K> {

  @Override
  public Expression<K> applyInternal(Not<K> input) {
    Expression<K> e = input.getE();

      if(e instanceof Literal){
        Literal l = (Literal) e;
        return Literal.of(!l.getValue());
      }

      if(e instanceof Not){
        Not<K> internal = (Not<K>) e;
        return internal.getE();
      }
    return input;
  }

  @Override
  protected boolean isApply(Expression<K> input) {
    return input instanceof Not;
  }
}
