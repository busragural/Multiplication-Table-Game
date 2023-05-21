
import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class FileOp {
    
    public static void writeChildToFile(List<ChildrenInfo> childrenList, String fileName) {
      
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.writeObject(childrenList);
                System.out.println("Dosyaya yazıldı.");
            } catch (IOException e) {
                System.out.println("Hata: " + e.getMessage());
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
                System.out.println("Hata: " + e.getMessage());
            }
            return childrenList;
    }


    
  
    
    
}
