package pl.wit.lab4;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class DocHistogram
{
    private String filePath;
    private Map<String, Integer> mapHistogram;
    public DocHistogram(String filePath)
    {
        this.filePath = filePath;
        mapHistogram = new HashMap<>();
        parseFile();
    }
    private void parseFile()
    {
        List<String> lines;
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            lines = new ArrayList<>();
            String line;
            while ((line=br.readLine())!=null)
            {
                lines.add(line);
            }
            for(String line1 : lines)
            {
                String cleanLine = line1.replaceAll("[,\\.\\n]", "");
                String[] words = cleanLine.split("\\s+");
                countAndAddToMap(words);
            }
            br.close();
        } catch (Exception e)
        {
            throw new RuntimeException();
        }

    }
    private void countAndAddToMap(String[] words)
    {
        for (String word : words)
        {
            if (mapHistogram.containsKey(word))
            {
                mapHistogram.put(word, mapHistogram.get(word) + 1);
            }
            else
            {
                mapHistogram.put(word, 1);
            }
        }
    }

    public String printHistogram()
    {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : mapHistogram.entrySet())
        {
            sb.append(entry.getKey());
            sb.append(",");
            sb.append(entry.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }
    public void saveHistogramToFile(String fileName)
    {
        try
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(printHistogram());
            bufferedWriter.close();
        }
        catch (Exception e)
        {
            throw new RuntimeException();
        }
    }

    public Map<String, Integer> getMapHistogram()
    {
        return mapHistogram;
    }
}
