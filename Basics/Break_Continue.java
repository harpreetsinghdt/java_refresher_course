public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
        System.out.println(i);
        i++;
        if (i == 4) {
            break;
        }
        }

        int i1 = 0;
        while (i1 < 10) {
        if (i1 == 4) {
            i1++;
            continue;
        }
        System.out.println(i1);
        i1++;
        }
    }
}
