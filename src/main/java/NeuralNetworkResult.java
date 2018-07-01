import com.googlecode.fannj.Fann;

public class NeuralNetworkResult {

    public static void main(String[] args) {
        System.load("D:\\Work\\Java\\NeuralBankSystem\\src\\main\\java\\FANN\\bin\\fannfloat.dll");
        Fann fann = new Fann("ann");
        float[][] tests = {
                {2, 30, 4, 0, 5234, 1, 1, 4, 4, 1, 2, 3, 28, 3, 2, 2, 4, 1, 1, 1},

        };
        for (float[] test:tests){
            System.out.println(getAction(fann.run(test)));
        }
    }


    private static String getAction(float[] out){
        String result;
        result = out[0] + " lol";

        return result;
    }

}
