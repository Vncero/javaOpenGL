package engine.graphics;

import org.jetbrains.annotations.NotNull;

import com.jogamp.opengl.GL2;

import static com.jogamp.opengl.GL2.*;

public class GraphicsGL2 {
    private static double rotation = 0d;

    public static void setRotation(double rotation) {
        GraphicsGL2.rotation = rotation;
    }

    public static void setDrawColor(@NotNull GL2 gl2, float r, float g, float b, float a) {
        gl2.glColor4f(r, g, b, a);
    }

    public static void setClearColor(@NotNull GL2 gl2, float r, float g, float b, float a) {
        gl2.glClearColor(r, g, b, a);
        gl2.glClear(GL_COLOR_BUFFER_BIT);
    }

    public static void fillRect(@NotNull GL2 gl2, float x, float y, float width, float height) {
        gl2.glTranslatef(x, y, 0);
        renderWrapper(
                gl2,
                GL_QUADS,
                () -> {
                    //impl modifying render style (center, vertices)
                    gl2.glVertex2f(-width / 2, -height / 2);
                    gl2.glVertex2f(width / 2, -height / 2);
                    gl2.glVertex2f(width / 2, height / 2);
                    gl2.glVertex2f(-width / 2, height / 2);
                }
        );

        gl2.glTranslatef(-x, -y, 0);
    }

    public static void fillTriangle(@NotNull GL2 gl2) {
        renderWrapper(
            gl2,
            GL_TRIANGLES,
            () -> {
                // gl2.glVertex2f();
                // gl2.glVertex2f();
                // gl2.glVertex2f();
            }
        );
    }

    private static void renderWrapper(@NotNull GL2 gl2, int glMode, Runnable r) {
        gl2.glRotatef((float) rotation, 0, 0, 1);

        gl2.glBegin(glMode);
            r.run();
        gl2.glEnd();

        gl2.glFlush();

        gl2.glRotatef((float) -rotation, 0, 0, 1);
    }
}
