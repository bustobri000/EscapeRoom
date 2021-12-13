import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;


public class EscapeRoom {


    public static JFrame Window;
    public static JPanel Panel;
    public static JLabel label1;
    public static JLabel descriptionBlock;
    public static JTextField textBlock;
    public static JButton Node1, Node2, Node3, Node4, textButton;
    public static JRadioButton Item1, Item2, Item3, Item4;
    public static ButtonGroup Items = new ButtonGroup();

    public static Boolean item1 = true;
    public static Boolean item2 = false;
    public static Boolean item3 = false;
    public static Boolean item4 = false;
    public static int run = 1;

    public static Color Back = new Color(20, 20, 20, 255);
    public static Color Front = new Color(220, 220, 220);
    public static Color offYellow = new Color(220, 200, 60);
    public static Color NEO = new Color(220, 60, 160);
    public static Color NEO2 = new Color(248, 248, 192);

    public static void main(String[] args) {
        Window = new JFrame("UnfunnyUndertaleJoke12.exe.jpeg.png.gif  and Knuckles deluxe edition u featuring Dante from Devil May Cry Series and Knuckles 3D U and Knuckles and Knuckles and Knuckles and Knuckles and Knuckles and Knuckles and Knuckles and Knuckles and Knuckle sand Knuckle sand Knuckles and Knuckle sand Knuckle sand Knuckles week 7 Update ft sussus amogus");

        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.setSize(750, 500);

        Panel = new JPanel();
        Panel.setBackground(Back);

        Node1 = new JButton("Mettaton");
        Node1.setBounds(0, 0, 90, 50);
        Node1.setBackground(Front);
        Node1.addActionListener(new Node1Listener());

        Node2 = new JButton("YOU");
        Node2.setBackground(offYellow);
        Node2.setBounds(0, 50, 90, 50);
        Node2.addActionListener(new Node2Listener());

        Node3 = new JButton("STAGE");
        Node3.setBackground(NEO);
        Node3.setBounds(0, 100, 90, 50);
        Node3.addActionListener(new Node3Listener());

        Node4 = new JButton("DOOR");
        Node4.setBackground(NEO2);
        Node4.setBounds(0, 150, 90, 50);
        Node4.addActionListener(new Node4Listener());

        textButton = new JButton("Submit");
        textButton.addActionListener(new textButtonListener());
        textBlock = new JTextField(10);
        textBlock.setBounds(100, 100, 50, 50);
        textButton.setBounds(200, 200, 50, 50);

        label1 = new JLabel("Some weird dancing robot thing has taken you captive to make you a star! You must escape!");
        label1.setBounds(100, 25, 550, 35);
        descriptionBlock = new JLabel("Are you going to do something or not?");
        descriptionBlock.setBounds(100, 50, 550, 35);

        Item1 = new JRadioButton("Microphone");
        Item1.setBounds(0, 425, 100, 35);
        Item2 = new JRadioButton("Dress");
        Item2.setBounds(101, 425, 60, 35);
        Item3 = new JRadioButton("Calculator");
        Item3.setBounds(161, 425, 100, 35);

        Panel.add(Item1);
        Panel.add(Item3);

        Items.add(Item1);
        Items.add(Item2);
        Items.add(Item3);
        Items.add(Item4);

        Panel.setLayout(null);
        Panel.setBackground(Color.white);
        Panel.add(label1);
        Panel.add(descriptionBlock);
        Panel.add(Node1);
        Panel.add(Node2);
        Panel.add(Node3);
        Window.add(Panel);
        Window.setVisible(true);
        Panel.setBackground(Back);
        label1.setForeground(Front);
        descriptionBlock.setForeground(Front);
        Item1.setBackground(offYellow);
        Item2.setBackground(offYellow);
        Item3.setBackground(offYellow);

    }

