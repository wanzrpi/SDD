package main;

import java.util.Arrays;
import java.util.List;

import main.rules.Rule;
import main.rules.RuleSet;
import com.google.common.collect.Lists;

public abstract class NExpression<K> extends Expression<K>{

  public final Expression<K>[] expressions;

  protected NExpression(List<Expression<K>> expressions){
    if(expressions.isEmpty()){
      throw new IllegalArgumentException("Arguments length 0!");
    }

    this.expressions = expressions.toArray(ExprUtil.<K>expr(0));
    Arrays.sort(this.expressions);
  }

  @Override
  public Expression<K> apply(List<Rule<?, K>> rules) {
    List<Expression<K>> childCopy = Lists.newArrayList();
    for(Expression<K> expr: expressions){
      childCopy.add(RuleSet.applyAll(expr, rules));
    }
    return createInternal(childCopy);
  }

  public List<Expression<K>> getChildren(){
    return ExprUtil.list(expressions);
  }

  protected abstract Expression<K> createInternal(List<Expression<K>> children);
}
