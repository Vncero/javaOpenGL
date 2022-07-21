package engine.graphics;
import com.jogamp.opengl.GL2;
import org.jetbrains.annotations.NotNull;

import static com.jogamp.opengl.GL.GL_COLOR_BUFFER_BIT;

public class GraphicsGL2 {

    public static void setDrawColor(@NotNull GL2 gl2, float r, float g, float b, float a) {
        gl2.glColor4f(r, g, b, a);
    }

    public static void setClearColor(@NotNull GL2 gl2, float r, float g, float b, float a) {
        gl2.glClearColor(r, g, b, a);
        gl2.glClear(GL_COLOR_BUFFER_BIT);
    }

    public static void fillRect(GL2 gl2, float x, float y, float width, float height) {
//        gl.glTranslatef(x, y, 0);
//        gl.glRotatef(rotation, 0, 0, 1);

        renderWrapper(
                gl2,
                GL2.GL_QUADS,
                () -> {
                    //impl modifying render style (center, vertices)
                    gl2.glVertex2f(-width / 2, -height / 2);
                    gl2.glVertex2f(width / 2, -height / 2);
                    gl2.glVertex2f(width / 2, height / 2);
                    gl2.glVertex2f(-width / 2, height / 2);
                }
        );

//        gl.glRotatef(-rotation, 0, 0, 1);
//        gl.glTranslatef(-x, -y, 0);
    }

    private static void renderWrapper(GL2 gl2, int glMode, Runnable r) {
        gl2.glBegin(glMode);
            r.run();
        gl2.glEnd();

        gl2.glFlush();
    }
}
