package C02.lecture.P02type;

import java.math.BigDecimal;

public class PiDecimalPosition {
    public static void main(String[] args) {
        BigDecimal pi = calculatePi(10000); // 소수점 이하 100,000자리의 파이 값을 계산
        String piString = pi.toPlainString().replace(".", ""); // 파이 값을 문자열로 변환하고 소수점 제거
        String inputString = "9"; // 임의의 숫자열

        int decimalPosition = findDecimalPosition(piString, inputString);
        if (decimalPosition != -1) {
            System.out.println("입력한 숫자열이 파이의 " + decimalPosition + "번째 자리에 위치합니다.");
        } else {
            System.out.println("입력한 숫자열이 파이에 포함되어 있지 않습니다.");
        }
    }

    // 소수점 이하 n자리까지의 파이 값을 계산하는 메소드
    private static BigDecimal calculatePi(int n) {
        return BigDecimal.valueOf(Math.PI).setScale(n, BigDecimal.ROUND_HALF_UP);
    }

    // 파이 문자열과 입력 문자열을 비교하여 파이의 소수점 이후 자리를 반환하는 메소드
    private static int findDecimalPosition(String piString, String inputString) {
        int decimalPosition = -1;

        // 입력 문자열이 파이의 소수점 이후 부분에 포함되어 있는지 확인
        int index = piString.indexOf(inputString);
        if (index != -1) {
            decimalPosition = index + inputString.length(); // 입력 문자열의 길이를 더해서 실제 자릿수로 변환
        }

        return decimalPosition;
    }
}
