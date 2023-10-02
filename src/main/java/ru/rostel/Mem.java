package ru.rostel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Mem {
    public static void mem(String path, String phrase) throws IOException {
        //можно было бы добавить вариации шрифтов и положения текста, но я только учусь :), так что пусть добавляется +- по середине картинки
        BufferedImage image = ImageIO.read(new File(path));
        Graphics g = image.getGraphics();
        g.setColor(Color.BLACK);
        g.setFont(Font.getFont("Arial"));
        g.getFont().deriveFont(Font.PLAIN, 14f);

        g.drawString(phrase, image.getHeight() / 2, image.getWidth() / 2);
        g.dispose();
        //тут бы добавить место сохранения
        ImageIO.write(image, "png", new File("C:\\Users\\ar1one\\IdeaProjects\\mem\\newimg.jpg"));
    }
}


