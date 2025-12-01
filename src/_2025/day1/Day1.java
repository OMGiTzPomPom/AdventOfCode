    package _2025.day1;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    import _2025.InputReader;

    public class Day1 {

        public static void main(String[] args) {
            ArrayList<String> list = (ArrayList<String>) InputReader.readFile(1);
            System.out.println(levelOne(list));
            System.out.println(levelTwo(list));
        }

        private static int levelOne(List<String> list) {
            System.out.print("Level one: ");
            int password = 0;
            int curPos = 50;

            for (String s : list) {
                int value = Integer.parseInt(s.substring(1));
                switch (s.charAt(0)) {
                    case 'R':
                        curPos = (curPos + value)%100;
                        break;
                    case 'L':
                        curPos = (curPos - value)%100;
                        if (curPos < 0) {
                            curPos = (curPos % 100 + 100) % 100;
                        }
                        break;
                    default:
                        break;
                }
                if(curPos == 0) {
                    password++;
                }
            }

            return password;
        }



        private static int levelTwo(List<String> list) {
            System.out.print("Level Two: ");
            int password = 0;
            int curPos = 50;
            int clics;

            for (String s : list) {

                int value = Integer.parseInt(s.substring(1));

                switch (s.charAt(0)) {
                    case 'R':
                        clics = (100 - curPos) % 100;
                        break;
                    case 'L':
                        clics = curPos % 100;
                        break;
                    default:
                        clics = 0;
                        break;
                }

                if (clics == 0) clics = 100;

                if (value >= clics) {
                    password += 1 + (value - clics) / 100;
                }

                switch (s.charAt(0)) {
                    case 'R':
                        curPos = (curPos + value) % 100;
                        break;
                    case 'L':
                        curPos = (curPos - value) % 100;
                        if (curPos < 0) {
                            curPos = (curPos % 100 + 100) % 100;
                        }
                        break;
                    default:
                        break;
                }
            }

            return password;

        }
    }
