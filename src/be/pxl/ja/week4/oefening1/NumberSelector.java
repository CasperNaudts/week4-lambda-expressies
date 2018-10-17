package be.pxl.ja.week4.oefening1;

public class NumberSelector {
    private NumberMachine numberMachine;

    public NumberSelector(NumberMachine numberMachine) {
        this.numberMachine = numberMachine;
    }

    public String showEvenNumbers() {
        return numberMachine.processNumbers(number -> number % 2 == 0);
    }

    public String showNumbersAbove(double limit){
        return numberMachine.processNumbers(number -> number > limit);
    }

    public String printHexNumbers() {
        return numberMachine.convertNumbers(number -> Integer.toHexString(number));
    }
}
