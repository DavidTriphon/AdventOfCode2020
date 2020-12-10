package days;

import handheld.*;
import util.*;

import java.io.*;


public class Day8B
{
   public static final String INPUT_FILE_LOC = ReaderUtil.RESOURCES_LOCATION + "input8.txt";
   
   
   public static void main(String[] args) throws IOException
   {
      CPU cpu = new CPU(ReaderUtil.parseFileToList(INPUT_FILE_LOC, Instruction::fromString));
      
      for (Instruction instruction : cpu.getProgram())
      {
         switch (instruction.getOpCode())
         {
            case JUMP:
            {
               instruction.setOpCode(OpCode.NO_OPERATION);
            }
            break;
            case NO_OPERATION:
            {
               instruction.setOpCode(OpCode.JUMP);
            }
            break;
         }
         
         cpu.runUntilRepeat();
         
         if (cpu.isHalted())
         {
            System.out.println(cpu.getAccumulator());
            break;
         }
         
         switch (instruction.getOpCode())
         {
            case JUMP:
            {
               instruction.setOpCode(OpCode.NO_OPERATION);
            }
            break;
            case NO_OPERATION:
            {
               instruction.setOpCode(OpCode.JUMP);
            }
            break;
         }
         
         cpu.resetMemory();
      }
   }
}
