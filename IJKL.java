class IJKL {
    public static void main(String []ar) {
        int L = 0;

        for (int k = 0; k < 100; k++) {
            for (int j = 0; j < k; j++) {
                for (int i = 0; i < j; i++) {
                    L = k + j + i;
                    if (i < j && j < k && k < L) {
                        System.out.println("I: " + i);
                        System.out.println("J: " + j);
                        System.out.println("K: " + k);
                        System.out.println("L: " + L);
                    }
                }
            }
        }

    }
}
