package years.y2019.days;

import util.*;
import years.y2019.cpu.*;

import java.io.*;
import java.util.*;


public class Day9
{
   private static final String INPUT_FILE_LOC =
      ReaderUtil.RESOURCES_LOCATION + "years/y2019/input9.txt";
   
   
   public static void main(String... args) throws IOException
   {
      Long[] opCodes = Program.getMemoryFromFile(INPUT_FILE_LOC);
      
      Program program = new Program();
      
      program.setMemory(opCodes);
      program.setInput(new Long[] {1L});
      program.compute();
      System.out.println(Arrays.asList(program.getOutput()));
   }
}
