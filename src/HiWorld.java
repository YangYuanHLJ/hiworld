public class HiWorld {
    public static void doia(String a ,String b,int k){
        if(a.length() == k){
            System.out.println(a);
        }else{
            for(int i = 0 ; i < b.length() ; i++){
                String tempa = new String(a);
                String tempb = new String(b);
                doia(tempa+tempb.charAt(i),new StringBuffer(tempb).deleteCharAt(i).toString(),a.length()+b.length());
            }
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        doia("",s,s.length());
    }
}













