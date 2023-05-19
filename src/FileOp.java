
import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class FileOp {
    
    public static void writeChildToFile(ChildrenInfo child, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName,true);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            
                objectOut.writeObject(child);
            
            System.out.println("yazildi dosyaya.");
        } catch (IOException e) {
            System.out.println("Error!" + e.getMessage());
        }
    }
    
    
    public static List<ChildrenInfo> readChildFromFile(String fileName) {
        List<ChildrenInfo> childrenList = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            while (true) {
                try {
                    ChildrenInfo child = (ChildrenInfo) objectIn.readObject();
                    childrenList.add(child);
                } catch (EOFException e) {
                    break; // Dosya sonuna gelindi, okuma işlemi sonlandırılıyor.
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Hata: " + e.getMessage());
        }
        for (ChildrenInfo item : childrenList) {
            System.out.println(item);
        }
        return childrenList;
    }


    
  
    
    
}
