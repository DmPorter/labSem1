package lab2.dop2;

import lab2.n16.Queue;

public class Main {
    public static void main(String[] args) {
        External1 e1;
        External1.Item1 i1;

        External2 e2;
        External2.Item2 i2;
    }


    public class External1{
        private int a;
        public External1(int b){
            a = b;
        }
        public void setA(int a) {
            this.a = a;
        }

        public static class Item1{
            private int b;

            public Item1(){
                b =1;
            }
            public void setB(int b) {
                this.b = b;
            }
        }
    }

    public class External2{
        private int a;
        public External2(){
            a = 1;
        }
        public void setA(int a) {
            this.a = a;
        }

        private static class Item2{
            private int b;

            public Item2(){
                b =1;
            }
            public void setB(int b) {
                this.b = b;
            }
        }

    }

    public class External3{
        private int a;
        public External3(){
            a = 1;
        }
        public void setA(int a) {
            this.a = a;
        }

        private class Item3{
            private int b;

            public Item3(){
                b =a;
            }
            public void setB(int b) {
                this.b = b;
                setA(b);
            }
        }
    }

    public class External4{
        private int a;
        public External4(){
            a = 1;
        }
        public void setA(int a) {
            this.a = a;
        }

        public class Item4{
            private int b;

            public Item4(int y){
                b =y;
            }
            public void setB(int b) {
                this.b = b;
                setA(b);
            }
        }

    }

}
