public class Again {
    public static void main(String[] args) {
        int[] list={1,2,3,1,2,2,2,3,5};

        for(int i=0;i<list.length;i++){
            int again=1;
            for(int j=0;j< list.length;j++){
                if((i!=j)&&(list[i]==list[j])){
                    again++;
                }
            }
            System.out.println(list[i]+":"+again);
        }
    }
}
