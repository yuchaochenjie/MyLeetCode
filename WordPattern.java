public class Solution {

    public boolean wordPattern(String pattern, String str) {

        char[] patterns=pattern.toCharArray();

        Map<Character,String> map=new HashMap<>();

        String[] strs=str.split(" ");

        if(patterns.length!=strs.length)

            return false;

        for(int i=0;i<patterns.length;i++)

        {

            char ch=patterns[i];

            if(map.containsKey(ch))

            {

                String value=map.get(ch);

                if(!value.equals(strs[i]))

                {

                    return false;

                }

            }

            else

            {

                if(map.containsValue(strs[i]))

                {

                    return false;

                }

                map.put(ch,strs[i]);

            }

        }

        return true;

        

    }

}
