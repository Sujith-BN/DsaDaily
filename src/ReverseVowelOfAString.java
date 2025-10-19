public class ReverseVowelOfAString {
    public static boolean isVowel(String s ){
            String vowels ="aeiouAEIOU";
            if(vowels.contains(s)){
                return true;
            }
            return false;
        }
        public String reverseVowels(String s) {

            String arr[] = s.split("");
            int i = 0 , j = s.length()-1;
            while(i<=j){
                if(isVowel(arr[i])){
                    if(! (isVowel(arr[j]))){
                        j--;
                    }
                    else{
                        String temp = arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        i++;
                        j--;
                    }
                }
                else{
                    i++;
                }
            }
            return String.join("",arr);
    }
}

