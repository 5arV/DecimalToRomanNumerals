import java.util.Arrays;
import java.util.Optional;

public class Calculator {

    public String calculate(int value) {
        StringBuilder builder = new StringBuilder();

        while (value > 0) {
            Optional<RomanNumeral> numeral = findRange(value);
            if (numeral.isEmpty()) {
                throw new IllegalArgumentException("invalid range for value: " + value);
            }
            builder.append(numeral.get().name());
            value = value - numeral.get().getDecimalValue();

            if (value < 0) {
                builder.insert(builder.length() -1, numeral.get().getPredecessor().name());
                value = value + numeral.get().getPredecessor().getDecimalValue();
            }
        }

        return builder.toString();
    }


    private Optional<RomanNumeral> findRange(int i) {
        return Arrays.stream(RomanNumeral.values()).filter(
                romanNumeral -> romanNumeral.getRangeMin() <= i && romanNumeral.getRangeMax() >= i
        ).findFirst();
    }
}
