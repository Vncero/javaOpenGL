package engine.graphics;

import com.jogamp.opengl.GL2;

public class Graphics {
    public static GL2 gl = null;

    public static void fillRect(float x, float y, float width, float height) {
//        gl.glTranslatef(x, y, 0);
//        gl.glRotatef(rotation, 0, 0, 1);

//        gl.glColor4f(r, g, b, a);

        gl.glBegin(GL2.GL_QUADS);
            gl.glVertex2f(-width / 2, -height / 2);
            gl.glVertex2f(width / 2, -height / 2);
            gl.glVertex2f(width / 2, height / 2);
            gl.glVertex2f(-width / 2, height / 2);
        gl.glEnd();

        gl.glFlush();

//        gl.glRotatef(-rotation, 0, 0, 1);
//        gl.glTranslatef(-x, -y, 0);
    }
}
