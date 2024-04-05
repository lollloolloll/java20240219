public class VideoDataExample {
    public static void main(String[] args) {
        // 비디오 프레임 수
        int numFrames = 3;
        // 비디오의 세로 해상도
        int height = 3;
        // 비디오의 가로 해상도
        int width = 3;

        // 비디오 데이터를 저장할 3차원 배열
        int[][][] videoData = new int[numFrames][height][width];

        // 각 프레임의 픽셀 값을 무작위로 초기화
        initializeVideoData(videoData);

        // 비디오 데이터 출력
        printVideoData(videoData);
    }

    // 비디오 데이터를 무작위로 초기화하는 메서드
    public static void initializeVideoData(int[][][] videoData) {
        for (int f = 0; f < videoData.length; f++) {
            for (int i = 0; i < videoData[f].length; i++) {
                for (int j = 0; j < videoData[f][i].length; j++) {
                    // 각 픽셀의 R, G, B 값 무작위로 설정 (0 ~ 255)
                    videoData[f][i][j] = (int) (Math.random() * 256);
                }
            }
        }
    }

    // 비디오 데이터를 출력하는 메서드
    public static void printVideoData(int[][][] videoData) {
        for (int f = 0; f < videoData.length; f++) {
            System.out.println("Frame " + f + ":");
            for (int i = 0; i < videoData[f].length; i++) {
                for (int j = 0; j < videoData[f][i].length; j++) {
                    System.out.print("(" + videoData[f][i][j] + ") ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
