public class SmallestPositiveMultiple2413 {

    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else return n * 2;

    }

    public int[] runningSum(int[] nums) {
        int[] temp = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            temp[i] = sum;

        }
        return temp;
    }

    int maximum69Number(int num) {
        String s = Integer.toString(num);
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '6') {
                ch[i] = '9';
                break;
            }

        }
        return Integer.parseInt(new String(ch));
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = String.join("", word1);
        String s2 = String.join("", word2);

        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }

    }



    public boolean isPangram(String sentance) {
        int Alphabet[] = new int[26];
        for (char ch : sentance.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                Alphabet[ch - 'a'] = Alphabet[ch - 'a'] + 1;
            }
        }
        for (int count : Alphabet) {
            if (count == 0) {
                return false;
            }
        }
        return true;
    }

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count =0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                count ++;

            }
        }
        return  count;
    }


    public String restoreString(String s, int[] indices) {
      char [] suffeled = new char [s.length()];
      for(int i=0;i<indices.length;i++){
          suffeled[indices[i]]=s.charAt(i);
      }
      return new String(suffeled);
    }
}

