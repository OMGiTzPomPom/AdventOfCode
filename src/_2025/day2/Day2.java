    package _2025.day2;

    import _2025.InputReader;

    import java.util.ArrayList;
    import java.util.List;

    public class Day2 {

        public static void main(String[] args) {
            String input = ((ArrayList<String>) InputReader.readFile(2)).getFirst();
            ArrayList<String> list = new ArrayList<>(List.of(input.split(",")));

            System.out.println(levelOne(list));
            System.out.println(levelTwo(list));
        }

        private static long levelOne(List<String> list) {
            System.out.print("Level one: ");

            long total = 0;

            for (String range : list) {
                String[] parts = range.split("-");
                long left = Long.parseLong(parts[0]);
                long right = Long.parseLong(parts[1]);

                for (long id = left; id <= right; id++) {
                    String s = Long.toString(id);

                    if (s.length() % 2 != 0) continue;

                    int half = s.length() / 2;
                    String a = s.substring(0, half);
                    String b = s.substring(half);

                    if (a.equals(b)) {
                        total += id;
                    }
                }
            }

            return total;
        }

        private static long levelTwo(List<String> list) {
            System.out.print("Level Two: ");

            long total = 0;

            for (String range : list) {
                String[] parts = range.split("-");
                long left = Long.parseLong(parts[0]);
                long right = Long.parseLong(parts[1]);

                for (long id = left; id <= right; id++) {
                    String s = Long.toString(id);

                    if (s.length() < 2) continue;

                    boolean invalid = false;
                    int len = s.length();

                    for (int blockLen = 1; blockLen <= len / 2; blockLen++) {
                        if (len % blockLen != 0) continue;

                        int repeats = len / blockLen;
                        if (repeats < 2) continue;

                        String block = s.substring(0, blockLen);
                        boolean allEqual = true;

                        for (int r = 1; r < repeats; r++) {
                            int start = r * blockLen;
                            if (!block.equals(s.substring(start, start + blockLen))) {
                                allEqual = false;
                                break;
                            }
                        }

                        if (allEqual) {
                            invalid = true;
                            break;
                        }
                    }

                    if (invalid) {
                        total += id;
                    }
                }
            }

            return total;
        }
    }
