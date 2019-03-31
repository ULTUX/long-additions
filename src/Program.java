

public class Program {
    public static int cyfraNa(int cyfra, int na){
        String str = null;
        str = Integer.toString(cyfra);
        str = Character.toString(str.charAt(na));
        return Integer.parseInt(str);
    }
    public static int ileCyfr(int cyfra){
        String str = null;
        str = Integer.toString(cyfra);
        return str.length();
    }
    public static void wypisz(int[] a, boolean koniec){
        if (koniec == false) {
            System.out.println();
        }
        for (int i = a.length-1; i >= 0; i--){
            StringBuilder str = new StringBuilder();
            if (koniec == false) str.append("  ");
            str.append(a[i]).append(" ");
            if (koniec == true)str.append("  ");
            System.out.print(str.toString());
        }
    }
    public static boolean nowalinia = false;

    public static void dodawanie(int a, int b){
        boolean nowalinia = false;
        int maxCyfr = Integer.max(ileCyfr(a), ileCyfr(b));
        boolean tak = true;
        int cyfryA[] = new int[maxCyfr];
        int licznik = 0;
        for (int i = ileCyfr(a)-1; i >= 0; i--){
            cyfryA[i] = cyfraNa(a, licznik);
            licznik++;
        }
        licznik = 0;
        int cyfryB[] = new int[maxCyfr];
        for (int i = ileCyfr(b)-1; i >= 0; i--){
            cyfryB[i] = cyfraNa(b, licznik);
            licznik++;
        }
        int T[] = new int[maxCyfr];
        wypisz(cyfryA, false);
        wypisz(cyfryB, false);
        for (int i = 0; i < maxCyfr; i++){
            T[i] +=  cyfryA[i] + cyfryB[i];
            if(T[i] > 9) {
                T[i] -= 10;
                if (i + 2 > T.length) {
                    nowalinia = true;
                }
                else T[i+1]++;
            }
        }
        wypisz(T, false);
        if (nowalinia == true){
            System.out.println();
            System.out.print(1+" ");
            wypisz(T, true);
        }
        System.out.println();
    }
}
