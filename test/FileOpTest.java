import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class FileOpTest {
    
    private static final String TEST_FILE_NAME = "test_data.txt";
    public FileOpTest() {
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
        File file = new File(TEST_FILE_NAME);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void testWriteChildToFile() {
        // Test verilerini oluştur
        List<ChildrenInfo> childrenList = new ArrayList<>();
        childrenList.add(new ChildrenInfo("child1", "password1"));
        childrenList.add(new ChildrenInfo("child2", "password2"));
        childrenList.add(new ChildrenInfo("child3", "password3"));

        // Dosyaya yazma işlemini gerçekleştir
        FileOp.writeChildToFile(childrenList,  TEST_FILE_NAME);

        try (FileInputStream fileIn = new FileInputStream(TEST_FILE_NAME);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            // Dosyadan okunan verileri al
            List<ChildrenInfo> actualList = (List<ChildrenInfo>) objectIn.readObject();
            actualList.get(0).setChildUsername("child4");
            // İki liste arasındaki eşleşmeyi kontrol et
            assertEquals(childrenList, actualList);
        } catch (IOException | ClassNotFoundException e) {
            fail("Dosya işlemleri hatası: " + e.getMessage());
        }
    }
/*
    @Test
    public void testReadChildFromFile() {
        String fileName = "";
        List<ChildrenInfo> expResult = null;
        List<ChildrenInfo> result = FileOp.readChildFromFile(fileName);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testWriteQuestionToFile() {
        List<Questions> qList = null;
        String fileName = "";
        FileOp.writeQuestionToFile(qList, fileName);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReadQuestionFromFile() {
        String fileName = "";
        List<Questions> expResult = null;
        List<Questions> result = FileOp.readQuestionFromFile(fileName);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testWriteReportToFile() throws Exception {
        String fileName = "";
        String data = "";
        FileOp.writeReportToFile(fileName, data);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsEmpty() throws Exception {
        String fileName = "";
        boolean expResult = false;
        boolean result = FileOp.isEmpty(fileName);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReadReportFromFile() {
            try {
                String fileName = "report.txt";
                String expectedData = "Sample report data";
                FileOp.writeReportToFile(fileName, expectedData);

                // Dosyadan okunan veriyi al
                List<Object[]> actualData = FileOp.readReportFromFile(fileName);

                // Beklenen veriyle eşleşmeyi kontrol et
                assertEquals(expectedData, actualData);
            } catch (IOException e) {
                fail("Dosya okuma hatası: " + e.getMessage());
            }
        }
    */
}
