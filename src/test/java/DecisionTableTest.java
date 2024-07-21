import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecisionTableTest {
    @Test
    public void test1() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(-1, -2));
    }
    @Test
    public void test2() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(-3, 2));
    }
    @Test
    public void test3() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(-2, 6));
    }
    @Test
    public void test4() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(-5, 10));
    }
    @Test
    public void test5() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(-1, 15));
    }
    @Test
    public void test6() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(0, -4));
    }
    @Test
    public void test7() {
        assertEquals("CAM THI", DieuKienThi.kiemTraDieuKienThi(1, 3));
    }
    @Test
    public void test8() {
        assertEquals("CAM THI", DieuKienThi.kiemTraDieuKienThi(1, 5));
    }
    @Test
    public void test9() {
        assertEquals("CAM THI", DieuKienThi.kiemTraDieuKienThi(0, 10));
    }
    @Test
    public void test10() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(1, 11));
    }
    @Test
    public void test11() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(2, -2));
    }
    @Test
    public void test12() {
        assertEquals("CAM THI", DieuKienThi.kiemTraDieuKienThi(3, 3));
    }
    @Test
    public void test13() {
        assertEquals("DU DIEU KIEN THI", DieuKienThi.kiemTraDieuKienThi(4, 5));
    }
    @Test
    public void test14() {
        assertEquals("DU DIEU KIEN THI", DieuKienThi.kiemTraDieuKienThi(3, 10));
    }
    @Test
    public void test15() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(6, 11));
    }
    @Test
    public void test16() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(10, -5));
    }
    @Test
    public void test17() {
        assertEquals("CAM THI", DieuKienThi.kiemTraDieuKienThi(10, 2));
    }
    @Test
    public void test18() {
        assertEquals("DU DIEU KIEN THI", DieuKienThi.kiemTraDieuKienThi(10, 6));
    }
    @Test
    public void test19() {
        assertEquals("QUA MON", DieuKienThi.kiemTraDieuKienThi(10, 10));
    }
    @Test
    public void test20() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(10, 12));
    }
    @Test
    public void test21() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(13, -1));
    }
    @Test
    public void test22() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(11, 3));
    }
    @Test
    public void test23() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(14, 7));
    }
    @Test
    public void test24() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(15, 10));
    }
    @Test
    public void test25() {
        assertEquals("KHONG HOP LE", DieuKienThi.kiemTraDieuKienThi(13, 12));
    }
}