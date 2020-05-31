import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();

        int locJ = 0;
        int locI = 0;

        int x = 0;
        int y = 0;

        String turn = "";
        String [][] m = new String [height][width] ;

        for (int i = 0; i < height; i++) {
            String line = in.next();
            for (int j = 0; j < width; j++){
                m[i][j] = "" + line.charAt(j) ;
            }
        }
        String side = in.next();

//searching pikaptcha
        for (int i = 0; i < height; i++){
            for(int j = 0; j < width; j++)
                if ((m[i][j].equals(">")) || (m[i][j].equals("<")) || (m[i][j].equals("^")) || (m[i][j].equals("v"))){
                turn = m[i][j];
                locJ = j;
                locI = i;
                x = i;
                y = j;
                m[i][j] = "" + 0;
                }
        }

        while (true) {
            if (turn.equals(">")) {

                if (side.equals("L")) {
                    /*LEFT SIDE impasse in two side -| && -0*/
                    if (((locI - 1) < 0) || "#".equals(m[locI - 1][locJ])) {
                        if ((((locJ + 1) > width - 1) || "#".equals(m[locI][locJ + 1]))) {
                            turn = "v";
                        } else {

                            int a = Integer.parseInt(m[locI][locJ]) + 1;
                            m[locI][locJ] = "" + a;
                            locJ += 1;
                        }
                    }
                    /*turn "^" */
                    if (((locI - 1) >= 0) && "0".equals(m[locI - 1][locJ])) {
                        turn = "^";
                    }
                } else {
                    /*RIGHT SIDE impasse in two side -| && -0*/
                    if (((locI + 1) > height-1) || "#".equals(m[locI + 1][locJ])) {
                        if ((((locJ + 1) > width - 1) || "#".equals(m[locI][locJ + 1]))) {
                            turn = "^";
                        } else {
                            int a = Integer.parseInt(m[locI][locJ]) + 1;
                            m[locI][locJ] = "" + a;
                            locJ += 1;
                        }
                    }
                    /*turn "^" */
                    if (((locI + 1) >= height - 1) && "0".equals(m[locI + 1][locJ])) {
                        turn = "v";
                    }
                }
            }

            if (turn.equals("v")){
                if (side.equals("L")) {

                    /*LEFT SIDE impasse in two side -| && -0*/
                    if (((locJ + 1) >= width) || "#".equals(m[locI][locJ + 1])) {
                        if ((((locI + 1) > height - 1) || "#".equals(m[locI + 1][locJ]))) {
                            turn = "<";
                        } else {
                            int a = Integer.parseInt(m[locI][locJ]) + 1;
                            m[locI][locJ] = "" + a;
                            locI += 1;
                        }
                    }
                    /*turn "^" */
                    if (((locJ + 1) < width) && "0".equals(m[locI][locJ + 1])) {
                        turn = ">";
                        System.out.println(">");
                    }
                } else {
                    /*RIGHT SIDE impasse in two side -| && -0*/
                    if (((locJ - 1) < 0) || "#".equals(m[locI][locJ - 1])) {
                        if ((((locI + 1) > height - 1) || "#".equals(m[locI+1][locJ]))) {
                            turn = ">";
                        } else {
                            int a = Integer.parseInt(m[locI][locJ]) + 1;
                            m[locI][locJ] = "" + a;
                            locI += 1;
                        }
                    }
                    /*turn "^" */
                    if (((locJ - 1) >= 0) && "0".equals(m[locI][locJ - 1])) {
                        turn = "<";
                    }
                }
            }

            if (turn.equals("<")) {

                if (side.equals("L")) {
                    /*LEFT SIDE impasse in two side -| && -0*/
                    if (((locI + 1) > height - 1) || "#".equals(m[locI + 1][locJ])) {
                        if ((((locJ - 1) < 0) || "#".equals(m[locI][locJ - 1]))) {
                            turn = "^";
                        } else {
                            int a = Integer.parseInt(m[locI][locJ]) + 1;
                            m[locI][locJ] = "" + a;
                            locJ -= 1;
                        }
                    }
                    /*turn "^" */
                    if (((locI + 1) < height) && "0".equals(m[locI + 1][locJ])) {
                        turn = "v";
                    }
                } else {
//                    /*RIGHT SIDE impasse in two side -| && -0*/
                    if (((locI - 1) < 0) || "#".equals(m[locI - 1][locJ])) {
                        if ((((locJ - 1) < 0) || "#".equals(m[locI][locJ - 1]))) {
                            turn = "v";
                        } else {
                            int a = Integer.parseInt(m[locI][locJ]) + 1;
                            m[locI][locJ] = "" + a;
                            locJ -= 1;
                        }
                    }
                    /*turn "^" */
                    if (((locI - 1) >= 0) && "0".equals(m[locI - 1][locJ])) {
                        turn = "^";
                    }
                }
            }

            if (turn.equals("^")) {

                if (side.equals("L")) {
                    /*LEFT SIDE impasse in two side -| && -0*/
                    if (((locJ - 1) < 0) || "#".equals(m[locI][locJ - 1])) {
                        if ((((locI - 1) < 0) || "#".equals(m[locI][locI - 1]))) {
                            turn = ">";
                        } else {
                            int a = Integer.parseInt(m[locI][locJ]) + 1;
                            m[locI][locJ] = "" + a;
                            locI -= 1;
                        }
                    }
                    /*turn "^" */
                    if (((locJ - 1) >= 0) && "0".equals(m[locI][locJ - 1])) {
                        turn = "<";
                    }
                } else {
                    /*RIGHT SIDE impasse in two side -| && -0*/
                    if (((locJ + 1) > width - 1) || "#".equals(m[locI][locJ+1])) {
                        if ((((locI - 1) < 0) || "#".equals(m[locI - 1][locJ]))) {
                            turn = "<";
                        } else {
                            int a = Integer.parseInt(m[locI][locJ]) + 1;
                            m[locI][locJ] = "" + a;
                            locI -= 1;
                        }
                    }
                    /*turn "^" */
                    if (((locJ + 1) < width) && "0".equals(m[locI][locJ + 1])) {
                        turn = ">";
                    }
                }
            }
//            for (int i = 0; i < height; i++){
//                for (int j = 0; j < width; j++){
//                    System.out.print(m[i][j]);
//                }
//                System.out.println();
//            }
            if ((x == locI) && (y == locJ) ){
                break;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(m[i][j]);
            }
        }


    }
}
