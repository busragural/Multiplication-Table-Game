
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Questions implements Serializable {
    private static final long serialVersionUID = 1L;

  
    int[] settings;
    //List<int[]> exercises;
    
    

    public Questions( ) {
         //exercises = new ArrayList<>();
         settings = new int[5];
    
    }
    
    
    public void makeOneSetting(int[] range){
       settings = range;
       //exercises = randomQuestion(settings[0], settings[1], settings[2], settings[3], settings[4]);
    }


    public List<int[]> randomQuestion(int a1, int a2, int b1, int b2, int n){
        Random rand = new Random();
        List<int[]> randomQuestions = new ArrayList<>();
        int firstRandomNum;
        int secondRandomNum;
    
      
        for(int i=0; i<n; i++){
            firstRandomNum = rand.nextInt(a2 - a1 + 1) + a1;
            secondRandomNum = rand.nextInt(b2 - b1 + 1) + b1;
            System.out.println("first: " + firstRandomNum);
            System.out.println("second" + secondRandomNum);
            int a[] = {firstRandomNum, secondRandomNum};
         
            randomQuestions.add(a);         
        }
 
       return randomQuestions;

    }
    

}
