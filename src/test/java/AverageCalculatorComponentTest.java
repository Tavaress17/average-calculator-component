import java.util.List;

import org.junit.Test;

import com.luan.ifsp.salesstatistics.AverageCalculatorComponent;

public class AverageCalculatorComponentTest {
    @Test
    public void testCalculateAverage() {
        AverageCalculatorComponent calculator = new AverageCalculatorComponent();
        double result = calculator.calculate(List.of(100.0, 200.0, 300.0));
        assert result == 200.0;
    }
}