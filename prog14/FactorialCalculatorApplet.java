import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialCalculatorApplet extends Applet implements ActionListener {
    TextField inputField, resultField;
    Button computeButton;

    public void init() {
        inputField = new TextField(10);
        resultField = new TextField(10);
        computeButton = new Button("Compute");

        Label inputLabel = new Label("Enter an integer:");
        Label resultLabel = new Label("Factorial:");

        add(inputLabel);
        add(inputField);
        add(computeButton);
        add(resultLabel);
        add(resultField);

        computeButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == computeButton) {
            try {
                int input = Integer.parseInt(inputField.getText());
                long factorial = calculateFactorial(input);
                resultField.setText(Long.toString(factorial));
            } catch (NumberFormatException e) {
                resultField.setText("Invalid input");
            }
        }
    }

    private long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Return -1 for invalid input
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
