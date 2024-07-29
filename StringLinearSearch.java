package LinearSearch;

public class StringLinearSearch {

    public static void main(String args[])
    {
        String[] stringArray= {"Java","C++","Python","JavaScript"};
        String key = "Java";
        System.out.println(key+" is found at index: "+stringSearch(stringArray, key));
    }

    public static int stringSearch(String[] arr, String key)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
