package years.y2019.days;

import map.*;
import util.*;
import years.y2019.cpu.*;
import years.y2019.paint.*;

import java.io.*;


public class Day11
{
   private static final String INPUT_FILE_LOC =
      ReaderUtil.RESOURCES_LOCATION + "years/y2019/input11.txt";
   
   
   public static void main(String... args) throws IOException
   {
      Long[] opCodes = Program.getMemoryFromFile(INPUT_FILE_LOC);
      
      Program program = new Program();
      program.setMemory(opCodes);
      
      InfiniteGridMap <Integer> map = new InfiniteGridMap <>(EmergencyPaintingRobot.PAINT_OLD);
      
      EmergencyPaintingRobot robot = new EmergencyPaintingRobot(program, map);
      
      robot.run();
      
      long black = map.count().get(EmergencyPaintingRobot.PAINT_BLACK);
      long white = map.count().get(EmergencyPaintingRobot.PAINT_WHITE);
      
      long paintUsed = black + white;
      
      System.out.println(paintUsed);
   }
}
