/*

CREATED BY VJSKIBIN
on 01.07.2018 | 14:08
 -> vk.com/vjskibin
 -> github.com/vjskibin
 -> vjskibin@gmail.com
 
 No more punk, alcohol and parties
 Only machine learning studing and evolution

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TrainReader {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>();
        File file = new File("german.txt");
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                //list.add(Integer.parseInt(text));
                String a[];
                a = text.split(" ");
                for(int i = 0; i < 21; i++)
                    list.add(Integer.parseInt(a[i]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }



//print out the list
        System.out.println(list);

        try(FileWriter writer = new FileWriter("train.data", false))
        {

            //writer.write("asfklsdfdfs");

            for(int i = 0; i < list.size(); i++)
            {
                /*if((i+1) % 21 != 0)
                {
                    writer.write(list.get(i).toString() + " ");
                }
                else
                {
                    writer.append('\n');
                    writer.write(list.get(i).toString());
                    writer.append('\n');
                }*/
                switch((i+1) % 21)
                {
                    case 0: writer.append('\n');
                            writer.write(list.get(i).toString());
                            writer.append('\n');
                            break;

                    case 1: writer.append(list.get(i).toString().charAt(1) + " ");
                            break;
                    case 2: writer.write(list.get(i).toString() + " ");
                            break;
                    case 3: writer.append(list.get(i).toString().charAt(1) + " ");
                        break;
                    case 4: writer.append(list.get(i).toString().charAt(1) + " ");
                        break;
                    case 5: writer.write(list.get(i).toString() + " ");
                        break;
                    case 6: writer.append(list.get(i).toString().charAt(1) + " ");
                        break;
                    case 7: writer.append(list.get(i).toString().charAt(1) + " ");
                        break;
                    case 8: writer.write(list.get(i).toString() + " ");
                        break;
                    case 9: writer.append(list.get(i).toString().charAt(1) + " ");
                        break;
                    case 10: writer.append(list.get(i).toString().charAt(2) + " ");
                        break;
                    case 11: writer.write(list.get(i).toString() + " ");
                        break;
                    case 12: writer.append(list.get(i).toString().charAt(2) + " ");
                        break;
                    case 13: writer.write(list.get(i).toString() + " ");
                        break;
                    case 14: writer.append(list.get(i).toString().charAt(2) + " ");
                        break;
                    case 15: writer.append(list.get(i).toString().charAt(2) + " ");
                        break;
                    case 16: writer.write(list.get(i).toString() + " ");
                        break;
                    case 17: writer.append(list.get(i).toString().charAt(2) + " ");
                        break;
                    case 18: writer.write(list.get(i).toString() + " ");
                        break;
                    case 19: writer.append(list.get(i).toString().charAt(2) + " ");
                        break;
                    case 20: writer.append(list.get(i).toString().charAt(2) + " ");
                        break;
                }
            }

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}
