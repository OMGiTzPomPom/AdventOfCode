    package _2025.day3;

    import _2025.InputReader;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

    public class Day3 {

        public static void main(String[] args) {
            ArrayList<String> list = (ArrayList<String>) InputReader.readFile(3);
            System.out.println(levelOne(list));
//            System.out.println(levelTwo(list));
        }

        private static int levelOne(List<String> list) {
            int total = 0;

            for (String s : list) {
                int best = -1;
                int n = s.length();

                for (int i = 0; i < n - 1; i++) {
                    if (!Character.isDigit(s.charAt(i))) continue;
                    int a = s.charAt(i) - '0';

                    for (int j = i + 1; j < n; j++) {
                        if (!Character.isDigit(s.charAt(j))) continue;
                        int b = s.charAt(j) - '0';
                        int value = 10 * a + b;
                        if (value > best) {
                            best = value;
                            if (best == 99) break;
                        }
                    }
                    if (best == 99) break;
                }
                    total += best;
            }
            return total;
        } 


        private static int levelTwo(List<String> list) {
            System.out.print("Level Two: ");
            return 0;
        }
    }
