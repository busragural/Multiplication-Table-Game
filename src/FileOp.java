
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class FileOp {
    //////////CHILD
    public static void writeChildToFile(List<ChildrenInfo> childrenList, String fileName) {
      
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.writeObject(childrenList);
                System.out.println("okay.");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
    }
    
    
    public static List<ChildrenInfo> readChildFromFile(String fileName) {
        
        List<ChildrenInfo> childrenList = new ArrayList<>();
            try (FileInputStream fileIn = new FileInputStream(fileName);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

                Object obj = objectIn.readObject();
                if (obj instanceof List<?> tempList) {
                    for (Object child : tempList) {
                        if (child instanceof ChildrenInfo childrenInfo) {
                            childrenList.add(childrenInfo);
                        }
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
            return childrenList;
    }

    /////////////
  
    public static void writeSettingsToFile(List<List<int[]>> settings, String fileName) {
      
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.writeObject(settings);
                System.out.println("okay.");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
    }
    
      public static List<List<int[]>> readSettingsFromFile(String fileName) {
        
        List<List<int[]>> settings = new ArrayList<>();
            try (FileInputStream fileIn = new FileInputStream(fileName);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

                settings = (List<List<int[]>>) objectIn.readObject();
                
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
            return settings;
    }
    
      
          
    public static void writeQuestionToFile(List<Questions> qList, String fileName) {
      
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.writeObject(qList);
                System.out.println("okay.");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
    }
    
    public static List<Questions> readQuestionFromFile(String fileName) {
        
        List<Questions> qList = new ArrayList<>();
            try (FileInputStream fileIn = new FileInputStream(fileName);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

                qList = (ArrayList<Questions>) objectIn.readObject();
                
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            }
            return qList;
    }
    
    
    public static void writeReportToFile(String fileName, String data) throws IOException {
        if (isEmpty(fileName)) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(data);
            }
        } else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.newLine();
                writer.write(data);
            }
        }
    }

    public static boolean isEmpty(String fileName) throws IOException {
        Path filePath = Paths.get(fileName);
        return Files.size(filePath) == 0;
    } 
    
    public static List<Object[]> readReportFromFile(String fileName) {
        
        List<Object[]> satirlar = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String satir;
            while ((satir = reader.readLine()) != null) {
                String[] veriler = satir.split(",");
                Object[] objDizi = new Object[veriler.length];
                for (int i = 0; i < veriler.length; i++) {
                    objDizi[i] = veriler[i];
                }
                satirlar.add(objDizi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
            return satirlar;
    }    
    
      

        
    
        
    
    
    
}
