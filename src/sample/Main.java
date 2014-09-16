package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;




public class Main extends Application {

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
       Vikings vikings = new Vikings();
       Question[] questions = new Question[vikings.getQuestionNumber()];

        Scanner in = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++)
        {
            String a = ""; String b = ""; String q = "";
            System.out.println("Question: ");
            q = in.next();
            System.out.println("Answer1: ");
            a = in.next();
            System.out.println("Answer2: ");
            b = in.next();
            questions[i] = new Question();
            questions[i].SetAnswer(q,a,b);
        }
        vikings.SetQs(questions);

        try {
            VikingsHelper.write(vikings, "viks.xml");
        }
        catch(Exception exc)
        {
            System.out.print("Ffuuuuu");
        }

        Vikings v = null;
        try {
           v = VikingsHelper.read("viks.xml");
        }
        catch(Exception exc) {
            System.out.print("Ffuuuuu");
        }

        if (v != null)
           v.GetQs();
        vikings.GetQs();
    }
    }

