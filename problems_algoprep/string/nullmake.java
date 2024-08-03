package string;

public class nullmake {
      public static void main(String[] args) {
            String str ="AkASH";
            int n = str.length();
            char[] ch = new char[n];
            for(int k=0;k<n;k++){
                  ch[k] = str.charAt(k);
            }
            for(int i=0;i<str.length();i++){
                  for(int j=1;j<str.length();j++){
                        if(ch[i]==ch[j]){
                                          ch[j]=' ';
                        }
                  }
            }
for(int k=0;k<n;k++){
      System.out.print(ch);
}
      }
}
