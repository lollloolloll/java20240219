public class ConvolutionFilterExample {
    public static void main(String[] args) {
        // 이미지를 나타내는 2차원 배열
        int[][] image = {
                {100, 150, 200, 250},
                {120, 160, 210, 240},
                {130, 170, 220, 230},
                {110, 140, 190, 260}
        };

        // 흐림 효과를 주는 필터 커널
        int[][] filter = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        // 컨볼루션 필터 적용
        int[][] result = applyConvolutionFilter(image, filter);

        // 결과 출력
        System.out.println("Original Image:");
        printImage(image);
        System.out.println("\nFiltered Image:");
        printImage(result);
    }

    // 컨볼루션 필터 적용 메서드
    public static int[][] applyConvolutionFilter(int[][] image, int[][] filter) {
        int[][] result = new int[image.length - filter.length + 1][image[0].length - filter[0].length + 1];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                int sum = 0;
                for (int k = 0; k < filter.length; k++) {
                    for (int l = 0; l < filter[k].length; l++) {
                        sum += image[i + k][j + l] * filter[k][l];
                    }
                }
                result[i][j] = sum / (filter.length * filter[0].length);
            }
        }
        return result;
    }

    // 이미지 출력 메서드
    public static void printImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
