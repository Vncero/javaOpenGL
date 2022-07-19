package engine.graphics;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLRunnable;

public class GraphicsGL2 {
    public static void fillRect(GL2 gl2, float x, float y, float width, float height) {
//        gl.glTranslatef(x, y, 0);
//        gl.glRotatef(rotation, 0, 0, 1);

//        gl.glColor4f(r, g, b, a);

        renderWrapper(
                gl2,
                GL2.GL_QUADS,
                () -> {
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
