package AhmedAmr;

import java.util.Arrays;

public class Sequence {

    //[1 ,3, 6, 13]
    public void ResolveSequence(int FinalNumber){
        int count = 4;
        int LoopCount= 4;
        int num= FinalNumber;
        int OtherNum = FinalNumber;
        int[] result = new int[count];
        for (int i = 0; i < LoopCount; i++) {
            if(num == FinalNumber){
                result[count-1] = num;
                num--;
            }
            else{
                int FinalNum = OtherNum/2;
                OtherNum = FinalNum;
                result[count-2] =FinalNum;
                count--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}




