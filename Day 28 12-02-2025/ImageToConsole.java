import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;

public class ImageToConsole {
    public static void main(String[] args) {
        try {
            // Load the image
            File file = new File("eagle.jpg");
            BufferedImage image = ImageIO.read(file);
            
            // Resize if needed
            int width = image.getWidth() / 4;  // Adjust scale for console
            int height = image.getHeight() / 4;
            
            // Loop through pixels
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    // Get pixel color
                    int pixel = image.getRGB(x * 4, y * 4);  // Scaled for resizing
                    Color color = new Color(pixel, true);
                    
                    // Convert to grayscale
                    int gray = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                    
                    // Choose character based on brightness
                    char ch = gray < 128 ? '*' : ' ';
                    
                    System.out.print(ch);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
