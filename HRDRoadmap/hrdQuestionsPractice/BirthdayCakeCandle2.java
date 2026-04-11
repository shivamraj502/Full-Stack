public class BirthdayCakeCandle2 {
    public static int maxCount(int[] candles){
        int max=0;
        int count=0;
        for(int i=0;i<candles.length;i++){
            if(candles[i]>max){max=candles[i];}
        }

        for(int i=0;i<candles.length;i++){
            if(candles[i]==max){count++;}
        }

        return count;
    }
    public static void main(String[] args) {
        int [] candles= {4,4,1,3};
        System.out.println("Max height candles: "+maxCount(candles));
    }
}

/**
Example
candles = [4,4,1,3]

The tallest candles are 4 units high. There are 2 candles with this height, 
so the function should return 2.
 */