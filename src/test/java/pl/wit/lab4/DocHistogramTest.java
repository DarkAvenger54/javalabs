package pl.wit.lab4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;

public class DocHistogramTest
{
    @Test
    public void printHistogramTest()
    {
        DocHistogram docHistogram = new DocHistogram("src/main/resources/tutorial9.txt");
        String result = docHistogram.printHistogram();
        System.out.println(result);
    }
    @Test
    public void SaveHistogramTest()
    {
        DocHistogram docHistogram = new DocHistogram("src/main/resources/tutorial9.txt");
        docHistogram.saveHistogramToFile("src/test/resources/result.txt");
        try
        {
            StringBuilder resultSb = new StringBuilder();
            StringBuilder testtextSb = new StringBuilder();
            String line;
            BufferedReader br = new BufferedReader(new FileReader("src/test/resources/result.txt"));
            while((line=br.readLine())!=null) {
                resultSb.append(line);
            }
            br.close();
            BufferedReader br2 = new BufferedReader(new FileReader("src/test/resources/testtext.txt"));
            while((line=br2.readLine())!=null)
            {
                testtextSb.append(line);
            }
            br2.close();
            String resultStr = resultSb.toString();
            String testtextStr = testtextSb.toString();
            Assertions.assertEquals(resultStr, testtextStr);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
