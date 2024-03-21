package AhmedAmr;

import org.ietf.jgss.Oid;

import java.util.Arrays;

public class Sequence {

    public void ResolveSequence(int FinalNumber) {
        int count = 4;
        int LoopCount = 4;
        int num = FinalNumber;
        int OtherNum = FinalNumber;
        int[] result = new int[count];
        for (int i = 0; i < LoopCount; i++) {
            if (num == FinalNumber) {
                result[count - 1] = num;
                num--;
            } else {
                int FinalNum = OtherNum / 2;
                OtherNum = FinalNum;
                result[count - 2] = FinalNum;
                count--;
            }

        }
        System.out.println(Arrays.toString(result));

    }
    public void EvenArray(int Length) {
        int x = 1;
        int count =0;
        int[] FirstArray = new int[Length];
        for (int i = 0; i < Length; i++) {
            FirstArray[i] = x;
            x++;
            if (i > 2 && i % 2 == 0) {
                FirstArray[i] = i;
                if(count==0) {
                    System.out.print("["+FirstArray[i]+",");
                }
                if(count==1) {
                    System.out.print(FirstArray[i]+",");
                }
                if (count==2) {
                    System.out.println(FirstArray[i] + "]");
                }
                count++;
            }

        }

    }
}
