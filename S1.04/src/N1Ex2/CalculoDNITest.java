package N1Ex2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDNITest {

    @ParameterizedTest
    @CsvSource({
            "53287342, E",
            "38536723, Q",
            "47443128, Q",
            "89467241, R",
            "13469758, S",
            "69745915, W",
            "65478932, W",
            "74123698, B",
            "36987412, P",
            "65478912, M"
    })

    void TestLetterCalculate(String numDni, String letter) { // tiene que haber misma cantidad de parámetros que en @ParameterizedTest
        CalculoDNI calculoDNI = new CalculoDNI();
        String newLetter = calculoDNI.letterCalculate(numDni, CalculoDNI.addLetters());
        assertEquals(letter, newLetter);
    }

}