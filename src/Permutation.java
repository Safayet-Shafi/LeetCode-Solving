public class Permutation {
    int sum=0;
    public int findPermutationDifference(String s, String t){
        for (int i=0;i<s.length();i++){
           char test= s.charAt(i);
            int r =Math.abs(s.indexOf(test)-t.indexOf(test));
            sum=sum+r;
        }
        return sum;
    }

    int x=0;
    public int finalValueAfterOperations(String[] operations) {
       for(String test:operations){
           if(test.equals("++X")||test.equals("X++")){
               x++;
           } else if (test.equals("--X")||test.equals("X--")) {
               x--;
           }

           }
           return x;
       }
}
