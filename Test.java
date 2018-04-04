import java.util.Scanner;

public class Test
        {
        public static void main(String[] args)
                {
                String word = "";
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter the phrase you would like to be translated into Pig-Latin");
                word = scan.nextLine();
                String[] arr = word.split("\\s");
                for (String x:arr)
                        {
			char first =x.charAt(0);
			String rest = x.substring(1);
                        System.out.print(rest+"-"+first+"ay ");
                        }
		}
	}
# pig-latin
