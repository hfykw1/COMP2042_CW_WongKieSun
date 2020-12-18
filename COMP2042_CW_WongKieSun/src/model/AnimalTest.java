package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javafx.scene.image.Image;

class AnimalTest {

	@Test
	void imgSizeTest() {
		Animal imagetest = new Animal();
		int expectedimgSize = 40;
		int actualimgSize = imagetest.imgSize;
		assertEquals(expectedimgSize,actualimgSize);
	}
	
	@Test
	void setImageTest() {
		int imgSize = 40;
		Animal imagetest = new Animal();
		Image imgW1 = new Image("file:src/model/ActorResources/froggerUp.png",imgSize, imgSize, true, true);
		Image imgW1a = imagetest.imgW1;
		assertEquals(imgW1, imgW1a);
	}
	
}
