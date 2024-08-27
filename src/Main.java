public class Main {
    public static void main(String[] args) {
//        2415
          SmallestPositiveMultiple2413 obj1=new SmallestPositiveMultiple2413();
//        obj1.smallestEvenMultiple(5);

        //1480
        int[]result1480=obj1.runningSum(new int[]{1,2,3,4});
//        for (int num : result1480) {
//            System.out.print(num + " ");
//        }
        // max96
//        System.out.println(obj1.maximum69Number(9669));

//
        boolean result = obj1.isPangram("thequickbrownfoxjumpsoverthelazydog");
//        System.out.println(result);

        int number=obj1.numberOfEmployeesWhoMetTarget(new int[]{5,1,4,2,2},6);
//        System.out.println(number);

        String result1 = obj1.restoreString("codeleet",new int []{4,5,6,7,0,2,1,3});
//        System.out.println(result1);

        Permutation obj2=new Permutation();
        obj2.findPermutationDifference("abcde","edbac");
        System.out.println(obj2.finalValueAfterOperations(new String[]{"++X","++X","X++"}));
    }
}