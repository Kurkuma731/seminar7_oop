public class CalculatorPresenter {
    private CalculatorView view;
    private ComplexNumberCalculator calculator;

    public CalculatorPresenter(CalculatorView view, ComplexNumberCalculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void performCalculation() {
        ComplexNumber num1 = view.getComplexNumberInput();
        ComplexNumber num2 = view.getComplexNumberInput();

        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);

        view.displayResult(sum);
        view.displayResult(product);
        view.displayResult(quotient);
    }
}