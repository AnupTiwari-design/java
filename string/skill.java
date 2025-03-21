package string;

public class skill {

    public static void main(String[] args) {
        
       
            String[] skills = {"a", "b", "c", "d"};
            String[] candidates = {"a b", "b c", "c d", "d"};
            int first = -1, second = -1;
            for (int i = 0; i < candidates.length; i++) {
                for (int j = i + 1; j < candidates.length; j++) {
                    if ((candidates[i] + " " + candidates[j]).contains("a") &&
                        (candidates[i] + " " + candidates[j]).contains("b") &&
                        (candidates[i] + " " + candidates[j]).contains("c") &&
                        (candidates[i] + " " + candidates[j]).contains("d")) {
                        first = i;
                        second = j;
                        System.out.println(first + " " + second);
                        return;
                    }
                }
            }
        }
    }