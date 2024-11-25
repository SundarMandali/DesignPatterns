package behavioural.interpreter;

//Non-Terminal Expression for Addition
class Add implements Expression {
 private final Expression left;
 private final Expression right;

 public Add(Expression left, Expression right) {
     this.left = left;
     this.right = right;
 }

 @Override
 public int interpret() {
     return left.interpret() + right.interpret();
 }
}
