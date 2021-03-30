import java.io.*;
import com.microsoft.demo.Demo;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void test_method_2() throws Exception {
        String expected_value = "Hello, world!";
        String file ="./src/test/resources/fileTest.txt";
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        Files.list(new File(System.getProperty("user.dir")).toPath())
            .limit(10)
            .forEach(path -> {
                System.out.println(path);
            });
        
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        reader.close();
        System.out.println("Line");
        System.out.println(currentLine);
        assertEquals(expected_value, currentLine);
    }
}