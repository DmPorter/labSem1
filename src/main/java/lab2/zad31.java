package lab2;

public class zad31 {
    private static class Wrapper {
        private String field;

        public Wrapper(String a){
            field = a;
        }

        public String getField() {
            return field;
        }
        public void setField(String val){
            field = val;
        }

        public void fill( Wrapper copy) {
            copy.setField(field);
        }
    }

    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper("asd");
        Wrapper wrapper1 = new Wrapper("");
        wrapper.fill(wrapper1);
        System.out.println(wrapper1.getField());
    }



}
