package exam_3;

public class _0001 {
    public static void main(String[] args) {
        for(int a=0;a<10000;a++){
            for(int b=0;b<10000;b++){
                if(b-a==168){
                    if(check(a)&&check(b)){
                        System.out.println(a-100);
                    }
                }
            }
        }
    }
    public static boolean check(int a){
        boolean flag=false;
        for(int i=-10000;i<a;i++){
            if(i*i==a){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
