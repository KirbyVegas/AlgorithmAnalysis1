public class CommonSubsequence {
    public static void findSubsequence(String text1, String text2) {
        String[] text1Array = text1.split("");
        String[] text2Array = text2.split("");
        String common = "";


        for (int i = 0; i < text1Array.length; i++) {
            for (int j = common.length(); j < text2Array.length; j++) {
                if(text1Array[i].equals(text2Array[j])) {
                    common = common + text1Array[i];
                    i++;
                    System.out.println(common);
                }


            }

        }
            System.out.println("The longest common subsequence is " + common);
        }


    }


