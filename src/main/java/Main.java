/*

CREATED BY VJSKIBIN
on 01.06.2018 | 13:04
 -> vk.com/vjskibin
 -> github.com/vjskibin
 -> vjskibin@gmail.com
 
 No more punk, alcohol and parties
 Only machine learning studing and evolution

*/

import com.googlecode.fannj.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello World!");
        System.load("D:\\Work\\Java\\NeuralBankSystem\\src\\main\\java\\FANN\\bin\\fannfloat.dll");
        List<Layer> layerList = new ArrayList<Layer>();
        layerList.add(Layer.create(20, ActivationFunction.FANN_SIGMOID_SYMMETRIC, 0.01f));
        layerList.add(Layer.create(40, ActivationFunction.FANN_SIGMOID_SYMMETRIC, 0.01f));
        layerList.add(Layer.create(1, ActivationFunction.FANN_SIGMOID_SYMMETRIC, 0.01f));
        Fann fann = new Fann(layerList);
        //Создаем тренера и определяем алгоритм обучения
        Trainer trainer = new Trainer(fann);
        trainer.setTrainingAlgorithm(TrainingAlgorithm.FANN_TRAIN_RPROP);
        /* Проведем обучение взяв уроки из файла, с максимальным колличеством
           циклов 100000, показывая отчет каждую 100ю итерацию и добиваемся
        ошибки меньше 0.0001 */
        trainer.train(new File("train.data").getAbsolutePath(), 100000, 100, 0.0001f);
        fann.save("ann");
    }
}
