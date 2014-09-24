package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Scanner;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;




public class Main extends Application {

    private final int qnum = 19;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    {
       //ikings vikings = new Vikings();

        Scanner in = new Scanner(System.in);

       /* ArrayList<Question> qs = new ArrayList<Question>();
        int y = -1; int n = -1; String q = "";
        for(int i = 0; i <= qnum; i++)
        {
            System.out.print("Question: ");
            q = in.nextLine();
            if (q.charAt(q.length() - 1) != '?')
              qs.add(new Block(q, i, i+1));
            else
            {
                System.out.println("Yes id: ");
                y = in.nextInt();
                System.out.println("No id: ");
                n = in.nextInt();
                qs.add(new IfQuestion(q, y, n, i));
                q = in.nextLine();
            }
        }
        vikings.SetQuestions(qs);


        try {
            VikingsHelper.write(vikings);
        }
        catch(Exception exc)
        {
            System.out.print("Ffuuuuu");
        }
*/
        Vikings v = null;
        try {
           v = VikingsHelper.read("viks.xml");
        }
        catch(Exception exc) {
            System.out.print("Ffuuuuu");
        }



    }
    }

