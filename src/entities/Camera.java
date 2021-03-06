package entities;

import org.lwjgl.input.Keyboard;
import org.lwjgl.util.vector.Vector3f;

public class Camera {
	private Vector3f position = new Vector3f(250, 10, 250);
	private float pitch; //the camera's rotation
	private float yaw; // camera's left or right
	private float roll; // camera's tilt
	
	public Camera(){}
	
	public void move(){ // move camera based on keyboard input
		if(Keyboard.isKeyDown(Keyboard.KEY_W)){
			position.z-=0.2f;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_S)){
			position.z+=0.2f;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_D)){
			position.x+=0.2f;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_A)){
			position.x-=0.2f;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_T)){
			position.y+=0.2f;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_G)){
			position.y-=0.2f;
		}
	}

	public Vector3f getPosition() {
		return position;
	}

	public float getPitch() {
		return pitch;
	}

	public float getYaw() {
		return yaw;
	}

	public float getRoll() {
		return roll;
	}
	
	
}
