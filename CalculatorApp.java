import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorApp {
    private static final Logger logger = Logger.getLogger(CalculatorApp.class.getName());

    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        ComplexNumberCalculator calculator = new ComplexNumberCalculator();
        CalculatorPresenter presenter = new CalculatorPresenter(view, calculator);

        try {
            presenter.performCalculation();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred: " + e.getMessage(), e);
        }
    }
}