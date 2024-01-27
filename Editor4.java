import java.awt.Color;

/**
 * Demonstrates the morphing operation featured by Runigram.java. 
 * The program recieves 2 command-line arguments: a string representing the name
 * of the PPM file, the number of morphing steps (an int). 
 * This action transforms the colored Thor image into a black and white Thor image.

 */
public class Editor4 {

	public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt (args[1]);
		Color[][] sourceImage = Runigram.read(source);
		Color[][] targetImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);
	}
}
