class PerfectSquare {
    public static void main(String []ar) {
        for (int i = 1024; i <= 9801; i++) {
            double sqrt = Math.sqrt(i);   
            
            if((sqrt - Math.floor(sqrt)) == 0) {
                String nos[] = String.valueOf(i).split("");
                
                int no1 = Integer.parseInt(nos[0] + nos[1]);
                int no2 = Integer.parseInt(nos[2] + nos[3]);

                double sqrt_no1 = Math.sqrt(no1);   
                double sqrt_no2 = Math.sqrt(no1);   
                if((sqrt_no1 - Math.floor(sqrt_no1)) == 0 && (sqrt_no2 - Math.floor(sqrt_no2)) == 0) {
                    System.out.println(i)        ;          
                }
            }
        }
    }
}
