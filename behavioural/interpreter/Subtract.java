package behavioural.interpreter;
//Non-Terminal Expression for Subtraction
class Subtract implements Expression {
 private final Expression left;
 private final Expression right;

 public Subtract(Expression left, Expression right) {
     this.left = left;
     this.right = right;
 }

 @Override
 public int interpret() {
     return left.interpret() - right.interpret();
 }
}