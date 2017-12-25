public class Demo{

  public static void main(String[] args){
    int f = 0;
    if(args.length > 0){
      try {
        f = Integer.parseInt(args[0]);
      }
      catch(NumberFormatException e){
        System.err.println("Argument" + args[0] + "must be an integer");
        System.exit(1);
      }
        System.out.println("Your entered: " + f);
    }



  }
}
