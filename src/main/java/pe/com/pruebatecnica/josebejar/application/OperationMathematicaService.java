package pe.com.pruebatecnica.josebejar.application;

import org.springframework.stereotype.Service;

@Service
public class OperationMathematicaService {

    OperationMathematica suma = createSum();
    OperationMathematica resta = subtraction();
    OperationMathematica multiplicacion  = multiplication();

    public OperationMathematica createSum() {
        return (a, b) -> a + b;
    }
    public OperationMathematica subtraction() {
        return (a, b) -> a - b;
    }

    public OperationMathematica multiplication() {
        return (a, b) -> a * b;
    }

    public int performOperation(int a, int b, OperationMathematica operation) {
        return operation.applyOperation(a, b);
    }

    public void showResult(String operation, int result) {
        System.out.println("Resultado " + operation + ": " + result);
    }
}
