package CodeTest2;

public class MaxArrayMain {
    public  static int maxArray(int[] input1) {

        int[] arrayInput = input1;
        int max = 0;
        for (int i = 0; i < arrayInput.length; i++) {

                if (arrayInput[i] >max){
                    max = arrayInput[i];
                }

        }

return  max;
    }
}




