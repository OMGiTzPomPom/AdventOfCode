    package _2025.day3;

    import _2025.InputReader;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

    public class Day3 {

        public static void main(String[] args) {
            ArrayList<String> list = (ArrayList<String>) InputReader.readFile(3);
            System.out.println(levelOne(list));
            System.out.println(levelTwo(list));
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

        public static long levelTwo(List<String> list) {
            long total = 0L;
            for (String s : list) {
                long best = maxKDigitsValue(s, 12);
                total += best;
            }
            return total;
        }

        private static long maxKDigitsValue(String s, int k) {
            StringBuilder digits = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) digits.append(c);
            }

            int n = digits.length();
            if (n < k) { //circuit breaker
                return 0L;
            }

            int toRemove = n - k;
            StringBuilder stack = new StringBuilder();

            for (int i = 0; i < n; i++) {
                char c = digits.charAt(i);
                while (stack.length() > 0 && toRemove > 0 && stack.charAt(stack.length() - 1) < c) {
                    stack.deleteCharAt(stack.length() - 1);
                    toRemove--;
                }
                stack.append(c);
            }

            if (toRemove > 0) {
                stack.setLength(stack.length() - toRemove);
            }
            String resultDigits = stack.substring(0, k);

            long value = 0L;
            for (int i = 0; i < resultDigits.length(); i++) {
                value = value * 10L + (resultDigits.charAt(i) - '0');
            }
            return value;
        }
    }
