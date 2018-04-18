import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Print extends MyArrays
{
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean loop = true;
        //String euro = "\u20ac";
        //String pound = "\u00a3";
        String strInput ="";   
        String charsCheck = "Â¬Â¦Â£â‚¬ï¿½";//+'\u20ac'+'\u00a3';//not supported charaters
        char[]chr = new char[charsCheck.length()];//set array to show on screen the input errors
        int error = 0;//count thr errors
     //arrays ffrom here
        byte singleChar = 0;//counter for single character input
        char c =  '\u00a9';
        System.out.print("by Zoltan Fuzesi " + c + " NOT Supported characters : Â¬Â¦$â‚¬");
        while(loop)//input loop start
        {
            Arrays.fill(chr, '\u0000');//fill array with null values all of the position
            System.out.print("\nEnter a string : ");
            strInput = in.nextLine();//input string
            for(int i=0;i<strInput.length();i++)//check input for string length
            {
                for(int j=0;j<charsCheck.length();j++)
                {
                    if(strInput.charAt(i)==charsCheck.charAt(j))
                    {
                        chr[error] = strInput.charAt(i);
                        error++;
                        
                    }
                  
                    if(strInput.length()==1)
                    {
                        singleChar++;
                        error++;
                    }
                    
                }
            }
            if(error==0)
            {
                loop=false;
            }
             else if(singleChar==1)
            {
                System.out.println("Single character input");
                singleChar=0;
                error = 0;
            }
            else if(error>0)
            {
            	
                //+'\u20ac'+" or " + '\u00a3' + " or " + '\u00A6' + " or " +'\u00AC'
                System.out.print("Not supported  character(s) or single character input");// +"\nInput : ");
               // for(int i=0;i<chr.length;i++)
              //  {
               // System.out.print(chr[i]);
               // }
                error = 0;
            }
           
            
        }//while input loop finish
        
        
        
        String printChar = strInput.toUpperCase();//input to upperCase
        byte whiteSpace = 0;//couter for witheSpace
        for(int i=0;i<strInput.length();i++)//search for space in the input
        {
            if(strInput.charAt(i)==' ')
            {
                whiteSpace++;
               // System.out.println("whiteSpace++");
            }
        }
        int stRColumns = strInput.length() * 10;//for the size of the columns
        
        str = new byte[5][stRColumns+whiteSpace];//set the output array
       
 
         
          passArray(printChar);
          
          
          for(int i=0;i<str.length;i++)//print out array
          {
              for(int j=0;j<str[0].length;j++)
              {
                  if(str[i][j]==1)
                  {
                  System.out.print("*");
                  }
                  else
                  {
                     System.out.print(" "); 
                  }
                  if(j==str[0].length-1)
                  {
                     System.out.println(); 
                  }
              }
          }
          
          System.out.println("Press Enter to exit......");
        try {
            System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
        }
     
  
    }
    
   
    
}

