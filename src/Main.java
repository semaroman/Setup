import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File src = new File("D://Games", "src");
        if (src.mkdir())
            System.out.println("Каталог " + src.getName() + " создан");
        else
            System.out.println("Каталог " + src.getName() + " НЕ создан");

        File res = new File("D://Games", "res");
        if (res.mkdir())
            System.out.println("Каталог " + res.getName() + " создан");
        else
            System.out.println("Каталог " + res.getName() + " НЕ создан");

        File savegames = new File("D://Games", "savegames");
        if (savegames.mkdir())
            System.out.println("Каталог " + savegames.getName() + " создан");
        else
            System.out.println("Каталог " + savegames.getName() + " НЕ создан");

        File temp = new File("D://Games", "temp");
        if (temp.mkdir())
            System.out.println("Каталог " + temp.getName() + " создан");
        else
            System.out.println("Каталог " + temp.getName() + " НЕ создан");

        File main = new File("D://Games/src", "main");
        if (main.mkdir())
            System.out.println("Каталог " + main.getName() + " создан");
        else
            System.out.println("Каталог " + main.getName() + " НЕ создан");

        File test = new File("D://Games/src", "test");
        if (test.mkdir())
            System.out.println("Каталог " + test.getName() + " создан");
        else
            System.out.println("Каталог " + test.getName() + " НЕ создан");

        File mainJava = new File("D://Games/src/main/Main.java");
        try {
            if (mainJava.createNewFile())
                System.out.println("Файл " + mainJava.getName() + " создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File utilsJava = new File("D://Games/src/main/Utils.java");
        try {
            if (utilsJava.createNewFile())
                System.out.println("Файл " + utilsJava.getName() + " создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawables = new File("D://Games/res", "drawables");
        if (drawables.mkdir())
            System.out.println("Каталог " + drawables.getName() + " создан");
        else
            System.out.println("Каталог " + drawables.getName() + " НЕ создан");

        File vectors = new File("D://Games/res", "vectors");
        if (vectors.mkdir())
            System.out.println("Каталог " + vectors.getName() + " создан");
        else
            System.out.println("Каталог " + vectors.getName() + " НЕ создан");

        File icons = new File("D://Games/res", "icons");
        if (icons.mkdir())
            System.out.println("Каталог " + icons.getName() + " создан");
        else
            System.out.println("Каталог " + icons.getName() + " НЕ создан");

        File tempTxt = new File("D://Games/temp/temp.txt");
        try {
            if (tempTxt.createNewFile())
                System.out.println("Файл " + tempTxt.getName() + " создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        StringBuilder log = new StringBuilder();
        log.append("Каталог " + src.getName() + " создан ");
        log.append("Каталог " + res.getName() + " создан ");
        log.append("Каталог " + savegames.getName() + " создан ");
        log.append("Каталог " + temp.getName() + " создан ");
        log.append("Каталог " + temp.getName() + " создан ");
        log.append("Каталог " + main.getName() + " создан ");
        log.append("Каталог " + test.getName() + " создан ");
        log.append("Файл " + mainJava.getName() + " создан ");
        log.append("Файл " + utilsJava.getName() + " создан ");
        log.append("Каталог " + drawables.getName() + " создан ");
        log.append("Каталог " + vectors.getName() + " создан ");
        log.append("Каталог " + icons.getName() + " создан");

        String txt = log.toString();

        try (FileWriter write = new FileWriter("D://Games/temp/temp.txt", false)) {
            write.write(txt);
            write.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}