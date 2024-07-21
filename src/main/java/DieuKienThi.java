public class DieuKienThi {
    public static String kiemTraDieuKienThi(double cc, double gk) {
        if(cc < 0 || gk < 0 || cc > 10 || gk > 10) {
            return "KHONG HOP LE";
        }
        if(cc < 5) {
            return "CAM THI";
        }
        if(gk < 4) {
            return "CAM THI";
        }
        if(cc == 10 && gk == 10) {
            return "QUA MON";
        }
        return "DU DIEU KIEN THI";
    }
}
