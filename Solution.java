class Solution {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        try{
            for(int charCtr = 0; charCtr < strs[0].length(); charCtr++){
                char currChar = strs[0].charAt(charCtr);
                boolean allMatch = true;
                for(int wordCtr = 0; wordCtr < strs.length; wordCtr++){
                    String currWord = strs[wordCtr];
                    if(currChar != currWord.charAt(charCtr)){
                        allMatch = false;
                        break;
                    }
                }
                if(allMatch){
                    sb.append(currChar);
                }
                else{
                    break;
                }
            }
            return sb.toString();
        }
        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            return sb.toString();
        }
    }
}
