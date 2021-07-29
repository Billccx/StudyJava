import java.util.*;

public class ArrayTest {
    public static void print(int index,Object object){
        System.out.println(String.format("%d: %s",index,object.toString()));
    }

    public static void demoString(){
        String str="djnon.pdf";
        print(1,str.indexOf('.'));
        print(2,str.charAt(6));
        print(3,str.substring(6));

        StringBuilder sb=new StringBuilder();
        sb.append("dm");
        sb.append(1.23);
        sb.append(true);
        print(4,sb.toString());
    }

    public static void demoMap(){
        Map<String,String> map=new HashMap<String,String>();
        for(int i=0;i<4;i++){
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        print(1,map.toString());

        for(Map.Entry<String,String>entry:map.entrySet()){
            print(2,entry.getKey()+"|"+entry.getValue());
        }

        print(3,map.get("3"));

        print(4,map.containsKey("a"));
    }

    public static void demoList(){
        List<String> strList=new ArrayList<>(10);
        for(int i=0;i<4;i++){
            strList.add(String.valueOf(i));
        }
        print(1,strList.toString());

        Collections.reverse(strList);
        print(2,strList.toString());

        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                 return o1.compareTo(o2);
            }
        });
    }


    public static void demoSet(){
        Set<String> strSet=new HashSet<String>();
        for(int i=0;i<3;i++){
            strSet.add(String.valueOf(i));
        }
        print(1,strSet);

        strSet.remove(String.valueOf(1));

        print(3,strSet.contains(String.valueOf(1)));
    }

    public static void demoControlFlow(){

    }

    public static void demoException(){
        try {
            int k=2;
            //k=k/0;
        }
        catch (Exception e){
            print(1,e.getMessage());
        }
        finally{
            print(2,"finally");
        }
    }

    public static void main(String[] args) {
        //demoString();
        //demoList();
        //demoMap();
        //demoSet();
        demoException();
    }
}
