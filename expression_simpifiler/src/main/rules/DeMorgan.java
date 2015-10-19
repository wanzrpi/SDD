package main.rules;

import com.google.common.collect.Lists;
import main.And;
import main.Expression;
import main.Not;
import main.Or;

import java.util.List;

public class DeMorgan<K> extends Rule<Not<K>, K> {

  @Override
  public Expression<K> applyInternal(Not<K> not) {
      Expression<K> e = not.getE();

      if(e instanceof And){
        And<K> internal = (And<K>) e;
        List<Expression<K>> morganed = Lists.newArrayList();
        for(Expression<K> expr: internal.expressions){
          morganed.add(Not.of(expr));
        }
        return Or.of(morganed);
      }

      if(e instanceof Or){
        Or<K> internal = (Or<K>) e;
        List<Expression<K>> morganed = Lists.newArrayList();
        for(Expression<K> expr: internal.expressions){
          morganed.add(Not.of(expr));
        }
        return And.of(morganed);
      }
    return not;
  }

  @Override
  protected boolean isApply(Expression input) {
    return input instanceof Not;
  }
}