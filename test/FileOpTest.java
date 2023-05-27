/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
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
public class FileOpTest {
    
    private static final String TEST_FILE_NAME = "test_data.ser";
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

        
        FileOp.writeChildToFile(childrenList,  TEST_FILE_NAME);

        try (FileInputStream fileIn = new FileInputStream(TEST_FILE_NAME);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            
            List<ChildrenInfo> actualList = (List<ChildrenInfo>) objectIn.readObject();
            //actualList.get(0).setChildUsername("child4");
           
            assertEquals(childrenList, actualList);
        } catch (IOException | ClassNotFoundException e) {
            fail("Dosya işlemleri hatası: " + e.getMessage());
        }
    }

    /**
     * Test of readChildFromFile method, of class FileOp.
     
    @Test
    public void testReadChildFromFile() {
        System.out.println("readChildFromFile");
        String fileName = "";
        List<ChildrenInfo> expResult = null;
        List<ChildrenInfo> result = FileOp.readChildFromFile(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of writeQuestionToFile method, of class FileOp.
     
    @Test
    public void testWriteQuestionToFile() {
        System.out.println("writeQuestionToFile");
        List<Questions> qList = null;
        String fileName = "";
        FileOp.writeQuestionToFile(qList, fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of readQuestionFromFile method, of class FileOp.
     
    @Test
    public void testReadQuestionFromFile() {
        System.out.println("readQuestionFromFile");
        String fileName = "";
        List<Questions> expResult = null;
        List<Questions> result = FileOp.readQuestionFromFile(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of writeReportToFile method, of class FileOp.
    
    @Test
    public void testWriteReportToFile() throws Exception {
        System.out.println("writeReportToFile");
        String fileName = "";
        String data = "";
        FileOp.writeReportToFile(fileName, data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */

    /**
     * Test of isEmpty method, of class FileOp.
     
    @Test
    public void testIsEmpty() throws Exception {
        System.out.println("isEmpty");
        String fileName = "";
        boolean expResult = false;
        boolean result = FileOp.isEmpty(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of readReportFromFile method, of class FileOp.
    
    @Test
    public void testReadReportFromFile() {
        System.out.println("readReportFromFile");
        String fileName = "";
        List expResult = null;
        List result = FileOp.readReportFromFile(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */
    
}
