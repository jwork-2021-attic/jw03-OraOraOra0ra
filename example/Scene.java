package example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import example.classloader.SteganographyClassLoader;

public class Scene {

    public static void main(String[] args) throws Exception {

        Line line = new Line(7);
        line.put(Gourd.ONE, 6);
        line.put(Gourd.TWO, 3);
        line.put(Gourd.THREE, 1);
        line.put(Gourd.FOUR, 5);
        line.put(Gourd.FIVE, 2);
        line.put(Gourd.SIX, 4);
        line.put(Gourd.SEVEN, 0);

        Geezer theGeezer = Geezer.getTheGeezer();

        SteganographyClassLoader loader = new SteganographyClassLoader(
                new URL("file:///D:/%E5%AD%A6%E4%B9%A0%E8%B5%84%E6%96%99/%E5%A4%A7%E4%B8%89%E4%B8%8A/%E9%AB%98%E7%BA%A7JAVA%E7%A8%8B%E5%BA%8F%E8%AE%BE%E8%AE%A1/task/03/jw03-OraOraOra0ra/example.QuickSorter.png"));

        Class c = loader.loadClass("example.SelectSorter");

        Sorter sorter = (Sorter) c.newInstance();

        theGeezer.setSorter(sorter);

        String log = theGeezer.lineUp(line);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
