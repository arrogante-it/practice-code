package Magic_ball;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "���������";
    private static final String DEFINITELY = "���������� ��";
    private static final String MOST_LIKELY = "��������� �����";
    private static final String OUTLOOK_GOOD = "������� �����������";
    private static final String ASK_AGAIN_LATER = "������ �����";
    private static final String TRY_AGAIN = "�������� �����";
    private static final String NO = "��� ����� � ���";
    private static final String VERY_DOUBTFUL = "������ �����������";

    public static String getPrediction() {
        Random r = new Random();
        int x = r.nextInt(8);
        if (x == 0) {
            return CERTAIN;
        } else if (x == 1) {
            return DEFINITELY;
        } else if (x == 2) {
            return MOST_LIKELY;
        } else if (x == 3) {
            return OUTLOOK_GOOD;
        } else if (x == 4) {
            return ASK_AGAIN_LATER;
        } else if (x == 5) {
            return TRY_AGAIN;
        } else if (x == 6) {
            return NO;
        } else if (x == 7) {
            return VERY_DOUBTFUL;
        } else {
            return null;
        }
    }
}
