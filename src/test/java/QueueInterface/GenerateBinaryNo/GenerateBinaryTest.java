package QueueInterface.GenerateBinaryNo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static QueueInterface.GenerateBinaryNo.GenerateBinary.generateBinary;
import static org.junit.jupiter.api.Assertions.*;

class GenerateBinaryTest {
    @Test
    void testgenerateBinary() {
        List<String> list =generateBinary(4);

        List<String> expected =new ArrayList<>();
        expected.add("1");
        expected.add("10");
        expected.add("11");
        expected.add("100");
        assertEquals(expected,list);


    }

}