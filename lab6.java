import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class SCLab2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter text:");
    String test = sc.nextLine();

    Pattern patDT = Pattern.compile("(int|double|float)");
    Pattern patOp = Pattern.compile("[-+*\\/=]");
    Pattern patId = Pattern.compile("\\b[_a-zA-Z][_a-zA-Z0-9]*\\b");
    Pattern patNum = Pattern.compile("\\d+");


    Matcher matcher = patDT.matcher(test);
    while (matcher.find()) {
      System.out.println("Datatype: "+matcher.group());
    }


    Matcher matcher1 = patOp.matcher(test);
    while (matcher1.find()) {
      System.out.println("Operator: "+matcher1.group());
    }

    Matcher matcher2 = patId.matcher(test);
    while (matcher2.find()) {
      if(!"int".equals(matcher2.group()) &&
        !"double".equals(matcher2.group()) &&
          !"float".equals(matcher2.group())){
        System.out.println("Identifier: "+matcher2.group());
      }
    }

    Matcher matcher3 = patNum.matcher(test);
    while (matcher3.find()) {
      System.out.println("Number: "+matcher3.group());
    }
  }
}
