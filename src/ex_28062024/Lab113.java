package ex_28062024;

public class Lab113 {
    public static void main(String[] args) {
// Strings - imutable in nature
        // StringBuilder , StringBuffer
        String s1 = "SREE";
        s1 = "Firoz";

        StringBuffer stringBuffer = new StringBuffer("sreee");
        // change the value of string - Buffer
        stringBuffer.append("firoz"); //sreefiroz
        stringBuffer.append("dua"); //sreefiroz

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");
        System.out.println(s1);
        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)
    }
}
