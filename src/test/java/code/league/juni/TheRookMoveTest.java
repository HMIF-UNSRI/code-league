package code.league.juni;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static code.league.juni.TheRookMove.checkRookMove;

public class TheRookMoveTest {

    @Test
    public void testCase0() {
        int[][] paths = {
                {2, 3, 6, 9, 8},
                {4, 7, 8, 6, 3}     // illegal at 8 to 6
        };

        assertEquals("LEGAL", checkRookMove(3, paths[0]));
        assertEquals("ILLEGAL", checkRookMove(3, paths[1]));
    }

    @Test
    public void testCase1() {
        int[][] paths = {
                {11, 12, 8, 7, 6, 10, 14, 13, 9, 10},
                {3, 4, 8, 12, 11, 10, 6, 2, 1, 5},
                {16, 12, 11, 15, 14, 10, 6, 2, 3, 6}    // illegal at 3 to 6
        };

        assertEquals("LEGAL", checkRookMove(4, paths[0]));
        assertEquals("LEGAL", checkRookMove(4, paths[1]));
        assertEquals("ILLEGAL", checkRookMove(4, paths[2]));
    }

    @Test
    public void testCase2() {
        int[][] paths = {
                {1, 6, 7, 12, 13, 8, 7, 12, 17, 22, 23, 24, 25, 19, 14},    // illegal at 25 to 19
                {23, 22, 21, 16, 17, 12, 11, 6, 1, 2, 7, 8, 9, 15, 19},     // illegal at 9 to 15
                {10, 15, 20, 19, 14, 13, 12, 7, 8, 9, 14, 19, 24, 25, 24}
        };

        assertEquals("ILLEGAL", checkRookMove(5, paths[0]));
        assertEquals("ILLEGAL", checkRookMove(5, paths[1]));
        assertEquals("LEGAL", checkRookMove(5, paths[2]));
    }

    @Test
    public void testCase3() {
        int[][] paths = {
                {31, 32, 33, 27, 21, 15, 9, 3, 2, 1, 7, 8, 9, 10, 11, 12, 17, 16, 22, 28, 27, 33, 34, 28, 22, 23, 24, 18, 17, 11},      // illegal at 12 to 17
                {2, 8, 7, 8, 9, 15, 21, 27, 26, 32, 33, 27, 33, 34, 35, 29, 30, 36, 30, 24, 18, 17, 11, 12, 6, 5, 11, 17, 12, 18},      // illegal at 17 to 12
                {9, 15, 9, 3, 9, 10, 9, 8, 14, 20, 26, 32, 31, 25, 26, 27, 28, 22, 23, 17, 16, 15, 14, 8, 9, 10, 4, 5, 6, 12},
                {6, 12, 18, 24, 30, 36, 35, 34, 33, 32, 31, 25, 19, 13, 7, 1, 2, 3, 4, 5, 11, 17, 23, 29, 28, 27, 26, 20, 14, 8}
        };

        assertEquals("ILLEGAL", checkRookMove(6, paths[0]));
        assertEquals("ILLEGAL", checkRookMove(6, paths[1]));
        assertEquals("LEGAL", checkRookMove(6, paths[2]));
        assertEquals("LEGAL", checkRookMove(6, paths[3]));
    }

    @Test
    public void testCase4() {
        int[][] paths = {
                {3, 4, 11, 10, 3, 4, 11, 18, 19, 20, 21, 28, 27, 34, 35, 42, 49, 48, 41, 40, 39, 38, 31, 24, 17, 24, 23, 24, 17, 10, 9, 2, 1, 8, 15},
                {19, 26, 19, 12, 5, 6, 7, 14, 21, 20, 19, 18, 17, 16, 15, 22, 15, 8, 9, 10, 3, 10, 11, 18, 25, 32, 39, 46, 45, 44, 37, 39, 23, 31, 32},     // illegal at 23 to 31
                {26, 19, 12, 13, 14, 21, 28, 27, 26, 33, 40, 47, 46, 39, 32, 31, 30, 31, 38, 39, 40, 41, 42, 49, 48, 47, 40, 33, 26, 25, 24, 17, 16, 9, 2},
                {38, 39, 40, 33, 26, 19, 12, 11, 18, 19, 20, 21, 14, 7, 6, 5, 12, 11, 10, 9, 8, 1, 2, 9, 16, 23, 30, 37, 44, 43, 44, 45, 37, 36, 29},       // illegal at 45 to 37
                {46, 47, 48, 49, 42, 41, 40, 39, 38, 37, 36, 29, 30, 31, 32, 33, 34, 35, 28, 27, 26, 25, 24, 23, 22, 15, 16, 17, 18, 19, 20, 21, 14, 13, 12}
        };

        assertEquals("LEGAL", checkRookMove(7, paths[0]));
        assertEquals("ILLEGAL", checkRookMove(7, paths[1]));
        assertEquals("LEGAL", checkRookMove(7, paths[2]));
        assertEquals("ILLEGAL", checkRookMove(7, paths[3]));
        assertEquals("LEGAL", checkRookMove(7, paths[4]));
    }

