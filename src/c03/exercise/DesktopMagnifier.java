//import javafx.application.Application;
//import javafx.geometry.Rectangle2D;
//import javafx.scene.Scene;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.StackPane;
//import javafx.scene.robot.Robot;
//import javafx.stage.Screen; // 추가
//import javafx.stage.Stage;
//
//public class DesktopMagnifier extends Application {
//
//    @Override
//    public void start(Stage primaryStage) {
//        // 전체 화면 크기 가져오기
//        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
//        double screenWidth = primaryScreenBounds.getWidth();
//        double screenHeight = primaryScreenBounds.getHeight();
//
//        // 원하는 부분의 화면 영역 설정 (예: x=0, y=0, width=500, height=500)
//        double magnifiedAreaWidth = 500;
//        double magnifiedAreaHeight = 500;
//        Rectangle2D magnifiedArea = new Rectangle2D(0, 0, magnifiedAreaWidth, magnifiedAreaHeight);
//
//        // 가상 데스크톱에서 확대하는 영역의 이미지뷰 생성
//        ImageView magnifiedView = new ImageView(new Robot().getScreenCapture(null, magnifiedArea));
//
//        // 스택팬에 이미지뷰 추가
//        StackPane root = new StackPane();
//        root.getChildren().add(magnifiedView);
//
//        // Scene 생성
//        Scene scene = new Scene(root, magnifiedAreaWidth, magnifiedAreaHeight);
//
//        // 스테이지 설정
//        primaryStage.setTitle("Desktop Magnifier");
//        primaryStage.setScene(scene);
//        primaryStage.setX(screenWidth - magnifiedAreaWidth - 20); // 오른쪽 하단에 표시
//        primaryStage.setY(screenHeight - magnifiedAreaHeight - 60); // 오른쪽 하단에 표시
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
