public class questionTen {
        // A) Adding 2 integer number
        private static void add(int a, int b){
            System.out.println(a+b);
        }

        //  B) Adding 2 double
        private static void add(double a, double b){
            System.out.println(a+b);
        }

        // C) multiplying 2 float
        private static void multiply(float a, float b){
            System.out.println(a*b);
        }

        // D) multiplying 2 int
        private static void multiply(int a, int b){
            System.out.println(a*b);
        }

        // E) concate 2 string
        private static void concatString(String str, String str1){
            System.out.println(str+" "+str1);
        }

        // F) Concate 3 String
        private  static void concatString(String str, String str1, String str2){
            System.out.println(str+" "+str1+" "+str2);

        }
        public static void main(String[] args) {

            add(2,3);
            add(3.5,4.5);
            multiply(2,3);
            multiply(3.2f,2.3f);
            concatString("str", "str1");
            concatString("str","str1","str2");

        }
    }