    @Test
    public void testCase5() {
        int[][] paths = {
                {50, 51, 52, 44, 36, 28, 20, 12, 4, 5, 6, 7, 8, 16, 24, 32, 40, 48, 56, 64, 56, 55, 54, 62, 54, 46, 38, 30, 22, 14, 6, 5, 13, 21, 29, 28, 27, 19, 11, 3, 2, 10, 11, 19, 27},
                {35, 43, 35, 27, 28, 29, 30, 22, 14, 13, 5, 4, 12, 20, 28, 36, 44, 43, 42, 41, 33, 25, 17, 18, 19, 20, 21, 22, 23, 31, 39, 47, 55, 63, 62, 61, 53, 54, 55, 56, 64, 56, 48, 40, 32},
                {1, 9, 10, 11, 12, 20, 28, 36, 35, 34, 33, 41, 42, 35, 27, 28, 29, 30, 31, 39,47, 55, 63, 64, 56, 55, 54, 53, 61, 60, 59, 51, 43, 35, 27, 26, 25, 33, 34, 35, 43, 50, 58, 50, 42},      // illegal at 43 to 50
                {55, 56, 64, 63, 55, 56, 64, 63, 55, 56, 64, 63, 55, 56, 64, 63, 55, 56, 64, 63, 55, 56, 64, 63, 55, 56, 64, 63, 55, 56, 64, 63, 55, 56, 64, 63, 55, 56, 64, 63, 55, 56, 64, 55, 56},   // illegal at 64 to 55
                {5, 13, 21, 29, 37, 45, 53, 61, 60, 52, 44, 45, 46, 48, 48, 40, 32, 31, 30, 29, 21, 22, 23, 24, 32, 40, 48, 47, 46, 45, 44, 43, 42, 41, 33, 34, 26, 18, 10, 9, 17, 18, 19, 20, 13}      // illegal at 20 to 13
        };

        assertEquals("LEGAL", checkRookMove(8, paths[0]));
        assertEquals("LEGAL", checkRookMove(8, paths[1]));
        assertEquals("ILLEGAL", checkRookMove(8, paths[2]));
        assertEquals("ILLEGAL", checkRookMove(8, paths[3]));
        assertEquals("ILLEGAL", checkRookMove(8, paths[4]));
    }

    @Test
    public void testCase6() {
        int[][] paths = {
                {50, 51, 52, 53, 62, 71, 80, 79, 70, 61, 52, 43, 42, 41, 40, 31, 22, 13, 14, 15, 16, 17, 18, 27, 36, 35, 26, 25, 34, 43, 52, 51, 50, 69, 78, 79, 80, 81, 80, 79, 78, 69, 68, 67, 58, 49, 48, 39, 49, 58},       // illegal at 39 to 49
                {69, 60, 51, 42, 41, 40, 39, 30, 21, 12, 3, 2, 3, 2, 1, 10, 11, 12, 13, 22, 31, 32, 33, 34, 43, 52, 53, 54, 63, 72, 81, 80, 71, 70, 61, 60, 51, 50, 41, 40, 31, 30, 21, 20, 11, 10, 1, 11, 21, 31},             // illegal at 1 to 11
                {73, 74, 75, 76, 77, 78, 79, 80, 81, 72, 63, 54, 45, 36, 27, 18, 9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 19, 28, 37, 46, 55, 64, 73, 74, 65, 56, 57, 58, 59, 68, 69, 60, 51, 42, 41, 40, 39, 30, 21, 12},
                {47, 48, 49, 58, 67, 76, 75, 74, 65, 56, 47, 38, 29, 20, 11, 2, 3, 4, 13, 14, 23, 24, 33, 34, 43, 44, 53, 54, 63, 62, 61, 60, 51, 42, 41, 50, 59, 68, 77, 69, 70, 60, 61, 69, 70, 80, 71, 62, 53, 61},          // illegal at 77 to 69
                {33, 32, 31, 40, 49, 58, 67, 68, 69, 60, 69, 78, 77, 76, 75, 74, 73, 64, 55, 46, 37, 28, 29, 30, 31, 32, 33, 24, 15, 6, 7, 8, 9, 18, 27, 36, 45, 44, 43, 42, 41, 40, 39, 48, 49, 50, 58, 59, 68, 77}            // illegal at 50 to 58
        };

        assertEquals("ILLEGAL", checkRookMove(9, paths[0]));
        assertEquals("ILLEGAL", checkRookMove(9, paths[1]));
        assertEquals("LEGAL", checkRookMove(9, paths[2]));
        assertEquals("ILLEGAL", checkRookMove(9, paths[3]));
        assertEquals("ILLEGAL", checkRookMove(9, paths[4]));
    }
}
