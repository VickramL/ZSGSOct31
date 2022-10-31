import java.util.*;

public class ZeroSum {
    public static void main(String[] args) {
//        List<List<Integer>> resList = new ArrayList<>();
        HashMap<List<Integer>,List<Integer>> map = new HashMap<>();
        int[] array = {-1,0,1,2,-1,4};
        int length = array.length;
        for(int i = 0;i<length;i++){
            for(int j = 0; j< length;j++){
                for(int k = 0;k<length;k++){
                    if(i!=j && i != k && j != k && array[i]+array[j]+array[k] == 0){
                        ArrayList<Integer> li = new ArrayList<>();
                        li.add(array[i]);
                        li.add(array[j]);
                        li.add(array[k]);
                        ArrayList<Integer> newList = new ArrayList<>(li);
                        Collections.sort(newList);
                        if(!map.containsKey(newList)){
                            map.put(newList,li);
                        }
                    }
                }
            }
        }
        for(List<Integer> value:map.values()){
            System.out.println(value);
        }
    }
}
