import java.util.*;

public class SubString {
    static Set<String> set = new HashSet<>();
    String str = "";
    public static void main(String[] args) {
        String s = "XYBYAXBY";
        System.out.println(new SubString().findCombination(s,0));
        System.out.println("Combination : "+ set.size());
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
    public boolean checkSequence(String combination, String s) {

        int index =-1;
        boolean flag = true;

        for(int i = 0; i< combination.length(); i++) {

            s=s.substring(index +1);

            index =s.indexOf(combination.charAt(i));

            if(index ==-1) {
                flag=false;
                break;
            }

        }

        if(flag) {
            set.add(combination);
            return true;
        }

        return false;


    }
}
