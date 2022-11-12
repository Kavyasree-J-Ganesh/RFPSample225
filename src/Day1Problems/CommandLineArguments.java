package Day1Problems;

public class CommandLineArguments {
  public static void main(String[] args){

      // System.out.println(args[0]);
      // System.out.println(args[1]);
      // System.out.println(args[2]);
      // System.out.println(args[3]);

      int sum = 0;
      for (int i=0; i<args.length; i++){
          sum = sum + Integer.valueOf(args[i]);
      }
      System.out.println(sum);
  }
}