    private static class Node1Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(run==1){
                if (Item1.isSelected()){
                label1.setText("You gave Mettaton the MICROPHONE, He starts singing.");
                descriptionBlock.setText("Bizarrely, he is singing about CALCULATORs and YOU.");
                item1 = false;
                item3 = true;
                Panel.remove(Item1);
                } else if (Item2.isSelected()){
                if (item2){
                    label1.setText("You gave Mettaton the DRESS, He's already beautiful enough.");
                    descriptionBlock.setText("He gives it back.");
                } else {
                    label1.setText("Mettaton looks at you, then at your empty hands, and then slaps you.");
                    descriptionBlock.setText("(What did you think would happen?)");
                }
                } else if (Item3.isSelected()) {
                label1.setText("You gave Mettaton the CALCULATOR, He throws it at you.");
                descriptionBlock.setText("(Are you trying every button combination?)");
                if (!item3){
                    label1.setText("Mettaton mentions something about a ghost.");
                    descriptionBlock.setText("(Are you trying every button combination?)");
                }
                } else {
                label1.setText("Mettaton slaps you elegantly.");
                descriptionBlock.setText("(This message is a rare one!)");
                }
            } else {
                if (Item1.isSelected()){
                    label1.setText("Mettaton Already has a MICROPHONE! HE IS NOW DUAL WIELDING MICs!");
                    descriptionBlock.setText("Now is your chance to flee!");
                    item1 = false;
                    Panel.add(Node4);
                    Panel.remove(Item1);
                }
            }
            Panel.updateUI();
        }
    }

    private static class Node2Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (run == 3){
            oneTimeJoke("Did you really think you could escape so easily?");
            descriptionBlock.setText("Mettaton NEO blocks the way!");
            Node1.setText("Mettaton NEO");
            Node1.setBackground(NEO);
            Node1.setBounds(0, 0, 120, 50);
            Panel.add(Node1);
            Node2.setForeground(NEO);
            Panel.setBackground(Front);

            } else {
                if (Item1.isSelected()) {
                    label1.setText("You gave YOURSELF the MICROPHONE.");
                    descriptionBlock.setText("YOU are a silent protagonist.");
                } else if (Item2.isSelected()) {
                    if (item2) {
                        label1.setText("You gave YOURSELF the DRESS, YOU are now in a dress.");
                        item2 = false;
                        Panel.remove(Item2);
                        System.out.println("2");
                    } else if (item3) {
                        label1.setText("What?");
                    }
                } else if (Item3.isSelected()) {
                    if (item1) {
                        label1.setText("You stare at the CALCULATOR.");
                        descriptionBlock.setText("Why would you want to use a CALCULATOR?");
                    } else {
                        descriptionBlock.setText("(Enjoy the fact there is no text wrapping here :)!)");
                        item3 = false;
                        oneTimeJoke("Given x=(-b+-√(b^2-4ac))/2a, with an X value of 0.0124, B value of 12 and C value of 51, what is a? (round to 4 decimal places");
                        Panel.remove(Item3);
                    }
                } else {
                    label1.setText("Do you like playing with yourself?");
                    descriptionBlock.setText("(This message is a rarer one!)");
                }
            }
            Panel.updateUI();
        }
    }

    private static class Node3Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (run==1){
            if (Item1.isSelected()){
                descriptionBlock.setText("The audience is already loud enough!");
                label1.setText("(Have you tried someone else?)");
                if (!item1){
                    label1.setText("The audience is confused! No one likes an imaginary MIC!");
                    descriptionBlock.setText("(What did you think would happen?)");
                }
            } else if (Item2.isSelected()){
                if(!item2){
                    descriptionBlock.setText("The audience loves it!...");
                    label1.setText("The audience gives you a second MICROPHONE!");
                    item1 = true;
                    run = 2;
                    Panel.add(Item1);
                } else {
                    descriptionBlock.setText("The audience adores the dress, but not you.");
                    label1.setText("(Have you tried wearing it?)");
                }
            } else if (Item3.isSelected()){
                descriptionBlock.setText("The audience hates math!");
                label1.setText("(Have you tried someone with math skills?)");
                if(!item3){
                    label1.setText("The audience hates math! Especially ghost math!");
                    descriptionBlock.setText("(What did you think would happen?)");
                }
            } else {
                descriptionBlock.setText("(This message is an even rare one!)");
                label1.setText("You are a anti social protagonist!");
            }

        } else {
                if (Item1.isSelected()){
                    descriptionBlock.setText("(You are an idiot)");
                    label1.setText("Why are you doing this?");
                    if (!item1){
                        descriptionBlock.setText("(You are an even bigger idiot)");
                        label1.setText("The crowd is already distracted!");
                    }
                }
            }
            Panel.updateUI();
        }
    }

    public static String oneTimeJoke(String prompt){
        Panel.add(textBlock);
        Panel.add(textButton);
        label1.setText(prompt);

        return textBlock.getText();
    }
    private static class textButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if (run != 3) {
                String garbage = oneTimeJoke("Given x=(-b+-√(b^2-4ac))/2a, with an X value of 0.0124, B value of 12 and C value of 51, what is a? (round to 4 decimal places");
                if (garbage.equals("e")) {
                    label1.setText("Why did you solve that?");
                    descriptionBlock.setText("From within the CALCULATOR is a DRESS! YOU toss the CALCULATOR");
                    item2 = true;
                    Panel.add(Item2);
                } else if (garbage.equals("")) {
                    label1.setText("YOU FAILED TO SUCCEED!");
                    descriptionBlock.setText("You broke the CALCULATOR by inputting nothing, inside was a DRESS!");
                    item2 = true;
                    Panel.add(Item2);
                } else {
                    label1.setText("YOU FAIL!");
                    descriptionBlock.setText("You broke the CALCULATOR by inputting garbage, inside was a DRESS!");
                    item2 = true;
                    Panel.add(Item2);
                }
            } else {
                String garbage = oneTimeJoke("Time for a pop quiz hotshot! Who is my favorite person here?").toLowerCase();
                if (garbage.equals("you") || garbage.equals("mettaton") || garbage.equals("mettaton neo")){
                    label1.setText("Yes I am!");
                } else if (garbage.equals("me")){
                    label1.setText("No!");
                } else if (garbage.equals("audience")){
                    label1.setText("Them?");
                } else {
                    label1.setText("Who?");
                }
            }
            Panel.remove(textBlock);
            Panel.remove(textButton);
            Panel.updateUI();
        }
    }
        private static class Node4Listener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //On the event any item is smuggled in by pressing the button twice, all items and buttons are cleared.
                Panel.remove(Node1);
                Panel.remove(Node3);
                Panel.remove(Node4);
                item1 = false;
                item2 = false;
                item3 = false;
                item4 = false;
                descriptionBlock.setText("The door is locked.");
                label1.setText("You attempt to exit.");
                run = 3;

                Panel.updateUI();
            }
        }
}
