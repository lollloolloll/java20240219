//import org.lwjgl.glfw.GLFW;
//import org.lwjgl.opengl.GL;
//import org.lwjgl.opengl.GL11;
//
//import static org.lwjgl.glfw.GLFW.*;
//import static org.lwjgl.system.MemoryUtil.*;
//
//public class MinecraftClone {
//
//    private long window;
//
//    public void run() {
//        init();
//        loop();
//        cleanup();
//    }
//
//    private void init() {
//        if (!glfwInit()) {
//            throw new IllegalStateException("Unable to initialize GLFW");
//        }
//
//        glfwDefaultWindowHints();
//        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
//        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
//
//        window = glfwCreateWindow(800, 600, "Minecraft Clone", NULL, NULL);
//        if (window == NULL) {
//            throw new RuntimeException("Failed to create the GLFW window");
//        }
//
//        glfwMakeContextCurrent(window);
//        glfwSwapInterval(1);
//        glfwShowWindow(window);
//    }
//
//    private void loop() {
//        GL.createCapabilities();
//
//        glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
//
//        while (!glfwWindowShouldClose(window)) {
//            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
//            render();
//            glfwSwapBuffers(window);
//            glfwPollEvents();
//        }
//    }
//
//    private void render() {
//        glColor3f(1.0f, 1.0f, 1.0f);
//        glBegin(GL_QUADS);
//        glVertex3f(-0.5f, -0.5f, 0.0f);
//        glVertex3f(0.5f, -0.5f, 0.0f);
//        glVertex3f(0.5f, 0.5f, 0.0f);
//        glVertex3f(-0.5f, 0.5f, 0.0f);
//        glEnd();
//    }
//
//    private void cleanup() {
//        glfwDestroyWindow(window);
//        glfwTerminate();
//    }
//
//    public static void main(String[] args) {
//        new MinecraftClone().run();
//    }
//}
