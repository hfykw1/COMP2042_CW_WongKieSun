package view;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class ScoreHandlerTest {

	@Test
    void createFile() {
        File file = new File("src/view/highscore.txt");
        assertTrue(file.exists(), "File is created");
    }

}
