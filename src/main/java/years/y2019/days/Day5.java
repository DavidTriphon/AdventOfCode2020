package years.y2019.days;

import util.*;
import years.y2019.cpu.*;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;


public class Day5
{
   private static final String INPUT_FILE_LOC =
      ReaderUtil.RESOURCES_LOCATION + "years/y2019/input5.txt";
   
   
   public static void main(String... args) throws IOException
   {
      String fileString =
         Files.readString(Path.of(INPUT_FILE_LOC), StandardCharsets.US_ASCII).trim();
      
      ArrayList <Long> opCodesArray = new ArrayList <>();
      Arrays.asList(fileString.split(",")).forEach((i) -> opCodesArray.add(Long.parseLong(i)));
      Long[] opCodes = opCodesArray.toArray(new Long[0]);
      
      Program program = new Program();
      program.setInput(new Long[] {1L});
      program.setMemory(opCodes);
      
      program.compute();
      
      System.out.println(Arrays.asList(program.getOutput()));
   }
}
