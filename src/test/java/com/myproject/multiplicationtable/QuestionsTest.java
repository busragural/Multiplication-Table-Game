package com.myproject.multiplicationtable;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author BusraGural
 */
public class QuestionsTest {

    public QuestionsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of makeOneSetting method, of class Questions.
     */
    @Test
    public void testMakeOneSetting() {
        int[] range = {1, 10};
        Questions instance = new Questions();
        instance.makeOneSetting(range);
        int[] settings = instance.settings;
        assertEquals(range[0], settings[0]);
        assertEquals(range[1], settings[1]);
    }

    /**
     * Test of randomQuestion method, of class Questions.
     */
    @Test
    public void testRandomQuestion() {
        int a1 = 1;
        int a2 = 10;
        int b1 = 1;
        int b2 = 10;
        int n = 5;
        Questions instance = new Questions();
        List<int[]> result = instance.randomQuestion(a1, a2, b1, b2, n);
        assertEquals(n, result.size());
        for (int[] question : result) {
            int firstNum = question[0];
            int secondNum = question[1];
            int expected = firstNum * secondNum;
            assertEquals(expected, question[2]);
        }
    }

}
