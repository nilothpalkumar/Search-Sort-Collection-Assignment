package LinearSearch;

import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Scanner;
    public class CountOccurance
    {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a string : ");
                String st = sc.nextLine();
                char[] arr = st.toCharArray();
                Arrays.sort(arr);
                ArrayList<Character> temp = new ArrayList();

                for(int i = 0; i < arr.length - 1; ++i) {
                    if (arr[i] != arr[i + 1]) {
                        temp.add(arr[i]);
                    }
                }
                temp.add(arr[arr.length - 1]);

                for(int i = 0; i < temp.size(); ++i) {
                    char x = (Character)temp.get(i);
                    int count = 0;

                    for(int j = 0; j < st.length(); ++j)
                    {
                        if (x == st.charAt(j))
                        {
                            ++count;
                        }
                    }

                    System.out.println("" + x + " : " + count);
                }

            }
    }