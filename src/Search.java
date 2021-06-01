public class Search {
    public static void main(Test[] args) {
        int[] number = new int[] {2,5,7,8};
        int r = 10;
        boolean e = ajay(number,r);
        System.out.println(e);

    }
    public static boolean ajay(int[] list, int x){
        int i =0;
        while(i < list.length){
            if(list[i]==x)
                return true;
            System.out.println(list[i]);
            i++;

        }
        return false;
    }
}
