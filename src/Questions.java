

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;
import java.util.Random;


public class Questions implements Serializable {
    private static final long serialVersionUID = 1L;
    int settingID =0;
  
    int[] settings;
    List<String[]> highScores;
    public Questions( ) {
       
         settings = new int[6];
         highScores = new ArrayList<>();
    
    }
    
    
    public void makeOneSetting(int[] range){
       settings = range;
       settings[5] = settingID;
       settingID++;
       
       
    }


    public List<int[]> randomQuestion(int a1, int a2, int b1, int b2, int n){
        Random rand = new Random();
        List<int[]> randomQuestions = new ArrayList<>();
        int firstRandomNum;
        int secondRandomNum;
        int result;
        int isTrue = 0;
    
      
        for(int i=0; i<n; i++){
            firstRandomNum = rand.nextInt(a2 - a1 + 1) + a1;
            secondRandomNum = rand.nextInt(b2 - b1 + 1) + b1;
            result = firstRandomNum * secondRandomNum;
            System.out.println("first: " + firstRandomNum);
            System.out.println("second" + secondRandomNum);
            int a[] = {firstRandomNum, secondRandomNum, result, isTrue};
         
            randomQuestions.add(a);         
        }
 
       return randomQuestions;

    }
    

}
