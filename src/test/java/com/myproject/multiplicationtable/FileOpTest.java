package com.myproject.multiplicationtable;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author BusraGural
 */
public class FileOpTest {

    private static final String TEST_FILE_NAME_1 = "test_child_file.ser";
    private static final String TEST_FILE_NAME_2 = "test_report.csv";

    public FileOpTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {

    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        Files.deleteIfExists(Paths.get(TEST_FILE_NAME_1));
        Files.deleteIfExists(Paths.get(TEST_FILE_NAME_2));

    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
        Files.deleteIfExists(Paths.get(TEST_FILE_NAME_1));
        Files.deleteIfExists(Paths.get(TEST_FILE_NAME_2));

    }

    /**
     * Test of writeChildToFile method, of class FileOp.
     */
    @org.junit.jupiter.api.Test
    public void testWriteChildToFile() {

        List<ChildrenInfo> childrenList = new ArrayList<>();
        childrenList.add(new ChildrenInfo("child1", "password1"));
        childrenList.add(new ChildrenInfo("child2", "password2"));
        childrenList.add(new ChildrenInfo("child3", "password3"));

        FileOp.writeChildToFile(childrenList, TEST_FILE_NAME_1);

        try (FileInputStream fileIn = new FileInputStream(TEST_FILE_NAME_1); ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            List<ChildrenInfo> actualList = (List<ChildrenInfo>) objectIn.readObject();
            //actualList.get(0).setChildUsername("child4");

            assertEquals(childrenList, actualList);
        } catch (IOException | ClassNotFoundException e) {
            fail("Dosya işlemleri hatası: " + e.getMessage());
        }
    }

    /*
     * Test of readChildFromFile method, of class FileOp.
     */
    @org.junit.jupiter.api.Test
    public void testReadChildFromFile() {
        // Create a list of ChildrenInfo objects
        List<ChildrenInfo> childrenList = new ArrayList<>();
        childrenList.add(new ChildrenInfo("child1", "password1"));
        childrenList.add(new ChildrenInfo("child2", "password2"));
        childrenList.add(new ChildrenInfo("child3", "password3"));

        FileOp.writeChildToFile(childrenList, TEST_FILE_NAME_1);

        List<ChildrenInfo> actualList = FileOp.readChildFromFile(TEST_FILE_NAME_1);

        assertEquals(childrenList, actualList);
    }

    /**
     * Test of isEmpty method, of class FileOp.
     */
    @org.junit.jupiter.api.Test
    public void testIsEmpty_NonEmptyFile() throws IOException {
        String fileName = TEST_FILE_NAME_2;
        Files.write(Paths.get(fileName), "Test data".getBytes());

        assertFalse(FileOp.isEmpty(fileName));
    }

    /**
     * Test of readReportFromFile method, of class FileOp.
     */
    @org.junit.jupiter.api.Test
    public void testReadReportFromFile() throws IOException {
        String fileName = TEST_FILE_NAME_2;
        List<String> expectedLines = new ArrayList<>();
        expectedLines.add("Line 1");
        expectedLines.add("Line 2");
        expectedLines.add("Line 3");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : expectedLines) {
                writer.write(line);
                writer.newLine();
            }
        }

        List<String> actualLines = new ArrayList<>();
        List<Object[]> reportData = FileOp.readReportFromFile(fileName);
        for (Object[] row : reportData) {
            for (Object value : row) {
                actualLines.add((String) value);
            }
        }

        assertEquals(expectedLines, actualLines);
    }

}
