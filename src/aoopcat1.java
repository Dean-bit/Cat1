import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.Group;
public class aoopcat1 extends Application {
    private void showAlertWithoutHeaderText() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("message");

        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("Thank you for registering for Advanced object oriented cat1 Application");

        alert.showAndWait();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Text text1 = new Text ("Names:");

        // step 2: create label Rgistered
        Text text2 = new Text ("Date of Birth:");


        Text text3 = new Text ("Email Address:");
        Text text4 = new Text (" Completed University Degree:");
        Text text5 = new Text ("Phone Number:");
        Text text6 = new Text ("National ID number:");

        //step 3: create Text Field for name
        TextField textField1 = new TextField();

        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();

        //step 4: create combo Box for Registered
        //ComboBox comboBox = new ComboBox(); //ComboBox comboBox = new ComboBox();

        //FileInputStream input = new  FileInputStream("ibm.jpg");
        //Image image = new Image(input);
        //ImageView imageView = new ImageView(image);
        // Label label =new Label ("My Label",imageView);

        DatePicker datePicker = new DatePicker();

        HBox hbox = new HBox(datePicker);

        Button button1 = new Button ("Save");



        GridPane gridPane = new GridPane();
        gridPane.setMinSize(450, 600);

        //step 8: Set padding
        gridPane.setPadding(new Insets(50, 50, 50, 50));

        // step 9: Set the vertical and horinzotal gaps between the columns
        gridPane.setVgap(10);
        gridPane.setHgap(10);


        // step 10: Set the Grid Alignment


        gridPane.setAlignment(Pos.CENTER);



        //step 11: Arrange all the nodes in the grid
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        //gridPane.add(button1, 1, 1);

        gridPane.add(text2, 0, 1);

        gridPane.add(datePicker, 1, 1);

        gridPane.add(text3, 0, 3);


        gridPane.add(textField3,1, 3);

        gridPane.add(text4,0,4);
        gridPane.add(textField4,1,4);

        gridPane.add(text5,0,5);
        gridPane.add(textField5,1,5);

        gridPane.add(text6,0,8);
        gridPane.add(textField6,1,8);


        gridPane.add(button1, 1, 9);




        //step 12: Style nodes be creative and more Styles
        button1.setStyle("-fx-background-color: cornflowerblue; -fx-text-fill: white; -fx-font-size:13pt;");

        //button2.setStyle("-fx-background-color: limegreen; -fx-text-fill: white; -fx-font-size:13pt;");

        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");
        text3.setStyle("-fx-font: normal bold 20px 'serif' ");
        text4.setStyle("-fx-font: normal bold 20px 'serif' ");
        text5.setStyle("-fx-font: normal bold 20px 'serif' ");
        text6.setStyle("-fx-font: normal bold 20px 'serif' ");

        gridPane.setStyle("-fx-background-color: purple");

        //imageView.setX(50);
        //imageView.setY(25);

        //imageView.setFitHeight(455);
        //imageView.setFitWidth(500);

        //imageView.setPreserveRatio(true);

        //gridPane.setStyle("-fx-background-color: blue");

        Scene scene = new Scene(gridPane);

        Scene sene = new Scene(hbox, 200, 100);

        Scene sen = new Scene (new Group (),450,250);

        Scene sn = new Scene (new Group (),450,250);

        // Scene sin = new Scene (label ,200,100);

        //Scene sin =new Scene(root, 600,500);
        Button signButton = new Button("Sign up");
        gridPane.add(signButton, 1, 9);
        signButton.setStyle
                ("-fx-text-fill: white; -fx-background-color: green; -fx-font-size: 24px; -fx-font-family: 'Arial'; -fx-font-weight: bold; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        signButton.setMinSize(300, 40);

        // Signup Button Event Handler
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mEvent) {
                System.out.println("Mouse Clicked");//Notification Message
                signButton.setStyle
                        ("-fx-background-color: blue; -fx-text-fill: white; -fx-font-size: 24px; -fx-font-family: 'Arial'; -fx-font-weight: bold; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                signButton.setMinSize(300, 30);
                showAlertWithoutHeaderText();
                // Show an Information Alert without Header Text


            }
        };

        signButton.addEventHandler(MouseEvent.MOUSE_CLICKED,eventHandler);

        // Add a new scene
        //stage.setScene(sin);
        stage.setTitle("Advanced OOOP");
        stage.setScene(sn);
        stage.setScene(sen);
        stage.setScene(sene);
        stage.setScene(scene);

        stage.show();
    }

}