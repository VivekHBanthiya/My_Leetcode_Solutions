class Solution {
    public String processStr(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                sb.append(c);
            }
            else if(c=='*' && sb.length()>=1){
                sb.deleteCharAt(sb.length()-1);
            }
            else if(c=='#' && sb.length()>=1){
                sb.append(sb.toString());
            }else if(c=='%' && sb.length()>=1){
                String res = sb.reverse().toString();
                sb.delete(0, sb.length());
                sb.append(res);
            }
        }
        return sb.toString();
    }
}