package codility;

public class MicroStrategy {
    public static String solution(int[] T) {
        int[] seasonAmplitude = new int[4];
        boolean secondConditionCheck = true;
        if (T.length % 4 == 0 && (T.length > 3 && T.length < 201)) {
            int[] WINTER = new int[T.length / 4];
            int[] SPRING = new int[T.length / 4];
            int[] SUMMER = new int[T.length / 4];
            int[] AUTUMN = new int[T.length / 4];
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < T.length / 4; i++) {
                    if (T[j * T.length / 4 + i] < -1000 || T[j * T.length / 4 + i] > 1000) {
                        secondConditionCheck = true;
                        break;
                    } else {
                        if (j == 0) {
                            WINTER[i] = T[j * T.length / 4 + i];
                        } else if (j == 1) {
                            SPRING[i] = T[j * T.length / 4 + i];
                        } else if (j == 2) {
                            SUMMER[i] = T[j * T.length / 4 + i];
                        } else {
                            AUTUMN[i] = T[j * T.length / 4 + i];
                        }
                    }
                }
            }
            seasonAmplitude[0] = getAmplitude(WINTER);
            seasonAmplitude[1] = getAmplitude(SPRING);
            seasonAmplitude[2] = getAmplitude(SUMMER);
            seasonAmplitude[3] = getAmplitude(AUTUMN);
        }
        if (secondConditionCheck) {
            return "wrong input!";
        }
        getIndex(seasonAmplitude);
        switch (getIndex(seasonAmplitude)){
            case 0:
                return "WINTER";
            case 1:
                return "SPRING";
            case 2:
                return "SUMMER";
            case 3:
                return "AUTUMN";
        } return "WRONG INPUT!";
    }

    public static int getAmplitude(int[] t) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < t.length; i++) {
            if (min > t[i]) {
                min = t[i];
            }
            if (max < t[i]) {
                max = t[i];
            }
        }
        return max - min;
    }

    public static int getIndex(int[] array) {
        int index = 0;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            if (array[i] > largest) {
                largest = array[i];
                index = i;
            }
        }
        return index;
    }
}
