package Expression;

public interface Operator {
    double doOperation(Evaluable leftOperand, Evaluable rightOperand);
}
