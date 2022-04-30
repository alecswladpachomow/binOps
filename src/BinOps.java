public class BinOps {
    private final static String bin = "01";

    public String sum(String a, String b) {
        if (checkBin(a) && checkBin(b)) {
            return Integer.toBinaryString
                    (Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
        } else {
            return "Формат операнда не соответствует двоичному";
        }
    }

    public String mult(String a, String b) {
        if (checkBin(a) && checkBin(b)) {
            return Integer.toBinaryString
                    (Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
        } else {
            return "Формат операнда не соответствует двоичному";
        }
    }

    public boolean checkBin(String value) {
        for (int i = 0; i < value.length(); i++) {
            int tempB = value.charAt(i);
            if (tempB != '0' && tempB != '1') {
                return false;
            }
        }
        return true;
    }
}
