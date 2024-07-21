import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoundaryTest {
    @Test
    public void test1() {
        assertEquals("CAM THI", DieuKienThi.kiemTraDieuKienThi(0, 6));
    }
    @Test
    public void test2() {
        assertEquals("CAM THI", DieuKienThi.kiemTraDieuKienThi(1, 6));
    }
    @Test
    public void test3() {
        assertEquals("DU DIEU KIEN THI", DieuKienThi.kiemTraDieuKienThi(4, 6));
    }
    @Test
    public void test4() {
        assertEquals("DU DIEU KIEN THI", DieuKienThi.kiemTraDieuKienThi(9, 6));
    }
    @Test
    public void test5() {
        assertEquals("DU DIEU KIEN THI", DieuKienThi.kiemTraDieuKienThi(10, 6));
    }
    @Test
    public void test6() {
        assertEquals("CAM THI", DieuKienThi.kiemTraDieuKienThi(4, 0));
    }
    @Test
    public void test7() {
        assertEquals("CAM THI", DieuKienThi.kiemTraDieuKienThi(4, 1));
    }
    @Test
    public void test8() {
        assertEquals("DU DIEU KIEN THI", DieuKienThi.kiemTraDieuKienThi(4, 9));
    }
    @Test
    public void test9() {
        assertEquals("DU DIEU KIEN THI", DieuKienThi.kiemTraDieuKienThi(4, 10));
    }
}