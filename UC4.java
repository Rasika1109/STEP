public class UC4 
{
    public static void main(String[] args) 
    {
        String s1[]=new String[5];
        s1[0]=String.join(" ","***** ","***** ","***** ","***** ");
        s1[1]=String.join(" ","*   * ","*   * ","*   * ","***** ");
        s1[2]=String.join(" ","*   * ","*   * ","***** ","    * ");
        s1[3]=String.join(" ","*   * ","*   * ","*     ","    * ");
        s1[4]=String.join(" ","***** ","***** ","*     ","***** ");
        for(int i=0;i<=4;i++)
        {
            System.out.println(s1[i]);
        }

    }
}