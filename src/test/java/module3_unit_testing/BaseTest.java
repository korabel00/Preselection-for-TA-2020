package module3_unit_testing;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected Calculator calculator;

    @BeforeClass(groups = {"unitTests1"})
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterClass(groups = {"unitTests1"})
    public void tearDown() {
        calculator = null;
    }
}
