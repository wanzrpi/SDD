package main.rules;

import main.Expression;

public abstract class Rule<E extends Expression<K>, K> {

  public abstract Expression<K> applyInternal(E input);

  public Expression<K> apply(Expression<K> input){
    if(isApply(input)){
      return applyInternal((E) input);
    }
    return input;
  }

  protected abstract boolean isApply(Expression<K> input);
}
