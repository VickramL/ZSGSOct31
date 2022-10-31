import java.util.*;

public class SubString {
    static Set<String> set = new HashSet<>();
    String str = "";
    public static void main(String[] args) {
        String s = "XYBYAXBY";
        System.out.println(new SubString().findCombination(s,0));
        System.out.println("Combination :"+ set.size());
    }
    public Set<String> findCombination(String s,int index) {

        if(str.length()>1) {
            checkSequence(str,s.substring(index-1));
            //return set;
        }


        for(int i=index;i<s.length();i++) {

            str+=s.charAt(i);
            findCombination(s,i+1);
            str=str.substring(0,str.length()-1);

        }
        return set;

    }
    public boolean checkSequence(String combi, String s) {

        int indx=-1;
        boolean flag = true;

        for(int i=0;i<combi.length();i++) {

            s=s.substring(indx+1);

            indx=s.indexOf(combi.charAt(i));

            if(indx==-1) {
                flag=false;
                break;
            }

        }

        if(flag) {
            set.add(combi);
            return true;
        }

        return false;


    }
}
