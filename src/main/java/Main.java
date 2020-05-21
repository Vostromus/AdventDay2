import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        AdventDay_2 advent = new AdventDay_2();

        List<Integer> inputValues = Arrays.asList(1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,10,1,19,1,6,19,23,2,23,6,27,1,5,27,31,1,31,9,35,2,10,35,39,1,5,39,43,2,43,10,47,1,47,6,51,2,51,6,55,2,55,13,59,2,6,59,63,1,63,5,67,1,6,67,71,2,71,9,75,1,6,75,79,2,13,79,83,1,9,83,87,1,87,13,91,2,91,10,95,1,6,95,99,1,99,13,103,1,13,103,107,2,107,10,111,1,9,111,115,1,115,10,119,1,5,119,123,1,6,123,127,1,10,127,131,1,2,131,135,1,135,10,0,99,2,14,0,0);        
        Integer noun = 0,verb = 0;
        List<Integer> testSolution = new ArrayList<>();
        testSolution.addAll(inputValues);
       // List<Integer> solution = Arrays.asList();
        Boolean solving = true;


        for( int x = 0; x <= 99; x++){
            for(int y = 0; y <= 99; y++){
                    inputValues.set(1,x);
                    testSolution.set(2,y);
                    testSolution = advent.runOpcode(testSolution);
                     System.out.println(testSolution.get(0));   
                     if(testSolution.get(0) == 19690720){
                        System.out.println(testSolution.get(1) + "," + testSolution.get(2));                        
                        return;
                     } else {
                        testSolution = new ArrayList<>();
                        testSolution.addAll(inputValues);
                     }

            }
            
        }
   
        System.out.println(testSolution.get(1) + "," + testSolution.get(2));


    }
}